package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.models.Note;
import ci.digitalacademy.monetab.models.Student;

import java.util.List;
import java.util.Optional;

public interface NoteService {

    Note save(Note note);

    Note update(Note note);

    Optional<Note> findOne(Long id);

    List<Note> findAll();

    void delecte(Long id);
}
