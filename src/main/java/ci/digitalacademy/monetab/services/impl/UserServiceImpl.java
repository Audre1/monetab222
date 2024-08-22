package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.repositories.UserRepository;
import ci.digitalacademy.monetab.services.UserService;
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
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        Optional<User> optionalUser = findOne(user.getId());
        if(optionalUser.isPresent()){
            User userToUpdate = optionalUser.get();
            userToUpdate.setPassword(user.getPassword());
            userToUpdate.setPseudo(user.getPseudo());
            return  save(userToUpdate);
        }else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Optional<User> findOne(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void delecte(Long id) {
        userRepository.deleteById(id);
    }


    //private final logger log= loggerFactory.getLogger(UserServiceimpl.class);

}
