package ci.digitalacademy.monetab.services;


import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.DTO.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService {

    UserDTO save(UserDTO userDTO);

    UserDTO update(UserDTO userDTO);


    Optional<UserDTO> findOne(Long id);

    List<UserDTO> findAll();

    void delecte(Long id);

}
