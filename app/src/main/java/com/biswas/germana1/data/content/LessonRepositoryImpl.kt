package com.biswas.germana1.data.content

import com.biswas.germana1.domain.model.DialogueEntry
import com.biswas.germana1.domain.model.ExampleSentence
import com.biswas.germana1.domain.model.Exercise
import com.biswas.germana1.domain.model.ExerciseType
import com.biswas.germana1.domain.model.GrammarRule
import com.biswas.germana1.domain.model.Lesson
import com.biswas.germana1.domain.model.VocabularyItem
import com.biswas.germana1.domain.repository.LessonRepository

class LessonRepositoryImpl : LessonRepository {

    private val lessonsList = listOf(
        Lesson(
            id = "lesson_1",
            title = "Lektion 1: German Alphabet, Pronunciation & Basic Greetings",
            description = "Learn the alphabet, core pronunciation rules, and formal vs. informal greetings.",
            order = 1,
            objectives = listOf(
                "Pronounce the German alphabet and special letters (Ä, Ö, Ü, ß).",
                "Understand fundamental pronunciation rules (W, V, Z, EI, IE).",
                "Greet people formally (Sie) and informally (du).",
                "Say goodbye and ask 'How are you?'."
            ),
            vocabulary = listOf(
                VocabularyItem("Hallo", "Hello", "hah-loh", "Hallo, wie geht's?"),
                VocabularyItem("Guten Morgen", "Good morning", "goo-ten mor-gen", "Guten Morgen, Herr Müller!"),
                VocabularyItem("Guten Tag", "Good day / Hello", "goo-ten tahk", "Guten Tag!"),
                VocabularyItem("Guten Abend", "Good evening", "goo-ten ah-bent", "Guten Abend, Frau Weber!"),
                VocabularyItem("Gute Nacht", "Good night", "goo-te nakht", "Gute Nacht, schlaf gut!"),
                VocabularyItem("Tschüss", "Bye (informal)", "tshooss", "Tschüss, bis morgen!"),
                VocabularyItem("Auf Wiedersehen", "Goodbye (formal)", "owf vee-der-zay-en", "Auf Wiedersehen!"),
                VocabularyItem("Wie geht es Ihnen?", "How are you? (formal)", "vee gayt es ee-nen", "Guten Tag, wie geht es Ihnen?"),
                VocabularyItem("Wie geht's?", "How are you? (informal)", "vee gayts", "Hallo Nina, wie geht's?"),
                VocabularyItem("Danke, gut!", "Thanks, good!", "dahn-ke goot", "Danke, gut! Und dir?")
            ),
            grammarRules = listOf(
                GrammarRule(
                    title = "Formal vs. Informal ('Sie' vs. 'du')",
                    explanation = "'Sie' (capitalized) is used with adults, strangers, and bosses. 'du' is used with friends, family, and peers.",
                    examples = listOf("Formal: Wie geht es Ihnen?", "Informal: Wie geht es dir? / Wie geht's?")
                ),
                GrammarRule(
                    title = "Special German Letters & Pronunciation",
                    explanation = "Ä (like bed), Ö (rounded lip 'eh'), Ü (rounded lip 'ee'), ß (ss sound). 'W' sounds like 'V', 'V' sounds like 'F', 'Z' sounds like 'TS'.",
                    examples = listOf("Wie (pronounced vee)", "Vater (pronounced fah-ter)", "Zeit (pronounced tsayt)")
                )
            ),
            exampleSentences = listOf(
                ExampleSentence("Guten Morgen, wie geht es Ihnen?", "Good morning, how are you? (Formal)", "goo-ten mor-gen, vee gayt es ee-nen"),
                ExampleSentence("Hallo! Wie geht's?", "Hi! How's it going? (Informal)", "hah-loh! vee gayts"),
                ExampleSentence("Danke, gut! Und Ihnen?", "Thanks, good! And you? (Formal)", "dahn-ke goot! oont ee-nen")
            ),
            dialogues = listOf(
                DialogueEntry("Herr Berg", "Guten Morgen, Frau Schmidt!", "Good morning, Mrs. Schmidt!"),
                DialogueEntry("Frau Schmidt", "Guten Morgen, Herr Berg! Wie geht es Ihnen?", "Good morning, Mr. Berg! How are you?"),
                DialogueEntry("Herr Berg", "Danke, gut! Und Ihnen?", "Thanks, good! And you?"),
                DialogueEntry("Frau Schmidt", "Auch gut, danke. Auf Wiedersehen!", "Also good, thank you. Goodbye!"),
                DialogueEntry("Herr Berg", "Auf Wiedersehen!", "Goodbye!")
            ),
            exercises = listOf(
                Exercise(
                    id = "ex_1_1",
                    question = "Fill in the missing word: Guten ________! (Good morning!)",
                    correctAnswer = "Morgen",
                    explanation = "'Morgen' means morning in 'Guten Morgen'.",
                    type = ExerciseType.FILL_IN_BLANK
                ),
                Exercise(
                    id = "ex_1_2",
                    question = "Which greeting is used to address your boss formally?",
                    options = listOf("Hallo, wie geht's?", "Guten Morgen, wie geht es Ihnen?", "Tschüss!"),
                    correctAnswer = "Guten Morgen, wie geht es Ihnen?",
                    explanation = "'wie geht es Ihnen?' is the polite formal greeting.",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_1_3",
                    question = "Translate to German: Goodbye! (Formal)",
                    correctAnswer = "Auf Wiedersehen",
                    explanation = "'Auf Wiedersehen' is the formal way to say goodbye.",
                    type = ExerciseType.TRANSLATION
                )
            )
        ),
        Lesson(
            id = "lesson_2",
            title = "Lektion 2: Zahlen (German Numbers 0-10)",
            description = "Master numbers 0 to 10 and practice phone number listening recognition.",
            order = 2,
            objectives = listOf(
                "Count from 0 to 10 in German.",
                "Understand and write down phone numbers pronounced in German."
            ),
            vocabulary = listOf(
                VocabularyItem("null", "0", "nool", "Null"),
                VocabularyItem("eins", "1", "eyens", "Eins"),
                VocabularyItem("zwei", "2", "tsvay", "Zwei"),
                VocabularyItem("drei", "3", "dray", "Drei"),
                VocabularyItem("vier", "4", "feer", "Vier"),
                VocabularyItem("fünf", "5", "fuenf", "Fünf"),
                VocabularyItem("sechs", "6", "zeks", "Sechs"),
                VocabularyItem("sieben", "7", "zee-ben", "Sieben"),
                VocabularyItem("acht", "8", "akht", "Acht"),
                VocabularyItem("neun", "9", "noyn", "Neun"),
                VocabularyItem("zehn", "10", "tsayn", "Zehn")
            ),
            grammarRules = listOf(
                GrammarRule(
                    title = "Number Pronunciation",
                    explanation = "Notice 'zwei' starts with 'z' (ts sound) and 'vier' starts with 'v' (f sound).",
                    examples = listOf("0173 = null eins sieben drei")
                )
            ),
            exampleSentences = listOf(
                ExampleSentence("Meine Telefonnummer ist zero eins sieben zwei.", "My phone number is 0172.", "my-ne te-le-fon-noo-mer ist..."),
                ExampleSentence("Ich habe drei Äpfel.", "I have three apples.", "eekh ha-be dray aep-fel")
            ),
            dialogues = listOf(
                DialogueEntry("Anna", "Wie ist deine Telefonnummer?", "What is your phone number?"),
                DialogueEntry("Ben", "Null eins sieben drei, fünf vier zwei.", "0173 542.")
            ),
            exercises = listOf(
                Exercise(
                    id = "ex_2_1",
                    question = "What is the German word for the number 4?",
                    options = listOf("drei", "vier", "fünf"),
                    correctAnswer = "vier",
                    explanation = "'vier' is 4.",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_2_2",
                    question = "Translate 'null eins sieben drei' to digits:",
                    correctAnswer = "0173",
                    explanation = "null=0, eins=1, sieben=7, drei=3.",
                    type = ExerciseType.FILL_IN_BLANK
                )
            )
        )
    )

    override fun getLessons(): List<Lesson> = lessonsList

    override fun getLessonById(id: String): Lesson? = lessonsList.find { it.id == id }
}
