package com.umg.tarea3;

import javax.swing.SwingUtilities;

/** Tarea 3 - Menú Principal (formulario con diseñador visual de NetBeans). */
public class MenuPrincipal extends javax.swing.JFrame {



    public MenuPrincipal() {
        initComponents();

        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEj1 = new javax.swing.JButton();
        btnEj2 = new javax.swing.JButton();
        btnEj3 = new javax.swing.JButton();
        btnEj4 = new javax.swing.JButton();
        btnEj5 = new javax.swing.JButton();
        btnEj6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tarea 3 - Menú Principal");

        btnEj1.setText("1. Registro de Calificaciones");
        btnEj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj1ActionPerformed(evt);
            }
        });

        btnEj2.setText("2. Manifiesto de Pasajeros");
        btnEj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj2ActionPerformed(evt);
            }
        });

        btnEj3.setText("3. Analizador de Temperaturas");
        btnEj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj3ActionPerformed(evt);
            }
        });

        btnEj4.setText("4. Biblioteca de Discos");
        btnEj4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj4ActionPerformed(evt);
            }
        });

        btnEj5.setText("5. Clases y Objetos (Streaming)");
        btnEj5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj5ActionPerformed(evt);
            }
        });

        btnEj6.setText("6. Catálogo de Videojuegos");
        btnEj6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnEj1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnEj2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnEj3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnEj4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnEj5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnEj6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnEj1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btnEj2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnEj3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(btnEj4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(btnEj5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(btnEj6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj1ActionPerformed
        new Calificaciones().setVisible(true);
    }//GEN-LAST:event_btnEj1ActionPerformed

    private void btnEj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj2ActionPerformed
        new Pasajeros().setVisible(true);
    }//GEN-LAST:event_btnEj2ActionPerformed

    private void btnEj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj3ActionPerformed
        new Temperaturas().setVisible(true);
    }//GEN-LAST:event_btnEj3ActionPerformed

    private void btnEj4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj4ActionPerformed
        new Discos().setVisible(true);
    }//GEN-LAST:event_btnEj4ActionPerformed

    private void btnEj5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj5ActionPerformed
        new Streaming().setVisible(true);
    }//GEN-LAST:event_btnEj5ActionPerformed

    private void btnEj6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj6ActionPerformed
        new Juegos().setVisible(true);
    }//GEN-LAST:event_btnEj6ActionPerformed

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEj1;
    private javax.swing.JButton btnEj2;
    private javax.swing.JButton btnEj3;
    private javax.swing.JButton btnEj4;
    private javax.swing.JButton btnEj5;
    private javax.swing.JButton btnEj6;
    // End of variables declaration//GEN-END:variables
}
