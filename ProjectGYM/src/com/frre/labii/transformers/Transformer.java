/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.frre.labii.transformers;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author developer
 * @param <T>
 */
public interface Transformer<T> {
    
    public T transform(HashMap<String, Object> data);
    public List<T> transform(List<HashMap<String, Object>> data);
}
