package com.biswas.germana1.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.biswas.germana1.data.content.LessonRepositoryImpl
import com.biswas.germana1.domain.repository.LessonRepository
import com.biswas.germana1.ui.auth.AuthViewModel
import com.biswas.germana1.ui.auth.LoginScreen
import com.biswas.germana1.ui.auth.RegisterScreen
import com.biswas.germana1.ui.home.HomeScreen
import com.biswas.germana1.ui.lesson.LessonDetailScreen

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Register : Screen("register")
    object Home : Screen("home")
    object LessonDetail : Screen("lesson_detail/{lessonId}") {
        fun createRoute(lessonId: String) = "lesson_detail/$lessonId"
    }
}

@Composable
fun AppNavigation(
    authViewModel: AuthViewModel,
    lessonRepository: LessonRepository = remember { LessonRepositoryImpl() },
    onTriggerAd: (() -> Unit)? = null,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val currentUser by authViewModel.currentUser.collectAsState()
    val lessons = remember { lessonRepository.getLessons() }

    val startDestination = if (currentUser != null) Screen.Home.route else Screen.Login.route

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(Screen.Login.route) {
            LoginScreen(
                viewModel = authViewModel,
                onNavigateToRegister = { navController.navigate(Screen.Register.route) },
                onLoginSuccess = {
                    navController.navigate(Screen.Home.route) {
                        popUpTo(Screen.Login.route) { inclusive = true }
                    }
                }
            )
        }

        composable(Screen.Register.route) {
            RegisterScreen(
                viewModel = authViewModel,
                onNavigateToLogin = { navController.popBackStack() },
                onRegisterSuccess = {
                    navController.navigate(Screen.Home.route) {
                        popUpTo(Screen.Login.route) { inclusive = true }
                    }
                }
            )
        }

        composable(Screen.Home.route) {
            HomeScreen(
                currentUser = currentUser,
                lessons = lessons,
                onLogout = {
                    authViewModel.logout()
                    navController.navigate(Screen.Login.route) {
                        popUpTo(Screen.Home.route) { inclusive = true }
                    }
                },
                onSelectLesson = { lesson ->
                    onTriggerAd?.invoke()
                    navController.navigate(Screen.LessonDetail.createRoute(lesson.id))
                }
            )
        }

        composable(
            route = Screen.LessonDetail.route,
            arguments = listOf(navArgument("lessonId") { type = NavType.StringType })
        ) { backStackEntry ->
            val lessonId = backStackEntry.arguments?.getString("lessonId")
            val lesson = lessonRepository.getLessonById(lessonId ?: "")

            if (lesson != null) {
                LessonDetailScreen(
                    lesson = lesson,
                    onBack = { navController.popBackStack() }
                )
            }
        }
    }
}
