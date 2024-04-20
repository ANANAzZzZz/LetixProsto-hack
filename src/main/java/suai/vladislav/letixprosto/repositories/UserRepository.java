package suai.vladislav.letixprosto.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import suai.vladislav.letixprosto.models.User;

public interface UserRepository extends MongoRepository<User, String> {
}
