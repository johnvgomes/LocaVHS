/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import View.FormClientePasso2;
import View.FormMenu;
import java.awt.Color;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author John Victor
 */
public class FormFuncionario extends javax.swing.JInternalFrame {

    boolean mensagemSucesso = false;
    String mensagem = "";

    FormMenu telaPai = null;

    /**
     * Creates new form Home
     */
    public FormFuncionario(FormMenu telaPai) {
        initComponents();
        this.telaPai = telaPai;

        txtNome.setText("Nome");
        lblNome.setVisible(false);
        txtSobrenome.setText("Sobrenome");
        lblSobrenome.setVisible(false);
        campoMensagem.setVisible(false);
        lblMensagem.setVisible(false);

    }

    FormFuncionarioPasso2 funcionarioPasso2;
    FormHome home;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jpTitulo = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btncancelar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnProsseguir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnpasso01 = new javax.swing.JPanel();
        lblpasso01 = new javax.swing.JLabel();
        pnpasso02 = new javax.swing.JPanel();
        lblpasso02 = new javax.swing.JLabel();
        pnpasso03 = new javax.swing.JPanel();
        lblpasso03 = new javax.swing.JLabel();
        pnpasso3 = new javax.swing.JPanel();
        lblpasso3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAlterarImage = new javax.swing.JPanel();
        btnAlterarImagem = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dtnasc = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        lblDatanasc = new java.awt.Label();
        jpTitulo1 = new javax.swing.JPanel();
        lblTituloForm4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        lblSexo = new java.awt.Label();
        jSeparator2 = new javax.swing.JSeparator();
        rbtnMasculino = new javax.swing.JRadioButton();
        rbtnFeminino = new javax.swing.JRadioButton();
        lblNome = new java.awt.Label();
        lblSobrenome = new java.awt.Label();
        campoMensagem = new javax.swing.JPanel();
        lblMensagem = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(300, 80));
        setPreferredSize(new java.awt.Dimension(1210, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jpTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncancelar.setBackground(new java.awt.Color(109, 127, 145));
        btncancelar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btncancelar.setText("CANCELAR");
        btncancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelarMouseClicked(evt);
            }
        });
        jPanel3.add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 60));

        jpTitulo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 60));

        jPanel4.setBackground(new java.awt.Color(109, 127, 145));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProsseguir.setBackground(new java.awt.Color(109, 127, 145));
        btnProsseguir.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnProsseguir.setForeground(new java.awt.Color(255, 255, 255));
        btnProsseguir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProsseguir.setText("Prosseguir");
        btnProsseguir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProsseguirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProsseguirMouseEntered(evt);
            }
        });
        jPanel4.add(btnProsseguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 60));

        jpTitulo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 220, 60));

        jPanel1.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 780, 60));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setText("Passo ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 110, 40));

        pnpasso01.setBackground(new java.awt.Color(48, 59, 70));
        pnpasso01.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblpasso01.setForeground(new java.awt.Color(255, 255, 255));
        lblpasso01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpasso01.setText("1");
        pnpasso01.add(lblpasso01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 25, 25));

        jPanel1.add(pnpasso01, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 25, 25));

        pnpasso02.setBackground(new java.awt.Color(109, 127, 145));
        pnpasso02.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblpasso02.setBackground(new java.awt.Color(109, 127, 145));
        lblpasso02.setForeground(new java.awt.Color(255, 255, 255));
        lblpasso02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpasso02.setText("2");
        pnpasso02.add(lblpasso02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 25, 25));

        jPanel1.add(pnpasso02, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 25, 25));

        pnpasso03.setBackground(new java.awt.Color(109, 127, 145));
        pnpasso03.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblpasso03.setForeground(new java.awt.Color(255, 255, 255));
        lblpasso03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpasso03.setText("3");
        pnpasso03.add(lblpasso03, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 25, 25));

        jPanel1.add(pnpasso03, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 25, 25));

        pnpasso3.setBackground(new java.awt.Color(109, 127, 145));
        pnpasso3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblpasso3.setBackground(new java.awt.Color(109, 127, 145));
        lblpasso3.setForeground(new java.awt.Color(255, 255, 255));
        lblpasso3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpasso3.setText("4");
        pnpasso3.add(lblpasso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 25, 25));

        jPanel1.add(pnpasso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 25, 25));

        jPanel2.setBackground(new java.awt.Color(226, 224, 224));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 120));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 130, 120));

        btnAlterarImage.setBackground(new java.awt.Color(109, 127, 145));
        btnAlterarImage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlterarImagem.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnAlterarImagem.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAlterarImagem.setText("Alterar Imagem");
        btnAlterarImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarImagemMouseClicked(evt);
            }
        });
        btnAlterarImage.add(btnAlterarImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jPanel1.add(btnAlterarImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 130, 30));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        dtnasc.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dtnasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 380, 30));

        jSeparator1.setForeground(new java.awt.Color(109, 127, 145));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 380, 10));

        lblDatanasc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblDatanasc.setForeground(new java.awt.Color(109, 127, 145));
        lblDatanasc.setText("Data de Nascimento");
        jPanel1.add(lblDatanasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 480, 130, -1));

        jpTitulo1.setBackground(new java.awt.Color(109, 127, 145));
        jpTitulo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloForm4.setBackground(new java.awt.Color(109, 127, 145));
        lblTituloForm4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTituloForm4.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloForm4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloForm4.setText("FORMULARIO DO FUNCIONARIO");
        jpTitulo1.add(lblTituloForm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 60));

        jPanel1.add(jpTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 780, 60));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(109, 127, 145));
        txtNome.setToolTipText("Nome");
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });
        jPanel5.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 40));

        txtSobrenome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtSobrenome.setForeground(new java.awt.Color(109, 127, 145));
        txtSobrenome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSobrenomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSobrenomeFocusLost(evt);
            }
        });
        txtSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobrenomeActionPerformed(evt);
            }
        });
        jPanel5.add(txtSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 380, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 780, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSexo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(109, 127, 145));
        lblSexo.setText("Sexo");
        jPanel6.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 20));

        jSeparator2.setForeground(new java.awt.Color(109, 127, 145));
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 380, 10));

        rbtnMasculino.setBackground(new java.awt.Color(255, 255, 255));
        grpSexo.add(rbtnMasculino);
        rbtnMasculino.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rbtnMasculino.setForeground(new java.awt.Color(109, 127, 145));
        rbtnMasculino.setText("Masculino");
        rbtnMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMasculinoActionPerformed(evt);
            }
        });
        jPanel6.add(rbtnMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        rbtnFeminino.setBackground(new java.awt.Color(255, 255, 255));
        grpSexo.add(rbtnFeminino);
        rbtnFeminino.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rbtnFeminino.setForeground(new java.awt.Color(109, 127, 145));
        rbtnFeminino.setText("Feminino");
        jPanel6.add(rbtnFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 780, 70));

        lblNome.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(109, 127, 145));
        lblNome.setText("Nome");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 40, 20));

        lblSobrenome.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblSobrenome.setForeground(new java.awt.Color(109, 127, 145));
        lblSobrenome.setText("Sobrenome");
        jPanel1.add(lblSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 80, 20));

        campoMensagem.setBackground(new java.awt.Color(255, 204, 204));
        campoMensagem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMensagem.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 51, 51));
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensagem.setText("You have an error in you form");
        campoMensagem.add(lblMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 5, 750, 30));

        jPanel1.add(campoMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 780, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1230, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void rbtnMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnMasculinoActionPerformed

    private void btnProsseguirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProsseguirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProsseguirMouseEntered

    private void btnProsseguirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProsseguirMouseClicked
        // TODO add your handling code here:

        mensagem = "";
        lblMensagem.setVisible(false);
        campoMensagem.setVisible(false);
        long anoAtualMenosDezAnos = new Date().getTime() - 315576000000L;

        if (txtNome.getText().trim().equals("Nome") || txtNome.getText().trim().isEmpty()) {

            mensagem = "Nome não pode ser vazio";
            mensagemSucesso = false;
            txtNome.grabFocus();

        } else if (txtSobrenome.getText().trim().equals("Sobrenome") || txtSobrenome.getText().trim().isEmpty()) {

            mensagem = "Sobrenome não pode ser vazio";
            mensagemSucesso = false;
            txtSobrenome.grabFocus();

        } else if (!rbtnFeminino.isSelected() && !rbtnMasculino.isSelected()) {

            mensagem = "Sexo deve ser selecionado";
            mensagemSucesso = false;
            rbtnMasculino.grabFocus();

        } else if (dtnasc.getDate() == null) {

            mensagem = "Data de Nascimento não deve ser vazia";
            mensagemSucesso = false;
            dtnasc.grabFocus();

        } else if (dtnasc.getDate().getTime() >= anoAtualMenosDezAnos) {

            mensagem = "O cliente deve ter mais de 10 anos";
            mensagemSucesso = false;
            dtnasc.grabFocus();

        } else {
            mensagem = "";
            lblMensagem.setVisible(false);
            campoMensagem.setVisible(false);

            mensagemSucesso = true;

        }

        if (mensagemSucesso) {

            funcionarioPasso2 = new FormFuncionarioPasso2(this.telaPai);
            this.telaPai.Internal(funcionarioPasso2);

        } else {

            campoMensagem.setBackground(new Color(255, 204, 204));
            campoMensagem.setVisible(true);
            lblMensagem.setText(mensagem);
            lblMensagem.setVisible(true);
        }

    }//GEN-LAST:event_btnProsseguirMouseClicked

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        // TODO add your handling code here:


    }//GEN-LAST:event_txtNomeKeyReleased

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        // TODO add your handling code here:
        if (txtNome.getText().equals("Nome")) {
            txtNome.setText("");
            lblNome.setVisible(true);
        }
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        // TODO add your handling code here:

        if (txtNome.getText().isEmpty()) {
            txtNome.setText("Nome");
            lblNome.setVisible(false);
        }
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtSobrenomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSobrenomeFocusGained
        // TODO add your handling code here:
        if (txtSobrenome.getText().equals("Sobrenome")) {
            txtSobrenome.setText("");
            lblSobrenome.setVisible(true);
        }

    }//GEN-LAST:event_txtSobrenomeFocusGained

    private void txtSobrenomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSobrenomeFocusLost
        // TODO add your handling code here:
        if (txtSobrenome.getText().isEmpty()) {
            txtSobrenome.setText("Sobrenome");
            lblSobrenome.setVisible(false);
        }

    }//GEN-LAST:event_txtSobrenomeFocusLost

    private void btnAlterarImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarImagemMouseClicked
        // TODO add your handling code here:

