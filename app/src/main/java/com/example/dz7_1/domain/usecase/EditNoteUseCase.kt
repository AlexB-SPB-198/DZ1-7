package com.example.dz7_1.domain.usecase

import com.example.dz7_1.domain.model.Note
import com.example.dz7_1.domain.repository.NoteRepository

class EditNoteUseCase(
    private val noteRepository: NoteRepository) {
    fun editNote(note: Note) = noteRepository.editNote(note)

}