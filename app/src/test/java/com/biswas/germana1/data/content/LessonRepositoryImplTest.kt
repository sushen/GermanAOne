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
        assertEquals(10, lessons.size)
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
        assertEquals("lesson_6", lessons[5].id)
        assertEquals(6, lessons[5].order)
        assertEquals("lesson_7", lessons[6].id)
        assertEquals(7, lessons[6].order)
        assertEquals("lesson_8", lessons[7].id)
        assertEquals(8, lessons[7].order)
        assertEquals("lesson_9", lessons[8].id)
        assertEquals(9, lessons[8].order)
        assertEquals("lesson_10", lessons[9].id)
        assertEquals(10, lessons[9].order)
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
    fun getLessonById_returnsChapter10DetailsCorrectly() {
        val lesson10 = repository.getLessonById("lesson_10")
        assertNotNull(lesson10)
        lesson10!!

        assertEquals("Lektion 10: স্বাস্থ্য ও শরীর (Gesundheit & Körper)", lesson10.title)
        assertEquals(10, lesson10.order)

        assertTrue(lesson10.objectives.isNotEmpty())
        assertTrue(lesson10.vocabulary.isNotEmpty())
        assertTrue(lesson10.grammarRules.isNotEmpty())
        assertTrue(lesson10.exampleSentences.isNotEmpty())
        assertTrue(lesson10.dialogues.isNotEmpty())
        assertTrue(lesson10.exercises.isNotEmpty())

        val containsKopfVocab = lesson10.vocabulary.any { it.german == "der Kopf" }
        assertTrue(containsKopfVocab)

        val containsArztVocab = lesson10.vocabulary.any { it.german == "der Arzt" }
        assertTrue(containsArztVocab)

        val containsApothekeVocab = lesson10.vocabulary.any { it.german == "die Apotheke" }
        assertTrue(containsApothekeVocab)

        val containsTutWehGrammar = lesson10.grammarRules.any { it.title.contains("tut weh") }
        assertTrue(containsTutWehGrammar)

        val containsMultipleChoice = lesson10.exercises.any { it.type == ExerciseType.MULTIPLE_CHOICE }
        val containsFillInBlank = lesson10.exercises.any { it.type == ExerciseType.FILL_IN_BLANK }
        val containsTranslation = lesson10.exercises.any { it.type == ExerciseType.TRANSLATION }

        assertTrue(containsMultipleChoice)
        assertTrue(containsFillInBlank)
        assertTrue(containsTranslation)
    }

    @Test
    fun getLessonById_returnsChapter9DetailsCorrectly() {
        val lesson9 = repository.getLessonById("lesson_9")
        assertNotNull(lesson9)
        lesson9!!

        assertEquals("Lektion 9: সময়, তারিখ ও অ্যাপয়েন্টমেন্ট (Zeit, Datum & Termine)", lesson9.title)
        assertEquals(9, lesson9.order)

        assertTrue(lesson9.objectives.isNotEmpty())
        assertTrue(lesson9.vocabulary.isNotEmpty())
        assertTrue(lesson9.grammarRules.isNotEmpty())
        assertTrue(lesson9.exampleSentences.isNotEmpty())
        assertTrue(lesson9.dialogues.isNotEmpty())
        assertTrue(lesson9.exercises.isNotEmpty())

        val containsMontagVocab = lesson9.vocabulary.any { it.german == "Montag" }
        assertTrue(containsMontagVocab)

        val containsUhrVocab = lesson9.vocabulary.any { it.german == "die Uhr" }
        assertTrue(containsUhrVocab)

        val containsTerminVocab = lesson9.vocabulary.any { it.german == "der Termin" }
        assertTrue(containsTerminVocab)

        val containsAmUmGrammar = lesson9.grammarRules.any { it.title.contains("am") || it.title.contains("um") }
        assertTrue(containsAmUmGrammar)

        val containsMultipleChoice = lesson9.exercises.any { it.type == ExerciseType.MULTIPLE_CHOICE }
        val containsFillInBlank = lesson9.exercises.any { it.type == ExerciseType.FILL_IN_BLANK }
        val containsTranslation = lesson9.exercises.any { it.type == ExerciseType.TRANSLATION }

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

    @Test
    fun getLessonById_returnsChapter6DetailsCorrectly() {
        val lesson6 = repository.getLessonById("lesson_6")
        assertNotNull(lesson6)
        lesson6!!

        assertEquals("Lektion 6: খাবার ও পানীয় (Essen und Trinken)", lesson6.title)
        assertEquals(6, lesson6.order)

        assertTrue(lesson6.objectives.isNotEmpty())
        assertTrue(lesson6.vocabulary.isNotEmpty())
        assertTrue(lesson6.grammarRules.isNotEmpty())
        assertTrue(lesson6.exampleSentences.isNotEmpty())
        assertTrue(lesson6.dialogues.isNotEmpty())
        assertTrue(lesson6.exercises.isNotEmpty())

        val containsBrotVocab = lesson6.vocabulary.any { it.german == "das Brot" }
        assertTrue(containsBrotVocab)

        val containsWasserVocab = lesson6.vocabulary.any { it.german == "das Wasser" }
        assertTrue(containsWasserVocab)

        val containsMoechteGrammar = lesson6.grammarRules.any { it.title.contains("möchte") }
        assertTrue(containsMoechteGrammar)

        val containsMultipleChoice = lesson6.exercises.any { it.type == ExerciseType.MULTIPLE_CHOICE }
        val containsFillInBlank = lesson6.exercises.any { it.type == ExerciseType.FILL_IN_BLANK }
        val containsTranslation = lesson6.exercises.any { it.type == ExerciseType.TRANSLATION }

        assertTrue(containsMultipleChoice)
        assertTrue(containsFillInBlank)
        assertTrue(containsTranslation)
    }

    @Test
    fun getLessonById_returnsChapter7DetailsCorrectly() {
        val lesson7 = repository.getLessonById("lesson_7")
        assertNotNull(lesson7)
        lesson7!!

        assertEquals("Lektion 7: কেনাকাটা (Einkaufen)", lesson7.title)
        assertEquals(7, lesson7.order)

        assertTrue(lesson7.objectives.isNotEmpty())
        assertTrue(lesson7.vocabulary.isNotEmpty())
        assertTrue(lesson7.grammarRules.isNotEmpty())
        assertTrue(lesson7.exampleSentences.isNotEmpty())
        assertTrue(lesson7.dialogues.isNotEmpty())
        assertTrue(lesson7.exercises.isNotEmpty())

        val containsKaufenVocab = lesson7.vocabulary.any { it.german == "kaufen" }
        assertTrue(containsKaufenVocab)

        val containsKostenVocab = lesson7.vocabulary.any { it.german == "kosten" }
        assertTrue(containsKostenVocab)

        val containsTeuerVocab = lesson7.vocabulary.any { it.german == "teuer" }
        assertTrue(containsTeuerVocab)

        val containsKostenGrammar = lesson7.grammarRules.any { it.title.contains("kosten") || it.title.contains("দাম") }
        assertTrue(containsKostenGrammar)

        val containsMultipleChoice = lesson7.exercises.any { it.type == ExerciseType.MULTIPLE_CHOICE }
        val containsTranslation = lesson7.exercises.any { it.type == ExerciseType.TRANSLATION }

        assertTrue(containsMultipleChoice)
        assertTrue(containsTranslation)
    }

    @Test
    fun getLessonById_returnsChapter8DetailsCorrectly() {
        val lesson8 = repository.getLessonById("lesson_8")
        assertNotNull(lesson8)
        lesson8!!

        assertEquals("Lektion 8: শহরে চলাফেরা (Unterwegs in der Stadt)", lesson8.title)
        assertEquals(8, lesson8.order)

        assertTrue(lesson8.objectives.isNotEmpty())
        assertTrue(lesson8.vocabulary.isNotEmpty())
        assertTrue(lesson8.grammarRules.isNotEmpty())
        assertTrue(lesson8.exampleSentences.isNotEmpty())
        assertTrue(lesson8.dialogues.isNotEmpty())
        assertTrue(lesson8.exercises.isNotEmpty())

        val containsBahnhofVocab = lesson8.vocabulary.any { it.german == "der Bahnhof" }
        assertTrue(containsBahnhofVocab)

        val containsBusVocab = lesson8.vocabulary.any { it.german == "der Bus" }
        assertTrue(containsBusVocab)

        val containsWoGrammar = lesson8.grammarRules.any { it.title.contains("Wo ist") }
        assertTrue(containsWoGrammar)

        val containsMultipleChoice = lesson8.exercises.any { it.type == ExerciseType.MULTIPLE_CHOICE }
        val containsFillInBlank = lesson8.exercises.any { it.type == ExerciseType.FILL_IN_BLANK }
        val containsTranslation = lesson8.exercises.any { it.type == ExerciseType.TRANSLATION }

        assertTrue(containsMultipleChoice)
        assertTrue(containsFillInBlank)
        assertTrue(containsTranslation)
    }
}
