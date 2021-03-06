package Form;

import Database_access.DaoProyect;
import javax.swing.table.DefaultTableModel;

public class ListMemberxProyect extends javax.swing.JPanel {

    private int code;

    public ListMemberxProyect(int code) {
        initComponents();
        this.code=code;
        DefaultTableModel model;
        model = new DefaultTableModel();
        jTableMembers.setModel(model);
        model.addColumn("codigo");
        model.addColumn("nombre");

        jTableMembers.getTableHeader().setReorderingAllowed(false);

        DaoProyect proyectDao = new DaoProyect();
        proyectDao.consultarMiembroProyecto(model,code);
        jScrollPane1.setViewportView(jTableMembers);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMembers = new javax.swing.JTable();

        jTableMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTableMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMembersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMembers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMembersMouseClicked
       
    }//GEN-LAST:event_jTableMembersMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMembers;
    // End of variables declaration//GEN-END:variables
}
