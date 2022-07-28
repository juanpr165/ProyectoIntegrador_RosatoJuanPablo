/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jpr.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author juanp
 */


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    
    //Constructor

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String despcripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = despcripcionE;
    }
    //Getter y Setter

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDespcripcionE() {
        return descripcionE;
    }

    public void setDespcripcionE(String despcripcionE) {
        this.descripcionE = despcripcionE;
    }
    
    
    
}
