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
public class Metas {
    private int usuarios_codigo;
    private Date fecha_inicio;
    private Date fecha_fin;
    private byte altura;
    private int peso_inicial;
    private int peso_final;
    private String descripcion;
    private String observaciones;

    public int getUsuarios_codigo() {
        return usuarios_codigo;
    }

    public void setUsuarios_codigo(int usuarios_codigo) {
        this.usuarios_codigo = usuarios_codigo;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public byte getAltura() {
        return altura;
    }

    public void setAltura(byte altura) {
        this.altura = altura;
    }

    public int getPeso_inicial() {
        return peso_inicial;
    }

    public void setPeso_inicial(int peso_inicial) {
        this.peso_inicial = peso_inicial;
    }

    public int getPeso_final() {
        return peso_final;
    }

    public void setPeso_final(int peso_final) {
        this.peso_final = peso_final;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    @Override
    public String toString() {
        return "Meta{" + descripcion + ". " + "Usuario " + usuarios_codigo + ", fecha de alta " + fecha_inicio + ". " + observaciones + '}';
    }        
}
