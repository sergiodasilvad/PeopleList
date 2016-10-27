/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.presentation.bean;

import ch.hearc.ig.odi.peoplelist.business.Person;
import ch.hearc.ig.odi.peoplelist.services.Services;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author sergio.dasilvad
 */
@Named(value = "peopleListBean")
@RequestScoped
public class PeopleListBean {

    @Inject
    Services services;

    private Person personToDelete;
    private Long id;
    private String gender;
    private String firstName;
    private String lastName;
    private Boolean married;
    private Date birthDate;
    
    public PeopleListBean() {
    }

    public Person getPersonToDelete() {
        return personToDelete;
    }

    public void setPersonToDelete(Person personToDelete) {
        this.personToDelete = personToDelete;
    }

    public Long getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Boolean getMarried() {
        return married;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    public List getPeopleList() {
        return services.getPeopleList();
    }

    public String insertPeople(){
        services.savePerson(gender, firstName, lastName, married, birthDate);
        return "success";
    }
    public String removePeople(){
        services.removePerson(personToDelete);
        return "success";
    }
}
