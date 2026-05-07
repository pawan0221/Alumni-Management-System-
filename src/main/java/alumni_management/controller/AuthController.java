package alumni_management.controller;

import alumni_management.model.User;
import alumni_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users/count")
    public long getTotalUsers() {
        return userRepository.count();
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        Optional<User> found = userRepository.findByUsernameAndPassword(
            user.getUsername(), user.getPassword()
        );
        return found.orElse(null);
    }
}