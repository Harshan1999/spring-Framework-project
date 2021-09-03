package com.Harsha.service;

import com.Harsha.model.Speaker;
import com.Harsha.respository.HibernateSpeakerRepositoryImpl;
import com.Harsha.respository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SpeakerServiceImpl implements SpeakerService{
    @Autowired
    private SpeakerRepository repository;
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
