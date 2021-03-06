package Interface;

import Control.ControlUser;
import Database_access.DaoLoan;
import Form.Devolution;
import Form.EditProfile;
import Form.EditProyect;
import Form.ListEquipment;
import Form.ListMembers;
import Form.ListProyects;
import Form.ProyectForm;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;

public class Profile_proyectdirector extends javax.swing.JFrame {
    DaoLoan loanDao = new DaoLoan();
    ProyectForm jifProyectForm = new ProyectForm();
    ControlUser control = new ControlUser();
    private int code;
    private String Profile;
    
    public Profile_proyectdirector(int code,String Profile) {
        this.code=code;
        this.Profile=Profile;
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana = this.getSize();
        this.setLocation((pantalla.width - ventana.width) / 4 , (pantalla.height - ventana.height) / 4 ); 
        setVisible(true);
        initComponents();
        loanDao.multas(code);
        loanDao.equiposatrasados(code);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        logoUV = new javax.swing.JLabel();
        logoLaboratorio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelInferior = new javax.swing.JPanel();
        logoUVInferior = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EditProfile = new javax.swing.JButton();
        Members = new javax.swing.JButton();
        Proyects = new javax.swing.JButton();
        Equipment = new javax.swing.JButton();
        Registration = new javax.swing.JButton();
        EditProyect = new javax.swing.JButton();
        panelResultOperation = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        Devolucion2 = new javax.swing.JButton();
        Option = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        Signoff = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        Guide = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfil Director de Proyectos");
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));

        logoUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logoUV3.png"))); // NOI18N

        logoLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mmvlabLogo.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ProyectDirector.png"))); // NOI18N

        panelInferior.setBackground(new java.awt.Color(213, 27, 37));

        logoUVInferior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LogoInferior.PNG"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Universidad del Valle:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cali - Colombia");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirección:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ciudad Universitaria Meléndez");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Calle 13 # 100-00");

        javax.swing.GroupLayout panelInferiorLayout = new javax.swing.GroupLayout(panelInferior);
        panelInferior.setLayout(panelInferiorLayout);
        panelInferiorLayout.setHorizontalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInferiorLayout.createSequentialGroup()
                .addComponent(logoUVInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelInferiorLayout.setVerticalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoUVInferior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInferiorLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        EditProfile.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        EditProfile.setText("Editar Perfil");
        EditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProfileActionPerformed(evt);
            }
        });

        Members.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        Members.setText("Miembros");
        Members.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MembersActionPerformed(evt);
            }
        });

        Proyects.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        Proyects.setText("Proyectos");
        Proyects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProyectsActionPerformed(evt);
            }
        });

        Equipment.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        Equipment.setText("Equipos");
        Equipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipmentActionPerformed(evt);
            }
        });

        Registration.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        Registration.setText("Nuevo Proyecto");
        Registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationActionPerformed(evt);
            }
        });

        EditProyect.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        EditProyect.setText("Editar Proyecto");
        EditProyect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProyectActionPerformed(evt);
            }
        });

        panelResultOperation.setBackground(new java.awt.Color(255, 255, 255));
        panelResultOperation.setPreferredSize(new java.awt.Dimension(487, 469));

        Welcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fondo.jpg"))); // NOI18N

        javax.swing.GroupLayout panelResultOperationLayout = new javax.swing.GroupLayout(panelResultOperation);
        panelResultOperation.setLayout(panelResultOperationLayout);
        panelResultOperationLayout.setHorizontalGroup(
            panelResultOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultOperationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelResultOperationLayout.setVerticalGroup(
            panelResultOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultOperationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        Devolucion2.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        Devolucion2.setText("Devolucion");
        Devolucion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Devolucion2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInferior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Members, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Proyects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Equipment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Registration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditProyect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Devolucion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelResultOperation, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(logoUV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoLaboratorio)))
                .addGap(36, 36, 36))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoUV)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoLaboratorio)))
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(EditProfile)
                        .addGap(33, 33, 33)
                        .addComponent(Members)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Proyects)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Equipment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Registration)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditProyect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Devolucion2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelResultOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 448, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menu.setText("Menu");

        Signoff.setText("Cerrar sesion");
        Signoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignoffActionPerformed(evt);
            }
        });
        Menu.add(Signoff);

        Exit.setText("Salir");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        Menu.add(Exit);

        Option.add(Menu);

        Help.setText("Ayuda");

        Guide.setText("Guia");
        Help.add(Guide);

        Option.add(Help);

        setJMenuBar(Option);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProfileActionPerformed
       EditProfile editProfile = new EditProfile(code);
        editProfile.setSize(614, 450);
        editProfile.setLocation(0,0);
        panelResultOperation.removeAll();
        panelResultOperation.add(editProfile, null);
        panelResultOperation.revalidate();
        panelResultOperation.repaint(); 
    }//GEN-LAST:event_EditProfileActionPerformed

    private void RegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationActionPerformed
        ProyectForm panelProyect =new ProyectForm();
        panelProyect.setSize(584, 392);
        panelProyect.setLocation(0,0);
        panelResultOperation.removeAll();
        panelResultOperation.add(panelProyect, null);
        panelResultOperation.revalidate();
        panelResultOperation.repaint();
    }//GEN-LAST:event_RegistrationActionPerformed

    private void SignoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignoffActionPerformed
        Join joifn = new Join();
        dispose();
    }//GEN-LAST:event_SignoffActionPerformed

    private void EquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipmentActionPerformed
        ListEquipment listEqui = new ListEquipment(code);
        listEqui.setSize(614, 450);
        listEqui.setLocation(0,0);
        panelResultOperation.removeAll();
        panelResultOperation.add(listEqui, null);
        panelResultOperation.revalidate();
        panelResultOperation.repaint();
    }//GEN-LAST:event_EquipmentActionPerformed

    private void ProyectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProyectsActionPerformed
        String position;
        position = control.check_position(Integer.toString(code));
        ListProyects listPro = new ListProyects(position);
        listPro.setSize(614, 450);
        listPro.setLocation(0,0);
        panelResultOperation.removeAll();
        panelResultOperation.add(listPro, null);
        panelResultOperation.revalidate();
        panelResultOperation.repaint();
    }//GEN-LAST:event_ProyectsActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void MembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MembersActionPerformed
        String position;
        position = control.check_position(Integer.toString(code));
        ListMembers listMem = new ListMembers(position);
        listMem.setSize(614, 450);
        listMem.setLocation(0,0);
        panelResultOperation.removeAll();
        panelResultOperation.add(listMem, null);
        panelResultOperation.revalidate();
        panelResultOperation.repaint();
    }//GEN-LAST:event_MembersActionPerformed

    private void EditProyectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProyectActionPerformed
        EditProyect editproyect = new EditProyect();
        editproyect.setSize(614, 450);
        editproyect.setLocation(0,0);
        panelResultOperation.removeAll();
        panelResultOperation.add(editproyect , null);
        panelResultOperation.revalidate();
        panelResultOperation.repaint();
    }//GEN-LAST:event_EditProyectActionPerformed

    private void Devolucion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Devolucion2ActionPerformed
        Devolution devolutiont = new Devolution(Profile,code);
        devolutiont.setSize(614, 450);
        devolutiont.setLocation(0,0);
        panelResultOperation.removeAll();
        panelResultOperation.add(devolutiont , null);
        panelResultOperation.revalidate();
        panelResultOperation.repaint();
    }//GEN-LAST:event_Devolucion2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Devolucion2;
    private javax.swing.JButton EditProfile;
    private javax.swing.JButton EditProyect;
    private javax.swing.JButton Equipment;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Guide;
    private javax.swing.JMenu Help;
    private javax.swing.JButton Members;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuBar Option;
    private javax.swing.JButton Proyects;
    private javax.swing.JButton Registration;
    private javax.swing.JMenuItem Signoff;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel logoLaboratorio;
    private javax.swing.JLabel logoUV;
    private javax.swing.JLabel logoUVInferior;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelResultOperation;
    // End of variables declaration//GEN-END:variables
}
