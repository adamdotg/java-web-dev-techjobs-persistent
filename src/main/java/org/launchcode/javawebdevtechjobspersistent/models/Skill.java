package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description must not be empty")
    @Size(max = 500, message = "Description must not exceed 500 characters")
    private String description;

    public Skill(@NotBlank(message = "Description must not be empty") @Size(max = 500, message = "Description must not exceed 500 characters") String description) {
        this.description = description;
    }

    public Skill () {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
      return description;
    }
// generated below, both unnecessary
//  @Override
//  public String toString() {
//    return "Skill{" +
//      "description='" + description + '\'' +
//      '}';
//  }
}