//        try {
//
//					janela.setFileSelectionMode(JFileChooser.FILES_ONLY);
//
//					int i = janela.showSaveDialog(null);
//
//					if (i == 1) {
//						txt_endereco_img.setText("");
//					} else {
//						java.io.File arquivo = janela.getSelectedFile();
//						txt_endereco_img.setText(arquivo.getPath());
//
//						String caminho = janela.getSelectedFile().getAbsolutePath();
//						ImageIcon icon = new ImageIcon(caminho);
//						iconeRedimensionado = new ImageIcon(icon.getImage().getScaledInstance(120,120,0));
//						lbl_FOTO_Funcionario.setIcon(iconeRedimensionado);
//					}
//
//				} catch (Exception e1) {
//					e1.printStackTrace();
//				}
    }//GEN-LAST:event_btnAlterarImagemMouseClicked

    private void btncancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelarMouseClicked
        // TODO add your handling code here:

        dispose();

        home = new FormHome();
        this.telaPai.Internal(home);
    }//GEN-LAST:event_btncancelarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAlterarImage;
    private javax.swing.JLabel btnAlterarImagem;
    private javax.swing.JLabel btnProsseguir;
    private javax.swing.JLabel btncancelar;
    private javax.swing.JPanel campoMensagem;
    private com.toedter.calendar.JDateChooser dtnasc;
    private javax.swing.ButtonGroup grpSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpTitulo1;
    private java.awt.Label lblDatanasc;
    private javax.swing.JLabel lblMensagem;
    private java.awt.Label lblNome;
    private java.awt.Label lblSexo;
    private java.awt.Label lblSobrenome;
    private javax.swing.JLabel lblTituloForm4;
    private javax.swing.JLabel lblpasso01;
    private javax.swing.JLabel lblpasso02;
    private javax.swing.JLabel lblpasso03;
    private javax.swing.JLabel lblpasso3;
    private javax.swing.JPanel pnpasso01;
    private javax.swing.JPanel pnpasso02;
    private javax.swing.JPanel pnpasso03;
    private javax.swing.JPanel pnpasso3;
    private javax.swing.JRadioButton rbtnFeminino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
