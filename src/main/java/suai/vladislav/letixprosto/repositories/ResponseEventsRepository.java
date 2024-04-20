package suai.vladislav.letixprosto.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import suai.vladislav.letixprosto.models.events.Response;

public interface ResponseEventsRepository extends MongoRepository<Response, String> {
}
