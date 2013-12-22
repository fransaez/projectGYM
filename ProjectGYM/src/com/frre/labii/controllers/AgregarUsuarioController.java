/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frre.labii.controllers;

import com.frre.labii.conexion.ConexionBD;
import com.frre.labii.logic.Usuarios;
import com.frre.labii.transformers.UsuarioTransformer;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cleo
 */
public class AgregarUsuarioController extends GenericController {

    private List<HashMap<String, Object>> mapa;

    public void agregarUsuario(String[] valor) throws SQLException {

        ConexionBD.getInstance().insertRecordToTable("INSERT INTO usuarios (Apellidos, Nombre, email, DNI, Direccion, Telefono, Movil, sexo, fecha_nac, observaciones) VALUES ('" + valor[0] + "', '" + valor[1] + "', '" + valor[2] + "', '" + valor[3] + "', '" + valor[4] + "', '" + valor[5] + "', '" + valor[6] + "', '" + valor[7] + "', '" + valor[8] + "', '" + valor[9] + "')");

    }

    public void eliminarUsuario(String codigo) throws SQLException {

        ConexionBD.getInstance().deleteRecordFromTable("DELETE FROM usuarios WHERE codigo = '" + codigo + "'");

    }

    public void modificarUsuario(int codigo, byte campo, String valor) throws SQLException {

        String col_name = "";
        switch (campo) {
            case 1:
                col_name = "Apellidos";
                break;
            case 2:
                col_name = "Nombre";
                break;
            case 3:
                col_name = "email";
                break;
            case 4:
                col_name = "DNI";
                break;
            case 5:
                col_name = "Direccion";
                break;
            case 6:
                col_name = "Telefono";
                break;
            case 7:
                col_name = "Movil";
                break;
            case 8:
                col_name = "Sexo";
                break;
            case 9:
                col_name = "fecha_nac";
                break;
            case 10:
                col_name = "observaciones";
                break;
        }
        ConexionBD.getInstance().insertRecordToTable("UPDATE usuarios SET " + col_name + " = " + valor + "WHERE codigo = " + codigo + ")");

    }

    public List<Usuarios> devolverUsuarios() throws SQLException {

        mapa = ConexionBD.getInstance().makeQuery("select * from usuarios");
        UsuarioTransformer TR = new UsuarioTransformer();
        List<Usuarios> listaUsuarios = TR.transform(mapa);
        return listaUsuarios;

    }
    
    public boolean existValue(String campo, String valor) throws SQLException {
        mapa = ConexionBD.getInstance().makeQuery("select " + campo + " from usuarios where " + campo + " = '" + valor + "'");
        return !mapa.isEmpty();
    }

}
