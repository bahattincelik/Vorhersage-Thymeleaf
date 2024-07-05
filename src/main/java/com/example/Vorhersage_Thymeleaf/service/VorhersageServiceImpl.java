package com.example.Vorhersage_Thymeleaf.service;

import com.example.Vorhersage_Thymeleaf.model.Vorhersage;
import com.example.Vorhersage_Thymeleaf.repository.VorhersageService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class VorhersageServiceImpl implements VorhersageService {
    @Override
    public long geschlosseneVorhersage(Vorhersage vorhersage, int rand) {

        int difference=Math.abs(rand-vorhersage.getVermuten());
        return 100-(difference);
    }
}
