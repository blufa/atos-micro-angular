package atos.sn.cvservice.services;


import java.util.List;

import atos.sn.cvservice.entities.SkillEntity;

public interface SkillService {
    SkillEntity addSkill(SkillEntity skill);
    SkillEntity editSkill(SkillEntity skill);
    List<SkillEntity> getSkills();
    SkillEntity getSkill(String id);
    void deleteSkill(String id);
}
