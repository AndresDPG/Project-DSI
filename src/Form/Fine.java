package Form;

import Database_access.DaoFine;
import Database_access.DaoLoan;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Fine extends javax.swing.JPanel {
    DaoFine fineDao = new DaoFine();
    DaoLoan loanDao = new DaoLoan();
    DefaultTableModel model;
    DefaultTableModel tablaequipment;

    public Fine() {
        initComponents();
        model = new DefaultTableModel();
       
        model.addColumn("id");
        model.addColumn("codigo usuario");
        model.addColumn("Nombre");
        model.addColumn("id_prestamo");
        model.addColumn("valor");
        
        fineDao.readFine(model);
        jTableEquipment.getTableHeader().setReorderingAllowed(false);
        jTableEquipment.setModel(model);
        jScrollPane1.setViewportView(jTableEquipment);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEquipment = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Busqueda = new javax.swing.JTextField();

        jTableEquipment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTableEquipment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEquipmentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEquipment);

        jLabel1.setText("Buscar");

        Busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusquedaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableEquipmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEquipmentMouseClicked

        tablaequipment = (DefaultTableModel) jTableEquipment.getModel();
        String numero=String.valueOf(tablaequipment.getValueAt(jTableEquipment.getSelectedRow(), 0));
        String prestamo=String.valueOf(tablaequipment.getValueAt(jTableEquipment.getSelectedRow(), 3));
        int opcion = JOptionPane.showConfirmDialog(this, "Va a pagar la multa", TOOL_TIP_TEXT_KEY, WIDTH);
        if(opcion==0){
            if(loanDao.check_prestamo(Integer.parseInt(prestamo))){
               fineDao.deleteFine(numero); 
               fineDao.updateFine(numero);
            }else{
              JOptionPane.showMessageDialog(null,"Por favor hacer devolucion del equipo primero");
            } 
            
        }
        int row = jTableEquipment.rowAtPoint(evt.getPoint());

    }//GEN-LAST:event_jTableEquipmentMouseClicked

    private void BusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusquedaKeyReleased

        TableRowSorter<DefaultTableModel> tr;

        jTableEquipment.setModel(model);
        tr=new TableRowSorter<>(model);
        jTableEquipment.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(Busqueda.getText()));
    }//GEN-LAST:event_BusquedaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Busqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEquipment;
    // End of variables declaration//GEN-END:variables
}
