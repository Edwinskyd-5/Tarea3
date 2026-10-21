package com.umg.tarea3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

//
public class Calificaciones extends javax.swing.JFrame {

    // 
    final String NOMBRE = "Notas";  
    double[] notas = new double[6];
    int indice = 0;

    public Calificaciones() {
        initComponents();

        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Calificaciones");

        jLabel1.setText("Nota:");

        btnAgregar.setText("Agregar Nota");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnReporte.setText("Generar Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        lblEstado.setText("Notas ingresadas: 0 de 6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (indice >= notas.length) {
            JOptionPane.showMessageDialog(this, "Ya se ingresaron las 6 notas.");
            return;
        }
        try {
            double nota = Double.parseDouble(txtNota.getText().trim());
            notas[indice] = nota;
            indice++;
            txtNota.setText("");
            txtNota.requestFocus();
            lblEstado.setText("Notas ingresadas: " + indice + " de 6");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        if (indice < 6) {
            JOptionPane.showMessageDialog(this, "Faltan notas. Ingresadas: " + indice + " de 6.");
            return;
        }
        int aprobados = 0, reprobados = 0;
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 61) aprobados++; else reprobados++;
            suma += notas[i];
        }
        double promedio = suma / notas.length;

        try {
            new File("temp").mkdirs();   // se asegura que exista la carpeta temp
            PrintWriter pw = new PrintWriter(new FileWriter("temp/" + NOMBRE + "_reporte_notas.txt"));
            pw.println("Reporte de Notas");
            pw.println("Aprobados: " + aprobados);
            pw.println("Reprobados: " + reprobados);
            pw.println("Promedio de Notas: " + promedio);
            pw.close();
            JOptionPane.showMessageDialog(this, "Reporte generado en temp/" + NOMBRE + "_reporte_notas.txt");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al escribir el archivo: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnReporteActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
