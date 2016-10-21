/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.presentation.bean;

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

    public List getPeopleList() {
        return services.getPeopleList();
    }

}
