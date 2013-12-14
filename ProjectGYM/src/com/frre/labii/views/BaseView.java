/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frre.labii.views;

import com.frre.labii.controllers.GenericController;
import javax.swing.JFrame;

/**
 *
 * @author Cleo
 */
public class BaseView extends JFrame {
    
    private GenericController controller;

    public BaseView(GenericController controller) {
        this.controller = controller;
    }

    public GenericController getController() {
        return controller;
    }
    
    
}
