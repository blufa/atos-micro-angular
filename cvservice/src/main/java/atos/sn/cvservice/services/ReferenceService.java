package atos.sn.cvservice.services;


import atos.sn.cvservice.entites.ReferenceEntity;

import java.util.List;

public interface ReferenceService {
    ReferenceEntity addReference(ReferenceEntity reference);
    ReferenceEntity editReference(ReferenceEntity reference);
    List<ReferenceEntity> getReferences();
    ReferenceEntity getReference(String id);
    void deleteReference(String id);
}
