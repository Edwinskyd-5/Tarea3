package com.umg.tarea3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

//
public class Discos extends javax.swing.JFrame {

    // ---- Arreglos paralelos globales ----
    String[] titulos = new String[5];
    int[] anios = new int[5];
    String ruta = "temp/discos.csv";

    public Discos() {
        initComponents();
        cargarDatos();     
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblAnio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNuevoAnio = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Biblioteca de Discos Musicales");

        jLabel1.setText("Buscar Álbum:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblAnio.setText("Año actual: ---");

        jLabel2.setText("Nuevo Año:");

        btnActualizar.setText("Actualizar Registro");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(txtNuevoAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(txtNuevoAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int pos = buscarIndice(txtBuscar.getText().trim());
        if (pos == -1) {
            lblAnio.setText("Año actual: ---");
            JOptionPane.showMessageDialog(this, "Álbum no encontrado.");
        } else {
            lblAnio.setText("Año actual: " + anios[pos]);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int pos = buscarIndice(txtBuscar.getText().trim());
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Primero busque un álbum existente.");
            return;
        }
        try {
            anios[pos] = Integer.parseInt(txtNuevoAnio.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un año numérico válido.");
            return;
        }
        // Sobrescribir el archivo completo (append = false)
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(ruta, false));
            for (int i = 0; i < titulos.length; i++) {
                pw.println(titulos[i] + "," + anios[i]);
            }
            pw.close();
            lblAnio.setText("Año actual: " + anios[pos]);
            txtNuevoAnio.setText("");
            JOptionPane.showMessageDialog(this, "Registro actualizado y archivo guardado.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al escribir el archivo: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    /** Lee discos.csv y llena los dos arreglos paralelos. */
    private void cargarDatos() {
        try {
            Scanner sc = new Scanner(new File(ruta));
            int i = 0;
            while (sc.hasNextLine() && i < titulos.length) {
                String linea = sc.nextLine().trim();
                if (linea.isEmpty()) continue;
                String[] partes = linea.split(",");
                titulos[i] = partes[0].trim();
                anios[i] = Integer.parseInt(partes[1].trim());
                i++;
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "No se encontró " + ruta);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Año inválido en discos.csv");
        }
    }

    /** Búsqueda secuencial. Devuelve el índice o -1 si no existe. */
    private int buscarIndice(String nombre) {
        for (int i = 0; i < titulos.length; i++) {
            if (titulos[i] != null && titulos[i].equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNuevoAnio;
    // End of variables declaration//GEN-END:variables
}
