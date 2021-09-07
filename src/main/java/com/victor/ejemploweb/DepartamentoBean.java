/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victor.ejemploweb;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author victorm
 */
@Named(value = "departamentoBean")
@SessionScoped
public class DepartamentoBean implements Serializable {
    private Departamento departamento;

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public void guardar(){
        addMessage(FacesMessage.SEVERITY_INFO, "Se guardo", departamento.getNombre());

    } 
    
    public void addMessage(FacesMessage.Severity severity, String summary, String detail) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(severity, summary, detail));
    }
    /**
     * Creates a new instance of DepartamentoBean
     */
    public DepartamentoBean() {
        departamento=new Departamento();
    }
    
    
}
