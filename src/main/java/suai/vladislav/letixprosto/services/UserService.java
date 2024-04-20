package suai.vladislav.letixprosto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import suai.vladislav.letixprosto.models.User;
import suai.vladislav.letixprosto.repositories.UserRepository;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }
    public User getUser(String id) {
        return userRepository.findById(id).orElse(null);
    }
    public ArrayList<User> getAllUsers(){
        return (ArrayList<User>) userRepository.findAll();
    }
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
