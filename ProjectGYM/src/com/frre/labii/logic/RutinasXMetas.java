/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.frre.labii.logic;

/**
 *
 * @author fran
 */
public class RutinasXMetas {
    private String diasHabiles_codigo;
    private int metas_usuarios_codigo;
    private String rutinas_codigo;
    private String observaciones;

    public String getDiasHabiles_codigo() {
        return diasHabiles_codigo;
    }

    public void setDiasHabiles_codigo(String diasHabiles_codigo) {
        this.diasHabiles_codigo = diasHabiles_codigo;
    }

    public int getMetas_usuarios_codigo() {
        return metas_usuarios_codigo;
    }

    public void setMetas_usuarios_codigo(int metas_usuarios_codigo) {
        this.metas_usuarios_codigo = metas_usuarios_codigo;
    }

    public String getRutinas_codigo() {
        return rutinas_codigo;
    }

    public void setRutinas_codigo(String rutinas_codigo) {
        this.rutinas_codigo = rutinas_codigo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    @Override
    public String toString() {
        return "Rutina por meta{" + diasHabiles_codigo + " - " + metas_usuarios_codigo + " - " + rutinas_codigo + ". " + observaciones + '}';
    }            
}
