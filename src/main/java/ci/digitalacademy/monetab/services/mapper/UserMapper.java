package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.models.Adresse;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.DTO.AdresseDTO;
import ci.digitalacademy.monetab.services.DTO.UserDTO;

public final class UserMapper {

    private UserMapper(){

    }
    public static UserDTO toDTO(User user) {

        UserDTO userDTO = new UserDTO();
        userDTO.setPassword(user.getPassword());
        userDTO.setPseudo(user.getPseudo());
        userDTO.setCreationDate(user.getCreationDate());
        return userDTO;
    }

    public static User toEntity(UserDTO userDTO ){

         User user = new User();
         user.setPassword(userDTO.getPassword());
        user.setPseudo(user.getPseudo());
        user.setCreationDate(userDTO.getCreationDate());

        return user;
    }


}
