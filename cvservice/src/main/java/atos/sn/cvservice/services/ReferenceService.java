package atos.sn.cvservice.services;


import java.util.List;

import atos.sn.cvservice.entities.ReferenceEntity;

public interface ReferenceService {
    ReferenceEntity addReference(ReferenceEntity reference);
    ReferenceEntity editReference(ReferenceEntity reference);
    List<ReferenceEntity> getReferences();
    ReferenceEntity getReference(String id);
    void deleteReference(String id);
}
