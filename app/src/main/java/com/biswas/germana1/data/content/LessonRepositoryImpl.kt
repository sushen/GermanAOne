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
            title = "Lektion 1: জার্মান বর্ণমালা, উচ্চারণ ও মৌলিক সম্ভাষণ",
            description = "জার্মান বর্ণমালা, উচ্চারণের মৌলিক নিয়ম এবং আনুষ্ঠানিক ও অনানুষ্ঠানিক সম্ভাষণ শিখুন।",
            order = 1,
            objectives = listOf(
                "জার্মান বর্ণমালা এবং বিশেষ বর্ণসমূহ (Ä, Ö, Ü, ß) উচ্চারণ করা।",
                "উচ্চারণের মৌলিক নিয়মাবলী (W, V, Z, EI, IE) বোঝা।",
                "আনুষ্ঠানিকভাবে (Sie) এবং অনানুষ্ঠানিকভাবে (du) সম্ভাষণ জানানো।",
                "বিদায় জানানো এবং 'কেমন আছেন?' জিজ্ঞাসা করা।"
            ),
            vocabulary = listOf(
                VocabularyItem("Hallo", "হ্যালো / ওহে", "হা-লো", "Hallo, wie geht's?"),
                VocabularyItem("Guten Morgen", "শুভ সকাল / সুপ্রভাত", "গু-টেন মোর-গেন", "Guten Morgen, Herr Müller!"),
                VocabularyItem("Guten Tag", "শুভ দিন / হ্যালো", "গু-টেন তাক", "Guten Tag!"),
                VocabularyItem("Guten Abend", "শুভ সন্ধ্যা", "গু-টেন আ-বেন্ট", "Guten Abend, Frau Weber!"),
                VocabularyItem("Gute Nacht", "শুভ রাত্রি", "গু-টে নাখ্ত", "Gute Nacht, schlaf gut!"),
                VocabularyItem("Tschüss", "বাই (অনানুষ্ঠানিক)", "চুস", "Tschüss, bis morgen!"),
                VocabularyItem("Auf Wiedersehen", "বিদায় (আনুষ্ঠানিক)", "আউফ ভি-ডের-জে-এন", "Auf Wiedersehen!"),
                VocabularyItem("Wie geht es Ihnen?", "আপনি কেমন আছেন? (আনুষ্ঠানিক)", "ভি গেত এস ই-ნენ", "Guten Tag, wie geht es Ihnen?"),
                VocabularyItem("Wie geht's?", "তুমি কেমন আছো? (অনানুষ্ঠানিক)", "ভি গেৎস", "Hallo Nina, wie geht's?"),
                VocabularyItem("Danke, gut!", "ধন্যবাদ, ভালো!", "দান-কে গুত", "Danke, gut! Und dir?")
            ),
            grammarRules = listOf(
                GrammarRule(
                    title = "আনুষ্ঠানিক বনাম অনানুষ্ঠানিক ('Sie' বনাম 'du')",
                    explanation = "'Sie' (বড় হাতের) বয়স্ক, অপরিচিত ব্যক্তি এবং বসের সাথে ব্যবহৃত হয়। 'du' বন্ধু, পরিবার এবং সমবয়সীদের সাথে ব্যবহৃত হয়।",
                    examples = listOf("আনুষ্ঠানিক: Wie geht es Ihnen?", "অনানুষ্ঠানিক: Wie geht es dir? / Wie geht's?")
                ),
                GrammarRule(
                    title = "জার্মান বিশেষ বর্ণ ও উচ্চারণ",
                    explanation = "Ä (যেমন bed), Ö (ঠোঁট গোল করে 'এ'), Ü (ঠোঁট গোল করে 'ই'), ß ('স' ধ্বনি)। 'W' এর উচ্চারণ 'V' (ভ)-এর মতো, 'V' এর উচ্চারণ 'F' (ফ)-এর মতো, 'Z' এর উচ্চারণ 'TS' (ৎস)-এর মতো।",
                    examples = listOf("Wie (উচ্চারণ: ভি)", "Vater (উচ্চারণ: ফা-টার)", "Zeit (উচ্চারণ: ত্সাইত)")
                )
            ),
            exampleSentences = listOf(
                ExampleSentence("Guten Morgen, wie geht es Ihnen?", "শুভ সকাল, আপনি কেমন আছেন? (আনুষ্ঠানিক)", "গু-টেন মোর-গেন, ভি গেত এস ই-ნენ"),
                ExampleSentence("Hallo! Wie geht's?", "হ্যালো! তুমি কেমন আছো? (অনানুষ্ঠানিক)", "হা-লো! ভি গেৎস"),
                ExampleSentence("Danke, gut! Und Ihnen?", "ধন্যবাদ, ভালো! আর আপনি? (আনুষ্ঠানিক)", "দান-কে গুত! উন্ট ই-ნენ")
            ),
            dialogues = listOf(
                DialogueEntry("Herr Berg", "Guten Morgen, Frau Schmidt!", "শুভ সকাল, মিসেস স্মিট!"),
                DialogueEntry("Frau Schmidt", "Guten Morgen, Herr Berg! Wie geht es Ihnen?", "শুভ সকাল, মি. বার্গ! আপনি কেমন আছেন?"),
                DialogueEntry("Herr Berg", "Danke, gut! Und Ihnen?", "ধন্যবাদ, ভালো! আর আপনি?"),
                DialogueEntry("Frau Schmidt", "Auch gut, danke. Auf Wiedersehen!", "আমিও ভালো, ধন্যবাদ। বিদায়!"),
                DialogueEntry("Herr Berg", "Auf Wiedersehen!", "বিদায়!")
            ),
            exercises = listOf(
                Exercise(
                    id = "ex_1_1",
                    question = "শূন্যস্থান পূরণ করুন: Guten ________! (শুভ সকাল!)",
                    correctAnswer = "Morgen",
                    explanation = "'Guten Morgen' বাক্যে 'Morgen' শব্দের অর্থ সকাল।",
                    type = ExerciseType.FILL_IN_BLANK
                ),
                Exercise(
                    id = "ex_1_2",
                    question = "আপনার বসকে আনুষ্ঠানিকভাবে সম্ভাষণ জানাতে কোনটি ব্যবহার করবেন?",
                    options = listOf("Hallo, wie geht's?", "Guten Morgen, wie geht es Ihnen?", "Tschüss!"),
                    correctAnswer = "Guten Morgen, wie geht es Ihnen?",
                    explanation = "'wie geht es Ihnen?' হলো মার্জিত ও আনুষ্ঠানিক সম্ভাষণ।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_1_3",
                    question = "জার্মানে অনুবাদ করুন: বিদায়! (আনুষ্ঠানিক)",
                    correctAnswer = "Auf Wiedersehen",
                    explanation = "'Auf Wiedersehen' হলো বিদায় জানানোর আনুষ্ঠানিক রূপ।",
                    type = ExerciseType.TRANSLATION
                )
            )
        ),
        Lesson(
            id = "lesson_2",
            title = "Lektion 2: Zahlen (জার্মান সংখ্যা ০–১০)",
            description = "০ থেকে ১০ পর্যন্ত সংখ্যা আয়ত্ত করুন এবং ফোন নম্বর শুনে চেনার অনুশীলন করুন।",
            order = 2,
            objectives = listOf(
                "জার্মানে ০ থেকে ১০ পর্যন্ত গণনা করা।",
                "জার্মানে উচ্চারিত ফোন নম্বর বোঝা ও লেখা।"
            ),
            vocabulary = listOf(
                VocabularyItem("null", "০ (শূন্য)", "নুল", "Null"),
                VocabularyItem("eins", "১ (এক)", "আইনস", "Eins"),
                VocabularyItem("zwei", "২ (দুই)", "ত্সবাই", "Zwei"),
                VocabularyItem("drei", "৩ (তিন)", "ড্রাই", "Drei"),
                VocabularyItem("vier", "৪ (চার)", "ফিয়ার", "Vier"),
                VocabularyItem("fünf", "৫ (পাঁচ)", "ফিউনফ", "Fünf"),
                VocabularyItem("sechs", "৬ (ছয়)", "জেক্স", "Sechs"),
                VocabularyItem("sieben", "৭ (সাত)", "জিবেন", "Sieben"),
                VocabularyItem("acht", "৮ (আট)", "আখ্ত", "Acht"),
                VocabularyItem("neun", "৯ (নয়)", "নয়ন", "Neun"),
                VocabularyItem("zehn", "১০ (দশ)", "ত্সেন", "Zehn")
            ),
            grammarRules = listOf(
                GrammarRule(
                    title = "সংখ্যার উচ্চারণ",
                    explanation = "খেয়াল করুন 'zwei' শুরু হয় 'z' (ৎস ধ্বনি) দিয়ে এবং 'vier' শুরু হয় 'v' (ফ ধ্বনি) দিয়ে।",
                    examples = listOf("0173 = null eins sieben drei")
                )
            ),
            exampleSentences = listOf(
                ExampleSentence("Meine Telefonnummer ist zero eins sieben zwei.", "আমার ফোন নম্বর ০১৭২।", "মাই-নে টে-লে-ফোন-নুমের ইস্ট..."),
                ExampleSentence("Ich habe drei Äpfel.", "আমার তিনটি আপেল আছে।", "ইখ হা-বে ড্রাই এপ-ফেল")
            ),
            dialogues = listOf(
                DialogueEntry("Anna", "Wie ist deine Telefonnummer?", "তোমার ফোন নম্বর কত?"),
                DialogueEntry("Ben", "Null eins sieben drei, fünf vier zwei.", "০১৭৩ ৫৪২।")
            ),
            exercises = listOf(
                Exercise(
                    id = "ex_2_1",
                    question = "জার্মানে সংখ্যা ৪ (চার)-এর জন্য ব্যবহৃত শব্দ কোনটি?",
                    options = listOf("drei", "vier", "fünf"),
                    correctAnswer = "vier",
                    explanation = "'vier' মানে ৪ (চার)।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_2_2",
                    question = "'null eins sieben drei' সংখ্যাটি ডিজিটে লিখুন:",
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
