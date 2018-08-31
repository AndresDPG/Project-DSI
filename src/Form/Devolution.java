package Form;


import Control.ControlEquipment;
import Control.ControlLoan;
import Database_access.DaoEquipment;
import Database_access.DaoLoan;
import Logic.Equipment;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Devolution extends javax.swing.JPanel {
    DaoLoan loanDao = new DaoLoan();
    DaoLoan reservationDao = new DaoLoan();
    DefaultTableModel model;
    DefaultTableModel tablaequipment;

    public Devolution(String Profile,int code) {
        initComponents();
        
        model = new DefaultTableModel();
       
        model.addColumn("Codigo_usuario");
        model.addColumn("Nombre_usuario");
        model.addColumn("Numero_equipo");
        model.addColumn("Nombre_equipo");
        model.addColumn("Fecha_prestamo");
        model.addColumn("Fecha_devolucion");
        
       
        deshability(Profile,code);
       
    }
    private void deshability(String Profile,int code){
        if(!Profile.equals("Coordinador de Equipos")){
           Busqueda.setEnabled(false);
           Busqueda.setText(Integer.toString(code));
           String text = Busqueda.getText();
           loanDao.MostrarDatos(model,text);
           jTableEquipment.getTableHeader().setReorderingAllowed(false);
           jTableEquipment.setModel(model);
           jScrollPane1.setViewportView(jTableEquipment);
        }else{
            reservationDao.consultarPrestamo2(model); 
            jTableEquipment.getTableHeader().setReorderingAllowed(false);
            jTableEquipment.setModel(model);
            jScrollPane1.setViewportView(jTableEquipment);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });
        Busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusquedaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableEquipmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEquipmentMouseClicked
        
        Equipment equipment = new Equipment();
        DaoEquipment equipmentDao = new DaoEquipment();
        ControlLoan controlloan = new ControlLoan();
        ControlEquipment controlequipment = new ControlEquipment();
        tablaequipment = (DefaultTableModel) jTableEquipment.getModel();
        String numero=String.valueOf(tablaequipment.getValueAt(jTableEquipment.getSelectedRow(), 2));
        String nombre=String.valueOf(tablaequipment.getValueAt(jTableEquipment.getSelectedRow(), 3));
        equipment = equipmentDao.MostrarDatos(equipment, numero, nombre);
        int opcion = JOptionPane.showConfirmDialog(this, "Desea devolver el equipo", TOOL_TIP_TEXT_KEY, WIDTH);
        if(opcion==0){
            if(equipment.getState().equals("Prestado")){
                 controlloan.eliminar_limite(Integer.parseInt(numero));
                 controlequipment.modificar_Estado("Disponible",Integer.parseInt(numero));
                 controlloan.ModificarEstado("Disponible", Integer.parseInt(numero));
            }else{
                controlloan.ModificarEstado("Disponible", Integer.parseInt(numero));
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

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Busqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEquipment;
    // End of variables declaration//GEN-END:variables
}
