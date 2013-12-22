/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frre.labii.logic;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author developer
 */
public class Usuarios {

    private int codigo;
    private String apellido;
    private String nombre;
    private String email;
    private int dni;
    private String direccion;
    private long telefono;
    private long movil;
    private boolean sexo;
    private Date fecha_nac;
    private String observaciones;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getMovil() {
        return movil;
    }

    public void setMovil(long movil) {
        this.movil = movil;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


    @Override
    public String toString() {
        return "Usuario{" + "apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    public Object[] toTable() {
        SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy");
        Object[] exportTable = new Object[11];
        exportTable[0] = this.codigo;
        exportTable[1] = this.apellido;
        exportTable[2] = this.nombre;
        exportTable[3] = this.email;
        exportTable[4] = this.dni;
        exportTable[5] = this.direccion;
        exportTable[6] = (this.telefono == 0)?"":this.telefono;
        exportTable[7] = (this.movil == 0) ?"":this.movil;
        exportTable[8] = (this.sexo)?"Femenino":"Masculino";
        exportTable[9] = dt1.format(fecha_nac);
        exportTable[10] = this.observaciones;
        return exportTable;
    }
}
