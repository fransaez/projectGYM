/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frre.labii.controllers;

import com.frre.labii.conexion.ConexionBD;
import com.frre.labii.logic.Usuarios;
import com.frre.labii.transformers.UsuarioTransformer;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    public void agregarUsuario(int numero, String nombre, String apellido, Date fechaNac) throws SQLException {
        
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
        ConexionBD.getInstance().insertRecordToTable("INSERT INTO usuarios (dni, nombre, apellido, fecha_nac) VALUES ('"+numero+"', '"+nombre+"', '"+apellido+"', '"+dt1.format(fechaNac)+"')");
        
    }
    
    public List<Usuarios> devolverUsuarios() throws SQLException {
        
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
        
        mapa = ConexionBD.getInstance().makeQuery("select * from usuarios");
        UsuarioTransformer TR = new UsuarioTransformer();
        List<Usuarios> listaUsuarios = TR.transform(mapa);
        return listaUsuarios;
        
    }
    
}
