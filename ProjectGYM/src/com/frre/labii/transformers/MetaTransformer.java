/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frre.labii.transformers;

import com.frre.labii.logic.Metas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.sql.Date;

/**
 *
 * @author fran
 */
public class MetaTransformer implements Transformer<Metas> {

    private static final String USUARIOS_CODIGO_FIELD = "usuarios_codigo";
    private static final String FECHA_INICIO_FIELD = "fecha_inicio";
    private static final String FECHA_FIN_FIELD = "fecha_fin";
    private static final String ALTURA_FIELD = "altura";
    private static final String PESO_INICIAL_FIELD = "peso_inicial";
    private static final String PESO_FINAL_FIELD = "peso_final";
    private static final String DESCRIPCION_FIELD = "descripcion";
    private static final String OBSERVACIONES_FIELD = "observaciones";

    @Override
    public Metas transform(HashMap<String, Object> data) {
        Metas meta = new Metas();
        meta.setUsuarios_codigo((Integer) data.get(USUARIOS_CODIGO_FIELD));
        meta.setFecha_inicio((Date) data.get(FECHA_INICIO_FIELD));
        meta.setFecha_fin((Date) data.get(FECHA_FIN_FIELD));
        meta.setAltura((Byte) data.get(ALTURA_FIELD));
        meta.setPeso_inicial((Integer) data.get(PESO_INICIAL_FIELD));
        meta.setPeso_final((Integer) data.get(PESO_FINAL_FIELD));
        meta.setDescripcion((String) data.get(DESCRIPCION_FIELD));
        meta.setObservaciones((String) data.get(OBSERVACIONES_FIELD));
        return meta;
    }

    @Override
    public List<Metas> transform(List<HashMap<String, Object>> data) {
        List<Metas> meta = new ArrayList(data.size());
        for (HashMap<String, Object> hashMap : data) {
            meta.add(transform(hashMap));
        }
        return meta;
    }

}
