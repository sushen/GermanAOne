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
        assertEquals(3, lessons.size)
        assertEquals("lesson_1", lessons[0].id)
        assertEquals(1, lessons[0].order)
        assertEquals("lesson_2", lessons[1].id)
        assertEquals(2, lessons[1].order)
        assertEquals("lesson_3", lessons[2].id)
        assertEquals(3, lessons[2].order)
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
}
