/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itson.GUI;

import com.itson.DAOs.HabitatDAO;
import com.itson.dominio.Clima;
import com.itson.dominio.Continente;
import com.itson.dominio.Habitat;
import com.itson.dominio.Vegetacion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Erick
 */
public class frmRegistrarHabitat extends javax.swing.JFrame {

    private Habitat habitat = new Habitat();
    private DefaultListModel<Continente> modelContinente = new DefaultListModel<>();
    private DefaultListModel<String> modelVegetacion = new DefaultListModel<>();
    private DefaultListModel<String> modelClima = new DefaultListModel<>();

    private static frmRegistrarHabitat registrarHabitad;

    public static frmRegistrarHabitat obtenerInstancia() {

        if (registrarHabitad == null) {
            frmRegistrarHabitat registrarHabitad = new frmRegistrarHabitat();
            return registrarHabitad;
        }
        return registrarHabitad;
    }

    private frmRegistrarHabitat() {

        DefaultListModel<Continente> modelContinente = new DefaultListModel<>();
        DefaultListModel<String> modelClima = new DefaultListModel<>();
        DefaultListModel<String> modelVegetacion = new DefaultListModel<>();

        
        modelContinente.addElement(Continente.AFRICA);
        modelContinente.addElement(Continente.ASIA);
        modelContinente.addElement(Continente.AMERICA);
        modelContinente.addElement(Continente.ANTARTIDA);
        modelContinente.addElement(Continente.EUROPA);
        modelContinente.addElement(Continente.OCEANIA);

        for (Clima clima : HabitatDAO.getInstancia().obtenerClimas()) {
            modelClima.addElement(clima.getNombre());
        }

        for (Vegetacion vegetacion : HabitatDAO.getInstancia().obtenerVegetaciones()) {
            modelVegetacion.addElement(vegetacion.getNombre());
        }

        initComponents();

        listaClimasSistema.setModel(modelClima);
        listaVegetacionSistema.setModel(modelVegetacion);
        listaContinentesSistema.setModel(modelContinente);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList7 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFieldNombreHabitat = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaContinentesSistema = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaVegetacionSistema = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaVegetacionHabitat = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaClimasSistema = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaClimasHabitat = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        listaContinentesHabitat = new javax.swing.JList<>();
        btnAgregarContinente = new javax.swing.JButton();
        btnAgregarClima = new javax.swing.JButton();
        btnAgregarVegetacion = new javax.swing.JButton();
        btnEliminarContinente = new javax.swing.JButton();
        btnEliminarVegetacion = new javax.swing.JButton();
        btnEliminarClima = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtFielDescripcion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtFieldClima = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtFieldVegetacion = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        jList7.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(jList7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Hábitat");

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setText("Registrar hábitat");

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del hábitat:");

        txtFieldNombreHabitat.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listaContinentesSistema);

        jScrollPane3.setViewportView(listaVegetacionSistema);

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setText("Climas");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel5.setText("Vegetaciones");

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setText("Continentes");

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setText("Registrado en sistema");

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setText("Climas");

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setText("Vegetaciones");

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel11.setText("Continentes");

        jScrollPane4.setViewportView(listaVegetacionHabitat);

        jScrollPane5.setViewportView(listaClimasSistema);

        jScrollPane6.setViewportView(listaClimasHabitat);

        jScrollPane8.setViewportView(listaContinentesHabitat);

        btnAgregarContinente.setText("Agregar");
        btnAgregarContinente.setEnabled(false);
        btnAgregarContinente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarContinenteActionPerformed(evt);
            }
        });

        btnAgregarClima.setText("Agregar");
        btnAgregarClima.setEnabled(false);
        btnAgregarClima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClimaActionPerformed(evt);
            }
        });

        btnAgregarVegetacion.setText("Agregar");
        btnAgregarVegetacion.setEnabled(false);
        btnAgregarVegetacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVegetacionActionPerformed(evt);
            }
        });

        btnEliminarContinente.setText("Eliminar");
        btnEliminarContinente.setEnabled(false);
        btnEliminarContinente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarContinenteActionPerformed(evt);
            }
        });

        btnEliminarVegetacion.setText("Eliminar");
        btnEliminarVegetacion.setEnabled(false);
        btnEliminarVegetacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVegetacionActionPerformed(evt);
            }
        });

        btnEliminarClima.setText("Eliminar");
        btnEliminarClima.setEnabled(false);
        btnEliminarClima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClimaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setText("Nuevo clima:");

        txtFielDescripcion.setEditable(false);
        txtFielDescripcion.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setText("Descripción clima:");

        txtFieldClima.setEditable(false);
        txtFieldClima.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel14.setText("Nueva vegetación:");

        txtFieldVegetacion.setEditable(false);
        txtFieldVegetacion.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtFieldVegetacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldVegetacionActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFieldNombreHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerificar))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(txtFieldClima)
                    .addComponent(txtFielDescripcion)
                    .addComponent(txtFieldVegetacion)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(btnEliminarClima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(btnEliminarVegetacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 45, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEliminarContinente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 4, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(176, 176, 176)
                                        .addComponent(jLabel6)
                                        .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(10, 10, 10))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregarClima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregarVegetacion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregarContinente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGap(14, 14, 14))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(311, 311, 311))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFieldNombreHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVerificar))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFieldClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFielDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(txtFieldVegetacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarClima)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAgregarContinente)
                                .addComponent(btnAgregarVegetacion))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEliminarContinente)
                                .addComponent(btnEliminarVegetacion)
                                .addComponent(btnEliminarClima)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegresar)
                            .addComponent(btnGuardar))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldVegetacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldVegetacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldVegetacionActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        frmInicio.obtenerInstancia().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed

        System.out.println(HabitatDAO.getInstancia().obtenerHabitat(txtFieldNombreHabitat.getText()));
        Habitat habitatTemp = HabitatDAO.getInstancia().obtenerHabitat(txtFieldNombreHabitat.getText());
        if (habitatTemp != null) {

            showMessageDialog(this, "Hábitat ya existente");

            DefaultListModel<Continente> modelContinente = new DefaultListModel<>();
            DefaultListModel<String> modelClima = new DefaultListModel<>();
            DefaultListModel<String> modelVegetacion = new DefaultListModel<>();

            System.out.println(habitatTemp.getContinentes().toString());

            for (Continente continente : habitatTemp.getContinentes()) {
                modelContinente.addElement(continente);
            }

            for (Clima clima : habitatTemp.getClimas()) {
                modelClima.addElement(clima.getNombre());
            }

            for (Vegetacion vegetacion : habitatTemp.getVegetaciones()) {
                modelVegetacion.addElement(vegetacion.getNombre());
            }

            listaClimasHabitat.setModel(modelClima);
            listaVegetacionHabitat.setModel(modelVegetacion);
            listaContinentesHabitat.setModel(modelContinente);
            

        } else {

            if (txtFieldNombreHabitat.getText().isBlank()) {

                showMessageDialog(this, "Porfavor ingrese un nombre de hábitat");

                btnEliminarClima.setEnabled(false);
                btnEliminarContinente.setEnabled(false);
                btnEliminarVegetacion.setEnabled(false);

                btnAgregarClima.setEnabled(false);
                btnAgregarContinente.setEnabled(false);
                btnAgregarVegetacion.setEnabled(false);

                txtFieldClima.setEditable(false);
                txtFielDescripcion.setEditable(false);
                txtFieldVegetacion.setEditable(false);

                btnGuardar.setEnabled(false);
            } else {
                btnEliminarClima.setEnabled(true);
                btnEliminarContinente.setEnabled(true);
                btnEliminarVegetacion.setEnabled(true);

                btnAgregarClima.setEnabled(true);
                btnAgregarContinente.setEnabled(true);
                btnAgregarVegetacion.setEnabled(true);

                txtFieldClima.setEditable(true);
                txtFielDescripcion.setEditable(true);
                txtFieldVegetacion.setEditable(true);

                btnGuardar.setEnabled(true);
            }
        }

    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        Clima clima = new Clima();
        Vegetacion vegetacion = new Vegetacion();

        List<Clima> climas = new ArrayList();
        if (listaClimasHabitat.getModel().getSize() > 0) {

            for (int i = 0; i < listaClimasHabitat.getModel().getSize(); i++) {
                clima.setNombre(listaClimasHabitat.getModel().getElementAt(i));
                climas.add(clima);
            }
        } else if (!txtFieldClima.getText().isBlank()) {

            clima.setNombre(txtFieldClima.getText());
            
            if (!txtFielDescripcion.getText().isBlank()) {

            clima.setDescripcion(txtFielDescripcion.getText());

            climas.add(clima);

        } else {
            showMessageDialog(this, "Porfavor ingrese la descripción del clima");
        } 

        } else {
            showMessageDialog(this, "Porfavor ingrese climas");
        }

        
        List<Vegetacion> vegetaciones = new ArrayList();
        if (listaVegetacionHabitat.getModel().getSize() > 0) {
            for (int i = 0; i < listaVegetacionHabitat.getModel().getSize(); i++) {
                vegetacion.setNombre(listaVegetacionHabitat.getModel().getElementAt(i));
                vegetaciones.add(vegetacion);
            }
        } else if (!txtFieldVegetacion.getText().isBlank()) {
            vegetacion.setNombre(txtFieldVegetacion.getText());

            vegetaciones.add(vegetacion);

        } else {
            showMessageDialog(this, "Porfavor ingrese vegetaciones");
        }

        List<Continente> Continentes = new ArrayList();
        if (listaContinentesHabitat.getModel().getSize() > 0) {
            for (int i = 0; i < listaContinentesHabitat.getModel().getSize(); i++) {
                Continentes.add(listaContinentesHabitat.getModel().getElementAt(i));
            }
        } else {
            showMessageDialog(this, "Porfavor ingrese continentes");

        }
        habitat.setClimas(climas);
        habitat.setContinentes(Continentes);
        habitat.setNombre(txtFieldNombreHabitat.getText());
        habitat.setVegetaciones(vegetaciones);

        try {
            HabitatDAO.getInstancia().guardarHabitat(habitat);
            showMessageDialog(this, "Hábitat registrado correctamente ^^");
            frmInicio.obtenerInstancia().setVisible(true);
            this.dispose();

        } catch (Exception e) {

        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAgregarClimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClimaActionPerformed

        DefaultListModel<String> modelClima = (DefaultListModel<String>) listaClimasSistema.getModel();

        this.modelClima.addElement(listaClimasSistema.getSelectedValue());
        modelClima.removeElement(listaClimasSistema.getSelectedValue());

        listaClimasHabitat.setModel(this.modelClima);
        listaClimasSistema.setModel(modelClima);

    }//GEN-LAST:event_btnAgregarClimaActionPerformed

    private void btnAgregarVegetacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVegetacionActionPerformed

        DefaultListModel<String> modelVegetacion = (DefaultListModel<String>) listaVegetacionSistema.getModel();

        this.modelVegetacion.addElement(listaVegetacionSistema.getSelectedValue());
        
        modelVegetacion.removeElement(listaVegetacionSistema.getSelectedValue());
        

        listaVegetacionHabitat.setModel(this.modelVegetacion);
        listaVegetacionSistema.setModel(modelVegetacion);

    }//GEN-LAST:event_btnAgregarVegetacionActionPerformed

    private void btnAgregarContinenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarContinenteActionPerformed

        DefaultListModel<Continente> modelContinente = (DefaultListModel<Continente>) listaContinentesSistema.getModel();

        this.modelContinente.addElement(listaContinentesSistema.getSelectedValue());

        modelContinente.removeElement(listaContinentesSistema.getSelectedValue());

        listaContinentesHabitat.setModel(this.modelContinente);
        listaContinentesSistema.setModel(modelContinente);

    }//GEN-LAST:event_btnAgregarContinenteActionPerformed

    private void btnEliminarClimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClimaActionPerformed

        DefaultListModel<String> modelClima = (DefaultListModel<String>) listaClimasSistema.getModel();

        modelClima.addElement(listaClimasHabitat.getSelectedValue());
        this.modelClima.removeElement(listaClimasHabitat.getSelectedValue());

        listaClimasHabitat.setModel(this.modelClima);
        listaClimasSistema.setModel(modelClima);
    }//GEN-LAST:event_btnEliminarClimaActionPerformed

    private void btnEliminarContinenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarContinenteActionPerformed

        DefaultListModel<Continente> modelContinente = (DefaultListModel<Continente>) listaContinentesSistema.getModel();

        modelContinente.addElement(listaContinentesHabitat.getSelectedValue());
        this.modelContinente.removeElement(listaContinentesHabitat.getSelectedValue());

        listaContinentesHabitat.setModel(this.modelContinente);
        listaContinentesSistema.setModel(modelContinente);

    }//GEN-LAST:event_btnEliminarContinenteActionPerformed

    private void btnEliminarVegetacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVegetacionActionPerformed

        DefaultListModel<String> modelVegetacion = (DefaultListModel<String>) listaVegetacionSistema.getModel();

        modelVegetacion.addElement(listaVegetacionHabitat.getSelectedValue());
        this.modelVegetacion.removeElement(listaVegetacionHabitat.getSelectedValue());

        listaVegetacionHabitat.setModel(this.modelVegetacion);
        listaVegetacionSistema.setModel(modelVegetacion);

    }//GEN-LAST:event_btnEliminarVegetacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarClima;
    private javax.swing.JButton btnAgregarContinente;
    private javax.swing.JButton btnAgregarVegetacion;
    private javax.swing.JButton btnEliminarClima;
    private javax.swing.JButton btnEliminarContinente;
    private javax.swing.JButton btnEliminarVegetacion;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList7;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JList<String> listaClimasHabitat;
    private javax.swing.JList<String> listaClimasSistema;
    private javax.swing.JList<Continente> listaContinentesHabitat;
    private javax.swing.JList<Continente> listaContinentesSistema;
    private javax.swing.JList<String> listaVegetacionHabitat;
    private javax.swing.JList<String> listaVegetacionSistema;
    private javax.swing.JTextField txtFielDescripcion;
    private javax.swing.JTextField txtFieldClima;
    private javax.swing.JTextField txtFieldNombreHabitat;
    private javax.swing.JTextField txtFieldVegetacion;
    // End of variables declaration//GEN-END:variables
}
