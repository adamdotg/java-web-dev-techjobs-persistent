package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description must not be empty")
    @Max(value = 500, message = "Description must not exceed 500 characters")
    private String description;

    public Skill(@NotBlank(message = "Description must not be empty") @Max(value = 500, message = "Description must not exceed 500 characters") String description) {
        this.description = description;
    }

    public Skill () {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}