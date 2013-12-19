/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.frre.labii.transformers;

import com.frre.labii.logic.Usuarios;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author developer
 */
public class UsuarioTransformer implements Transformer<Usuarios>{
    
    private static final String CODIGO_FIELD = "codigo";
    private static final String APELLIDOS_FIELD = "Apellidos";
    private static final String NOMBRE_FIELD = "Nombre";
    private static final String EMAIL_FIELD = "email";
    private static final String DNI_FIELD = "DNI";
    private static final String DIRECCION_FIELD = "Direccion";
    private static final String TELEFONO_FIELD = "Telefono";
    private static final String MOVIL_FIELD = "Movil";
    private static final String SEXO_FIELD = "sexo";
    private static final String FECHA_NAC_FIELD = "fecha_nac";
    private static final String OBSERVACIONES_FIELD = "observaciones";
    
    @Override
    public Usuarios transform(HashMap<String, Object> data) {
       Usuarios usuario = new Usuarios();
       usuario.setCodigo((Integer) data.get(CODIGO_FIELD));
       usuario.setApellido((String) data.get(APELLIDOS_FIELD));
       usuario.setNombre((String) data.get(NOMBRE_FIELD));
       usuario.setEmail((String) data.get(EMAIL_FIELD));
       usuario.setDni((Integer) data.get(DNI_FIELD));
       usuario.setDireccion((String) data.get(DIRECCION_FIELD));
       usuario.setTelefono((Long) data.get(TELEFONO_FIELD));
       usuario.setMovil((Long) data.get(MOVIL_FIELD));
       usuario.setSexo((Boolean) data.get(SEXO_FIELD));
       usuario.setFecha_nac((Date) data.get(FECHA_NAC_FIELD));
       usuario.setObservaciones((String) data.get(OBSERVACIONES_FIELD));
       return usuario;
    }   

    @Override
    public List<Usuarios> transform(List<HashMap<String, Object>> data) {
        List<Usuarios> usuario = new ArrayList(data.size());
        for (HashMap<String, Object> hashMap : data) {
            usuario.add(transform(hashMap));
        }
        return usuario;
    }
}
