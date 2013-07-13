/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monokepos.reg;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jaime
 */
@ManagedBean
@RequestScoped
public class RegistrationBean {
private String saludo;
private String nombre;
private String apellidos;
private int edad;
private String email;

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Creates a new instance of RegistrationBean
      */
    public RegistrationBean() {
    }
}
