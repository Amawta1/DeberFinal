/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author amawt
 */
public class Provincia implements Serializable{

    private int codigoProvincia;
    private Pais nombrePais;
    private String nombreProvincia;
    private int nroCanton;
    private int habitantes;
    private LocalDate fundacion;

    public Provincia(int codigoProvincia, Pais nombrePais, String nombreProvincia, int nroCanton, int habitantes, LocalDate fundacion) {
        this.codigoProvincia = codigoProvincia;
        this.nombrePais = nombrePais;
        this.nombreProvincia = nombreProvincia;
        this.nroCanton = nroCanton;
        this.habitantes = habitantes;
        this.fundacion = fundacion;

    }


    public int getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(int codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public Pais getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(Pais nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getNroCanton() {
        return nroCanton;
    }

    public void setNroCanton(int nroCanton) {
        this.nroCanton = nroCanton;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public LocalDate getFundacion() {
        return fundacion;
    }

    public void setFundacion(LocalDate fundacion) {
        this.fundacion = fundacion;
    }

    @Override
    public String toString() {
        return "Provincia{" + "codigoProvincia=" + codigoProvincia + ", nombrePais=" 
                + nombrePais.getNombrePais() + ", nombreProvincia=" + nombreProvincia + ", nroCanton=" 
                + nroCanton + ", habitantes=" + habitantes + ", fundacion=" + fundacion + '}';
    }

}
