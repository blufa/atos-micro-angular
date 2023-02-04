package atos.sn.cvservice.mappers;

import org.mapstruct.Mapper;

import atos.sn.cvservice.dto.CandidateDTO;
import atos.sn.cvservice.entities.CandidateEntity;

@Mapper(componentModel = "spring")
public interface CandidateMapper {
    CandidateEntity toEntity(CandidateDTO candidateDTO);
    CandidateDTO toDto(CandidateEntity candidateEntity);
}
