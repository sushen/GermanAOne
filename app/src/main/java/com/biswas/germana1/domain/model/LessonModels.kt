package com.biswas.germana1.domain.model

data class Lesson(
    val id: String,
    val title: String,
    val description: String,
    val order: Int,
    val objectives: List<String>,
    val vocabulary: List<VocabularyItem>,
    val grammarRules: List<GrammarRule>,
    val exampleSentences: List<ExampleSentence>,
    val dialogues: List<DialogueEntry>,
    val exercises: List<Exercise>
)

data class VocabularyItem(
    val german: String,
    val english: String,
    val pronunciation: String,
    val exampleSentence: String
)

data class GrammarRule(
    val title: String,
    val explanation: String,
    val examples: List<String>
)

data class ExampleSentence(
    val german: String,
    val english: String,
    val pronunciation: String? = null
)

data class DialogueEntry(
    val speaker: String,
    val german: String,
    val english: String
)

enum class ExerciseType {
    FILL_IN_BLANK,
    MULTIPLE_CHOICE,
    TRANSLATION
}

data class Exercise(
    val id: String,
    val question: String,
    val options: List<String> = emptyList(),
    val correctAnswer: String,
    val explanation: String,
    val type: ExerciseType
)
