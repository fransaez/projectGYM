/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frre.labii.transformers;

import com.frre.labii.logic.RutinasXMetas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author fran
 */
public class RutinaXMetaTransformer implements Transformer<RutinasXMetas> {

    private static final String DIASHABILES_CODIGO_FIELD = "diasHabiles_codigo";
    private static final String METAS_USUARIOS_CODIGO_FIELD = "metas_usuarios_codigo";
    private static final String RUTINAS_CODIGO_FIELD = "rutinas_codigo";
    private static final String OBSERVACIONES_FIELD = "observaciones";

    @Override
    public RutinasXMetas transform(HashMap<String, Object> data) {
        RutinasXMetas rutinaXMeta = new RutinasXMetas();
        rutinaXMeta.setDiasHabiles_codigo((String) data.get(DIASHABILES_CODIGO_FIELD));
        rutinaXMeta.setMetas_usuarios_codigo((Integer) data.get(METAS_USUARIOS_CODIGO_FIELD));
        rutinaXMeta.setRutinas_codigo((String) data.get(RUTINAS_CODIGO_FIELD));
        rutinaXMeta.setObservaciones((String) data.get(OBSERVACIONES_FIELD));
        return rutinaXMeta;
    }

    @Override
    public List<RutinasXMetas> transform(List<HashMap<String, Object>> data) {
        List<RutinasXMetas> rutinaXMeta = new ArrayList(data.size());
        for (HashMap<String, Object> hashMap : data) {
            rutinaXMeta.add(transform(hashMap));
        }
        return rutinaXMeta;
    }

}
