package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required")
    @Size(max = 50, message = "Location must be less than 50 characters")
    private String location;

    @OneToMany(mappedBy = "employer")
    //@JoinColumn Is this needed?
    private List<Job> jobs = new ArrayList<>();

    public Employer(@NotBlank(message = "Location is required") @Size(max = 50, message = "Location must be less than 50 characters") String location) {
        this.location = location;
    }

    public Employer () {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    //unnecessary
//    @Override
//    public String toString() {return location;}
}
