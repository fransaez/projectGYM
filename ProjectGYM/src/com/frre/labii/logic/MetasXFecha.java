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
public class MetasXFecha {
    private Date fecha;
    private int metas_usuarios_codigo;
    private String observaciones;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMetas_usuarios_codigo() {
        return metas_usuarios_codigo;
    }

    public void setMetas_usuarios_codigo(int metas_usuarios_codigo) {
        this.metas_usuarios_codigo = metas_usuarios_codigo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
     @Override
    public String toString() {
        return "Fecha{" + fecha + " - meta " + metas_usuarios_codigo + ". " + observaciones + '}';
    }           
}
