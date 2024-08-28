package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.Adresse;
import ci.digitalacademy.monetab.models.Note;
import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.repository.NoteRepository;
import ci.digitalacademy.monetab.services.DTO.NoteDTO;
import ci.digitalacademy.monetab.services.NoteService;
import ci.digitalacademy.monetab.services.mapper.AdresseMapper;
import ci.digitalacademy.monetab.services.mapper.NoteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {
    private final NoteRepository noteRepository;

    @Override
    public NoteDTO save(NoteDTO noteDTO) {
        Note note = NoteMapper.toEntity(noteDTO);
        note = noteRepository.save(note);
        return NoteMapper.toDTO(note);
    }

    @Override
    public NoteDTO update(NoteDTO noteDTO) {
        return findOne(noteDTO.getId()).map(existeNote->{
            existeNote.setNotel(noteDTO.getNotel());
            existeNote.setMatiere(noteDTO.getMatiere());
            return save(existeNote);
        }).orElseThrow(()->new IllegalArgumentException());

    }

    @Override
    public Optional<NoteDTO> findOne(Long id) {

        return noteRepository.findById(id).map(note -> {
            return NoteMapper.toDTO(note);
        });
    }

    @Override
    public List<NoteDTO> findAll() {
        return noteRepository.findAll().stream().map(note -> {
            return NoteMapper.toDTO(note);
        }).toList();
    }

    @Override
    public void delecte(Long id) {

    }
}
