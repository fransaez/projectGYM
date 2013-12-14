/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.frre.labii.transformers;

import com.frre.labii.logic.Fechas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.sql.Date;

/**
 *
 * @author fran
 */

public class FechaTransformer implements Transformer<Fechas>{
    private static final String FECHA_FIELD = "fecha";
    private static final String OBSERVACIONES_FIELD = "observaciones";
    
    @Override
    public Fechas transform(HashMap<String, Object> data) {
       Fechas fecha = new Fechas();
       fecha.setFecha((Date) data.get(FECHA_FIELD));
       fecha.setObservaciones((String) data.get(OBSERVACIONES_FIELD));
       return fecha;
    }   

    @Override
    public List<Fechas> transform(List<HashMap<String, Object>> data) {
        List<Fechas> fecha = new ArrayList(data.size());
        for (HashMap<String, Object> hashMap : data) {
            fecha.add(transform(hashMap));
        }
        return fecha;
    }
    
}