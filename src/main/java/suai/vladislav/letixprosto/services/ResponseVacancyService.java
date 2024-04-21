package suai.vladislav.letixprosto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import suai.vladislav.letixprosto.models.vacancy.ResponseVacancy;
import suai.vladislav.letixprosto.repositories.ResponseVacancyRepository;

import java.util.ArrayList;

@Service
public class ResponseVacancyService {
    @Autowired
    private ResponseVacancyRepository responseVacancyRepository;

    public void saveResponse(ResponseVacancy responseVacancy) {
        responseVacancyRepository.save(responseVacancy);
    }

    public ArrayList<ResponseVacancy> getResponse() {
        return (ArrayList<ResponseVacancy>) responseVacancyRepository.findAll();
    }

    public ArrayList<ResponseVacancy> searchByMainVacancyCompetencies(String Competencies) {
        return (ArrayList<ResponseVacancy>) responseVacancyRepository.findByResultsMainVacancyCompetenciesName(Competencies);
    }
}
