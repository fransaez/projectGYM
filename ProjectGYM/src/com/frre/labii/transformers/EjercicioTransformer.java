/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.frre.labii.transformers;

import com.frre.labii.logic.Ejercicios;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author fran
 */
public class EjercicioTransformer implements Transformer<Ejercicios>{
    private static final String CODIGO_FIELD = "codigo";
    private static final String NOMBRE_FIELD = "nombre";
    private static final String DESCRIPCION_FIELD = "descripcion";
    private static final String OBSERVACIONES_FIELD = "obsevaciones";
    
    @Override
    public Ejercicios transform(HashMap<String, Object> data) {
       Ejercicios ejercicio = new Ejercicios();
       ejercicio.setCodigo((String) data.get(CODIGO_FIELD));
       ejercicio.setNombre((String) data.get(NOMBRE_FIELD));
       ejercicio.setDescripcion((String) data.get(DESCRIPCION_FIELD));
       ejercicio.setObservaciones((String) data.get(OBSERVACIONES_FIELD));
       return ejercicio;
    }   

    @Override
    public List<Ejercicios> transform(List<HashMap<String, Object>> data) {
        List<Ejercicios> ejercicio = new ArrayList(data.size());
        for (HashMap<String, Object> hashMap : data) {
            ejercicio.add(transform(hashMap));
        }
        return ejercicio;
    }
    
}
