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
        ),
        Lesson(
            id = "lesson_5",
            title = "Lektion 5: আমার দৈনন্দিন জীবন (Mein Alltag)",
            description = "দৈনন্দিন কাজের বিবরণ দেওয়া, সময় উল্লেখ করে কাজ করা, separable verb 'aufstehen' এবং দৈনন্দিন রুটিন সম্পর্কে বলা ও প্রশ্ন করা শিখুন।",
            order = 5,
            objectives = listOf(
                "ঘুম থেকে ওঠা, নাশতা করা, কাজ/পড়াশোনা, দুপুরের খাবার, বাড়ি ফেরা ও ঘুমানোর কথা বলা।",
                "নির্দিষ্ট সময় বোঝাতে 'um' (যেমন: um sieben Uhr) এবং দিনের অংশ বোঝাতে 'am Morgen / am Nachmittag / am Abend / in der Nacht' ব্যবহার করা।",
                "Separable verb 'aufstehen' বাক্যে সঠিকভাবে ব্যবহার করা (Ich stehe um sieben Uhr auf)।",
                "দৈনন্দিন জীবন সম্পর্কিত সহজ প্রশ্ন করা ও উত্তর দেওয়া।"
            ),
            vocabulary = listOf(
                VocabularyItem("der Alltag", "দৈনন্দিন জীবন", "দের আল-তাক", "Das ist mein Alltag."),
                VocabularyItem("der Morgen", "সকাল", "দের মোর-গেন", "Ich arbeite am Morgen."),
                VocabularyItem("der Vormittag", "সকাল / দুপুরের আগের সময়", "দের ফোর-মি-তাক", "Am Vormittag lerne ich."),
                VocabularyItem("der Mittag", "দুপুর", "দের মি-তাক", "Ich esse um 12:00 Uhr zu Mittag."),
                VocabularyItem("der Nachmittag", "বিকেল / দুপুরের পরের সময়", "দের নাখ-মি-তাক", "Am Nachmittag trinke ich Tee."),
                VocabularyItem("der Abend", "সন্ধ্যা / রাতের শুরুর সময়", "দের আ-বেন্ট", "Am Abend lerne ich Deutsch."),
                VocabularyItem("die Nacht", "রাত", "দি নাখ্ত", "In der Nacht schlafe ich."),
                VocabularyItem("aufstehen", "ঘুম থেকে ওঠা", "আউফ-স্টে-এন", "Ich stehe um sieben Uhr auf."),
                VocabularyItem("frühstücken", "নাশতা করা", "ফ্রিউ-স্ট্যু-কেন", "Ich frühstücke um acht Uhr."),
                VocabularyItem("essen", "খাওয়া / খাবার খাওয়া", "এস-সেন", "Ich esse einen Apfel."),
                VocabularyItem("trinken", "পান করা", "ট্রিন-কেন", "Ich trinke Wasser."),
                VocabularyItem("arbeiten", "কাজ করা", "আর-বাই-তেন", "Ich arbeite um neun Uhr."),
                VocabularyItem("lernen", "শেখা / পড়াশোনা করা", "লের-নেন", "Ich lerne viel."),
                VocabularyItem("Deutsch lernen", "জার্মান শেখা", "দইচ লের-নেন", "Ich lerne Deutsch am Abend."),
                VocabularyItem("zur Schule gehen", "স্কুলে যাওয়া", "ত্সুর শু-লে গে-এন", "Er geht zur Schule."),
                VocabularyItem("nach Hause gehen", "বাড়ি যাওয়া", "নাখ হাউ-জে গে-এন", "Ich gehe nach Hause."),
                VocabularyItem("kochen", "রান্না করা", "কো-খেন", "Ich koche am Abend."),
                VocabularyItem("lesen", "পড়া", "লে-জেন", "Ich lese ein Buch."),
                VocabularyItem("fernsehen", "টিভি দেখা", "ফের্ন-জে-এন", "Ich sehe am Abend fern."),
                VocabularyItem("schlafen", "ঘুমানো", "শ্লা-ফেন", "Ich schlafe um elf Uhr."),
                VocabularyItem("ins Bett gehen", "বিছানায় যাওয়া", "ইনস বেট গে-এন", "Ich gehe um 23:00 Uhr ins Bett.")
            ),
            grammarRules = listOf(
                GrammarRule(
                    title = "বর্তমান কাল ও সাধারণ বাক্যের গঠন (Präsens)",
                    explanation = "জার্মান ভাষায় সাধারণ বাক্য গঠনে subject-এর পর Verb বসে (Verb সবসময় ২ নম্বর পজিশনে থাকে):\n- Ich arbeite. (আমি কাজ করি।)\n- Ich lerne Deutsch. (আমি জার্মান শিখি।)",
                    examples = listOf(
                        "Ich arbeite. (আমি কাজ করি।)",
                        "Ich lerne Deutsch. (আমি জার্মান শিখি।)"
                    )
                ),
                GrammarRule(
                    title = "সময় প্রকাশের অব্যয় ('um' এবং 'am')",
                    explanation = "১. 'um' ব্যবহার করে ঘড়ির নির্দিষ্ট সময় বোঝানো হয়:\n- um sieben Uhr (সাতটায়)\n- um acht Uhr (আটটায়)\n২. 'am' ব্যবহার করে দিনের বিভিন্ন অংশ বোঝানো হয়:\n- am Morgen (সকালে)\n- am Nachmittag (বিকেলে)\n- am Abend (সন্ধ্যায়)\n(ব্যতিক্রম: in der Nacht = রাতে)",
                    examples = listOf(
                        "Ich arbeite um neun Uhr. (আমি নয়টায় কাজ করি।)",
                        "Ich lerne am Abend Deutsch. (আমি সন্ধ্যায় জার্মান শিখি।)"
                    )
                ),
                GrammarRule(
                    title = "Separable Verb ('aufstehen')",
                    explanation = "'aufstehen' একটি separable (পৃথকযোগ্য) verb। সাধারণ বাক্যে মূল Verb 'stehe' দ্বিতীয় স্থানে বসে এবং 'auf' অংশটি বাক্যের একেবারে শেষে চলে যায়:\n- Ich stehe um sieben Uhr auf.",
                    examples = listOf(
                        "Ich stehe um sieben Uhr auf. (আমি সাতটায় উঠি।)",
                        "Wann stehst du auf? (তুমি কখন ওঠো?)"
                    )
                ),
                GrammarRule(
                    title = "দৈনন্দিন রুটিন ও সহজ বাক্য প্যাটার্ন",
                    explanation = "দৈনন্দিন কাজ প্রকাশের সহজ প্যাটার্নসমূহ:\n- Ich + verb: Ich arbeite.\n- Ich + verb + time: Ich arbeite um neun Uhr.\n- Ich + activity + time: Ich frühstücke um acht Uhr.",
                    examples = listOf(
                        "Ich frühstücke um acht Uhr. (আমি আটটায় নাশতা করি।)",
                        "Ich komme um 18:00 Uhr nach Hause. (আমি সন্ধ্যা ৬টায় বাড়ি ফিরি।)"
                    )
                )
            ),
            exampleSentences = listOf(
                ExampleSentence("Ich stehe um sieben Uhr auf.", "আমি সাতটায় উঠি।", "ইখ স্টে-হে উম জিবেন উর আউফ"),
                ExampleSentence("Ich frühstücke um acht Uhr.", "আমি আটটায় নাশতা করি।", "ইখ ফ্রিউ-স্ট্যু-কে উম আখ্ত উর"),
                ExampleSentence("Ich arbeite am Morgen.", "আমি সকালে কাজ করি।", "ইখ আর-বাই-টে আম মোর-গেন"),
                ExampleSentence("Ich esse zu Mittag um 13:00 Uhr.", "আমি বেলা ১টায় দুপুরের খাবার খাই।", "ইখ এস-সে ত্সু মি-তাক..."),
                ExampleSentence("Ich komme nach Hause.", "আমি বাড়িতে ফিরি।", "ইখ কো-মে নাখ হাউ-জে"),
                ExampleSentence("Ich lerne am Abend Deutsch.", "আমি সন্ধ্যায় জার্মান শিখি।", "ইখ লের-নে আম আ-বেন্ট দইচ"),
                ExampleSentence("Ich schlafe um elf Uhr.", "আমি রাত এগারোটায় ঘুমাই।", "ইখ শ্লা-ফে উম এলফ উর")
            ),
            dialogues = listOf(
                DialogueEntry("A", "Wann stehst du auf?", "তুমি কখন ঘুম থেকে ওঠো?"),
                DialogueEntry("B", "Ich stehe um sieben Uhr auf.", "আমি সাতটায় উঠি।"),
                DialogueEntry("A", "Wann frühstückst du?", "তুমি কখন নাশতা করো?"),
                DialogueEntry("B", "Ich frühstücke um acht Uhr.", "আমি আটটায় নাশতা করি।"),
                DialogueEntry("A", "Arbeitest du am Morgen?", "তুমি কি সকালে কাজ করো?"),
                DialogueEntry("B", "Ja. Ich arbeite um neun Uhr.", "হ্যাঁ। আমি নয়টায় কাজ করি।"),
                DialogueEntry("A", "Und wann lernst du Deutsch?", "আর তুমি কখন জার্মান শিখো?"),
                DialogueEntry("B", "Ich lerne Deutsch am Abend.", "আমি সন্ধ্যায় জার্মান শিখি।"),
                DialogueEntry("A", "Wann gehst du ins Bett?", "তুমি কখন বিছানায় যাও?"),
                DialogueEntry("B", "Ich gehe um elf Uhr ins Bett.", "আমি রাত এগারোটায় বিছানায় যাই।")
            ),
            exercises = listOf(
                Exercise(
                    id = "ex_5_1",
                    question = "\"am Morgen\" এর বাংলা অর্থ কী?",
                    options = listOf("সকালে", "রাতে", "বিকেলে", "দুপুরে"),
                    correctAnswer = "সকালে",
                    explanation = "'am Morgen' শব্দের অর্থ সকালে।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_5_2",
                    question = "\"Ich stehe um sieben Uhr auf.\" এর বাংলা অর্থ কী?",
                    options = listOf("আমি সাতটায় ঘুমাই।", "আমি সাতটায় উঠি।", "আমি সাতটায় কাজ করি।", "আমি সাতটায় নাশতা করি।"),
                    correctAnswer = "আমি সাতটায় উঠি।",
                    explanation = "'aufstehen' মানে ঘুম থেকে ওঠা, তাই সঠিক উত্তর 'আমি সাতটায় উঠি।'",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_5_3",
                    question = "শূন্যস্থান পূরণ করুন: Ich stehe um sieben Uhr ___.",
                    options = listOf("ein", "aus", "auf", "an"),
                    correctAnswer = "auf",
                    explanation = "'aufstehen' ক্রিয়াটির 'auf' অংশটি বাক্যের শেষে বসে।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_5_4",
                    question = "\"Ich frühstücke um acht Uhr.\" এর বাংলা অর্থ কী?",
                    correctAnswer = "আমি আটটায় নাশতা করি।",
                    explanation = "'frühstücken' অর্থ নাশতা করা এবং 'um acht Uhr' অর্থ আটটায়।",
                    type = ExerciseType.TRANSLATION
                ),
                Exercise(
                    id = "ex_5_5",
                    question = "প্রশ্ন: Wann arbeitest du?",
                    options = listOf("Ich arbeite um neun Uhr.", "Ich heiße Karim.", "Ich komme aus Bangladesch.", "Das ist meine Mutter."),
                    correctAnswer = "Ich arbeite um neun Uhr.",
                    explanation = "'Wann arbeitest du?' (তুমি কখন কাজ করো?) প্রশ্নের সঠিক উত্তর 'Ich arbeite um neun Uhr.'",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_5_6",
                    question = "নিচের বাক্যে কি পরিমাণ বা সময় উল্লেখ করা হয়েছে? \"Ich schlafe um elf Uhr.\"",
                    options = listOf("07:00", "08:00", "11:00", "12:00"),
                    correctAnswer = "11:00",
                    explanation = "'um elf Uhr' মানে ১১:০০ বা ১১টায়।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_5_7",
                    question = "জার্মানে অনুবাদ করুন: আমি জার্মান শিখি।",
                    correctAnswer = "Ich lerne Deutsch.",
                    explanation = "'আমি জার্মান শিখি' এর জার্মান অনুবাদ হলো 'Ich lerne Deutsch.'",
                    type = ExerciseType.TRANSLATION
                ),
                Exercise(
                    id = "ex_5_8",
                    question = "শূন্যস্থান পূরণ করুন: Ich esse zu Mittag ___ 13:00 Uhr.",
                    options = listOf("um", "am", "in", "aus"),
                    correctAnswer = "um",
                    explanation = "নির্দিষ্ট সময়ের পূর্বে 'um' অব্যয় ব্যবহৃত হয়।",
                    type = ExerciseType.MULTIPLE_CHOICE
                )
            )
        ),
        Lesson(
            id = "lesson_6",
            title = "Lektion 6: খাবার ও পানীয় (Essen und Trinken)",
            description = "খাবার ও পানীয় সম্পর্কিত মৌলিক শব্দাবলী, ক্রিয়া (essen, trinken, möchten), অর্ডার করার ভাষা এবং রেস্তোরাঁ/ক্যাফের সহজ কথোপকথন শিখুন।",
            order = 6,
            objectives = listOf(
                "জার্মান ভাষায় বিভিন্ন খাবার ও পানীয়ের নাম (আর্টিকেল সহ) ব্যবহার করা।",
                "খাওয়া ও পান করা প্রকাশের জন্য 'essen' এবং 'trinken' ক্রিয়ার প্রয়োগ শেখা।",
                "ভদ্রভাবে কোনো কিছু চাইতে 'möchte' ব্যবহার করা।",
                "ক্যাফে বা রেস্তোরাঁয় খাবার বা পানীয় অর্ডার করা।",
                "খাবার ও পানীয় সম্পর্কিত সহজ প্রশ্নোত্তর ও রেস্তোরাঁর কথোপকথন বোঝা।"
            ),
            vocabulary = listOf(
                VocabularyItem("das Brot", "রুটি", "দাস ব্রোট", "Ich esse Brot."),
                VocabularyItem("der Reis", "ভাত", "দের রাইস", "Ich esse Reis."),
                VocabularyItem("der Apfel", "আপেল", "দের আপ-ফেল", "Ich esse einen Apfel."),
                VocabularyItem("die Banane", "কলা", "দি বা-না-নে", "Ich esse eine Banane."),
                VocabularyItem("das Ei", "ডিম", "দাস আই", "Das Ei ist frisch."),
                VocabularyItem("die Suppe", "স্যুপ", "দি জু-পে", "Die Suppe ist heiß."),
                VocabularyItem("der Salat", "সালাদ", "দের যা-লাট", "Ich möchte einen Salat."),
                VocabularyItem("das Fleisch", "মাংস", "দাস ফ্লাইশ", "Ich esse kein Fleisch."),
                VocabularyItem("der Fisch", "মাছ", "দের ফিশ", "Der Fisch schmeckt gut."),
                VocabularyItem("der Käse", "চিজ / পনির", "দের কে-জে", "Ich mag Käse."),
                VocabularyItem("das Frühstück", "নাশতা", "দাস ফ্রিউ-স্ট্যুক", "Das Frühstück ist fertig."),
                VocabularyItem("das Mittagessen", "দুপুরের খাবার", "দাস মি-তাক-এস-সেন", "Das Mittagessen ist um 13:00 Uhr."),
                VocabularyItem("das Abendessen", "রাতের খাবার", "দাস আ-বেন্ট-এস-সেন", "Das Abendessen ist um 20:00 Uhr."),
                VocabularyItem("das Wasser", "পানি", "দাস ভাস-সার", "Ich trinke Wasser."),
                VocabularyItem("der Tee", "চা", "দের টে", "Ich möchte Tee."),
                VocabularyItem("der Kaffee", "কফি", "দের কা-ফে", "Ich trinke einen Kaffee."),
                VocabularyItem("die Milch", "দুধ", "দি মিলখ", "Ich trinke Milch."),
                VocabularyItem("der Saft", "জুস", "দের জাফট", "Ich möchte einen Saft."),
                VocabularyItem("essen", "খাওয়া", "এস-সেন", "Was isst du?"),
                VocabularyItem("trinken", "পান করা", "ট্রিন-কেন", "Was trinkst du?"),
                VocabularyItem("möchten", "চাইতে / চাই", "মেখ-তেন", "Was möchten Sie?"),
                VocabularyItem("bestellen", "অর্ডার করা", "বে-স্টেল-লেন", "Ich möchte bestellen."),
                VocabularyItem("bitte", "দয়া করে / এই নিন", "বি-টে", "Einen Kaffee, bitte."),
                VocabularyItem("danke", "ধন্যবাদ", "দান-কে", "Danke schön!")
            ),
            grammarRules = listOf(
                GrammarRule(
                    title = "খাবার ও পানীয়ের রূপ ও ক্রিয়া ('essen' ও 'trinken')",
                    explanation = "'essen' (খাওয়া) এবং 'trinken' (পান করা) ক্রিয়ার সাধারণ ব্যবহার:\n- Ich esse Brot. (আমি রুটি খাই।)\n- Was isst du? (তুমি কী খাও?)\n- Ich trinke Wasser. (আমি পানি পান করি।)\n- Was trinkst du? (তুমি কী পান করো?)",
                    examples = listOf(
                        "Ich esse Brot. (আমি রুটি খাই।)",
                        "Was isst du? - Ich esse einen Apfel.",
                        "Ich trinke Wasser. (আমি পানি পান করি।)",
                        "Was trinkst du? - Ich trinke Tee."
                    )
                ),
                GrammarRule(
                    title = "ভদ্রভাবে চাওয়া বা প্রকাশ করা ('möchte')",
                    explanation = "'möchte' ব্যবহার করে ভদ্রভাবে কিছু চাইতে বা কী নিতে চান তা প্রকাশ করা হয়।\nবাংলা ব্যাখ্যা: \"möchte\" ব্যবহার করে ভদ্রভাবে কিছু চাইতে বা কী নিতে চাই তা বলতে পারি।\n- Ich möchte Wasser. (আমি পানি চাই।)\n- Ich möchte Tee. (আমি চা চাই।)\n- Was möchtest du trinken? (তুমি কী পান করতে চাও?)\n- Was möchtest du essen? (তুমি কী খেতে চাও?)",
                    examples = listOf(
                        "Ich möchte Wasser. (আমি পানি চাই।)",
                        "Ich möchte einen Kaffee. (আমি একটি কফি চাই।)",
                        "Was möchtest du trinken? (তুমি কী পান করতে চাও?)",
                        "Was möchtest du essen? (তুমি কী খেতে চাও?)"
                    )
                ),
                GrammarRule(
                    title = "ব্যবহারিক আর্টিকেল ('einen / ein / eine')",
                    explanation = "খাবার বা পানীয় একবচনে নির্দেশের সময় কাজের অবজেক্ট বা আকুযাটিভ রূপে আর্টিকেল বসে:\n- Masculine (der Kaffee / der Apfel) -> einen: Ich möchte einen Kaffee.\n- Neuter (das Brot / das Ei) -> ein: Ich möchte ein Brot.\n- Feminine (die Suppe / die Banane) -> eine: Ich möchte eine Suppe.",
                    examples = listOf(
                        "Ich möchte einen Kaffee. [der Kaffee]",
                        "Ich möchte ein Brot. [das Brot]",
                        "Ich möchte eine Suppe. [die Suppe]"
                    )
                ),
                GrammarRule(
                    title = "অর্ডার করা ও পছন্দের প্রকাশ ('mögen')",
                    explanation = "সহজভাবে নিজের পছন্দ প্রকাশ করতে 'mag' (mögen) ব্যবহৃত হয়:\n- Ich mag Kaffee. (আমি কফি পছন্দ করি।)\n- Ich mag Brot. (আমি রুটি পছন্দ করি।)\n- Ich mag Tee. (আমি চা পছন্দ করি।)",
                    examples = listOf(
                        "Ich mag Kaffee. (আমি কফি পছন্দ করি।)",
                        "Ich mag Tee. (আমি চা পছন্দ করি।)"
                    )
                )
            ),
            exampleSentences = listOf(
                ExampleSentence("Ich esse Brot.", "আমি রুটি খাই।", "ইখ এস-সে ব্রোট"),
                ExampleSentence("Ich trinke Wasser.", "আমি পানি পান করি।", "ইখ ট্রিন-কে ভাস-সার"),
                ExampleSentence("Ich möchte einen Kaffee.", "আমি একটি কফি চাই।", "ইখ মেখ-টে আই-নেন কা-ফে"),
                ExampleSentence("Ich möchte Tee.", "আমি চা চাই।", "ইখ মেখ-টে টে"),
                ExampleSentence("Was möchtest du trinken?", "তুমি কী পান করতে চাও?", "ভাস মেখ-টেস্ট দু ট্রিন-কেন"),
                ExampleSentence("Ich möchte Wasser.", "আমি পানি চাই।", "ইখ মেখ-টে ভাস-সার"),
                ExampleSentence("Was möchtest du essen?", "তুমি কী খেতে চাও?", "ভাস মেখ-টেস্ট দু এস-সেন"),
                ExampleSentence("Ich möchte einen Apfel.", "আমি একটি আপেল চাই।", "ইখ মেখ-টে আই-নেন আপ-ফেল")
            ),
            dialogues = listOf(
                DialogueEntry("Kellner", "Guten Tag! Was möchten Sie?", "শুভ দিন! আপনি কী চান?"),
                DialogueEntry("Kunde", "Ich möchte einen Kaffee, bitte.", "আমি একটি কফি চাই, দয়া করে।"),
                DialogueEntry("Kellner", "Möchten Sie auch etwas essen?", "আপনি কি কিছু খেতেও চান?"),
                DialogueEntry("Kunde", "Ja. Ich möchte ein Brot.", "হ্যাঁ। আমি একটি রুটি চাই।"),
                DialogueEntry("Kellner", "Bitte.", "এই নিন।"),
                DialogueEntry("Kunde", "Danke!", "ধন্যবাদ!"),
                DialogueEntry("A", "Was möchtest du trinken?", "তুমি কী পান করতে চাও?"),
                DialogueEntry("B", "Ich möchte Tee.", "আমি চা চাই।"),
                DialogueEntry("A", "Möchtest du auch etwas essen?", "তুমি কি কিছু খেতেও চাও?"),
                DialogueEntry("B", "Ja. Ich möchte einen Apfel.", "হ্যাঁ। আমি একটি আপেল চাই।"),
                DialogueEntry("A", "Guten Appetit!", "উপভোগ করে খান!"),
                DialogueEntry("B", "Danke!", "ধন্যবাদ!")
            ),
            exercises = listOf(
                Exercise(
                    id = "ex_6_1",
                    question = "\"Ich trinke Wasser.\" এর বাংলা অর্থ কী?",
                    options = listOf("আমি পানি পান করি।", "আমি পানি কিনি।", "আমি পানি খাই।", "আমি পানি চাই।"),
                    correctAnswer = "আমি পানি পান করি।",
                    explanation = "'trinken' অর্থ পান করা, তাই সঠিক অর্থ 'আমি পানি পান করি।'",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_6_2",
                    question = "\"das Brot\" এর অর্থ কী?",
                    options = listOf("পানি", "রুটি", "দুধ", "আপেল"),
                    correctAnswer = "রুটি",
                    explanation = "'das Brot' শব্দের অর্থ রুটি।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_6_3",
                    question = "শূন্যস্থান পূরণ করুন: Ich ___ Wasser.",
                    options = listOf("esse", "trinke", "möchte", "bin"),
                    correctAnswer = "trinke",
                    explanation = "পানি (Wasser) এর সাথে পান করা অর্থ বোঝাতে 'trinke' ক্রিয়া ব্যবহৃত হয়।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_6_4",
                    question = "শূন্যস্থান পূরণ করুন: Ich möchte ___ Kaffee.",
                    options = listOf("eine", "einen", "ein", "die"),
                    correctAnswer = "einen",
                    explanation = "'der Kaffee' আকুযাটিভ রূপে 'einen Kaffee' হয়।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_6_5",
                    question = "\"Was möchtest du trinken?\" এর অর্থ কী?",
                    options = listOf("তুমি কী খেতে চাও?", "তুমি কী পান করতে চাও?", "তুমি কোথায় থাকো?", "তুমি কখন ওঠো?"),
                    correctAnswer = "তুমি কী পান করতে চাও?",
                    explanation = "'trinken' অর্থ পান করা, তাই প্রশ্নটির অর্থ 'তুমি কী পান করতে চাও?'",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_6_6",
                    question = "জার্মানে অনুবাদ করুন: আমি চা চাই।",
                    correctAnswer = "Ich möchte Tee.",
                    explanation = "'আমি চা চাই' এর জার্মান অনুবাদ হলো 'Ich möchte Tee.'",
                    type = ExerciseType.TRANSLATION
                ),
                Exercise(
                    id = "ex_6_7",
                    question = "\"Ich esse einen Apfel.\" এর অর্থ কী?",
                    correctAnswer = "আমি একটি আপেল খাই।",
                    explanation = "'Ich esse einen Apfel.' অর্থ 'আমি একটি আপেল খাই।'",
                    type = ExerciseType.TRANSLATION
                ),
                Exercise(
                    id = "ex_6_8",
                    question = "কথোপকথনটি পড়ুন:\nKellner: Was möchten Sie?\nKunde: Ich möchte einen Kaffee.\n\nপ্রশ্ন: Der Kunde möchte was?",
                    options = listOf("Einen Tee", "Einen Kaffee", "Ein Brot", "Eine Suppe"),
                    correctAnswer = "Einen Kaffee",
                    explanation = "কথোপকথন অনুযায়ী কাস্টমার (Kunde) একটি কফি (einen Kaffee) চান।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_6_9",
                    question = "শূন্যস্থান পূরণ করুন: Was ___ du essen?",
                    options = listOf("möchtest", "möchten", "möchte", "mag"),
                    correctAnswer = "möchtest",
                    explanation = "'du' এর সাথে 'möchten' এর সঠিক রূপ 'möchtest'।",
                    type = ExerciseType.FILL_IN_BLANK
                ),
                Exercise(
                    id = "ex_6_10",
                    question = "জার্মানে অনুবাদ করুন: আমি একটি কফি চাই।",
                    correctAnswer = "Ich möchte einen Kaffee.",
                    explanation = "'আমি একটি কফি চাই' এর জার্মান অনুবাদ হলো 'Ich möchte einen Kaffee.'",
                    type = ExerciseType.TRANSLATION
                )
            )
        ),
        Lesson(
            id = "lesson_7",
            title = "Lektion 7: কেনাকাটা (Einkaufen)",
            description = "দোকান বা সুপারমার্কেটে কেনাকাটা করা, পণ্যের দাম জিজ্ঞাসা করা, দাম বলা এবং কেনাকাটা সম্পর্কিত সহজ কথোপকথন শিখুন।",
            order = 7,
            objectives = listOf(
                "দোকানে পণ্যের দাম কীভাবে জিজ্ঞাসা করতে হয় তা শেখা (Wie viel kostet das? / Was kostet das?)।",
                "পণ্যের দাম প্রকাশ করা (Das kostet ... Euro)।",
                "পণ্য পছন্দ করা ও কেনার ইচ্ছা প্রকাশ করা (Ich möchte das kaufen / Ich nehme das)।",
                "দাম সম্পর্কে মন্তব্য করা (teuer, billig, günstig)।",
                "কেনাকাটা সংক্রান্ত দৈনন্দিন কথোপকথন বোঝা।"
            ),
            vocabulary = listOf(
                VocabularyItem("einkaufen", "কেনাকাটা করা", "আইন-কাউ-ফেন", "Ich gehe einkaufen."),
                VocabularyItem("kaufen", "কেনা", "কাউ-ফেন", "Ich möchte das kaufen."),
                VocabularyItem("der Supermarkt", "সুপারমার্কেট", "দের জুপার-মার্কট", "Ich gehe in den Supermarkt."),
                VocabularyItem("das Geschäft", "দোকান", "দাস গে-শেফট", "Das Geschäft ist offen."),
                VocabularyItem("der Preis", "দাম / মূল্য", "দের প্রাইস", "Der Preis ist gut."),
                VocabularyItem("kosten", "দাম হওয়া", "কস-তেন", "Was kostet das?"),
                VocabularyItem("Euro", "ইউরো", "অয়-রো", "Das kostet fünf Euro."),
                VocabularyItem("Cent", " সেন্ট", "সেন্ট", "Das kostet 50 Cent."),
                VocabularyItem("teuer", "দামি / ব্যয়বহুল", "তয়-আর", "Das ist teuer."),
                VocabularyItem("billig", "সস্তা", "বি-লিশ", "Das ist billig."),
                VocabularyItem("günstig", "সাশ্রয়ী / কম দামের", "গ্যুন-স্টিশ", "Das ist günstig."),
                VocabularyItem("nehmen", "নেওয়া", "নে-মেন", "Ich nehme das."),
                VocabularyItem("brauchen", "প্রয়োজন হওয়া", "ব্রাউ-খেন", "Ich brauche Brot."),
                VocabularyItem("die Tasche", "ব্যাগ / থলে", "দি তা-শে", "Ich brauche eine Tasche."),
                VocabularyItem("das Geld", "টাকা / অর্থ", "দাস গেল্ট", "Ich habe Geld.")
            ),
            grammarRules = listOf(
                GrammarRule(
                    title = "দাম জিজ্ঞাসা করা ('Wie viel kostet ...?' / 'Was kostet ...?')",
                    explanation = "কোনো জিনিসের দাম জানতে 'Wie viel kostet das?' বা 'Was kostet das?' ব্যবহার করা যায়। উভয় বাক্যের অর্থ 'এটার দাম কত?'।",
                    examples = listOf(
                        "Wie viel kostet das? (এটার দাম কত?)",
                        "Was kostet das? (এটার দাম কত?)"
                    )
                ),
                GrammarRule(
                    title = "দাম বলা ('Das kostet ... Euro')",
                    explanation = "কোনো জিনিসের দাম প্রকাশ করার জন্য 'Das kostet + [ইউরো/সংখ্যা]' ব্যবহার করা হয়।",
                    examples = listOf(
                        "Das kostet fünf Euro. (এটার দাম পাঁচ ইউরো।)",
                        "Das kostet zehn Euro. (এটার দাম দশ ইউরো।)",
                        "Der Preis ist zehn Euro. (দাম দশ ইউরো।)"
                    )
                ),
                GrammarRule(
                    title = "পণ্য পছন্দ করা ও কেনা ('Ich möchte ... kaufen' & 'Ich nehme ...')",
                    explanation = "কোনো কিছু কিনতে চাইলে ভদ্রভাবে বলতে পারেন 'Ich möchte das kaufen' (আমি এটা কিনতে চাই) অথবা 'Ich nehme das' (আমি এটা নেব)।",
                    examples = listOf(
                        "Ich möchte das kaufen. (আমি এটা কিনতে চাই।)",
                        "Ich nehme das. (আমি এটা নেব।)",
                        "Ich möchte diesen Kaffee. (আমি এই কফিটি চাই।)"
                    )
                ),
                GrammarRule(
                    title = "দাম বিচার প্রকাশ করা ('teuer', 'billig', 'günstig')",
                    explanation = "কোনো পণ্যের দাম সম্পর্কে মন্তব্য করতে:\n- teuer = দামি\n- billig = সস্তা\n- günstig = সাশ্রয়ী / কম দামের",
                    examples = listOf(
                        "Das ist teuer. (এটা দামি।)",
                        "Das ist billig. (এটা সস্তা।)",
                        "Das ist günstig. (এটা সাশ্রয়ী।)"
                    )
                ),
                GrammarRule(
                    title = "দোকানে মার্জিত ভাষা (Höflichkeit beim Einkaufen)",
                    explanation = "দোকানদার ও ক্রেতার মধ্যে কেনাকাটার সময় কিছু সাধারণ মার্জিত অভিব্যক্তি:\n- Guten Tag (শুভ দিন)\n- Ich möchte ... (আমি ... চাই)\n- Bitte (দয়া করে / এই নিন)\n- Danke (ধন্যবাদ)",
                    examples = listOf(
                        "Kann ich Ihnen helfen? (আমি কি আপনাকে সাহায্য করতে পারি?)",
                        "Danke! (ধন্যবাদ!)"
                    )
                )
            ),
            exampleSentences = listOf(
                ExampleSentence("Wie viel kostet das?", "এটার দাম কত?", "ভি ফিল কস-তেত দাস"),
                ExampleSentence("Was kostet das?", "এটার দাম কত?", "ভাস কস-তেত দাস"),
                ExampleSentence("Das kostet fünf Euro.", "এটার দাম পাঁচ ইউরো।", "দাস কস-তেত ফিউনফ অয়-রো"),
                ExampleSentence("Das kostet zehn Euro.", "এটার দাম দশ ইউরো।", "দাস কস-তেত ত্সেন অয়-রো"),
                ExampleSentence("Der Preis ist zehn Euro.", "দাম দশ ইউরো।", "দের প্রাইস ইস্ট ত্সেন অয়-রো"),
                ExampleSentence("Ich möchte das kaufen.", "আমি এটা কিনতে চাই।", "ইখ মেখ-টে দাস কাউ-ফেন"),
                ExampleSentence("Ich nehme das.", "আমি এটা নেব।", "ইখ নে-মে দাস"),
                ExampleSentence("Das ist teuer.", "এটা দামি।", "দাস ইস্ট তয়-আর"),
                ExampleSentence("Das ist billig.", "এটা সস্তা।", "দাস ইস্ট বি-লিশ"),
                ExampleSentence("Das ist günstig.", "এটা সাশ্রয়ী।", "দাস ইস্ট গ্যুন-স্টিশ")
            ),
            dialogues = listOf(
                DialogueEntry("Verkäufer", "Guten Tag! Kann ich Ihnen helfen?", "শুভ দিন! আমি কি আপনাকে সাহায্য করতে পারি?"),
                DialogueEntry("Kunde", "Ja, bitte. Was kostet das?", "জি, দয়া করে। এটার দাম কত?"),
                DialogueEntry("Verkäufer", "Das kostet zehn Euro.", "এটার দাম দশ ইউরো।"),
                DialogueEntry("Kunde", "Das ist teuer.", "এটা দামি।"),
                DialogueEntry("Verkäufer", "Dieses kostet fünf Euro.", "এটির দাম পাঁচ ইউরো।"),
                DialogueEntry("Kunde", "Okay. Ich nehme das.", "ঠিক আছে। আমি এটা নেব।"),
                DialogueEntry("Verkäufer", "Bitte.", "এই নিন।"),
                DialogueEntry("Kunde", "Danke!", "ধন্যবাদ!"),
                DialogueEntry("Kunde", "Guten Tag! Was kostet die Tasche?", "শুভ দিন! ব্যাগটির দাম কত?"),
                DialogueEntry("Verkäufer", "Die Tasche kostet zwanzig Euro.", "ব্যাগটির দাম বিশ ইউরো।"),
                DialogueEntry("Kunde", "Oh, das ist teuer.", "ওহ, এটা দামি।"),
                DialogueEntry("Verkäufer", "Dieses Produkt kostet zehn Euro.", "এই পণ্যটির দাম দশ ইউরো।"),
                DialogueEntry("Kunde", "Gut. Ich nehme das.", "বেশ। আমি এটা নেব।"),
                DialogueEntry("Verkäufer", "Bitte sehr!", "এই যে, নিন!"),
                DialogueEntry("Kunde", "Danke schön!", "অনেক ধন্যবাদ!")
            ),
            exercises = listOf(
                Exercise(
                    id = "ex_7_1",
                    question = "\"Wie viel kostet das?\" এর অর্থ কী?",
                    options = listOf("এটা কী?", "এটার দাম কত?", "এটা কোথায়?", "এটা কার?"),
                    correctAnswer = "এটার দাম কত?",
                    explanation = "'Wie viel kostet das?' শব্দের অর্থ 'এটার দাম কত?'।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_7_2",
                    question = "\"Das kostet fünf Euro.\" এর বাংলা অর্থ কী?",
                    options = listOf("এটা পাঁচ ইউরো।", "এটার দাম পাঁচ ইউরো।", "আমি পাঁচ ইউরো চাই।", "আমার কাছে পাঁচ ইউরো আছে।"),
                    correctAnswer = "এটার দাম পাঁচ ইউরো।",
                    explanation = "'Das kostet fünf Euro.' অর্থ 'এটার দাম পাঁচ ইউরো।'",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_7_3",
                    question = "শূন্যস্থান পূরণ করুন: Das ___ zehn Euro.",
                    options = listOf("kostet", "kauft", "nimmt", "sucht"),
                    correctAnswer = "kostet",
                    explanation = "দাম প্রকাশ করতে 'kostet' ক্রিয়াটি ব্যবহৃত হয়।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_7_4",
                    question = "\"teuer\" এর অর্থ কী?",
                    options = listOf("সস্তা", "দামি", "নতুন", "বড়"),
                    correctAnswer = "দামি",
                    explanation = "'teuer' শব্দের অর্থ দামি।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_7_5",
                    question = "\"billig\" এর অর্থ কী?",
                    options = listOf("দামি", "সস্তা", "সুন্দর", "ছোট"),
                    correctAnswer = "সস্তা",
                    explanation = "'billig' শব্দের অর্থ সস্তা।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_7_6",
                    question = "জার্মানে অনুবাদ করুন: এটার দাম কত?",
                    correctAnswer = "Wie viel kostet das?",
                    explanation = "'এটার দাম কত?' এর জার্মান অনুবাদ হলো 'Wie viel kostet das?' (বা 'Was kostet das?')।",
                    type = ExerciseType.TRANSLATION
                ),
                Exercise(
                    id = "ex_7_7",
                    question = "জার্মানে অনুবাদ করুন: আমি এটা নেব।",
                    correctAnswer = "Ich nehme das.",
                    explanation = "'আমি এটা নেব' এর জার্মান অনুবাদ হলো 'Ich nehme das.'",
                    type = ExerciseType.TRANSLATION
                ),
                Exercise(
                    id = "ex_7_8",
                    question = "\"Ich möchte das kaufen.\" এর বাংলা অর্থ কী?",
                    correctAnswer = "আমি এটা কিনতে চাই।",
                    explanation = "'Ich möchte das kaufen.' অর্থ 'আমি এটা কিনতে চাই।'",
                    type = ExerciseType.TRANSLATION
                ),
                Exercise(
                    id = "ex_7_9",
                    question = "জার্মান বাক্যে বলা হয়েছে: \"Das kostet zwanzig Euro.\" এটার দাম কত?",
                    options = listOf("€5", "€10", "€20", "€50"),
                    correctAnswer = "€20",
                    explanation = "'zwanzig Euro' মানে ২০ ইউরো (€20)।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_7_10",
                    question = "কথোপকথনটি পড়ুন:\nVerkäufer: Das kostet fünfzehn Euro.\n\nপ্রশ্ন: Wie viel kostet das?",
                    options = listOf("Fünf Euro", "Zehn Euro", "Fünfzehn Euro", "Zwanzig Euro"),
                    correctAnswer = "Fünfzehn Euro",
                    explanation = "বিক্রেতা বলেছেন 'Das kostet fünfzehn Euro', অর্থাৎ ১৫ ইউরো।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_7_11",
                    question = "\"günstig\" এর অর্থ কী?",
                    options = listOf("দামি", "সাশ্রয়ী", "পুরাতন", "খারাপ"),
                    correctAnswer = "সাশ্রয়ী",
                    explanation = "'günstig' শব্দের অর্থ সাশ্রয়ী বা কম দামের।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_7_12",
                    question = "শূন্যস্থান পূরণ করুন: Ich möchte das ___.",
                    options = listOf("kaufen", "kostet", "ist", "preis"),
                    correctAnswer = "kaufen",
                    explanation = "'Ich möchte das kaufen' বাক্যটির অর্থ 'আমি এটা কিনতে চাই'।",
                    type = ExerciseType.MULTIPLE_CHOICE
                )
            )
        ),
        Lesson(
            id = "lesson_8",
            title = "Lektion 8: শহরে চলাফেরা (Unterwegs in der Stadt)",
            description = "শহরে চলাফেরা করা, বিভিন্ন স্থানের অবস্থান জিজ্ঞাসা করা, দিকনির্দেশনা বোঝা এবং সাধারণ গণপরিবহন সম্পর্কিত জার্মান ভাষা শিখুন।",
            order = 8,
            objectives = listOf(
                "কোথায় একটি স্থান আছে তা জিজ্ঞাসা করা (Wo ist ...?)।",
                "কোনো স্থানের অবস্থান প্রকাশ করা (hier, dort, neben, gegenüber)।",
                "সাধারণ দিকনির্দেশনা বোঝা (geradeaus, links, rechts)।",
                "বাম, ডান এবং সোজা যাওয়ার নির্দেশ বোঝা ও ব্যবহার করা।",
                "শহরের গুরুত্বপূর্ণ স্থানসমূহ চেনা (Bahnhof, Bank, Apotheke, Supermarkt ইত্যাদি)।",
                "গণপরিবহন সম্পর্কিত মূল শব্দমালা জানা (Bus, Zug, Bahn, Taxi, Fahrrad)।",
                "বাস, ট্রেন বা ট্রাম সম্পর্কে জিজ্ঞাসা করা।",
                "দিকনির্দেশনা সংক্রান্ত বাস্তব সংক্ষিপ্ত কথোপকথন বোঝা।",
                "অবস্থান ও পরিবহন সম্পর্কিত সহজ A1 বাক্য তৈরি করা।"
            ),
            vocabulary = listOf(
                VocabularyItem("die Stadt", "শহর", "দি স্টাট", "Berlin ist eine große Stadt."),
                VocabularyItem("der Bahnhof", "রেলস্টেশন", "দের বান-হোফ", "Wo ist der Bahnhof?"),
                VocabularyItem("die Bushaltestelle", "বাসস্টপ", "দি বুশ-হাল-টে-স্টেল-লে", "Die Bushaltestelle ist dort."),
                VocabularyItem("der Flughafen", "বিমানবন্দর", "দের ফ্লুগ-হা-ফেন", "Der Flughafen ist groß."),
                VocabularyItem("die Bank", "ব্যাংক", "দি ব্যাংক", "Die Bank ist geöffnet."),
                VocabularyItem("die Post", "ডাকঘর", "দি পোস্ট", "Wo ist die Post?"),
                VocabularyItem("der Supermarkt", "সুপারমার্কেট", "দের জুপার-মার্কট", "Der Supermarkt ist nah."),
                VocabularyItem("das Geschäft", "দোকান", "দাস গে-শেফট", "Das Geschäft ist hier."),
                VocabularyItem("die Apotheke", "ফার্মেসি", "দি আ-পো-তে-কে", "Die Apotheke ist neben der Bank."),
                VocabularyItem("das Hotel", "হোটেল", "দাস হো-টেল", "Das Hotel ist dort."),
                VocabularyItem("das Restaurant", "রেস্টুরেন্ট", "দাস রেস-তো-রং", "Das Restaurant ist gut."),
                VocabularyItem("das Café", "ক্যাফে", "দাস কা-ফে", "Das Café ist gemütlich."),
                VocabularyItem("die Schule", "স্কুল", "দি শু-লে", "Die Schule ist groß."),
                VocabularyItem("der Park", "পার্ক", "দের পার্ক", "Der Park ist schön."),
                VocabularyItem("das Krankenhaus", "হাসপাতাল", "দাস ক্রাংকেন-হাউস", "Das Krankenhaus ist weit."),
                VocabularyItem("die Straße", "রাস্তা", "দি শ্ট্রা-সে", "Die Straße ist lang."),
                VocabularyItem("der Platz", "চত্বর / স্কোয়ার", "দের প্লাৎস", "Der Platz ist schön."),
                VocabularyItem("geradeaus", "সোজা", "গে-রা-দে-আউস", "Gehen Sie geradeaus."),
                VocabularyItem("links", "বামে", "লিংকস", "Gehen Sie nach links."),
                VocabularyItem("rechts", "ডানে", "রেখটস", "Gehen Sie nach rechts."),
                VocabularyItem("hier", "এখানে", "হিয়ার", "Die Bank ist hier."),
                VocabularyItem("dort", "সেখানে", "ডর্ট", "Der Bahnhof ist dort."),
                VocabularyItem("vorne", "সামনে", "ফর-নে", "Das Taxi ist vorne."),
                VocabularyItem("hinten", "পেছনে", "হিন-তেন", "Der Bus ist hinten."),
                VocabularyItem("neben", "পাশে", "নে-বেন", "Das Café ist neben dem Hotel."),
                VocabularyItem("gegenüber", "বিপরীতে", "গে-গেন-উই-বার", "Die Apotheke ist gegenüber der Bank."),
                VocabularyItem("der Bus", "বাস", "দের বুস", "Ich fahre mit dem Bus."),
                VocabularyItem("die Bahn", "ট্রেন/রেল", "দি বান", "Die Bahn kommt pünktlich."),
                VocabularyItem("der Zug", "ট্রেন", "দের ত্সুগ", "Ich fahre mit dem Zug."),
                VocabularyItem("die Straßenbahn", "ট্রাম", "দি শ্ট্রা-সেন-বান", "Die Straßenbahn kommt."),
                VocabularyItem("das Taxi", "ট্যাক্সি", "দাস ট্যাক্সি", "Ich fahre mit dem Taxi."),
                VocabularyItem("das Auto", "গাড়ি", "দাস আউ-টো", "Das Auto ist neu."),
                VocabularyItem("das Fahrrad", "সাইকেল", "দাস ফার-রাট", "Ich fahre Fahrrad."),
                VocabularyItem("zu Fuß", "হেঁটে", "ত্সু ফুস", "Ich gehe zu Fuß."),
                VocabularyItem("fahren", "যাতায়াত করা / যাওয়া", "ফা-রেন", "Ich fahre mit dem Bus."),
                VocabularyItem("gehen", "যাওয়া / হাঁটা", "গে-এন", "Gehen Sie geradeaus."),
                VocabularyItem("kommen", "আসা", "কো-মেন", "Wie komme ich zum Bahnhof?"),
                VocabularyItem("nehmen", "নেওয়া / ব্যবহার করা", "নে-মেন", "Ich nehme ein Taxi.")
            ),
            grammarRules = listOf(
                GrammarRule(
                    title = "স্থান জিজ্ঞাসা করা ('Wo ist ...?')",
                    explanation = "কোনো স্থান কোথায় অবস্থিত তা জানতে 'Wo ist ...?' প্রশ্নটি ব্যবহার করা হয়。\n- Wo ist der Bahnhof? (রেলস্টেশন কোথায়?)\n- Wo ist die Bank? (ব্যাংক কোথায়?)\n- Wo ist das Hotel? (হোটেল কোথায়?)",
                    examples = listOf(
                        "Wo ist der Bahnhof? (রেলস্টেশন কোথায়?)",
                        "Wo ist die Bank? (ব্যাংক কোথায়?)",
                        "Wo ist die Apotheke? (ফার্মেসি কোথায়?)",
                        "Wo ist das Hotel? (হোটেল কোথায়?)"
                    )
                ),
                GrammarRule(
                    title = "গন্তব্যে পৌঁছানোর উপায় ('Wie komme ich ...?')",
                    explanation = "কোনো নির্দিষ্ট স্থানে কীভাবে পৌঁছাবেন তা জানতে নির্দিষ্ট অভিব্যক্তি 'Wie komme ich zum/zur ...?' ব্যবহার করা হয়。\n- Wie komme ich zum Bahnhof? (আমি কীভাবে রেলস্টেশনে যাব?)\n- Wie komme ich zur Bank? (আমি কীভাবে ব্যাংকে যাব?)",
                    examples = listOf(
                        "Wie komme ich zum Bahnhof? (আমি কীভাবে রেলস্টেশনে যাব?)",
                        "Wie komme ich zur Bank? (আমি কীভাবে ব্যাংকে যাব?)"
                    )
                ),
                GrammarRule(
                    title = "অবস্থান প্রকাশ ('hier', 'dort', 'neben', 'gegenüber')",
                    explanation = "কোনো স্থানের অবস্থান নির্দেশ করার জন্য নিম্নোক্ত শব্দসমূহ ব্যবহার করা হয়:\n- hier (এখানে)\n- dort (সেখানে)\n- neben (পাশে)\n- gegenüber (বিপরীতে)",
                    examples = listOf(
                        "Der Bahnhof ist dort. (রেলস্টেশন সেখানে।)",
                        "Die Bank ist hier. (ব্যাংক এখানে।)",
                        "Das Café ist neben dem Hotel. (ক্যাফেটি হোটেলের পাশে।)",
                        "Die Apotheke ist gegenüber der Bank. (ফার্মেসিটি ব্যাংকের বিপরীতে।)"
                    )
                ),
                GrammarRule(
                    title = "দিকনির্দেশনা নির্দেশ করা ('Gehen Sie ...')",
                    explanation = "ভদ্রভাবে কাউকেও দিকনির্দেশ দিতে 'Gehen Sie ...' দিয়ে বাক্য গঠন করা হয়:\n- Gehen Sie geradeaus. (সোজা যান।)\n- Gehen Sie nach links. (বামে যান।)\n- Gehen Sie nach rechts. (ডানে যান।)",
                    examples = listOf(
                        "Gehen Sie geradeaus. (সোজা যান।)",
                        "Gehen Sie nach links. (বামে যান。)",
                        "Gehen Sie nach rechts. (ডানে যান।)"
                    )
                ),
                GrammarRule(
                    title = "পরিবহন মাধ্যম প্রকাশ ('mit dem/der' & 'zu Fuß')",
                    explanation = "কোনো যানবহন ব্যবহার করে কোথাও যাওয়া বোঝাতে 'mit dem/der [যানবাহন]' এবং হেঁটে যাওয়া বোঝাতে 'zu Fuß' ব্যবহৃত হয়:\n- Ich fahre mit dem Bus. (আমি বাসে যাই।)\n- Ich fahre mit dem Zug. (আমি ট্রেনে যাই。)\n- Ich fahre mit dem Taxi. (আমি ট্যাক্সিতে যাই।)\n- Ich gehe zu Fuß. (আমি হেঁটে যাই।)",
                    examples = listOf(
                        "Ich fahre mit dem Bus. (আমি বাসে যাই।)",
                        "Ich fahre mit dem Zug. (আমি ট্রেনে যাই।)",
                        "Ich fahre mit dem Taxi. (আমি ট্যাক্সিতে যাই।)",
                        "Ich gehe zu Fuß. (আমি হেঁটে যাই।)"
                    )
                )
            ),
            exampleSentences = listOf(
                ExampleSentence("Wo ist der Bahnhof?", "রেলস্টেশন কোথায়?", "ভো ইস্ট দের বান-হোফ"),
                ExampleSentence("Wo ist die Bank?", "ব্যাংক কোথায়?", "ভো ইস্ট দি ব্যাংক"),
                ExampleSentence("Wie komme ich zum Bahnhof?", "আমি কীভাবে রেলস্টেশনে যাব?", "ভি কো-মে ইখ ত্সুম বান-হোফ"),
                ExampleSentence("Gehen Sie geradeaus.", "সোজা যান।", "গে-এন জি গে-রা-দে-আউস"),
                ExampleSentence("Gehen Sie nach links.", "বামে যান।", "গে-এন জি নাখ লিংকস"),
                ExampleSentence("Gehen Sie nach rechts.", "ডানে যান।", "গে-এন জি নাখ রেখটস"),
                ExampleSentence("Der Bahnhof ist dort.", "রেলস্টেশন সেখানে।", "দের বান-হোফ ইস্ট ডর্ট"),
                ExampleSentence("Die Bank ist hier.", "ব্যাংক এখানে।", "দি ব্যাংক ইস্ট হিয়ার"),
                ExampleSentence("Das Café ist neben dem Hotel.", "ক্যাফেটি হোটেলের পাশে।", "দাস কা-ফে ইস্ট নে-বেন দেম হো-টেল"),
                ExampleSentence("Die Apotheke ist gegenüber der Bank.", "ফার্মেসিটি ব্যাংকের বিপরীতে।", "দি আ-পো-তে-কে ইস্ট গে-গেন-উই-বার দের ব্যাংক"),
                ExampleSentence("Ich fahre mit dem Bus.", "আমি বাসে যাই।", "ইখ ফা-রে মিট দেম বুস"),
                ExampleSentence("Ich gehe zu Fuß.", "আমি হেঁটে যাই।", "ইখ গে-হে ত্সু ফুস")
            ),
            dialogues = listOf(
                DialogueEntry("A", "Entschuldigung, wo ist der Bahnhof?", "ক্ষমা করবেন, রেলস্টেশন কোথায়?"),
                DialogueEntry("B", "Der Bahnhof ist dort.", "রেলস্টেশন সেখানে।"),
                DialogueEntry("A", "Wie komme ich zum Bahnhof?", "আমি কীভাবে রেলস্টেশনে যাব?"),
                DialogueEntry("B", "Gehen Sie geradeaus und dann nach rechts.", "সোজা যান এবং তারপর ডানে যান।"),
                DialogueEntry("A", "Danke!", "ধন্যবাদ!"),
                DialogueEntry("B", "Bitte!", "স্বাগতম!"),
                DialogueEntry("A", "Entschuldigung, wo ist die Apotheke?", "ক্ষমা করবেন, ফার্মেসি কোথায়?"),
                DialogueEntry("B", "Die Apotheke ist neben der Bank.", "ফার্মেসিটি ব্যাংকের পাশে।"),
                DialogueEntry("A", "Ist die Bank dort?", "ব্যাংকটি কি সেখানে?"),
                DialogueEntry("B", "Ja, genau.", "হ্যাঁ, একদম ঠিক।"),
                DialogueEntry("A", "Danke schön!", "অনেক ধন্যবাদ!"),
                DialogueEntry("B", "Bitte schön!", "আপনাকেও ধন্যবাদ!"),
                DialogueEntry("A", "Wie komme ich zum Bahnhof?", "আমি কীভাবে রেলস্টেশনে যাব?"),
                DialogueEntry("B", "Sie können mit dem Bus fahren.", "আপনি বাসে যেতে পারেন।"),
                DialogueEntry("A", "Wo ist die Bushaltestelle?", "বাসস্টপ কোথায়?"),
                DialogueEntry("B", "Die Bushaltestelle ist dort.", "বাসস্টপ সেখানে।"),
                DialogueEntry("A", "Danke!", "ধন্যবাদ!")
            ),
            exercises = listOf(
                Exercise(
                    id = "ex_8_1",
                    question = "\"Wo ist der Bahnhof?\" এর সঠিক বাংলা অর্থ কোনটি?",
                    options = listOf("রেলস্টেশন কোথায়?", "বাসস্টপ কোথায়?", "হোটেল কোথায়?", "ব্যাংক কোথায়?"),
                    correctAnswer = "রেলস্টেশন কোথায়?",
                    explanation = "'der Bahnhof' মানে রেলস্টেশন, তাই সঠিক অর্থ 'রেলস্টেশন কোথায়?'।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_8_2",
                    question = "শূন্যস্থান পূরণ করুন: Gehen Sie ________.",
                    options = listOf("geradeaus", "Bahnhof", "Wasser", "Apfel"),
                    correctAnswer = "geradeaus",
                    explanation = "'Gehen Sie geradeaus' বাক্যটির অর্থ 'সোজা যান'।",
                    type = ExerciseType.FILL_IN_BLANK
                ),
                Exercise(
                    id = "ex_8_3",
                    question = "\"rechts\" শব্দের সঠিক বাংলা অর্থ কোনটি?",
                    options = listOf("বামে", "ডানে", "সোজা", "পেছনে"),
                    correctAnswer = "ডানে",
                    explanation = "'rechts' মানে ডানে।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_8_4",
                    question = "জার্মানে অনুবাদ করুন: আমি বাসে যাই।",
                    correctAnswer = "Ich fahre mit dem Bus.",
                    explanation = "'আমি বাসে যাই' এর জার্মান অনুবাদ হলো 'Ich fahre mit dem Bus.'",
                    type = ExerciseType.TRANSLATION
                ),
                Exercise(
                    id = "ex_8_5",
                    question = "You are in Berlin and want to find the train station.\n\"Entschuldigung, ______ ist der Bahnhof?\"",
                    options = listOf("wo", "wie", "was", "wer"),
                    correctAnswer = "wo",
                    explanation = "কোনো স্থানের অবস্থান জানতে 'wo' (কোথায়) ব্যবহৃত হয়।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_8_6",
                    question = "শূন্যস্থান পূরণ করুন: Gehen Sie ________ und dann nach links.",
                    options = listOf("geradeaus", "Tee", "Brot", "Sohn"),
                    correctAnswer = "geradeaus",
                    explanation = "দিকনির্দেশনায় 'geradeaus' (সোজা) ব্যবহৃত হয়।",
                    type = ExerciseType.FILL_IN_BLANK
                ),
                Exercise(
                    id = "ex_8_7",
                    question = "জার্মানে অনুবাদ করুন: ফার্মেসিটি ব্যাংকের পাশে।",
                    correctAnswer = "Die Apotheke ist neben der Bank.",
                    explanation = "'ফার্মেসিটি ব্যাংকের পাশে' এর জার্মান অনুবাদ হলো 'Die Apotheke ist neben der Bank.'",
                    type = ExerciseType.TRANSLATION
                ),
                Exercise(
                    id = "ex_8_8",
                    question = "\"links\" শব্দের অর্থ কী?",
                    options = listOf("বামে", "ডানে", "সামনে", "পেছনে"),
                    correctAnswer = "বামে",
                    explanation = "'links' শব্দের অর্থ 'বামে'।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_8_9",
                    question = "\"die Bushaltestelle\" শব্দের বাংলা অর্থ কী?",
                    options = listOf("রেলস্টেশন", "বাসস্টপ", "বিমানবন্দর", "চত্বর"),
                    correctAnswer = "বাসস্টপ",
                    explanation = "'die Bushaltestelle' শব্দের অর্থ 'বাসস্টপ'।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_8_10",
                    question = "জার্মানে অনুবাদ করুন: আমি হেঁটে যাই।",
                    correctAnswer = "Ich gehe zu Fuß.",
                    explanation = "'আমি হেঁটে যাই' এর জার্মান অনুবাদ হলো 'Ich gehe zu Fuß.'",
                    type = ExerciseType.TRANSLATION
                ),
                Exercise(
                    id = "ex_8_11",
                    question = "\"Wie komme ich zum Bahnhof?\" এর অর্থ কী?",
                    options = listOf("আমি কীভাবে রেলস্টেশনে যাব?", "রেলস্টেশন কোথায়?", "বাসটি কখন আসবে?", "হোটেলটি কোথায়?"),
                    correctAnswer = "আমি কীভাবে রেলস্টেশনে যাব?",
                    explanation = "'Wie komme ich zum Bahnhof?' এর বাংলা অর্থ 'আমি কীভাবে রেলস্টেশনে যাব?'।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_8_12",
                    question = "\"Gehen Sie nach rechts.\" এর অর্থ কী?",
                    options = listOf("বামে যান।", "ডানে যান।", "সোজা যান।", "থামুন।"),
                    correctAnswer = "ডানে যান।",
                    explanation = "'Gehen Sie nach rechts' বাক্যটির অর্থ 'ডানে যান।'",
                    type = ExerciseType.MULTIPLE_CHOICE
                )
            )
        ),
        Lesson(
            id = "lesson_9",
            title = "Lektion 9: সময়, তারিখ ও অ্যাপয়েন্টমেন্ট (Zeit, Datum & Termine)",
            description = "সময় জিজ্ঞেস করা ও বলা, বার ও তারিখের বর্ণনা, অ্যাপয়েন্টমেন্ট তৈরি ও 'am' / 'um' এর সঠিক প্রয়োগ শিখুন।",
            order = 9,
            objectives = listOf(
                "সময় জিজ্ঞাসা করা (Wie spät ist es?) এবং সময় বলা (Es ist ... Uhr / halb ...)।",
                "ঘণ্টা ও মিনিট বোঝা ও প্রকাশ করা।",
                "সপ্তাহের ৭টি বারের নাম চিনতে পারা ও ব্যবহার করা।",
                "সহজ তারিখ প্রকাশ করা।",
                "অ্যাপয়েন্টমেন্ট কখন তা বলতে পারা।",
                "সহজ সময়সূচী (Schedule) বোঝা।",
                "একটি সাধারণ অ্যাপয়েন্টমেন্ট তৈরি বা নিশ্চিত করা।",
                "বার/তারিখের জন্য 'am' এবং ঘড়ির সময়ের জন্য 'um' এর ব্যবহার প্রয়োগ করা।"
            ),
            vocabulary = listOf(
                VocabularyItem("Montag", "সোমবার", "মোন-তাক", "Heute ist Montag."),
                VocabularyItem("Dienstag", "মঙ্গলবার", "দিন্স-তাক", "Morgen ist Dienstag."),
                VocabularyItem("Mittwoch", "বুধবার", "মিট-ভোখ", "Am Mittwoch arbeite ich."),
                VocabularyItem("Donnerstag", "বৃহস্পতিবার", "ডনের্স-তাক", "Der Termin ist am Donnerstag."),
                VocabularyItem("Freitag", "শুক্রবার", "ফ্রাই-তাক", "Am Freitag habe ich einen Termin."),
                VocabularyItem("Samstag", "শনিবার", "জাম্স-তাক", "Am Samstag habe ich frei."),
                VocabularyItem("Sonntag", "রবিবার", "জোন-তাক", "Sonntag ist ein Ruhetag."),
                VocabularyItem("heute", "আজ", "হয়-টে", "Heute ist Montag."),
                VocabularyItem("morgen", "আগামীকাল", "মোর-গেন", "Morgen ist Dienstag."),
                VocabularyItem("gestern", "গতকাল", "গেস্-তার্ন", "Gestern war Sonntag."),
                VocabularyItem("die Uhr", "ঘড়ি / সময়", "দি উর", "Wie spät ist es auf der Uhr?"),
                VocabularyItem("die Stunde", "ঘণ্টা", "দি স্টুন-ডে", "Eine Stunde hat 60 Minuten."),
                VocabularyItem("die Minute", "মিনিট", "দি মি-নু-টে", "Es ist zehn Uhr fünf Minute."),
                VocabularyItem("die Zeit", "সময়", "দি সাইত", "Ich habe Zeit."),
                VocabularyItem("halb", "সাড়ে / অর্ধেক", "হাল্প", "Es ist halb acht."),
                VocabularyItem("Viertel", "এক-চতুর্থাংশ / ১৫ মিনিট", "ফির-টেল", "Es ist Viertel nach zehn."),
                VocabularyItem("der Morgen", "সকাল", "দের মোর-গেন", "Am Morgen arbeite ich."),
                VocabularyItem("der Vormittag", "সকাল / দুপুরের আগের সময়", "দের ফোর-মি-তাক", "Am Vormittag lerne ich."),
                VocabularyItem("der Mittag", "দুপুর", "দের মি-তাক", "Der Termin ist am Mittag."),
                VocabularyItem("der Nachmittag", "বিকেল", "দের নাখ-মি-তাক", "Am Nachmittag habe ich Zeit."),
                VocabularyItem("der Abend", "সন্ধ্যা", "দের আ-বেন্ট", "Am Abend lerne ich Deutsch."),
                VocabularyItem("die Nacht", "রাত", "দি নাখ্ত", "Gute Nacht!"),
                VocabularyItem("das Datum", "তারিখ", "দাস ডা-টুম", "Wie ist das Datum heute?"),
                VocabularyItem("der Geburtstag", "জন্মদিন", "দের গে-বুর্তস-তাক", "Mein Geburtstag ist am 10. Mai."),
                VocabularyItem("der Termin", "অ্যাপয়েন্টমেন্ট / নির্ধারিত সময়", "দের টের-মিন", "Ich habe einen Termin."),
                VocabularyItem("einen Termin haben", "অ্যাপয়েন্টমেন্ট থাকা", "আই-নেন টের-মিন হা-বেন", "Ich habe am Montag einen Termin."),
                VocabularyItem("der Arzttermin", "ডাক্তারের অ্যাপয়েন্টমেন্ট", "দের আরৎস-টের-মিন", "Ich habe einen Arzttermin."),
                VocabularyItem("der Kurs", "কোর্স", "দের কুর্স", "Der Deutschkurs beginnt um neun Uhr."),
                VocabularyItem("beginnen", "শুরু হওয়া", "বে-গিন-নেন", "Der Kurs beginnt um neun Uhr.")
            ),
            grammarRules = listOf(
                GrammarRule(
                    title = "সময় জিজ্ঞাসা ও বলা (Uhrzeit)",
                    explanation = "সময় জিজ্ঞাসা করার জন্য সহজ প্রশ্ন:\n- Wie spät ist es? (কয়টা বাজে?)\n- Wie viel Uhr ist es? (কয়টা বাজে?)\n\nসময় উত্তর দেওয়ার নিয়ম:\n- পূর্ণ ঘণ্টা: Es ist + [সংখ্যা] + Uhr. (যেমন: Es ist zehn Uhr = ১০:০০)\n- অর্ধেক ঘণ্টা (halb): জার্মানে 'halb' এর পর পরবর্তী ঘণ্টা বলা হয়! যেমন: halb acht = ৭:৩০ (৮টার অর্ধেক পথ)।\n- মিনিট সহ: Es ist zehn Uhr fünfzehn (১০:১৫) / Es ist acht Uhr dreißig (৮:৩০)।",
                    examples = listOf(
                        "Wie spät ist es? - Es ist zehn Uhr. (১০:০০)",
                        "Es ist halb acht. (৭:৩০ - সাড়ে সাতটা)",
                        "Es ist acht Uhr dreißig. (৮:৩০)"
                    )
                ),
                GrammarRule(
                    title = "'am' বনাম 'um' এর ব্যবহার",
                    explanation = "সময় ও সময়সূচীর জন্য সহজ নিয়ম:\n- AM: বার (Days) এবং তারিখ (Dates)-এর সাথে 'am' ব্যবহৃত হয়। ('am' → কোন দিন / কোন তারিখে)\n  উদাহরণ: am Montag (সোমবারে), am 5. September (৫ই সেপ্টেম্বরে)\n- UM: ঘড়ির নির্দিষ্ট সময়ের (Clock times) সাথে 'um' ব্যবহৃত হয়। ('um' → কোন সময়ে)\n  উদাহরণ: um zehn Uhr (১০টায়), um 14 Uhr (১৪টায়)",
                    examples = listOf(
                        "am Montag (সোমবারে)",
                        "am 5. September (৫ই সেপ্টেম্বরে)",
                        "um zehn Uhr (১০টায়)",
                        "Ich arbeite am Montag. (আমি সোমবারে কাজ করি।)",
                        "Der Termin ist um zehn Uhr. (অ্যাপয়েন্টমেন্টটি ১০টায়।)"
                    )
                ),
                GrammarRule(
                    title = "অ্যাপয়েন্টমেন্ট ও সময়সূচী (Termine und Kurs)",
                    explanation = "অ্যাপয়েন্টমেন্ট নেওয়া বা সময়সূচী জানার সহজ বাক্য গঠন:\n- Ich habe einen Termin. (আমার একটি অ্যাপয়েন্টমেন্ট আছে।)\n- Ich habe am Montag einen Termin. (সোমবার আমার একটি অ্যাপয়েন্টমেন্ট আছে।)\n- Der Termin ist um zehn Uhr. (অ্যাপয়েন্টমেন্টটি ১০টায়।)\n- Der Kurs beginnt um neun Uhr. (কোর্সটি ৯টায় শুরু হয়।)",
                    examples = listOf(
                        "Ich habe am Dienstag einen Termin.",
                        "Der Kurs beginnt um neun Uhr."
                    )
                )
            ),
            exampleSentences = listOf(
                ExampleSentence("Wie spät ist es?", "কয়টা বাজে?", "ভি শ্পেত ইস্ট এস"),
                ExampleSentence("Es ist zehn Uhr.", "দশটা বাজে।", "এস ইস্ট ত্সেন উর"),
                ExampleSentence("Es ist halb acht.", "সাড়ে সাতটা। (৭:৩০)", "এস ইস্ট হাল্প আখ্ত"),
                ExampleSentence("Heute ist Montag.", "আজ সোমবার।", "হয়-টে ইস্ট মোন-তাক"),
                ExampleSentence("Morgen ist Dienstag.", "আগামীকাল মঙ্গলবার।", "মোর-গেন ইস্ট দিন্স-তাক"),
                ExampleSentence("Am Freitag habe ich einen Termin.", "শুক্রবার আমার একটি অ্যাপয়েন্টমেন্ট আছে।", "আম ফ্রাই-তাক হা-বে ইখ আই-নেন টের-মিন"),
                ExampleSentence("Ich habe am Montag einen Termin.", "সোমবার আমার একটি অ্যাপয়েন্টমেন্ট আছে।", "ইখ হা-বে আম মোন-তাক আই-নেন টের-মিন"),
                ExampleSentence("Der Termin ist um zehn Uhr.", "অ্যাপয়েন্টমেন্টটি দশটায়।", "দের টের-মিন ইস্ট উম ত্সেন উর"),
                ExampleSentence("Heute ist der 5. September.", "আজ ৫ সেপ্টেম্বর।", "হয়-টে ইস্ট দের ফিউনফ-টে জেপ-টেম-বার"),
                ExampleSentence("Mein Geburtstag ist am 10. Mai.", "আমার জন্মদিন ১০ মে।", "মাইন গে-বুর্তস-তাক ইস্ট আম ত্সেন-তেন মাই"),
                ExampleSentence("Am Morgen arbeite ich.", "সকালে আমি কাজ করি।", "আম মোর-গেন আর-বাই-টে ইখ"),
                ExampleSentence("Der Kurs beginnt um neun Uhr.", "কোর্সটি নয়টায় শুরু হয়।", "দের কুর্স বে-গিন্ট উম নয়ন উর")
            ),
            dialogues = listOf(
                DialogueEntry("A", "Entschuldigung, wie spät ist es?", "ক্ষমা করবেন, কয়টা বাজে?"),
                DialogueEntry("B", "Es ist zehn Uhr.", "দশটা বাজে।"),
                DialogueEntry("A", "Danke!", "ধন্যবাদ!"),
                DialogueEntry("B", "Bitte!", "স্বাগতম!"),
                DialogueEntry("A", "Guten Tag. Ich möchte einen Termin.", "শুভ দিন। আমি একটি অ্যাপয়েন্টমেন্ট চাই।"),
                DialogueEntry("B", "Gerne. Wann?", "অবশ্যই। কখন?"),
                DialogueEntry("A", "Am Montag, bitte.", "সোমবারে, দয়া করে।"),
                DialogueEntry("B", "Um zehn Uhr?", "দশটায়?"),
                DialogueEntry("A", "Ja, das ist gut.", "হ্যাঁ, সেটা ভালো হয়।"),
                DialogueEntry("B", "Gut. Bis Montag!", "বেশ। সোমবার দেখা হবে!"),
                DialogueEntry("A", "Danke. Bis Montag!", "ধন্যবাদ। সোমবার দেখা হবে!"),
                DialogueEntry("A", "Wann beginnt der Deutschkurs?", "জার্মান কোর্স কখন শুরু হয়?"),
                DialogueEntry("B", "Am Dienstag um neun Uhr.", "মঙ্গলবার নয়টায়।"),
                DialogueEntry("A", "Um neun Uhr?", "নয়টায়?"),
                DialogueEntry("B", "Ja, genau.", "হ্যাঁ, একদম ঠিক।"),
                DialogueEntry("A", "Danke!", "ধন্যবাদ!")
            ),
            exercises = listOf(
                Exercise(
                    id = "ex_9_1",
                    question = "ঘড়িতে ১০:০০ বাজে। \"Wie spät ist es?\" প্রশ্নের সঠিক উত্তর কোনটি?",
                    options = listOf("Es ist zehn Uhr.", "Es ist acht Uhr.", "Es ist zwei Uhr.", "Es ist fünf Uhr."),
                    correctAnswer = "Es ist zehn Uhr.",
                    explanation = "১০:০০ এর ক্ষেত্রে 'Es ist zehn Uhr.' বলা হয়।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_9_2",
                    question = "শূন্যস্থান পূরণ করুন: Der Termin ist ___ zehn Uhr.",
                    options = listOf("um", "am", "in", "aus"),
                    correctAnswer = "um",
                    explanation = "ঘড়ির নির্দিষ্ট সময়ের পূর্বে 'um' অব্যয় ব্যবহৃত হয়।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_9_3",
                    question = "শূন্যস্থান পূরণ করুন: Ich habe ___ Montag einen Termin.",
                    options = listOf("am", "um", "in", "aus"),
                    correctAnswer = "am",
                    explanation = "বার বা দিনের পূর্বে 'am' ব্যবহৃত হয়।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_9_4",
                    question = "\"Montag\" শব্দের অর্থ কী?",
                    options = listOf("মঙ্গলবার", "সোমবার", "শুক্রবার", "রবিবার"),
                    correctAnswer = "সোমবার",
                    explanation = "'Montag' অর্থ 'সোমবার'।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_9_5",
                    question = "জার্মানে অনুবাদ করুন: আমার সোমবার একটি অ্যাপয়েন্টমেন্ট আছে।",
                    correctAnswer = "Ich habe am Montag einen Termin.",
                    explanation = "'আমার সোমবার একটি অ্যাপয়েন্টমেন্ট আছে' এর অনুবাদ হলো 'Ich habe am Montag einen Termin.'",
                    type = ExerciseType.TRANSLATION
                ),
                Exercise(
                    id = "ex_9_6",
                    question = "জার্মানে অনুবাদ করুন: অ্যাপয়েন্টমেন্টটি দশটায়।",
                    correctAnswer = "Der Termin ist um zehn Uhr.",
                    explanation = "'অ্যাপয়েন্টমেন্টটি দশটায়' এর অনুবাদ হলো 'Der Termin ist um zehn Uhr.'",
                    type = ExerciseType.TRANSLATION
                ),
                Exercise(
                    id = "ex_9_7",
                    question = "জার্মান ব্যাকরণে \"halb acht\" বলতে সময়ের কোন রূপটিকে বোঝায়?",
                    options = listOf("০৭:৩০", "০৮:৩০", "০৮:০০", "০৭:০০"),
                    correctAnswer = "০৭:৩০",
                    explanation = "জার্মানে 'halb acht' মানে ৭:৩০ (৮টা বাজার অর্ধেক পথ)।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_9_8",
                    question = "ঘড়িতে ০৯:১৫ বাজে। জার্মানে কীভাবে বলবেন?",
                    options = listOf("Es ist neun Uhr fünfzehn.", "Es ist zehn Uhr.", "Es ist acht Uhr.", "Es ist halb neun."),
                    correctAnswer = "Es ist neun Uhr fünfzehn.",
                    explanation = "৯:১৫ হলো 'Es ist neun Uhr fünfzehn.'",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_9_9",
                    question = "You have a doctor's appointment on Monday at 10:00.\nWann ist der Termin?",
                    options = listOf("Am Montag um zehn Uhr.", "Am Dienstag um zwei Uhr.", "Um zehn Uhr am Freitag.", "Am Sonntag."),
                    correctAnswer = "Am Montag um zehn Uhr.",
                    explanation = "সোমবারে (Am Montag) এবং ১০টায় (um zehn Uhr)।",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_9_10",
                    question = "You want to ask what time the German course starts. Which sentence is correct?",
                    options = listOf("Wann beginnt der Deutschkurs?", "Wie heißt du?", "Wo wohne ich?", "Wie viel kostet das?"),
                    correctAnswer = "Wann beginnt der Deutschkurs?",
                    explanation = "'Wann beginnt der Deutschkurs?' মানে 'জার্মান কোর্স কখন শুরু হয়?'",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_9_11",
                    question = "You want to ask the current time. Which sentence is correct?",
                    options = listOf("Wie spät ist es?", "Wo ist der Bahnhof?", "Wie geht es Ihnen?", "Was machst du?"),
                    correctAnswer = "Wie spät ist es?",
                    explanation = "'Wie spät ist es?' মানে 'কয়টা বাজে?'",
                    type = ExerciseType.MULTIPLE_CHOICE
                ),
                Exercise(
                    id = "ex_9_12",
                    question = "শূন্যস্থান পূরণ করুন: Heute ist Montag. Morgen ist ___.",
                    options = listOf("Dienstag", "Sonntag", "Freitag", "Gestern"),
                    correctAnswer = "Dienstag",
                    explanation = "আজ সোমবার হলে আগামীকাল মঙ্গলবার (Dienstag)।",
                    type = ExerciseType.FILL_IN_BLANK
                )
            )
        )
    )

    override fun getLessons(): List<Lesson> = lessonsList

    override fun getLessonById(id: String): Lesson? = lessonsList.find { it.id == id }
}
