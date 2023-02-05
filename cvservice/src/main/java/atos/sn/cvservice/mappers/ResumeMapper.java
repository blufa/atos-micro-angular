package atos.sn.cvservice.mappers;

import org.mapstruct.Mapper;

import atos.sn.cvservice.dto.ResumeDTO;
import atos.sn.cvservice.entities.ResumeEntity;

@Mapper(componentModel = "spring")
public interface ResumeMapper {
    ResumeEntity toEntity(ResumeDTO resumeDTO);
    ResumeDTO toDto(ResumeEntity resumeEntity);
}
