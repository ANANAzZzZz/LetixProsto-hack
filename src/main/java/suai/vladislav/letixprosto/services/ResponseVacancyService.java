package suai.vladislav.letixprosto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import suai.vladislav.letixprosto.models.vacancy.Response;
import suai.vladislav.letixprosto.repositories.ResponseVacancyRepository;

@Service
public class ResponseVacancyService {
    @Autowired
    private ResponseVacancyRepository responseVacancyRepository;

    public void saveResponse(Response response) { responseVacancyRepository.save(response); }
}
