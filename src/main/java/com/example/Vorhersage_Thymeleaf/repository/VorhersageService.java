package com.example.Vorhersage_Thymeleaf.repository;

import com.example.Vorhersage_Thymeleaf.model.Vorhersage;

public interface VorhersageService {
    long geschlosseneVorhersage(Vorhersage vorhersage, int rand);
}
