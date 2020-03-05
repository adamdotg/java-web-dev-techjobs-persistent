package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required")
    @Max(value = 50, message = "Location must be less than 50 characters")
    private String location;

    public Employer(@NotBlank(message = "Location is required") @Max(value = 50, message = "Location must be less than 50 characters") String location) {
        this.location = location;
    }

    public Employer () {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
//    Is this needed?
//    @Override
//    public String toString() {return location;}
}
