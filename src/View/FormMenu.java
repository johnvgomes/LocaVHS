/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import View.FormHome;
import View.FormCliente;
import View.FormClientePasso2;
import View.FormClientePasso3;
import View.FormFuncionario;
import View.FormFuncionarioPasso2;
import View.FormFuncionarioPasso3;
import View.FormFuncionarioPasso4;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;


/**
 *
 * @author John Victor
 */
public class FormMenu extends javax.swing.JFrame {

    FormHome home;
    FormCliente cliente;
    FormClientePasso2 clientePasso2;
    FormClientePasso3 clientePasso3;
    FormFuncionario funcionario;
    FormFuncionarioPasso2 funcionariopasso2;
    FormFuncionarioPasso3 funcionariopasso3;
    FormFuncionarioPasso4 funcionarioPasso4;
    FormAdministrador administrador;
    FormAdministradorPasso2 administradorpasso2;
    FormAdministradorPasso3 administradorpasso3;
    FormAdministradorPasso4 administradorPasso4;
    FormFilmeCategoria catfilme;

    /**
     * Creates new form FormMenu
     */
    public FormMenu() {
        initComponents();
    }

    public void Internal(JInternalFrame frame) {
        areaTrabalhoMenu.removeAll();
        areaTrabalhoMenu.add(frame);
        frame.setLocation(
                areaTrabalhoMenu.getWidth() / 2 - frame.getWidth() / 2,
                areaTrabalhoMenu.getHeight() / 2 - frame.getHeight() / 2);
        frame.pack();
        frame.setVisible(true);
        ((BasicInternalFrameUI) frame.getUI()).setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMENU = new javax.swing.JPanel();
        jpnBarMenu = new javax.swing.JPanel();
        lblIconUser = new javax.swing.JLabel();
        lblHOME = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btncliente11 = new javax.swing.JPanel();
        btncliente12 = new javax.swing.JPanel();
        lblfunc10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblfunc11 = new javax.swing.JLabel();
        btnCliente = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        btnfuncionario = new javax.swing.JPanel();
        lblfunc = new javax.swing.JLabel();
        btnFilme = new javax.swing.JPanel();
        lblfilme = new javax.swing.JLabel();
        btnpromocoes = new javax.swing.JPanel();
        lblPromocoes = new javax.swing.JLabel();
        btnAdministrador = new javax.swing.JPanel();
        lbladministrador = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        areaTrabalhoMenu = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMENU.setBackground(new java.awt.Color(255, 255, 255));
        jpMENU.setToolTipText("");
        jpMENU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpMENUMouseEntered(evt);
            }
        });
        jpMENU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnBarMenu.setBackground(new java.awt.Color(0, 0, 0));
        jpnBarMenu.setToolTipText("LOCAVHS");
        jpnBarMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/149071.png"))); // NOI18N
        jpnBarMenu.add(lblIconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 10, 50, 50));

        lblHOME.setBackground(new java.awt.Color(255, 255, 255));
        lblHOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vhs-icon HOME.png"))); // NOI18N
        lblHOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHOMEMouseClicked(evt);
            }
        });
        jpnBarMenu.add(lblHOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fulano");
        jpnBarMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 30, -1, -1));

        jpMENU.add(jpnBarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1500, 70));

        jPanel1.setBackground(new java.awt.Color(109, 127, 145));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncliente11.setBackground(new java.awt.Color(109, 127, 145));
        btncliente11.setForeground(new java.awt.Color(255, 255, 255));
        btncliente11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncliente11MouseClicked(evt);
            }
        });
        btncliente11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncliente12.setBackground(new java.awt.Color(109, 127, 145));
        btncliente12.setForeground(new java.awt.Color(255, 255, 255));
        btncliente12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncliente12MouseClicked(evt);
            }
        });
        btncliente12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfunc10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblfunc10.setForeground(new java.awt.Color(255, 255, 255));
        lblfunc10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfunc10.setText("Funcionario");
        lblfunc10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblfunc10MouseEntered(evt);
            }
        });
        btncliente12.add(lblfunc10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 240, 60));

        btncliente11.add(btncliente12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 240, 60));
        btncliente11.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 220, 60));

        lblfunc11.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblfunc11.setForeground(new java.awt.Color(255, 255, 255));
        lblfunc11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfunc11.setText("MENU");
        lblfunc11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblfunc11MouseEntered(evt);
            }
        });
        btncliente11.add(lblfunc11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 60));

        jPanel1.add(btncliente11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 260, 60));

        btnCliente.setBackground(new java.awt.Color(109, 127, 145));
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
        });
        btnCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCliente.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCliente.setText("   Cliente");
        lblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblClienteMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblClienteMouseReleased(evt);
            }
        });
        btnCliente.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 60));

        jPanel1.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 260, 60));

        btnfuncionario.setBackground(new java.awt.Color(109, 127, 145));
        btnfuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnfuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfuncionarioMouseClicked(evt);
            }
        });
        btnfuncionario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfunc.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblfunc.setForeground(new java.awt.Color(255, 255, 255));
        lblfunc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblfunc.setText("   Funcionário");
        lblfunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfuncMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblfuncMouseEntered(evt);
            }
        });
        btnfuncionario.add(lblfunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 60));

        jPanel1.add(btnfuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 260, 60));

        btnFilme.setBackground(new java.awt.Color(109, 127, 145));
        btnFilme.setForeground(new java.awt.Color(255, 255, 255));
        btnFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFilmeMouseClicked(evt);
            }
        });
        btnFilme.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfilme.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblfilme.setForeground(new java.awt.Color(255, 255, 255));
        lblfilme.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblfilme.setText("   Filme");
        lblfilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfilmeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblfilmeMouseEntered(evt);
            }
        });
        btnFilme.add(lblfilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 60));

        jPanel1.add(btnFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 60));

        btnpromocoes.setBackground(new java.awt.Color(109, 127, 145));
        btnpromocoes.setForeground(new java.awt.Color(255, 255, 255));
        btnpromocoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpromocoesMouseClicked(evt);
            }
        });
        btnpromocoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPromocoes.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblPromocoes.setForeground(new java.awt.Color(255, 255, 255));
        lblPromocoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPromocoes.setText("   Promoções");
        lblPromocoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPromocoesMouseEntered(evt);
            }
        });
        btnpromocoes.add(lblPromocoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 60));

        jPanel1.add(btnpromocoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 260, 60));

        btnAdministrador.setBackground(new java.awt.Color(109, 127, 145));
        btnAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdministradorMouseClicked(evt);
            }
        });
        btnAdministrador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbladministrador.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbladministrador.setForeground(new java.awt.Color(255, 255, 255));
        lbladministrador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbladministrador.setText("   Administrador");
        lbladministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbladministradorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbladministradorMouseEntered(evt);
            }
        });
        btnAdministrador.add(lbladministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 70));

        jPanel1.add(btnAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 260, 70));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Todos os direitos reservados ©");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, -1, -1));

        jpMENU.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 260, 780));

        jPanel3.setBackground(new java.awt.Color(226, 224, 224));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("June 2018");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1210, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Desenvolvido por LabarouskCompany & Geremaia's Software Corporation");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 20));

        jpMENU.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 720, 1210, 50));

        areaTrabalhoMenu.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("LOCAVHS");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/locavhstransp.png"))); // NOI18N
        jLabel1.setToolTipText("LOCAVHS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 990, 520));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        jButton1.setText("LogOut");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 540, 200, 80));

        areaTrabalhoMenu.add(jPanel2);
        jPanel2.setBounds(0, 0, 1210, 640);

        jpMENU.add(areaTrabalhoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 1210, 640));

        getContentPane().add(jpMENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1500, 770));

        jButton3.setBackground(new java.awt.Color(217, 83, 79));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("jButton1");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 240, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpMENUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMENUMouseEntered
        // TODO add your handling code here:

        btnCliente.setBackground(new Color(109, 127, 145));

        btnfuncionario.setBackground(new Color(109, 127, 145));
        btnFilme.setBackground(new Color(109, 127, 145));
        btnAdministrador.setBackground(new Color(109, 127, 145));
        btnpromocoes.setBackground(new Color(109, 127, 145));

    }//GEN-LAST:event_jpMENUMouseEntered

    private void btnAdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministradorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdministradorMouseClicked

    private void lbladministradorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbladministradorMouseEntered
        // TODO add your handling code here:
        btnAdministrador.setBackground(new Color(48, 59, 70));

        btnCliente.setBackground(new Color(109, 127, 145));
        btnfuncionario.setBackground(new Color(109, 127, 145));
        btnpromocoes.setBackground(new Color(109, 127, 145));
        btnFilme.setBackground(new Color(109, 127, 145));

    }//GEN-LAST:event_lbladministradorMouseEntered

    private void btnpromocoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpromocoesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpromocoesMouseClicked

    private void lblPromocoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPromocoesMouseEntered
        // TODO add your handling code here:

        btnpromocoes.setBackground(new Color(48, 59, 70));

        btnCliente.setBackground(new Color(109, 127, 145));
        btnfuncionario.setBackground(new Color(109, 127, 145));
        btnAdministrador.setBackground(new Color(109, 127, 145));
        btnFilme.setBackground(new Color(109, 127, 145));

    }//GEN-LAST:event_lblPromocoesMouseEntered

    private void btnFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFilmeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFilmeMouseClicked

    private void lblfilmeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfilmeMouseEntered
        // TODO add your handling code here:

        btnFilme.setBackground(new Color(48, 59, 70));

        btnCliente.setBackground(new Color(109, 127, 145));
        btnfuncionario.setBackground(new Color(109, 127, 145));
        btnAdministrador.setBackground(new Color(109, 127, 145));
        btnpromocoes.setBackground(new Color(109, 127, 145));

    }//GEN-LAST:event_lblfilmeMouseEntered

    private void btnfuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfuncionarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnfuncionarioMouseClicked

    private void lblfuncMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfuncMouseEntered
        // TODO add your handling code here:
        btnfuncionario.setBackground(new Color(48, 59, 70));

        btnCliente.setBackground(new Color(109, 127, 145));
        btnFilme.setBackground(new Color(109, 127, 145));
        btnAdministrador.setBackground(new Color(109, 127, 145));
        btnpromocoes.setBackground(new Color(109, 127, 145));

    }//GEN-LAST:event_lblfuncMouseEntered

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnClienteMouseClicked

    private void lblClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClienteMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblClienteMouseReleased

    private void lblClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClienteMouseEntered
        // TODO add your handling code here:

        btnCliente.setBackground(new Color(48, 59, 70));

        btnfuncionario.setBackground(new Color(109, 127, 145));
        btnFilme.setBackground(new Color(109, 127, 145));
        btnAdministrador.setBackground(new Color(109, 127, 145));
        btnpromocoes.setBackground(new Color(109, 127, 145));

    }//GEN-LAST:event_lblClienteMouseEntered

    private void btncliente11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncliente11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncliente11MouseClicked

    private void lblfunc11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfunc11MouseEntered
        // TODO add your handling code here:

        btnCliente.setBackground(new Color(109, 127, 145));

        btnfuncionario.setBackground(new Color(109, 127, 145));
        btnFilme.setBackground(new Color(109, 127, 145));
        btnAdministrador.setBackground(new Color(109, 127, 145));
        btnpromocoes.setBackground(new Color(109, 127, 145));


    }//GEN-LAST:event_lblfunc11MouseEntered

    private void btncliente12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncliente12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncliente12MouseClicked

    private void lblfunc10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfunc10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblfunc10MouseEntered

    private void lblHOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHOMEMouseClicked
        // TODO add your handling code here:

        home = new FormHome();
        Internal(home);
    }//GEN-LAST:event_lblHOMEMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClienteMouseClicked
        // TODO add your handling code here:
   //     clientePasso3 = new FormClientePasso3();
     //   this.Internal(clientePasso3);

        cliente = new FormCliente(this);
       
        this.Internal(cliente);
    }//GEN-LAST:event_lblClienteMouseClicked

    private void lblfuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfuncMouseClicked
        // TODO add your handling code here:
        funcionario = new FormFuncionario(this);
        this.Internal(funcionario);
        
        //funcionarioPasso4 = new FormFuncionarioPasso4();
        //this.Internal(funcionarioPasso4);
        
    }//GEN-LAST:event_lblfuncMouseClicked

    private void lbladministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbladministradorMouseClicked
        // TODO add your handling code here:
        
        administrador = new FormAdministrador(this);
        this.Internal( administrador );
    }//GEN-LAST:event_lbladministradorMouseClicked

    private void lblfilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfilmeMouseClicked
        // TODO add your handling code here:
        
        catfilme = new FormFilmeCategoria(this);
        this.Internal( catfilme );
        
    }//GEN-LAST:event_lblfilmeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormMenu fm = new FormMenu();
                fm.setLocationRelativeTo(null);
                fm.pack();
                fm.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane areaTrabalhoMenu;
    private javax.swing.JPanel btnAdministrador;
    private javax.swing.JPanel btnCliente;
    private javax.swing.JPanel btnFilme;
    private javax.swing.JPanel btncliente11;
    private javax.swing.JPanel btncliente12;
    private javax.swing.JPanel btnfuncionario;
    private javax.swing.JPanel btnpromocoes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpMENU;
    private javax.swing.JPanel jpnBarMenu;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblHOME;
    private javax.swing.JLabel lblIconUser;
    private javax.swing.JLabel lblPromocoes;
    private javax.swing.JLabel lbladministrador;
    private javax.swing.JLabel lblfilme;
    private javax.swing.JLabel lblfunc;
    private javax.swing.JLabel lblfunc10;
    private javax.swing.JLabel lblfunc11;
    // End of variables declaration//GEN-END:variables
}
