/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itson.GUI;

/**
 *
 * @author Erick
 */
public class frmInicio extends javax.swing.JFrame {

    private static frmInicio inicio;

    public static frmInicio obtenerInstancia() {

        if (inicio == null) {
            frmInicio inicio = new frmInicio();
            return inicio;
        }
        return inicio;
    }

    /**
     * Creates new form frmRegistrarQuejas
     */
    private frmInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnHabitat = new javax.swing.JButton();
        btnEspecie = new javax.swing.JButton();
        brnQueja = new javax.swing.JButton();
        btnItinerario = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setText("Registrar quejas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setText("Zoológico");

        btnHabitat.setText("Registrar/Editar hábitat");
        btnHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitatActionPerformed(evt);
            }
        });

        btnEspecie.setText("Registrar/Editar especie");
        btnEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspecieActionPerformed(evt);
            }
        });

        brnQueja.setText("Registrar queja");
        brnQueja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnQuejaActionPerformed(evt);
            }
        });

        btnItinerario.setText("Registrar/Actualizar Itinerario");
        btnItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItinerarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brnQueja, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnHabitat)
                .addGap(18, 18, 18)
                .addComponent(btnEspecie)
                .addGap(18, 18, 18)
                .addComponent(btnItinerario)
                .addGap(18, 18, 18)
                .addComponent(brnQueja)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitatActionPerformed

        frmRegistrarHabitat.obtenerInstancia().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnHabitatActionPerformed

    private void btnEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspecieActionPerformed

        frmRegistrarEspecie.obtenerInstancia().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnEspecieActionPerformed

    private void btnItinerarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItinerarioActionPerformed

        frmRegistrarItinerario.obtenerInstancia().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnItinerarioActionPerformed

    private void brnQuejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnQuejaActionPerformed

        frmRegistrarQuejas.obtenerInstancia().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_brnQuejaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnQueja;
    private javax.swing.JButton btnEspecie;
    private javax.swing.JButton btnHabitat;
    private javax.swing.JButton btnItinerario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
