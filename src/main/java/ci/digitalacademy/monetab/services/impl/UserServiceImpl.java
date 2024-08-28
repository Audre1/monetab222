package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.repository.UserRepository;
import ci.digitalacademy.monetab.services.DTO.UserDTO;
import ci.digitalacademy.monetab.services.UserService;
import ci.digitalacademy.monetab.services.mapper.AdresseMapper;
import ci.digitalacademy.monetab.services.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public UserDTO save(UserDTO userDTO) {
        log.debug("Request to save User: {}", userDTO);
        User user = UserMapper.toEntity(userDTO);
        user = userRepository.save(user);
        return UserMapper.toDTO(user);

    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        return findOne(userDTO.getId()).map(existingUser -> {
            existingUser.setPseudo(userDTO.getPseudo());
            existingUser.setPassword(userDTO.getPassword());
            return save(existingUser);
        }).orElseThrow(() -> new IllegalArgumentException("User not found with id " + userDTO.getId()));

    }

    @Override
    public Optional<UserDTO> findOne(Long id) {
        return userRepository.findById(id).map(user ->{
            return UserMapper.toDTO(user);
        } );

    }

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream().map(user -> {
            return UserMapper.toDTO(user);
        }).toList();

    }

    @Override
    public void delecte(Long id) {

    }
}
