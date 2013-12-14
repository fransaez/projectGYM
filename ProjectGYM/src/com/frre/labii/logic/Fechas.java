/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.frre.labii.logic;

import java.sql.Date;
/**
 *
 * @author fran
 */
public class Fechas {
    private Date fecha;
    private String observaciones;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
     @Override
    public String toString() {
        return "Fecha{" + fecha + ". " + observaciones + '}';
    }       
}
