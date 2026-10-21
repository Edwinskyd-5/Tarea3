package com.umg.tarea3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

//
public class Temperaturas extends javax.swing.JFrame {

    // ---- Variables globales ----
    double[] temperaturas = new double[6];
    int indice = 0;
    String ruta = "temp/temperaturas.txt";

    public Temperaturas() {
        initComponents();

        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCargar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Analizador de Temperaturas");

        btnCargar.setText("Cargar Datos");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular Estadísticas");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        areaResultado.setEditable(false);
        areaResultado.setColumns(20);
        areaResultado.setRows(5);
        jScrollPane1.setViewportView(areaResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        try {
            Scanner sc = new Scanner(new File(ruta));
            indice = 0;
            while (sc.hasNextLine() && indice < temperaturas.length) {
                String linea = sc.nextLine().trim();
                if (linea.isEmpty()) continue;                       
                temperaturas[indice] = Double.parseDouble(linea);    
                indice++;
            }
            sc.close();
            JOptionPane.showMessageDialog(this, "Los datos fueron cargados en memoria (" + indice + " registros).");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "No se encontró el archivo: " + ruta);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El archivo contiene un valor que no es numérico.");
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (indice == 0) {
            JOptionPane.showMessageDialog(this, "Primero presione \"Cargar Datos\".");
            return;
        }
        double suma = 0;
        int calidos = 0, frescos = 0;
        for (int i = 0; i < indice; i++) {
            suma += temperaturas[i];
            if (temperaturas[i] >= 25.0) calidos++; else frescos++;
        }
        double promedio = suma / indice;

        areaResultado.setText("");
        areaResultado.append("Análisis Climático\n");
        areaResultado.append("------------------\n");
        areaResultado.append("Promedio de Temperatura: " + String.format(Locale.US, "%.1f", promedio) + "\n");
        areaResultado.append("Días Cálidos (>= 25°): " + calidos + "\n");
        areaResultado.append("Días Frescos (< 25°): " + frescos + "\n");
    }//GEN-LAST:event_btnCalcularActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaResultado;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCargar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
