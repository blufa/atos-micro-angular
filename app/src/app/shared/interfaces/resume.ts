import { Language } from "./language";
import { Award } from './award';
import { Skill } from './skill';
import { Education } from './education';
import { User } from './user';
import { Experience } from './experience';

export interface Resume {
    id?: string;
    user: User;
    languages: Array<Language>;
    awardshonors: Array<Award>;
    skills: Array<Skill>;
    educations: Array<Education>;
    leisure: Array<string>;
    experiences: Array<Experience>;
}
