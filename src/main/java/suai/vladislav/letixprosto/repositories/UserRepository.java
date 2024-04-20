package suai.vladislav.letixprosto.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import suai.vladislav.letixprosto.models.User;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
}
