package suai.vladislav.letixprosto.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import suai.vladislav.letixprosto.models.vacancy.Response;

public interface ResponseVacancyRepository extends MongoRepository<Response, String> {
}
