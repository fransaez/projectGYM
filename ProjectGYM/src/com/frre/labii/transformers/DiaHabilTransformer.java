/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.frre.labii.transformers;

import com.frre.labii.logic.DiasHabiles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 *
 * @author fran
 */

public class DiaHabilTransformer implements Transformer<DiasHabiles>{
    private static final String CODIGO_FIELD = "codigo";
    private static final String NOMBRE_FIELD = "nombre";
    private static final String OBSERVACIONES_FIELD = "observaciones";
    
    @Override
    public DiasHabiles transform(HashMap<String, Object> data) {
       DiasHabiles diaHabil = new DiasHabiles();
       diaHabil.setCodigo((String) data.get(CODIGO_FIELD));
       diaHabil.setNombre((String) data.get(NOMBRE_FIELD));
       diaHabil.setObservaciones((String) data.get(OBSERVACIONES_FIELD));
       return diaHabil;
    }   

    @Override
    public List<DiasHabiles> transform(List<HashMap<String, Object>> data) {
        List<DiasHabiles> diaHabil = new ArrayList(data.size());
        for (HashMap<String, Object> hashMap : data) {
            diaHabil.add(transform(hashMap));
        }
        return diaHabil;
    }
    
}