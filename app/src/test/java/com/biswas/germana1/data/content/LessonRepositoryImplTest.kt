package com.biswas.germana1.data.content

import com.biswas.germana1.domain.model.ExerciseType
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class LessonRepositoryImplTest {

    private lateinit var repository: LessonRepositoryImpl

    @Before
    fun setUp() {
        repository = LessonRepositoryImpl()
    }

    @Test
    fun getLessons_returnsAllLessonsInOrder() {
        val lessons = repository.getLessons()
        assertEquals(5, lessons.size)
        assertEquals("lesson_1", lessons[0].id)
        assertEquals(1, lessons[0].order)
        assertEquals("lesson_2", lessons[1].id)
        assertEquals(2, lessons[1].order)
        assertEquals("lesson_3", lessons[2].id)
        assertEquals(3, lessons[2].order)
        assertEquals("lesson_4", lessons[3].id)
        assertEquals(4, lessons[3].order)
        assertEquals("lesson_5", lessons[4].id)
        assertEquals(5, lessons[4].order)
    }

    @Test
    fun getLessonById_returnsChapter3DetailsCorrectly() {
        val lesson3 = repository.getLessonById("lesson_3")
        assertNotNull(lesson3)
        lesson3!!

        assertEquals("Lektion 3: নিজের পরিচয় (Sich vorstellen)", lesson3.title)
        assertEquals(3, lesson3.order)

        assertTrue(lesson3.objectives.isNotEmpty())
        assertTrue(lesson3.vocabulary.isNotEmpty())
        assertTrue(lesson3.grammarRules.isNotEmpty())
        assertTrue(lesson3.exampleSentences.isNotEmpty())
        assertTrue(lesson3.dialogues.isNotEmpty())
        assertTrue(lesson3.exercises.isNotEmpty())

        val containsNameVocab = lesson3.vocabulary.any { it.german == "heißen" }
        assertTrue(containsNameVocab)

        val containsMultipleChoice = lesson3.exercises.any { it.type == ExerciseType.MULTIPLE_CHOICE }
        val containsFillInBlank = lesson3.exercises.any { it.type == ExerciseType.FILL_IN_BLANK }
        val containsTranslation = lesson3.exercises.any { it.type == ExerciseType.TRANSLATION }

        assertTrue(containsMultipleChoice)
        assertTrue(containsFillInBlank)
        assertTrue(containsTranslation)
    }

    @Test
    fun getLessonById_returnsChapter4DetailsCorrectly() {
        val lesson4 = repository.getLessonById("lesson_4")
        assertNotNull(lesson4)
        lesson4!!

        assertEquals("Lektion 4: আমার পরিবার (Meine Familie)", lesson4.title)
        assertEquals(4, lesson4.order)

        assertTrue(lesson4.objectives.isNotEmpty())
        assertTrue(lesson4.vocabulary.isNotEmpty())
        assertTrue(lesson4.grammarRules.isNotEmpty())
        assertTrue(lesson4.exampleSentences.isNotEmpty())
        assertTrue(lesson4.dialogues.isNotEmpty())
        assertTrue(lesson4.exercises.isNotEmpty())

        val containsMutterVocab = lesson4.vocabulary.any { it.german == "die Mutter" }
        assertTrue(containsMutterVocab)

        val containsMultipleChoice = lesson4.exercises.any { it.type == ExerciseType.MULTIPLE_CHOICE }
        val containsFillInBlank = lesson4.exercises.any { it.type == ExerciseType.FILL_IN_BLANK }
        val containsTranslation = lesson4.exercises.any { it.type == ExerciseType.TRANSLATION }

        assertTrue(containsMultipleChoice)
        assertTrue(containsFillInBlank)
        assertTrue(containsTranslation)
    }

    @Test
    fun getLessonById_returnsChapter5DetailsCorrectly() {
        val lesson5 = repository.getLessonById("lesson_5")
        assertNotNull(lesson5)
        lesson5!!

        assertEquals("Lektion 5: আমার দৈনন্দিন জীবন (Mein Alltag)", lesson5.title)
        assertEquals(5, lesson5.order)

        assertTrue(lesson5.objectives.isNotEmpty())
        assertTrue(lesson5.vocabulary.isNotEmpty())
        assertTrue(lesson5.grammarRules.isNotEmpty())
        assertTrue(lesson5.exampleSentences.isNotEmpty())
        assertTrue(lesson5.dialogues.isNotEmpty())
        assertTrue(lesson5.exercises.isNotEmpty())

        val containsAufstehenVocab = lesson5.vocabulary.any { it.german == "aufstehen" }
        assertTrue(containsAufstehenVocab)

        val containsMultipleChoice = lesson5.exercises.any { it.type == ExerciseType.MULTIPLE_CHOICE }
        val containsTranslation = lesson5.exercises.any { it.type == ExerciseType.TRANSLATION }

        assertTrue(containsMultipleChoice)
        assertTrue(containsTranslation)
    }
}
