/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.frre.labii.transformers;

import com.frre.labii.logic.Rutinas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 *
 * @author fran
 */
public class RutinaTransformer implements Transformer<Rutinas>{
    private static final String NOMBRE_FIELD = "nombre";
    private static final String OBSERVACIONES_FIELD = "obsevaciones";
    
    @Override
    public Rutinas transform(HashMap<String, Object> data) {
       Rutinas rutina = new Rutinas();
       rutina.setNombre((String) data.get(NOMBRE_FIELD));
       rutina.setObservaciones((String) data.get(OBSERVACIONES_FIELD));
       return rutina;
    }   

    @Override
    public List<Rutinas> transform(List<HashMap<String, Object>> data) {
        List<Rutinas> rutina = new ArrayList(data.size());
        for (HashMap<String, Object> hashMap : data) {
            rutina.add(transform(hashMap));
        }
        return rutina;
    }
    
}
