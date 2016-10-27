/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.presentation.converter;

import ch.hearc.ig.odi.peoplelist.business.Person;
import ch.hearc.ig.odi.peoplelist.services.Services;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author sergio.dasilvad
 */

@Named(value = "peopleLOVConverter")
@RequestScoped
public class PeopleLOVConverter implements Converter{
    @Inject
    Services services;
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null) {
            return null;

        } else {
            return services.getPerson(Long.parseLong(value));
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null) {
            return null;
        } else if (value instanceof Person) {
            return (String.valueOf(((Person) value).getId()));
        }else{
            return "";
        }
    }
    
}
