package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.Note;
import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.services.NoteService;

import java.util.List;
import java.util.Optional;

public class NoteServiceImpl implements NoteService {

    @Override
    public Note save(Note note) {
        return null;
    }

    @Override
    public Note update(Note note) {
        return null;
    }

    @Override
    public Optional<Note> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Note> findAll() {
        return List.of();
    }

    @Override
    public void delecte(Long id) {

    }
}
