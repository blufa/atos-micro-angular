package atos.sn.cvservice.mappers;

import org.mapstruct.Mapper;

import atos.sn.cvservice.dto.CandiateDTO;
import atos.sn.cvservice.entities.CandidateEntity;

@Mapper(componentModel = "spring")
public interface CandidateMapper {
    CandidateEntity toEntity(CandiateDTO userDTO);
    CandiateDTO toDto(CandidateEntity userEntity);
}
