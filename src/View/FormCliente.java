/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author John Victor
 */
public class FormCliente extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form Home
     */
    public FormCliente() {
        initComponents();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpTitulo = new javax.swing.JPanel();
        lblTituloForm = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(300, 80));
        setPreferredSize(new java.awt.Dimension(1210, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTitulo.setBackground(new java.awt.Color(109, 127, 145));
        jpTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloForm.setBackground(new java.awt.Color(109, 127, 145));
        lblTituloForm.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTituloForm.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloForm.setText("FORMULARIO DO CLIENTE");
        jpTitulo.add(lblTituloForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 60));

        jPanel1.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 780, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1230, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JLabel lblTituloForm;
    // End of variables declaration//GEN-END:variables
}
