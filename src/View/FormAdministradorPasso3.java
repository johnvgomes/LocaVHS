/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.WebServiceCep;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author John Victor
 */
public class FormAdministradorPasso3 extends javax.swing.JInternalFrame {

    boolean mensagemSucesso = false;
    String mensagem = "";
    private String cep;

    
    FormMenu telaPai = null;
    /**
     * Creates new form Home
     */
    public FormAdministradorPasso3(FormMenu telaPai) {

        initComponents();

        lblcep.setVisible(true);
        txtRua.setText("Rua");
        lblrua.setVisible(false);
        txtNumero.setText("Número");
        lblnumero.setVisible(false);
        txtBairro.setText("Bairro");
        lblbairro.setVisible(false);
        txtCidade.setText("Cidade");
        lblcidade.setVisible(false);
        campoMensagem.setVisible(false);
        lblMensagem.setVisible(false);

        cbUF.setModel(new DefaultComboBoxModel(
                new String[]{"Selecione...", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS",
                    "MG", "PR", "PB", "PA", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SE", "SP", "TO"}));

        cbUF.setSelectedIndex(0);
    }

    public void limpar() {

        txtRua.setText("Rua");
        txtBairro.setText("Bairro");
        txtCidade.setText("Cidade");
        txtNumero.setText("Número");
        cbUF.setSelectedIndex(0);

        txtRua.setEditable(true);
        txtCidade.setEditable(true);
        txtBairro.setEditable(true);
        cbUF.setEnabled(true);
    }

    public void buscaCep() {

        limpar();

        cep = txtCEP.getText();

        cep = cep.replace(".", "");
        cep = cep.replace("-", "");

        //Faz a busca para o cep 58043-280
        WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);
        //A ferramenta de busca ignora qualquer caracter que n?o seja n?mero.

        //caso a busca ocorra bem, imprime os resultados.
        if (webServiceCep.wasSuccessful()) {
            txtRua.setText(webServiceCep.getLogradouroFull());
            txtCidade.setText(webServiceCep.getCidade());
            txtBairro.setText(webServiceCep.getBairro());
            cbUF.setSelectedItem(webServiceCep.getUf());

            cbUF.setForeground(Color.black);

            if (!txtRua.getText().equals("Rua")) {
                lblrua.setVisible(true);
                txtRua.setEditable(false);
            }
            if (!txtCidade.getText().equals("Cidade")) {
                lblcidade.setVisible(true);
                txtCidade.setEditable(false);
            }
            if (!txtBairro.getText().equals("Bairro")) {
                lblbairro.setVisible(true);
                txtBairro.setEditable(false);
            }

            if (!txtNumero.getText().equals("Número")) {
                lblnumero.setVisible(true);
                txtNumero.setEditable(false);
            }
            if (!(cbUF.getSelectedIndex() == 0)) {
                lblnumero.setVisible(true);
                cbUF.setEnabled(false);
            }

            campoMensagem.setBackground(new Color(204, 255, 204));
            campoMensagem.setVisible(true);
            lblMensagem.setForeground(new Color(0, 204, 0));
            mensagem = "CEP VALIDO";
            lblMensagem.setText(mensagem);
            lblMensagem.setVisible(true);
            //caso haja problemas imprime as exce??es.
        } else {
            //JOptionPane.showMessageDialog(null, "Erro numero: " + webServiceCep.getResulCode());

            campoMensagem.setBackground(new Color(255, 255, 204));
            campoMensagem.setVisible(true);
            lblMensagem.setForeground(new Color(204, 204, 0));
            mensagem = "Ops! Não foi possível encontrar o CEP";
            lblMensagem.setText(mensagem);
            lblMensagem.setVisible(true);

        }
    }

    FormAdministradorPasso4 administradorPasso4;
    FormHome home;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnpasso3 = new javax.swing.JPanel();
        lblpasso3 = new javax.swing.JLabel();
        jpTitulo = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btncancelar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnConfirmar = new javax.swing.JLabel();
        pnpasso01 = new javax.swing.JPanel();
        lblpasso01 = new javax.swing.JLabel();
        pnpasso02 = new javax.swing.JPanel();
        lblpasso02 = new javax.swing.JLabel();
        pnpasso03 = new javax.swing.JPanel();
        lblpasso03 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JFormattedTextField();
        txtCidade = new javax.swing.JFormattedTextField();
        cbUF = new javax.swing.JComboBox<>();
        txtRua = new javax.swing.JFormattedTextField();
        txtNumero = new javax.swing.JFormattedTextField();
        lblcidade = new java.awt.Label();
        lblcep = new java.awt.Label();
        lblrua = new java.awt.Label();
        lblnumero = new java.awt.Label();
        lblbairro = new java.awt.Label();
        lbluf = new java.awt.Label();
        jSeparator2 = new javax.swing.JSeparator();
        jpTitulo1 = new javax.swing.JPanel();
        lblTituloForm4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTituloForm5 = new javax.swing.JLabel();
        campoMensagem = new javax.swing.JPanel();
        lblMensagem = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(204, 204, 0));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(300, 80));
        setPreferredSize(new java.awt.Dimension(1210, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnpasso3.setBackground(new java.awt.Color(109, 127, 145));
        pnpasso3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblpasso3.setBackground(new java.awt.Color(109, 127, 145));
        lblpasso3.setForeground(new java.awt.Color(255, 255, 255));
        lblpasso3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpasso3.setText("4");
        pnpasso3.add(lblpasso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 25, 25));

        jPanel1.add(pnpasso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 25, 25));

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

