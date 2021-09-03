package com.Harsha.respository;

import com.Harsha.model.Speaker;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository{
    public List<Speaker> findAll(){
        List<Speaker> speakers=new ArrayList<Speaker>();
        Speaker speaker=new Speaker();
        speaker.setFirstName("Harsha");
        speaker.setLastName("N");
        speakers.add(speaker);
        return speakers;
    }
}
