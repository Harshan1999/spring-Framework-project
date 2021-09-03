package com.Harsha.respository;

import com.Harsha.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