        btnConfirmar.setBackground(new java.awt.Color(109, 127, 145));
        btnConfirmar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseClicked(evt);
            }
        });
        jPanel4.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 60));

        jpTitulo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 220, 60));

        jPanel1.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 780, 60));

        pnpasso01.setBackground(new java.awt.Color(109, 127, 145));
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

        pnpasso03.setBackground(new java.awt.Color(48, 59, 70));
        pnpasso03.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblpasso03.setForeground(new java.awt.Color(255, 255, 255));
        lblpasso03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpasso03.setText("3");
        pnpasso03.add(lblpasso03, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 25, 25));

        jPanel1.add(pnpasso03, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 25, 25));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        txtBairro.setForeground(new java.awt.Color(109, 127, 145));
        txtBairro.setText("Bairro");
        txtBairro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBairroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBairroFocusLost(evt);
            }
        });
        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 380, 40));

        txtCidade.setForeground(new java.awt.Color(109, 127, 145));
        txtCidade.setText("Cidade");
        txtCidade.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCidadeFocusLost(evt);
            }
        });
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 380, 40));

        cbUF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UF" }));
        jPanel1.add(cbUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 380, 40));

        txtRua.setForeground(new java.awt.Color(109, 127, 145));
        txtRua.setText("Rua");
        txtRua.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRuaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRuaFocusLost(evt);
            }
        });
        txtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaActionPerformed(evt);
            }
        });
        jPanel1.add(txtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 780, 40));

        txtNumero.setForeground(new java.awt.Color(109, 127, 145));
        txtNumero.setText("Número");
        txtNumero.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroFocusLost(evt);
            }
        });
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 380, 40));

        lblcidade.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblcidade.setForeground(new java.awt.Color(109, 127, 145));
        lblcidade.setText("Cidade");
        jPanel1.add(lblcidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 60, 20));

        lblcep.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblcep.setForeground(new java.awt.Color(109, 127, 145));
        lblcep.setText("CEP");
        jPanel1.add(lblcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 40, 20));

        lblrua.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblrua.setForeground(new java.awt.Color(109, 127, 145));
        lblrua.setText("Rua");
        jPanel1.add(lblrua, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 40, 20));

        lblnumero.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblnumero.setForeground(new java.awt.Color(109, 127, 145));
        lblnumero.setText("Número");
        jPanel1.add(lblnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 50, 20));

        lblbairro.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblbairro.setForeground(new java.awt.Color(109, 127, 145));
        lblbairro.setText("Bairro");
        jPanel1.add(lblbairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 40, 20));

        lbluf.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lbluf.setForeground(new java.awt.Color(109, 127, 145));
        lbluf.setText("UF");
        jPanel1.add(lbluf, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 40, 20));

        jSeparator2.setForeground(new java.awt.Color(109, 127, 145));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 380, 10));

        jpTitulo1.setBackground(new java.awt.Color(109, 127, 145));
        jpTitulo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloForm4.setBackground(new java.awt.Color(109, 127, 145));
        lblTituloForm4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTituloForm4.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloForm4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloForm4.setText("FORMULARIO DO ADMINISTRADOR");
        jpTitulo1.add(lblTituloForm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 60));

        jPanel1.add(jpTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 780, 60));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel2.setText("Passo ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 110, 40));

        lblTituloForm5.setBackground(new java.awt.Color(109, 127, 145));
        lblTituloForm5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTituloForm5.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloForm5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloForm5.setText("FORMULARIO DO CLIENTE");
        jPanel1.add(lblTituloForm5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 770, 60));

        campoMensagem.setBackground(new java.awt.Color(255, 204, 204));
        campoMensagem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMensagem.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 51, 51));
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensagem.setText("You have an error in you form");
        campoMensagem.add(lblMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 5, 750, 30));

        jPanel1.add(campoMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 780, 40));

        txtCEP.setForeground(new java.awt.Color(109, 127, 145));
        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCEPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCEPFocusLost(evt);
            }
        });
        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });
        txtCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCEPKeyReleased(evt);
            }
        });
        jPanel1.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 780, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1230, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void btnConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseClicked

        if (txtCEP.getText().equals("  .   -   ")) {
            mensagem = "CEP não pode ser vazio";
            mensagemSucesso = false;
            txtCEP.grabFocus();
        } else if (txtRua.getText().equals("Rua") || txtRua.getText().trim().isEmpty()) {
            mensagem = "Rua não pode ser vazio";
            mensagemSucesso = false;
            txtRua.grabFocus();
        } else if (txtNumero.getText().equals("Número") || txtNumero.getText().trim().isEmpty()) {
            mensagem = "Numero não pode ser vazio";
            mensagemSucesso = false;
            txtNumero.grabFocus();
        } else if (txtBairro.getText().equals("Bairro") || txtBairro.getText().trim().isEmpty()) {
            mensagem = "Bairro não pode ser vazio";
            mensagemSucesso = false;
            txtBairro.grabFocus();
        } else if (txtCidade.getText().equals("Cidade") || txtCidade.getText().trim().isEmpty()) {
            mensagem = "Cidade não pode ser vazio";
            mensagemSucesso = false;
            txtCidade.grabFocus();
        } else if ((cbUF.getSelectedIndex() == 0)) {
            mensagem = "Selecione o estado (UF)";
            mensagemSucesso = false;
            cbUF.grabFocus();

        } else {
            mensagemSucesso = true;
        }
        if (mensagemSucesso) {

            administradorPasso4 = new FormAdministradorPasso4(this.telaPai);
            this.telaPai.Internal(administradorPasso4);

        } else {

            campoMensagem.setBackground(new Color(255, 204, 204));
            campoMensagem.setVisible(true);
            lblMensagem.setText(mensagem);
            lblMensagem.setVisible(true);
            lblMensagem.setForeground(new Color(204, 0, 0));
        }
    }//GEN-LAST:event_btnConfirmarMouseClicked

    private void txtRuaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRuaFocusGained
        // TODO add your handling code here:

        if (txtRua.getText().equals("Rua")) {
            txtRua.setText("");
            lblrua.setVisible(true);
        }

    }//GEN-LAST:event_txtRuaFocusGained

    private void txtRuaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRuaFocusLost
        // TODO add your handling code here:
        if (txtRua.getText().isEmpty()) {
            txtRua.setText("Rua");
            lblrua.setVisible(false);
        }

    }//GEN-LAST:event_txtRuaFocusLost

    private void txtNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFocusGained
        // TODO add your handling code here:

        if (txtNumero.getText().equals("Número")) {
            txtNumero.setText("");
            lblnumero.setVisible(true);
        }

    }//GEN-LAST:event_txtNumeroFocusGained

    private void txtNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFocusLost
        // TODO add your handling code here: 

        if (txtNumero.getText().isEmpty()) {
            txtNumero.setText("Número");
            lblnumero.setVisible(false);
        }
    }//GEN-LAST:event_txtNumeroFocusLost

    private void txtBairroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBairroFocusGained
        // TODO add your handling code here:

        if (txtBairro.getText().equals("Bairro")) {
            txtBairro.setText("");
            lblbairro.setVisible(true);
        }
    }//GEN-LAST:event_txtBairroFocusGained

    private void txtBairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBairroFocusLost
        // TODO add your handling code here:

        if (txtBairro.getText().isEmpty()) {
            txtBairro.setText("Bairro");
            lblbairro.setVisible(false);
        }
    }//GEN-LAST:event_txtBairroFocusLost

    private void txtCidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCidadeFocusGained
        // TODO add your handling code here:

        if (txtCidade.getText().equals("Cidade")) {
            txtCidade.setText("");
            lblcidade.setVisible(true);
        }

    }//GEN-LAST:event_txtCidadeFocusGained

    private void txtCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCidadeFocusLost
        // TODO add your handling code here:

        if (txtCidade.getText().isEmpty()) {
            txtCidade.setText("Cidade");
            lblcidade.setVisible(false);
        }


    }//GEN-LAST:event_txtCidadeFocusLost

    private void txtCEPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCEPFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPFocusGained

    private void txtCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCEPFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPFocusLost

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void txtCEPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCEPKeyReleased
        // TODO add your handling code here:

        cep = txtCEP.getText();

        cep = cep.replace(".", "");
        cep = cep.replace("-", "");

        if (cep.trim().length() == 8) {
            buscaCep();
        } else if (cep.trim().length() < 8) {

            campoMensagem.setVisible(false);
            mensagem = "";
            lblMensagem.setVisible(false);
        } else {
            campoMensagem.setBackground(new Color(255, 255, 204));
            campoMensagem.setVisible(true);
            lblMensagem.setForeground(new Color(204, 204, 0));
            mensagem = "Ops! Não foi possível encontrar o CEP";
            lblMensagem.setText(mensagem);
            lblMensagem.setVisible(true);
        }
    }//GEN-LAST:event_txtCEPKeyReleased

    private void btncancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelarMouseClicked
        // TODO add your handling code here:
        
          dispose();
        
         home = new FormHome();
            this.telaPai.Internal(home);
    }//GEN-LAST:event_btncancelarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnConfirmar;
    private javax.swing.JLabel btncancelar;
    private javax.swing.JPanel campoMensagem;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpTitulo1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblTituloForm4;
    private javax.swing.JLabel lblTituloForm5;
    private java.awt.Label lblbairro;
    private java.awt.Label lblcep;
    private java.awt.Label lblcidade;
    private java.awt.Label lblnumero;
    private javax.swing.JLabel lblpasso01;
    private javax.swing.JLabel lblpasso02;
    private javax.swing.JLabel lblpasso03;
    private javax.swing.JLabel lblpasso3;
    private java.awt.Label lblrua;
    private java.awt.Label lbluf;
    private javax.swing.JPanel pnpasso01;
    private javax.swing.JPanel pnpasso02;
    private javax.swing.JPanel pnpasso03;
    private javax.swing.JPanel pnpasso3;
    private javax.swing.JFormattedTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCidade;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JFormattedTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
