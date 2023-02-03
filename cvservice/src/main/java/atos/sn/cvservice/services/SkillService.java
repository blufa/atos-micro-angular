package atos.sn.cvservice.services;

import sn.atos.cv.entites.SkillEntity;

import java.util.List;

public interface SkillService {
    SkillEntity addSkill(SkillEntity skill);
    SkillEntity editSkill(SkillEntity skill);
    List<SkillEntity> getSkills();
    SkillEntity getSkill(String id);
    void delete(String id);
}
