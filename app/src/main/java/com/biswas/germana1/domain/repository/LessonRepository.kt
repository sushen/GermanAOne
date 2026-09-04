package com.biswas.germana1.domain.repository

import com.biswas.germana1.domain.model.Lesson

interface LessonRepository {
    fun getLessons(): List<Lesson>
    fun getLessonById(id: String): Lesson?
}
