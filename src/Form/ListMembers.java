package Form;

import Database_access.DaoUser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListMembers extends javax.swing.JPanel {

    private String select;
    private String opc;
    private int estado;
    private int key;
    private String position;
    
   
    
    public ListMembers(String position) {
        initComponents();
        this.position=position;
        DefaultTableModel model;
        model = new DefaultTableModel();
        jTableMembers.setModel(model);
        model.addColumn("Codigo");
        model.addColumn("Nombre_usuario");
        model.addColumn("Apellido");

        //jTableEquipment.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableMembers.getTableHeader().setReorderingAllowed(false);

        DaoUser userDao = new DaoUser();
        userDao.consultarMiembro(model);
        jScrollPane1.setViewportView(jTableMembers);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMembers = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableConsulta = new javax.swing.JTable();
        jButtonInformation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTableMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTableMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMembersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMembers);

        jTableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Cargo", "Correo", "Proyecto", "Telefono", "Cedula"
            }
        ));
        jTableConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableConsulta);

        jButtonInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/information.png"))); // NOI18N
        jButtonInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformationActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Información del Miembro consultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMembersMouseClicked
        int row = jTableMembers.rowAtPoint(evt.getPoint());
        DefaultTableModel asd = (DefaultTableModel) jTableMembers.getModel();
        String dato=String.valueOf(asd.getValueAt(jTableMembers.getSelectedRow(), 0));
        select = dato;

        modificar();
    }//GEN-LAST:event_jTableMembersMouseClicked

    private void modificar(){
        DefaultTableModel model;
        model = new DefaultTableModel();
        jTableConsulta.setModel(model);
        model.addColumn("Codigo");
        model.addColumn("Nombre_usuario");
        model.addColumn("Apellido");
        model.addColumn("Cargo");
        model.addColumn("Correo");
        model.addColumn("Proyecto");
        //model.addColumn("Contraseña");
        //model.addColumn("Respuesta");
        model.addColumn("Telefono");
        model.addColumn("Cedula");

        //jTableEquipment.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableConsulta.getTableHeader().setReorderingAllowed(false);

        DaoUser userDao = new DaoUser();
        userDao.consultarMiembro2(model, select);
        jScrollPane3.setViewportView(jTableConsulta);
    }
    
    private void jTableConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaMouseClicked
       DefaultTableModel tabla = (DefaultTableModel) jTableConsulta.getModel();
       String dato=String.valueOf(tabla.getValueAt(jTableConsulta.getSelectedRow(), 0));
       int code = Integer.parseInt(dato);
       if(position.equals("Director de laboratorio")){
       JFrame edit = new JFrame();
       edit.setVisible(true);
       edit.setSize(700, 500);

       EditProfile editProfile = new EditProfile(code, position);
       editProfile.setBounds(0, 0, 615, 450);
       
       edit.getContentPane().add(editProfile,null);
       }
      
    }//GEN-LAST:event_jTableConsultaMouseClicked

    private void jButtonInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInformationActionPerformed
        JOptionPane.showMessageDialog(null, "Para consultar un miembro simplemente seleccione uno de la tabla de arriba.\n"
        +"Si desea modificar algun miembro seleccionarlo en la segunda tabla");
    }//GEN-LAST:event_jButtonInformationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInformation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableConsulta;
    private javax.swing.JTable jTableMembers;
    // End of variables declaration//GEN-END:variables
}
