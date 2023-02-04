package atos.sn.cvservice.services;


import java.util.List;

import atos.sn.cvservice.entities.LanguageEntity;

public interface LanguageService {
    LanguageEntity addLanguage(LanguageEntity language);
    LanguageEntity editLanguage(LanguageEntity language);
    List<LanguageEntity> getLanguages();
    LanguageEntity getLanguage(String id);
    void deleteLanguage(String id);
}
