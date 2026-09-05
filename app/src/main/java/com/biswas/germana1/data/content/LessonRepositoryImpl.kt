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
        ),
        Lesson(
            id = "lesson_3",
            title = "Lektion 3: নিজের পরিচয় (Sich vorstellen)",
            description = "নিজের নাম, দেশ, বসবাসের স্থান, বয়স এবং ভাষার কথা বলতে ও অন্যের পরিচয় জানতে শিখুন।",
            order = 3,
            objectives = listOf(
                "নিজের নাম বলা এবং অন্যের নাম জিজ্ঞাসা করা।",
                "নিজের নিজ দেশ (উৎস) বলা এবং অন্য জন কোথা থেকে এসেছে জিজ্ঞাসা করা।",
                "কোথায় বসবাস করেন তা বলা এবং অন্যের বসবাসের স্থান জিজ্ঞাসা করা।",
                "নিজের বয়স বলা এবং অন্যের বয়স জিজ্ঞাসা করা।",
                "কোন কোন ভাষায় কথা বলেন তা প্রকাশ করা।"
            ),
            vocabulary = listOf(
                VocabularyItem("der Name", "নাম", "দের না-মে", "Mein Name ist Karim."),
                VocabularyItem("heißen", "নাম হওয়া", "হাই-সেন", "Ich heiße Karim."),
                VocabularyItem("kommen", "আসা", "কো-মেন", "Ich komme aus Bangladesch."),
                VocabularyItem("aus", "থেকে", "আউস", "Er kommt aus Deutschland."),
                VocabularyItem("Deutschland", "জার্মানি", "দইচ-লান্ট", "Deutschland ist in Europa."),
                VocabularyItem("Bangladesch", "বাংলাদেশ", "বাংলা-দেশ", "Ich komme aus Bangladesch."),
                VocabularyItem("wohnen", "বাস করা / থাকা", "ভো-নেন", "Ich wohne in Dhaka."),
                VocabularyItem("in", "এ / মধ্যে", "ইন", "Sie wohnt in Berlin."),
                VocabularyItem("das Alter", "বয়স", "দাস আল-টার", "Das Alter ist nur eine Zahl."),
                VocabularyItem("Jahre", "বছর (বহুবচন)", "যা-রে", "Ich bin 20 Jahre alt."),
                VocabularyItem("sprechen", "কথা বলা", "স্প্রে-খেন", "Ich spreche Deutsch."),
                VocabularyItem("Deutsch", "জার্মান ভাষা", "দইচ", "Sprechen Sie Deutsch?"),
                VocabularyItem("Englisch", "ইংরেজি ভাষা", "এং-লিশ", "Ich spreche Englisch.")
            ),
            grammarRules = listOf(
                GrammarRule(
                    title = "নাম বলা ও জিজ্ঞাসা ('heißen')",
                    explanation = "'heißen' ক্রিয়া পদ ব্যবহার করে নাম বলা হয়।\n- Ich heiße ... (আমার নাম ...)\n- Wie heißt du? (তোমার নাম কী? - অনানুষ্ঠানিক)\n- Wie heißen Sie? (আপনার নাম কী? - আনুষ্ঠানিক)",
                    examples = listOf("Ich heiße Karim.", "Wie heißt du?", "Wie heißen Sie?")
                ),
                GrammarRule(
                    title = "উৎস বা দেশ প্রকাশ ('kommen' + 'aus')",
                    explanation = "'kommen' ক্রিয়ার সাথে 'aus' প্রিপজিশন ব্যবহার করে কোন দেশ থেকে এসেছেন তা বোঝানো হয়।\n- Ich komme aus Bangladesch.\n- Woher kommst du? (তুমি কোথা থেকে এসেছ?)\n- Woher kommen Sie? (আপনি কোথা থেকে এসেছেন?)",
                    examples = listOf("Ich komme aus Bangladesch.", "Woher kommst du?", "Woher kommen Sie?")
                ),
                GrammarRule(
                    title = "বসবাসের স্থান প্রকাশ ('wohnen' + 'in')",
                    explanation = "কোথায় থাকেন বা বাস করেন তা বলতে 'wohnen in' ব্যবহার করা হয়।\n- Ich wohne in Dhaka.\n- Wo wohnst du? (তুমি কোথায় থাকো?)\n- Wo wohnen Sie? (আপনি কোথায় থাকেন?)",
                    examples = listOf("Ich wohne in Dhaka.", "Wo wohnst du?", "Wo wohnen Sie?")
                ),
                GrammarRule(
                    title = "বয়স প্রকাশ ('sein' + 'Jahre alt')",
                    explanation = "জার্মান ভাষায় বয়স প্রকাশের জন্য 'sein' (bin/bist/sind) ক্রিয়া এবং 'Jahre alt' ব্যবহার করা হয়।\n- Ich bin 20 Jahre alt. (আমার বয়স ২০ বছর।)\n- Wie alt bist du? (তোমার বয়স কত?)\n- Wie alt sind Sie? (আপনার বয়স কত?)",
                    examples = listOf("Ich bin 20 Jahre alt.", "Wie alt bist du?", "Wie alt sind Sie?")
                ),
                GrammarRule(
                    title = "ভাষা প্রকাশ ('sprechen')",
                    explanation = "ভাষা বলার সময় 'sprechen' ক্রিয়াটি ব্যবহৃত হয় (du রূপ: sprichst)।\n- Ich spreche Bangla und Englisch.\n- Welche Sprachen sprichst du? (তুমি কোন ভাষাগুলো বলো?)",
                    examples = listOf("Ich spreche Bangla und Englisch.", "Welche Sprachen sprichst du?")
                ),
                GrammarRule(
                    title = "মৌলিক প্রশ্নসূচক শব্দ (W-Fragen)",
                    explanation = "তথ্যাদি জানতে প্রশ্নসূচক শব্দ ব্যবহার করা হয়:\n- Wie (কী/কেমন)\n- Woher (কোথা থেকে)\n- Wo (কোথায়)\n- Welche (কোনটি/কোনগুলো)",
                    examples = listOf("Wie heißt du?", "Woher kommst du?", "Wo wohnst du?", "Welche Sprachen sprichst du?")
                )
            ),
            exampleSentences = listOf(
                ExampleSentence("Ich heiße Karim und ich komme aus Bangladesch.", "আমার নাম করিম এবং আমি বাংলাদেশ থেকে এসেছি।", "ইখ হাই-সে করিম উন্ট ইখ কো-মে আউস বাংলা-দেশ"),
                ExampleSentence("Ich wohne in Dhaka und ich bin 20 Jahre alt.", "আমি ঢাকায় থাকি এবং আমার বয়স ২০ বছর।", "ইখ ভো-নে ইন ঢাকা উন্ট ইখ বিন ২০ যা-রে আল্ট"),
                ExampleSentence("Ich spreche Bangla, Englisch und ein bisschen Deutsch.", "আমি বাংলা, ইংরেজি এবং অল্প কিছু জার্মান বলি।", "ইখ স্প্রে-খে বাংলা, এং-লিশ উন্ট আইন বিস-খেন দইচ")
            ),
            dialogues = listOf(
                DialogueEntry("Anna", "Hallo! Wie heißt du?", "হ্যালো! তোমার নাম কী?"),
                DialogueEntry("Karim", "Hallo! Ich heiße Karim. Und du?", "হ্যালো! আমার নাম করিম। আর তোমার?"),
                DialogueEntry("Anna", "Ich heiße Anna. Woher kommst du?", "আমার নাম আন্না। তুমি কোথা থেকে এসেছ?"),
                DialogueEntry("Karim", "Ich komme aus Bangladesch. Und du?", "আমি বাংলাদেশ থেকে এসেছি। আর তুমি?"),
                DialogueEntry("Anna", "Ich komme aus Deutschland. Wo wohnst du?", "আমি জার্মানি থেকে এসেছি। তুমি কোথায় থাকো?"),
                DialogueEntry("Karim", "Ich wohne in Dhaka. Wie alt bist du?", "আমি ঢাকায় থাকি। তোমার বয়স কত?"),
                DialogueEntry("Anna", "Ich bin 22 Jahre alt. Und du?", "আমার বয়স ২২ বছর। আর তোমার?"),
                DialogueEntry("Karim", "Ich bin 20 Jahre alt.", "আমার বয়স ২০ বছর।"),
                DialogueEntry("Anna", "Welche Sprachen sprichst du?", "তুমি কোন ভাষাগুলো বলো?"),
                DialogueEntry("Karim", "Ich spreche Bangla, Englisch und Deutsch.", "আমি বাংলা, ইংরেজি এবং জার্মান বলি।")
            ),
            exercises = listOf(
                Exercise(
                    id = "ex_3_1",
                    question = "জার্মান প্রশ্ন 'Wie heißt du?' - এর সঠিক বাংলা অর্থ কোনটি?",
                    options = listOf("তোমার বয়স কত?", "তোমার নাম কী?", "তুমি কোথায় থাকো?", "তুমি কোথা থেকে এসেছ?"),
                    correctAnswer = "তোমার নাম কী?",
                    explanation = "'Wie heißt du?' এর বাংলা অর্থ 'তোমার নাম কী?'।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_3_2",
                    question = "শূন্যস্থান পূরণ করুন: Ich komme ___ Bangladesch.",
                    options = listOf("aus", "in", "bin", "heiße"),
                    correctAnswer = "aus",
                    explanation = "উৎসের দেশ বোঝাতে 'kommen' এর পর 'aus' প্রিপজিশন বসে।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_3_3",
                    question = "জার্মানে অনুবাদ করুন: আমার বয়স ২০ বছর।",
                    correctAnswer = "Ich bin 20 Jahre alt.",
                    explanation = "বয়স প্রকাশ করতে 'Ich bin [সংখ্যা] Jahre alt' প্যাটার্ন ব্যবহৃত হয়।",
                    type = ExerciseType.TRANSLATION
                ),
                Exercise(
                    id = "ex_3_4",
                    question = "জার্মান প্রশ্ন 'Wo wohnst du?' - এর সঠিক অর্থ কী?",
                    options = listOf("তোমার নাম কী?", "তুমি কোথায় থাকো?", "তুমি কেমন আছো?", "তোমার বয়স কত?"),
                    correctAnswer = "তুমি কোথায় থাকো?",
                    explanation = "'Wo wohnst du?' অর্থ 'তুমি কোথায় থাকো?'।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_3_5",
                    question = "শূন্যস্থান পূরণ করুন: Welche Sprachen ________ du? (তুমি কোন ভাষাগুলো বলো?)",
                    correctAnswer = "sprichst",
                    explanation = "'du' এর ক্ষেত্রে 'sprechen' ক্রিয়াটি 'sprichst' রূপ ধারণ করে।",
                    type = ExerciseType.FILL_IN_BLANK
                ),
                Exercise(
                    id = "ex_3_6",
                    question = "জার্মানে অনুবাদ করুন: আমি ঢাকায় থাকি।",
                    correctAnswer = "Ich wohne in Dhaka.",
                    explanation = "'wohnen in' দিয়ে বসবাসের স্থান প্রকাশ করা হয়।",
                    type = ExerciseType.TRANSLATION
                ),
                Exercise(
                    id = "ex_3_7",
                    question = "কারো কাছে আনুষ্ঠানিকভাবে তাঁর দেশ/উৎস সম্পর্কে জানতে কোনটি বলবেন?",
                    options = listOf("Woher kommst du?", "Woher kommen Sie?", "Wie heißt du?"),
                    correctAnswer = "Woher kommen Sie?",
                    explanation = "মার্জিত বা আনুষ্ঠানিক প্রশ্নের ক্ষেত্রে 'Woher kommen Sie?' বলা হয়।",
                    type = ExerciseType.MULTIPLE_CHOICE
                )
            )
        ),
        Lesson(
            id = "lesson_4",
            title = "Lektion 4: আমার পরিবার (Meine Familie)",
            description = "পরিবারের সদস্যদের নাম, পরিচয় দেওয়া, অধিকার প্রকাশ (mein/meine) এবং পরিবার সম্পর্কিত সাধারণ প্রশ্নোত্তর শিখুন।",
            order = 4,
            objectives = listOf(
                "পরিবারের মৌলিক সদস্যদের নাম জার্মান ভাষায় বলা।",
                "কাউকে পরিচয় করিয়ে দেওয়া ('Das ist...')।",
                "পজেসিভ প্রোনাউন 'mein / meine' এবং 'dein / deine'-এর সঠিক ব্যবহার শেখা।",
                "ভাই-বোন ও পরিবার নিয়ে সহজ প্রশ্ন করা ও উত্তর দেওয়া।",
                "পরিবার সম্পর্কিত সংক্ষিপ্ত কথোপকথন বোঝা।"
            ),
            vocabulary = listOf(
                VocabularyItem("die Familie", "পরিবার", "দি ফা-মি-লি-য়ে", "Meine Familie ist groß."),
                VocabularyItem("die Mutter", "মা", "দি মু-টার", "Das ist meine Mutter."),
                VocabularyItem("der Vater", "বাবা", "দের ফা-টার", "Das ist mein Vater."),
                VocabularyItem("die Eltern", "বাবা-মা / পিতা-মাতা", "দি এল-টার্ন", "Meine Eltern wohnen in Dhaka."),
                VocabularyItem("der Bruder", "ভাই", "দের ব্রু-ডার", "Ich habe einen Bruder."),
                VocabularyItem("die Schwester", "বোন", "দি শ্বে-স্টার", "Ich habe eine Schwester."),
                VocabularyItem("der Sohn", "ছেলে / পুত্র", "দের জোন", "Das ist mein Sohn."),
                VocabularyItem("die Tochter", "মেয়ে / কন্যা", "দি তোখ-টার", "Das ist meine Tochter."),
                VocabularyItem("das Kind", "শিশু / সন্তান", "দাস কিন্ট", "Das Kind spielt."),
                VocabularyItem("der Mann", "পুরুষ / স্বামী", "দের মান", "Mein Mann heißt Rahat."),
                VocabularyItem("die Frau", "নারী / স্ত্রী", "দি ফ্রাউ", "Meine Frau heißt Salma."),
                VocabularyItem("die Oma", "দাদি / নানি", "দি ও-মা", "Meine Oma ist sehr nett."),
                VocabularyItem("der Opa", "দাদা / নানা", "দের ও-পা", "Mein Opa wohnt in Berlin."),
                VocabularyItem("die Geschwister", "ভাই-বোন (বহুবচন)", "দি গে-শ্বিস-টার", "Hast du Geschwister?")
            ),
            grammarRules = listOf(
                GrammarRule(
                    title = "পজেসিভ প্রোনাউন ('mein / meine' এবং 'dein / deine')",
                    explanation = "'mein' এবং 'meine' দুটোর অর্থই 'আমার'। জার্মান ভাষায় noun-এর gender অনুযায়ী রূপ পরিবর্তন হয়:\n- Masculine (der) ও Neuter (das)-এর ক্ষেত্রে: mein / dein\n- Feminine (die) ও Plural (die)-এর ক্ষেত্রে: meine / deine",
                    examples = listOf(
                        "mein Vater (আমার বাবা) [der Vater]",
                        "meine Mutter (আমার মা) [die Mutter]",
                        "dein Bruder (তোমার ভাই) [der Bruder]",
                        "deine Schwester (তোমার বোন) [die Schwester]"
                    )
                ),
                GrammarRule(
                    title = "পরিচয় করিয়ে দেওয়া ('Das ist...')",
                    explanation = "'Das ist...' এর মাধ্যমে কোনো ব্যক্তি বা বস্তুকে পরিচয় করিয়ে দেওয়া হয় (অর্থ: ইনি ... / এই যে ...)।",
                    examples = listOf(
                        "Das ist mein Vater. (ইনি আমার বাবা।)",
                        "Das ist meine Mutter. (ইনি আমার মা।)"
                    )
                ),
                GrammarRule(
                    title = "সম্পর্ক বা অধিকার প্রকাশ ('haben')",
                    explanation = "নিজের ভাই, বোন বা সন্তান আছে তা বলতে 'haben' ক্রিয়া ব্যবহৃত হয় (akku. masculin-এ 'einen', feminin-এ 'eine'):\n- Ich habe einen Bruder.\n- Ich habe eine Schwester.",
                    examples = listOf(
                        "Ich habe einen Bruder. (আমার একজন ভাই আছে।)",
                        "Ich habe eine Schwester. (আমার একজন বোন আছে।)"
                    )
                ),
                GrammarRule(
                    title = "পরিবার সম্পর্কিত প্রশ্ন (Familienfragen)",
                    explanation = "পরিবার সম্পর্কে সাধারণ প্রশ্ন করার নিয়ম:\n- Wer ist das? (উনি কে? / এটি কে?)\n- Ist das dein Vater? (উনি কি তোমার বাবা?)\n- Hast du Geschwister? (তোমার কি ভাই-বোন আছে?)",
                    examples = listOf(
                        "Wer ist das? - Das ist meine Schwester.",
                        "Hast du Geschwister? - Ja, ich habe einen Bruder."
                    )
                )
            ),
            exampleSentences = listOf(
                ExampleSentence("Das ist meine Mutter.", "ইনি আমার মা।", "দাস ইস্ট মাই-নে মু-টার"),
                ExampleSentence("Das ist mein Vater.", "ইনি আমার বাবা।", "দাস ইস্ট ভাইন ফা-টার"),
                ExampleSentence("Ich habe einen Bruder.", "আমার একজন ভাই আছে।", "ইখ হা-বে আই-নেন ব্রু-ডার"),
                ExampleSentence("Ich habe eine Schwester.", "আমার একজন বোন আছে।", "ইখ হা-বে আই-নে শ্বে-স্টার"),
                ExampleSentence("Meine Familie ist klein.", "আমার পরিবার ছোট।", "মাই-নে ফা-মি-লি-য়ে ইস্ট ক্লাইন"),
                ExampleSentence("Meine Familie ist groß.", "আমার পরিবার বড়।", "মাই-নে ফা-মি-লি-য়ে ইস্ট গ্রোস")
            ),
            dialogues = listOf(
                DialogueEntry("A", "Hallo! Das ist meine Familie.", "হ্যালো! এটি আমার পরিবার।"),
                DialogueEntry("B", "Wer ist das?", "উনি কে?"),
                DialogueEntry("A", "Das ist mein Vater.", "ইনি আমার বাবা।"),
                DialogueEntry("B", "Und wer ist das?", "আর উনি কে?"),
                DialogueEntry("A", "Das ist meine Mutter.", "ইনি আমার মা।"),
                DialogueEntry("B", "Hast du Geschwister?", "তোমার কি ভাই-বোন আছে?"),
                DialogueEntry("A", "Ja. Ich habe einen Bruder und eine Schwester.", "হ্যাঁ। আমার একজন ভাই এবং একজন বোন আছে।"),
                DialogueEntry("B", "Wie heißt dein Bruder?", "তোমার ভাইয়ের নাম কী?"),
                DialogueEntry("A", "Er heißt Karim.", "তার নাম করিম।")
            ),
            exercises = listOf(
                Exercise(
                    id = "ex_4_1",
                    question = "'Das ist meine Mutter.' - এর বাংলা অর্থ কী?",
                    options = listOf("ইনি আমার বাবা।", "ইনি আমার মা।", "এটি আমার ভাই।", "এটি আমার বোন।"),
                    correctAnswer = "ইনি আমার মা।",
                    explanation = "'Mutter' শব্দের অর্থ মা, তাই সঠিক অর্থ 'ইনি আমার মা।'",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_4_2",
                    question = "শূন্যস্থান পূরণ করুন: Das ist ___ Vater.",
                    options = listOf("meine", "mein", "deine", "eine"),
                    correctAnswer = "mein",
                    explanation = "'Vater' হলো Masculine (der Vater), তাই 'mein' বসবে।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_4_3",
                    question = "'Das ist meine Schwester.' বাক্যে 'Schwester' এর বাংলা অর্থ কী?",
                    correctAnswer = "বোন",
                    explanation = "'Schwester' শব্দের অর্থ বোন।",
                    type = ExerciseType.FILL_IN_BLANK
                ),
                Exercise(
                    id = "ex_4_4",
                    question = "'Hast du Geschwister?' - এর বাংলা অর্থ কী?",
                    options = listOf("তোমার বয়স কত?", "তোমার কি ভাই-বোন আছে?", "তোমার ভাই কোথায়?", "তোমার নাম কী?"),
                    correctAnswer = "তোমার কি ভাই-বোন আছে?",
                    explanation = "'Geschwister' মানে ভাই-বোন, প্রশ্নটির অর্থ 'তোমার কি ভাই-বোন আছে?'।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_4_5",
                    question = "জার্মানে অনুবাদ করুন: আমার একজন ভাই আছে।",
                    correctAnswer = "Ich habe einen Bruder.",
                    explanation = "'Bruder' শব্দের পূর্বে 'einen' ব্যবহৃত হয় (Ich habe einen Bruder)।",
                    type = ExerciseType.TRANSLATION
                ),
                Exercise(
                    id = "ex_4_6",
                    question = "শূন্যস্থান পূরণ করুন: Das ist ___ Mutter. (ইনি আমার মা।)",
                    correctAnswer = "meine",
                    explanation = "'Mutter' হলো Feminine (die Mutter), তাই 'meine' ব্যবহৃত হয়।",
                    type = ExerciseType.FILL_IN_BLANK
                ),
                Exercise(
                    id = "ex_4_7",
                    question = "জার্মানে অনুবাদ করুন: উনি কে?",
                    correctAnswer = "Wer ist das?",
                    explanation = "কাউকে পরিচয় জানতে চাইতে 'Wer ist das?' জিজ্ঞেস করতে হয়।",
                    type = ExerciseType.TRANSLATION
                )
            )
        )
    )

    override fun getLessons(): List<Lesson> = lessonsList

    override fun getLessonById(id: String): Lesson? = lessonsList.find { it.id == id }
}
