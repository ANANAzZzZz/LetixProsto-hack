package suai.vladislav.letixprosto.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import suai.vladislav.letixprosto.models.vacancy.ResponseVacancy;

import java.util.List;

public interface ResponseVacancyRepository extends MongoRepository<ResponseVacancy, String> {
     @Query(value = "{ 'results.mainVacancyCompetencies.name' : ?0}", fields = "{ 'results.mainVacancyCompetencies.name' : 1, 'results.name':  2}")
    public List<ResponseVacancy> findByResultsMainVacancyCompetenciesName(String mainVacancyCompetencies);
}
