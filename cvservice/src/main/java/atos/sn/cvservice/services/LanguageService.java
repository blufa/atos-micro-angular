package atos.sn.cvservice.services;


import atos.sn.cvservice.entites.LanguageEntity;

import java.util.List;

public interface LanguageService {
    LanguageEntity addLanguage(LanguageEntity language);
    LanguageEntity editLanguage(LanguageEntity language);
    List<LanguageEntity> getLanguages();
    LanguageEntity getLanguage(String id);
    void deleteLanguage(String id);
}
