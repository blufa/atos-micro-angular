package atos.sn.cvservice.services;

import sn.atos.cv.entites.LanguageEntity;

import java.util.List;

public interface LanguageService {
    LanguageEntity addLanguage(LanguageEntity language);
    LanguageEntity editLanguage(LanguageEntity language);
    List<LanguageEntity> getLanguages();
    LanguageEntity getLanguage(String id);
    void delete(String id);
}
