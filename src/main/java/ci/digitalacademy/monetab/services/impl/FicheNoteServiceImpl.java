package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.FicheNote;
import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.repository.FicheNoteRepository;
import ci.digitalacademy.monetab.repository.TeacherRepository;
import ci.digitalacademy.monetab.services.FicheNoteService;

import java.util.List;
import java.util.Optional;

public class FicheNoteServiceImpl implements FicheNoteService {
    private final FicheNoteRepository ficheNoteRepository;

    public FicheNoteServiceImpl(FicheNoteRepository ficheNoteRepository) {
        this.ficheNoteRepository = ficheNoteRepository;
    }

    @Override
    public FicheNote save(FicheNote ficheNote) {

        return ficheNoteRepository.save(ficheNote);
    }

    @Override
    public FicheNote update(FicheNote ficheNote) {
     return null;

    }

    @Override
    public Optional<FicheNote> findOne(Long id) {
        return ficheNoteRepository.findById(id);
    }

    @Override
    public List<FicheNote> findAll() {
        return ficheNoteRepository.findAll();
    }

    @Override
    public void delecte(Long id) {
        ficheNoteRepository.deleteById(id);

    }
}
