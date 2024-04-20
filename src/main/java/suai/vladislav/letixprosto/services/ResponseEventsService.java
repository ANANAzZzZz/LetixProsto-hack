package suai.vladislav.letixprosto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import suai.vladislav.letixprosto.models.events.Response;
import suai.vladislav.letixprosto.repositories.ResponseEventsRepository;

import java.util.ArrayList;

@Service
public class ResponseEventsService {
    @Autowired
    private ResponseEventsRepository responseEventsRepository;
    public ArrayList<Response> getAllResponse(){
        return (ArrayList<Response>) responseEventsRepository.findAll();
    }

    public boolean setResponse(Response response) {
        try {
            responseEventsRepository.save(response);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
}
