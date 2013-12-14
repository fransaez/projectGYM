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
public class EjerciciosXRutina {
    private String ejercicios_codigo;
    private String rutinas_codigo;
    private byte series;
    private byte repeticiones;
    private String observaciones;

    public String getEjercicios_codigo() {
        return ejercicios_codigo;
    }

    public void setEjercicios_codigo(String ejercicios_codigo) {
        this.ejercicios_codigo = ejercicios_codigo;
    }

    public String getRutinas_codigo() {
        return rutinas_codigo;
    }

    public void setRutinas_codigo(String rutinas_codigo) {
        this.rutinas_codigo = rutinas_codigo;
    }

    public byte getSeries() {
        return series;
    }

    public void setSeries(byte series) {
        this.series = series;
    }

    public byte getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(byte repeticiones) {
        this.repeticiones = repeticiones;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    @Override
    public String toString() {
        return "EjercicioXRutina{" + ejercicios_codigo + " x " + rutinas_codigo + "= " + series + " series de " + repeticiones + " repeticiones." + observaciones + '}';
    }        
}
