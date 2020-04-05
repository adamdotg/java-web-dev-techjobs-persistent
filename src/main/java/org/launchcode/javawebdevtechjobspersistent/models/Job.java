package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private final List<Skill> skills = new ArrayList<>();

    public Job() {
    }

//    public Job(String anEmployer, String someSkills) {
//        super();
//        this.employer = anEmployer;
//        this.skills = someSkills;
//    }

//    public Job(Employer anEmployer, List someSkills) {
//        this.employer = anEmployer;
//        this.skills = someSkills;
//    }

//    public String getEmployer() {
//        return employer;
//    }
//
//    public void setEmployer(String employer) {
//        this.employer = employer;
//    }


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
      return skills;
    }

    public void setSkills(List<Skill> skillList){
        for(Skill skill : skillList){
            this.skills.add(skill);
        }
    }

  //    public String getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String skills) {
//        this.skills = skills;
//    }
}
