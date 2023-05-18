/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itson.GUI;

import com.itson.dominio.Clima;
import com.itson.dominio.DiaHora;
import com.itson.dominio.Dias;
import com.itson.dominio.Itinerario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import com.itson.DAOs.ItinerarioDAO;
import com.itson.DAOs.ZonaDAO;
import com.itson.dominio.Zona;

/**
 *
 * @author Erick
 */
public class frmRegistrarItinerario extends javax.swing.JFrame {

    private static frmRegistrarItinerario registrarItinerario;
    DefaultListModel<DiaHora> modelDH = new DefaultListModel<>();
    DefaultListModel<Zona> modelZ = new DefaultListModel<>();
    DefaultListModel<Zona> modelZR = new DefaultListModel<>();

    public static frmRegistrarItinerario obtenerInstancia() {

        if (registrarItinerario == null) {
            frmRegistrarItinerario registrarItinerario = new frmRegistrarItinerario();
            return registrarItinerario;
        }
        return registrarItinerario;
    }

    private frmRegistrarItinerario() {

        DefaultComboBoxModel<Dias> modelD = new DefaultComboBoxModel<>();
        DefaultComboBoxModel<String> modelH = new DefaultComboBoxModel<>();

        // Añadir los elementos de la enumeración al modelo
        for (Dias dia : Dias.values()) {
            modelD.addElement(dia);
        };

        // Generar y agregar las horas al modelo
        for (int hora = 0; hora <= 23; hora++) {
            String horaString = String.format("%02d:00", hora); // Formatear la hora como "HH:00"
            modelH.addElement(horaString);
        }

        List<Zona> zonas = ZonaDAO.getInstancia().consultarZona();

        for (Zona elemento : zonas) {
            modelZ.addElement(elemento);
        }

        initComponents();
        comboDia.setModel(modelD);
        comboHora.setModel(modelH);
        listaZonasElegir.setModel(modelZ);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregarZona = new javax.swing.JButton();
        btnEliminarGuia = new javax.swing.JButton();
        btnEliminarZona = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtNomItinerario = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaZonas = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listDiasSemana = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaZonasElegir = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtMaxVisitantes = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnAgregarDiaHora = new javax.swing.JButton();
        comboDia = new javax.swing.JComboBox<>();
        comboHora = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro/Actualización Itinerario");

        jLabel1.setText("Registro/Actualización itinerarios");
        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N

        jLabel5.setText("Itinerario:");
        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        btnAgregarZona.setText("Agregar");
        btnAgregarZona.setEnabled(false);
        btnAgregarZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarZonaActionPerformed(evt);
            }
        });

        btnEliminarGuia.setText("Eliminar");
        btnEliminarGuia.setEnabled(false);
        btnEliminarGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarGuiaActionPerformed(evt);
            }
        });

        btnEliminarZona.setText("Eliminar");
        btnEliminarZona.setEnabled(false);
        btnEliminarZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarZonaActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtNomItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomItinerarioActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jLabel6.setText("Duración (minutos):");
        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        txtDuracion.setEditable(false);
        txtDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracionActionPerformed(evt);
            }
        });

        jLabel7.setText("Longitud (metros):");
        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        txtLongitud.setEditable(false);
        txtLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLongitudActionPerformed(evt);
            }
        });

        listaZonas.setEnabled(false);
        jScrollPane3.setViewportView(listaZonas);

        jLabel9.setText("Zona");
        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        jLabel10.setText("Días de la semana");
        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        listDiasSemana.setEnabled(false);
        jScrollPane4.setViewportView(listDiasSemana);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        listaZonasElegir.setEnabled(false);
        jScrollPane2.setViewportView(listaZonasElegir);

        jLabel2.setText("Guías");
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        jLabel3.setText("Zonas");
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        jLabel4.setText("Registrado en sistema");
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        jLabel14.setText("Número máximo de visitantes:");
        jLabel14.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        txtMaxVisitantes.setEditable(false);
        txtMaxVisitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxVisitantesActionPerformed(evt);
            }
        });

        jLabel15.setText("Día:");
        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        jLabel16.setText("Hora:");
        jLabel16.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        btnAgregarDiaHora.setText("Agregar");
        btnAgregarDiaHora.setEnabled(false);
        btnAgregarDiaHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDiaHoraActionPerformed(evt);
            }
        });

        comboDia.setEnabled(false);

        comboHora.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(197, 197, 197))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEliminarZona, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEliminarGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(50, 50, 50))
                            .addComponent(jLabel14)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMaxVisitantes, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDuracion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16)
                                        .addGap(114, 114, 114))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(txtNomItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtLongitud, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(comboHora, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnAgregarDiaHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(57, 57, 57)))
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAgregarZona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(104, 104, 104))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(10, 10, 10)
                        .addComponent(txtMaxVisitantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarDiaHora)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarZona)
                    .addComponent(btnEliminarGuia)
                    .addComponent(btnAgregarZona))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnGuardar))
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomItinerarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomItinerarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomItinerarioActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        btnAgregarZona.setEnabled(true);
        btnEliminarGuia.setEnabled(true);
        btnEliminarZona.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnAgregarDiaHora.setEnabled(true);

        txtDuracion.setEditable(true);
        txtLongitud.setEditable(true);
        txtMaxVisitantes.setEditable(true);
        txtNomItinerario.setEditable(true);

        comboDia.setEnabled(true);
        comboHora.setEnabled(true);
        listDiasSemana.setEnabled(true);
        listaZonas.setEnabled(true);
        listaZonasElegir.setEnabled(true);
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void txtDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracionActionPerformed

    private void txtLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLongitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLongitudActionPerformed

    private void txtMaxVisitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxVisitantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxVisitantesActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        frmInicio.obtenerInstancia().setVisible(true);
        this.dispose();    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarDiaHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDiaHoraActionPerformed
        DiaHora diaHora = new DiaHora();
        diaHora.setDia((Dias) comboDia.getSelectedItem());
        diaHora.setHora((String) comboHora.getSelectedItem());

        modelDH.addElement(diaHora);

        listDiasSemana.setModel(modelDH);
        comboDia.setEnabled(false);

    }//GEN-LAST:event_btnAgregarDiaHoraActionPerformed

    private void btnEliminarGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarGuiaActionPerformed
        int selectedIndex = listDiasSemana.getSelectedIndex();
        if (selectedIndex != -1) {
            DefaultListModel<DiaHora> model = (DefaultListModel<DiaHora>) listDiasSemana.getModel();
            model.remove(selectedIndex);
        }
    }//GEN-LAST:event_btnEliminarGuiaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ArrayList<DiaHora> DiaHoras = new ArrayList<>();
        ArrayList<Zona> zonas = new ArrayList<>();

        for (int i = 0; i < modelDH.getSize(); i++) {
            DiaHora diaHora = modelDH.getElementAt(i);
            DiaHoras.add(diaHora);
        }

        for (int i = 0; i < listaZonas.getModel().getSize(); i++) {
            zonas.add(listaZonas.getModel().getElementAt(i));
        }

        double duracion = Double.parseDouble(txtDuracion.getText());
        double longitud = Double.parseDouble(txtLongitud.getText());
        int maxVisitantes = Integer.parseInt(txtMaxVisitantes.getText());

        Itinerario itinerario = new Itinerario();
        itinerario.setDiasHora(DiaHoras);
        itinerario.setDuracion(duracion);
        itinerario.setLongitud(longitud);
        itinerario.setMaxVisitantes(maxVisitantes);
        itinerario.setIdZonas(zonas);

        ItinerarioDAO.getInstancia().guardarItinerario(itinerario);


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAgregarZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarZonaActionPerformed
        

        modelZR.addElement(listaZonasElegir.getSelectedValue());

        listaZonas.setModel(modelZR);

    }//GEN-LAST:event_btnAgregarZonaActionPerformed

    private void btnEliminarZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarZonaActionPerformed
        int selectedIndex = listaZonas.getSelectedIndex();
        if (selectedIndex != -1) {
            DefaultListModel<Zona> model = (DefaultListModel<Zona>) listaZonas.getModel();
            model.remove(selectedIndex);
        }

    }//GEN-LAST:event_btnEliminarZonaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarDiaHora;
    private javax.swing.JButton btnAgregarZona;
    private javax.swing.JButton btnEliminarGuia;
    private javax.swing.JButton btnEliminarZona;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox<Dias> comboDia;
    private javax.swing.JComboBox<String> comboHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<DiaHora> listDiasSemana;
    private javax.swing.JList<Zona> listaZonas;
    private javax.swing.JList<Zona> listaZonasElegir;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextField txtMaxVisitantes;
    private javax.swing.JTextField txtNomItinerario;
    // End of variables declaration//GEN-END:variables
}
