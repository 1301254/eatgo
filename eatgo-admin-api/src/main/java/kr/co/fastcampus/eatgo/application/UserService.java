package kr.co.fastcampus.eatgo.application;

import kr.co.fastcampus.eatgo.domain.User;
import kr.co.fastcampus.eatgo.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        List<User> users = userRepository.findAll();

        users.add(User.builder()
                .email("duswp220@gmail.com")
                .name("tester")
                .level(1L)
                .build());

        return users;
    }

    public User addUser(String email, String name) {
        User user = User.builder()
                .email(email)
                .name(name)
                .build();

        return userRepository.save(user);
    }

    public User updateUser(Long id, String email, String name, Long level) {
        return null;
    }
}
