package atos.sn.cvservice.services;

import java.util.List;

import atos.sn.cvservice.dto.CandiateDTO;
import atos.sn.cvservice.entities.CandidateEntity;

public interface CandidateService {
    CandiateDTO addUser(CandiateDTO userDTO);

    CandiateDTO editUser(CandiateDTO userDTO, String id);

    List<CandidateEntity> getUsers();

    CandidateEntity getUser(String id);

    void deleteUser(String id);
}
