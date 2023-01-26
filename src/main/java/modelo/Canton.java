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
public class Canton implements Serializable{

    private int codigoCanton;
    private String nombreCanton;
    private Provincia nombreProvincia;
    private int nroPoblacion;
    private LocalDate descubrimiento;

    public Canton(int codigoCanton, String nombreCanton, Provincia nombreProvincia, int nroPoblacion, LocalDate descubrimiento) {
        this.codigoCanton = codigoCanton;
        this.nombreCanton = nombreCanton;
        this.nombreProvincia = nombreProvincia;
        this.nroPoblacion = nroPoblacion;
        this.descubrimiento = descubrimiento;
    }

    public int getCodigoCanton() {
        return codigoCanton;
    }

    public void setCodigoCanton(int codigoCanton) {
        this.codigoCanton = codigoCanton;
    }

    public String getNombreCanton() {
        return nombreCanton;
    }

    public void setNombreCanton(String nombreCanton) {
        this.nombreCanton = nombreCanton;
    }

    public Provincia getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(Provincia nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getNroPoblacion() {
        return nroPoblacion;
    }

    public void setNroPoblacion(int nroPoblacion) {
        this.nroPoblacion = nroPoblacion;
    }

    public LocalDate getDescubrimiento() {
        return descubrimiento;
    }

    public void setDescubrimiento(LocalDate descubrimiento) {
        this.descubrimiento = descubrimiento;
    }

    @Override
    public String toString() {
        return "Canton{" + "codigoCanton=" + codigoCanton + ", nombreCanton=" + 
                nombreCanton + ", nombreProvincia=" + nombreProvincia.getNombreProvincia() + ", nroPoblacion=" 
                + nroPoblacion + ", descubrimiento=" + descubrimiento + '}';
    }

}
