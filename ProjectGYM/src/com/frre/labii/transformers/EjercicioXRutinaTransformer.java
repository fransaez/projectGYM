/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.frre.labii.transformers;

import com.frre.labii.logic.EjerciciosXRutina;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 *
 * @author fran
 */

public class EjercicioXRutinaTransformer implements Transformer<EjerciciosXRutina>{
    private static final String EJERCICIOS_CODIGO_FIELD = "ejercicios_codigo";
    private static final String RUTINAS_CODIGO_FIELD = "rutinas_codigo";
    private static final String SERIES_FIELD = "series";
    private static final String REPETICIONES_FIELD = "repeticiones";
    private static final String OBSERVACIONES_FIELD = "observaciones";
    
    @Override
    public EjerciciosXRutina transform(HashMap<String, Object> data) {
       EjerciciosXRutina ejercicioXRutina = new EjerciciosXRutina();
       ejercicioXRutina.setEjercicios_codigo((String) data.get(EJERCICIOS_CODIGO_FIELD));
       ejercicioXRutina.setRutinas_codigo((String) data.get(RUTINAS_CODIGO_FIELD));
       ejercicioXRutina.setSeries((Byte) data.get(SERIES_FIELD));
       ejercicioXRutina.setRepeticiones((Byte) data.get(REPETICIONES_FIELD));
       ejercicioXRutina.setObservaciones((String) data.get(OBSERVACIONES_FIELD));
       return ejercicioXRutina;
    }   

    @Override
    public List<EjerciciosXRutina> transform(List<HashMap<String, Object>> data) {
        List<EjerciciosXRutina> ejercicioXRutina = new ArrayList(data.size());
        for (HashMap<String, Object> hashMap : data) {
            ejercicioXRutina.add(transform(hashMap));
        }
        return ejercicioXRutina;
    }
    
}