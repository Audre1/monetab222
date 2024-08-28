package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.models.Note;
import ci.digitalacademy.monetab.services.DTO.NoteDTO;

public  final class NoteMapper {

    private  NoteMapper(){

    }
    public static NoteDTO toDTO(Note note){

        NoteDTO noteDTO = new NoteDTO();
        noteDTO.setId(note.getId());
        noteDTO.setNotel(note.getNotel());
        noteDTO.setMatiere(note.getMatiere());
        return noteDTO;
    }

    public static Note toEntity(NoteDTO noteDTO){

        Note  note = new Note();
        note.setId(noteDTO.getId());
        note.setNotel(noteDTO.getNotel());
        note.setMatiere(note.getMatiere());
        return note;
    }

}
