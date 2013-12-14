/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frre.labii.transformers;

import com.frre.labii.logic.MetasXFecha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.sql.Date;

/**
 *
 * @author fran
 */
public class MetaXFechaTransformer implements Transformer<MetasXFecha> {

    private static final String FECHA_FIELD = "fecha";
    private static final String METAS_USUARIOS_CODIGO_FIELD = "metas_usuarios_codigo";
    private static final String OBSERVACIONES_FIELD = "observaciones";

    @Override
    public MetasXFecha transform(HashMap<String, Object> data) {
        MetasXFecha metaXFecha = new MetasXFecha();
        metaXFecha.setFecha((Date) data.get(FECHA_FIELD));
        metaXFecha.setMetas_usuarios_codigo((Integer) data.get(METAS_USUARIOS_CODIGO_FIELD));
        metaXFecha.setObservaciones((String) data.get(OBSERVACIONES_FIELD));
        return metaXFecha;
    }

    @Override
    public List<MetasXFecha> transform(List<HashMap<String, Object>> data) {
        List<MetasXFecha> metaXFecha = new ArrayList(data.size());
        for (HashMap<String, Object> hashMap : data) {
            metaXFecha.add(transform(hashMap));
        }
        return metaXFecha;
    }

}
