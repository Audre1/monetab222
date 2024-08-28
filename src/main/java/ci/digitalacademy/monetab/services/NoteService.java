package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.models.Note;
import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.services.DTO.NoteDTO;

import java.util.List;
import java.util.Optional;

public interface NoteService {

    NoteDTO save(NoteDTO noteDTO);

    NoteDTO update(NoteDTO noteDTO);

    Optional<NoteDTO> findOne(Long id);

    List<NoteDTO> findAll();

    void delecte(Long id);
}
