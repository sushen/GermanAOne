package com.biswas.germana1.ui.lesson

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.biswas.germana1.domain.model.Exercise
import com.biswas.germana1.domain.model.ExerciseType
import com.biswas.germana1.domain.model.Lesson
import com.biswas.germana1.ui.theme.BrandCharcoal
import com.biswas.germana1.ui.theme.BrandRed
import com.biswas.germana1.ui.theme.BrandSuccess
import com.biswas.germana1.ui.theme.BrandYellow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonDetailScreen(
    lesson: Lesson,
    onBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    val tabs = listOf("সংক্ষিপ্ত বিবরণ", "শব্দভাণ্ডার", "ব্যাকরণ", "কথোপকথন", "অনুশীলন")

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = lesson.title,
                        fontWeight = FontWeight.Bold,
                        color = BrandCharcoal
                    )
                },
                navigationIcon = {
                    TextButton(onClick = onBack) {
                        Text(
                            text = "পেছনে",
                            color = BrandCharcoal,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
            )
        },
        modifier = modifier
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            ScrollableTabRow(selectedTabIndex = selectedTabIndex) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTabIndex == index,
                        onClick = { selectedTabIndex = index },
                        text = { Text(title) }
                    )
                }
            }

            when (selectedTabIndex) {
                0 -> OverviewTab(lesson = lesson)
                1 -> VocabularyTab(lesson = lesson)
                2 -> GrammarTab(lesson = lesson)
                3 -> DialogueTab(lesson = lesson)
                4 -> ExercisesTab(lesson = lesson)
            }
        }
    }
}

@Composable
private fun OverviewTab(lesson: Lesson) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Text(text = lesson.description, style = MaterialTheme.typography.bodyLarge)
        }
        item {
            Text(text = "উদ্দেশ্যসমূহ", style = MaterialTheme.typography.titleMedium)
        }
        items(lesson.objectives) { objective ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
            ) {
                Text(
                    text = "• $objective",
                    modifier = Modifier.padding(12.dp),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Composable
private fun VocabularyTab(lesson: Lesson) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(lesson.vocabulary) { item ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    // German target word visually prominent
                    Text(
                        text = item.german,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = BrandCharcoal
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = item.english,
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Medium,
                        color = BrandRed
                    )
                    Text(
                        text = "উচ্চারণ: [${item.pronunciation}]",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "উদাহরণ: ${item.exampleSentence}",
                        style = MaterialTheme.typography.bodyMedium,
                        color = BrandCharcoal
                    )
                }
            }
        }
    }
}

@Composable
private fun GrammarTab(lesson: Lesson) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(lesson.grammarRules) { rule ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = rule.title,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = BrandCharcoal
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = rule.explanation,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    rule.examples.forEach { example ->
                        Text(
                            text = "• $example",
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.SemiBold,
                            color = BrandCharcoal
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun DialogueTab(lesson: Lesson) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(lesson.dialogues) { dialogue ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Text(
                        text = "${dialogue.speaker}:",
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold,
                        color = BrandRed
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    // Prominent German sentence
                    Text(
                        text = dialogue.german,
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Bold,
                        color = BrandCharcoal
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = dialogue.english,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

@Composable
private fun ExercisesTab(lesson: Lesson) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(lesson.exercises) { exercise ->
            ExerciseCard(exercise = exercise)
        }
    }
}

@Composable
private fun ExerciseCard(exercise: Exercise) {
    var userAnswer by remember { mutableStateOf("") }
    var submitted by remember { mutableStateOf(false) }

    val isCorrect = userAnswer.trim().equals(exercise.correctAnswer.trim(), ignoreCase = true)

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = exercise.question,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = BrandCharcoal
            )
            Spacer(modifier = Modifier.height(12.dp))

            when (exercise.type) {
                ExerciseType.MULTIPLE_CHOICE -> {
                    exercise.options.forEach { option ->
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            RadioButton(
                                selected = userAnswer == option,
                                onClick = {
                                    if (!submitted) userAnswer = option
                                }
                            )
                            Text(
                                text = option,
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = FontWeight.Medium,
                                color = BrandCharcoal
                            )
                        }
                    }
                }
                ExerciseType.FILL_IN_BLANK, ExerciseType.TRANSLATION -> {
                    OutlinedTextField(
                        value = userAnswer,
                        onValueChange = { if (!submitted) userAnswer = it },
                        label = { Text("আপনার উত্তর") },
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.fillMaxWidth(),
                        enabled = !submitted
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            if (!submitted) {
                Button(
                    onClick = { submitted = true },
                    enabled = userAnswer.isNotBlank(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = BrandYellow,
                        contentColor = BrandCharcoal
                    ),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.align(Alignment.End)
                ) {
                    Text(
                        text = "যাচাই করুন",
                        fontWeight = FontWeight.Bold,
                        color = BrandCharcoal
                    )
                }
            } else {
                val statusText = if (isCorrect) "✅ সঠিক! 🎉" else "❌ ভুল উত্তর। সঠিক উত্তর: ${exercise.correctAnswer}"
                val statusColor = if (isCorrect) BrandSuccess else BrandRed

                Text(
                    text = statusText,
                    color = statusColor,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "💡 ${exercise.explanation}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = BrandCharcoal
                )
            }
        }
    }
}
