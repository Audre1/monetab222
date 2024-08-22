package ci.digitalacademy.monetab.services;


import ci.digitalacademy.monetab.models.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public interface UserService {

    User save(User user);

    User update(User user);

    Optional<User> findOne(Long id);

    List<User> findAll();

    void delecte(Long id);

}
