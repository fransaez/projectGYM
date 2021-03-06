/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frre.labii.views;

import com.frre.labii.controllers.AgregarUsuarioController;
import com.frre.labii.controllers.GenericController;
import com.frre.labii.logic.Usuarios;
import com.frre.labii.logic.EmailValidation;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.Color;

/**
 *
 * @author AGOSyFRAN
 */
public class InsertUsr extends BaseView1 {

    /**
     * Creates new form InsertUsr
     */
    AgregarUsuarioController iuContr;
    boolean alta;

    public InsertUsr(GenericController contr, AgregarUsuarioView au) throws SQLException {
        super(contr);
        iuContr = (AgregarUsuarioController) contr;
        initComponents();
        initOtherComponents();
        alta = true;
        auView = au;
    }

    public InsertUsr(GenericController contr, AgregarUsuarioView au, Usuarios usuario) throws SQLException {
        super(contr);
        iuContr = (AgregarUsuarioController) contr;
        initComponents();
        initOtherComponents();
        alta = false;
        this.jTextFieldNombre.setText(usuario.getNombre());
        this.jTextFieldApellidos.setText(usuario.getApellido());
        this.jTextFieldEmail.setText(usuario.getEmail());
        this.jTextFieldDNI.setText(Integer.toString(usuario.getDni()));
        this.jTextFieldDireccion.setText(usuario.getDireccion());
        if (usuario.getTelefono() > 0) {
            this.jTextFieldTelefono.setText(Long.toString(usuario.getTelefono()));
        }
        if (usuario.getMovil() > 0) {
            this.jTextFieldMovil.setText(Long.toString(usuario.getMovil()));
        }
        if (usuario.isSexo()) {
            this.jRadioButton2.setSelected(true);
        } else {
            this.jRadioButton1.setSelected(true);
        }
        this.jTextArea1.setText(usuario.getObservaciones());
        this.jDateChooser1.setDate(usuario.getFecha_nac());
        auView = au;
        auUsuario = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldMovil = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.frre.labii.ProjectGYMApp.class).getContext().getResourceMap(InsertUsr.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setAlwaysOnTop(true);
        setName("Form"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setName("jPanel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N

        jTextFieldNombre.setText(resourceMap.getString("jTextFieldNombre.text")); // NOI18N
        jTextFieldNombre.setName("jTextFieldNombre"); // NOI18N

        jTextFieldApellidos.setName("jTextFieldApellidos"); // NOI18N

        jTextFieldEmail.setName("jTextFieldEmail"); // NOI18N

        jTextFieldDNI.setName("jTextFieldDNI"); // NOI18N

        jTextFieldDireccion.setName("jTextFieldDireccion"); // NOI18N

        jTextFieldTelefono.setName("jTextFieldTelefono"); // NOI18N

        jTextFieldMovil.setName("jTextFieldMovil"); // NOI18N

        jDateChooser1.setName("jDateChooser1"); // NOI18N

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextArea1.setColumns(25);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(3);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText(resourceMap.getString("jRadioButton1.text")); // NOI18N
        jRadioButton1.setName("jRadioButton1"); // NOI18N

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText(resourceMap.getString("jRadioButton2.text")); // NOI18N
        jRadioButton2.setName("jRadioButton2"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldEmail)
                            .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AgregarUsuarioController controller = (AgregarUsuarioController) getController();
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            nuevoUsr[0] = this.jTextFieldApellidos.getText();
            nuevoUsr[1] = this.jTextFieldNombre.getText();
            nuevoUsr[2] = this.jTextFieldEmail.getText();
            nuevoUsr[3] = this.jTextFieldDNI.getText();
            if (this.validarDNI(nuevoUsr[3])) {
                JOptionPane.showMessageDialog(rootPane, "No se puede agregar este usuario. Existe otro usuario con el mismo DNI " + nuevoUsr[3]);
                return;
            }
            nuevoUsr[4] = this.jTextFieldDireccion.getText();
            nuevoUsr[5] = this.jTextFieldTelefono.getText();
            if (nuevoUsr[5].length() == 0) {
                nuevoUsr[5] = "0";
            } else if (nuevoUsr[5].length() != 10) {
                JOptionPane.showMessageDialog(rootPane, "El número de teléfono es invalido. Asegurese de ingresar el código de area sin el 0");
                return;
            }
            nuevoUsr[6] = this.jTextFieldMovil.getText();
            if (nuevoUsr[6].length() == 0) {
                nuevoUsr[6] = "0";
            } else if (nuevoUsr[6].length() != 10) {
                JOptionPane.showMessageDialog(rootPane, "El número de movil es invalido. Asegurese de ingresar el código de area sin el 0 y número sin el 15");
                return;
            }
            if (this.jRadioButton1.isSelected()) {
                nuevoUsr[7] = "0";
            } else if (this.jRadioButton2.isSelected()) {
                nuevoUsr[7] = "1";
            } else {
                JOptionPane.showMessageDialog(rootPane, "Debe seleccionar el sexo para poder continuar.");
                return;
            }
            Date fecha_nac = this.jDateChooser1.getDate();
            if (fecha_nac == null) {
                JOptionPane.showMessageDialog(rootPane, "La fecha de nacimiento ingresada es invalida");
                return;
            }
            nuevoUsr[8] = dt1.format(fecha_nac);
            nuevoUsr[9] = this.jTextArea1.getText();
            if (nuevoUsr[9].length() > 100) {
                JOptionPane.showMessageDialog(rootPane, "El texto de \"Observaciones\" es demasiado largo. El maximo permitido es de 100 caraccteres.");
                return;
            }
            byte vacio = this.validarVacios(nuevoUsr);
            String campo = "";
            if (vacio >= 0) {
                switch (vacio) {
                    case 0:
                        campo = "El usuario debe tener un apellido";
                        break;
                    case 1:
                        campo = "El usuario debe tener un nombre";
                        break;
                    case 2:
                        campo = "El usuario debe tener un email";
                        break;
                    case 3:
                        campo = "El usuario debe tener un DNI";
                        break;
                    case 8:
                        campo = "No ha seleccionado la fecha de nacimiento";
                        break;
                }
                JOptionPane.showMessageDialog(rootPane, campo);
                return;
            }
            if (this.validarEmail(nuevoUsr[2])) {
                JOptionPane.showMessageDialog(rootPane, "El email " + nuevoUsr[2] + " no es valido o ya existe.");
                return;
            }
            if (alta) {
                controller.agregarUsuario(nuevoUsr);
            } else {
                modificarUsuario();
            }

            auView.cargarUsuarios();
        } catch (SQLException ex) {
            Logger.getLogger(InsertUsr.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private boolean validarEmail(String dat) throws SQLException {
        EmailValidation em = new EmailValidation();
        if (!alta) {
            if (this.auUsuario.getEmail().equals(dat)) {
                return false;
            }
        }
        if (!em.validate(dat.trim())) {
            return true;
        } else {
            return iuContr.existValue("email", dat);
        }
    }

    private boolean validarDNI(String dat) throws SQLException {
        if (!alta) {
            if (Integer.toString(this.auUsuario.getDni()).equals(dat)) {
                return false;
            }
        }
        return iuContr.existValue("DNI", dat);
    }

    private byte validarVacios(String[] dat) {
        byte resul = -1;
        for (byte i = 0; i < 9; i++) {
            if (i > 3 && i < 7) {
                continue;
            }
            resul = (dat[i].length() == 0) ? i : resul;
            if (resul >= 0) {
                break;
            }
        }
        return resul;
    }

    private void modificarUsuario() throws SQLException {
        AgregarUsuarioController controller = (AgregarUsuarioController) getController();
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
        String valor = this.jTextFieldNombre.getText();
        if (!this.auUsuario.getNombre().equals(valor)) {
            controller.modificarUsuario(this.auUsuario.getCodigo(), (byte) 2, valor);
        }
        valor = this.jTextFieldApellidos.getText();
        if (!this.auUsuario.getApellido().equals(valor)) {
            controller.modificarUsuario(this.auUsuario.getCodigo(), (byte) 1, valor);
        }
        valor = this.jTextFieldEmail.getText();
        if (!this.auUsuario.getEmail().equals(valor)) {
            controller.modificarUsuario(this.auUsuario.getCodigo(), (byte) 3, valor);
        }
        valor = this.jTextFieldDNI.getText();
        if (!Integer.toString(this.auUsuario.getDni()).equals(valor)) {
            controller.modificarUsuario(this.auUsuario.getCodigo(), (byte) 4, valor);
        }
        valor = this.jTextFieldDireccion.getText();
        if (!this.auUsuario.getDireccion().equals(valor)) {
            controller.modificarUsuario(this.auUsuario.getCodigo(), (byte) 5, valor);
        }
        valor = this.jTextFieldTelefono.getText();
        if (!Long.toString(this.auUsuario.getTelefono()).equals(valor)) {
            controller.modificarUsuario(this.auUsuario.getCodigo(), (byte) 6, valor);
        }
        valor = this.jTextFieldMovil.getText();
        if (!Long.toString(this.auUsuario.getMovil()).equals(valor)) {
            controller.modificarUsuario(this.auUsuario.getCodigo(), (byte) 7, valor);
        }
        valor = (this.jButton1.isSelected() ? "0" : "1");
        if (!Boolean.toString(this.auUsuario.isSexo()).equals(valor)) {
            controller.modificarUsuario(this.auUsuario.getCodigo(), (byte) 8, valor);
        }
        valor = dt1.format(this.jDateChooser1.getDate());
        if (!dt1.format(this.auUsuario.getFecha_nac()).equals(valor)) {
            controller.modificarUsuario(this.auUsuario.getCodigo(), (byte) 9, valor);
        }
        valor = this.jTextArea1.getText();
        if (!this.auUsuario.getObservaciones().equals(valor)) {
            controller.modificarUsuario(this.auUsuario.getCodigo(), (byte) 10, valor);
        }
    }

    private void initOtherComponents() {
        RestrictedTextField jtf2 = new RestrictedTextField(jTextFieldNombre);
        jtf2.setLimit(30);
        RestrictedTextField jtf3 = new RestrictedTextField(jTextFieldApellidos);
        jtf3.setLimit(30);
        RestrictedTextField jtf4 = new RestrictedTextField(jTextFieldEmail);
        jtf4.setLimit(45);
        RestrictedTextField jtf5 = new RestrictedTextField(jTextFieldDNI);
        jtf5.setLimit(8);
        jtf5.setOnlyNums(true);
        RestrictedTextField jtf6 = new RestrictedTextField(jTextFieldDireccion);
        jtf6.setLimit(45);
        RestrictedTextField jtf7 = new RestrictedTextField(jTextFieldTelefono);
        jtf7.setLimit(10);
        jtf7.setOnlyNums(true);
        RestrictedTextField jtf8 = new RestrictedTextField(jTextFieldMovil);
        jtf8.setLimit(10);
        jtf8.setOnlyNums(true);
    }
    private String[] nuevoUsr = new String[10];
    private AgregarUsuarioView auView;
    private Usuarios auUsuario;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldMovil;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
