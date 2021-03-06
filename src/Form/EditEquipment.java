package Form;

import Control.ControlEquipment;
import Control.ControlLoan;
import Control.ControlProyect;
import Control.Validation;
import Database_access.DaoEquipment;
import Database_access.DaoProyect;
import Logic.Equipment;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditEquipment extends javax.swing.JPanel {
    ControlEquipment control = new ControlEquipment();
    ControlProyect controlproyect = new ControlProyect();
    ControlLoan controlloal = new ControlLoan();
    Validation validation = new Validation();
    DaoProyect proyectDao = new DaoProyect();
    Equipment equipment = new Equipment();
    DaoEquipment equipmentDao = new DaoEquipment();
    private int numero;
    private String nombre;

    public EditEquipment() {
        initComponents();
        DefaultTableModel model;
        model = new DefaultTableModel();
        jTableEquipment.setModel(model);
        jTableEquipment.setModel(model);
        model.addColumn("Numero_equipo");
        model.addColumn("Nombre_equipo");
        jTableEquipment.getTableHeader().setReorderingAllowed(false);
        equipmentDao.consultarEquipo(model);
        jScrollPane2.setViewportView(jTableEquipment);
    }
    private void Fields(){
        textNameEquipment.setText(equipment.getEquipmentName());
        textNumberEquipment.setText(Integer.toString(equipment.getNumeroEquipo()));
        textSerial.setText(Integer.toString(equipment.getMake()));
        textDescription.setText(equipment.getDescription());
         for(int i=0;i<State.getItemCount();i++){
           if(State.getItemAt(i).equals(equipment.getStateequipment())){
                State.setSelectedIndex(i);
            }
        }
       for(int i=0;i<listState.getItemCount();i++){
            if(listState.getItemAt(i).equals(equipment.getState())){
            listState.setSelectedIndex(i);
            }
        }   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textName = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        name6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescription = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        listState = new javax.swing.JComboBox<>();
        State = new javax.swing.JComboBox<>();
        textNameEquipment = new javax.swing.JTextField();
        textNumberEquipment = new javax.swing.JTextField();
        textSerial = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEquipment = new javax.swing.JTable();

        textName.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                textNameComponentAdded(evt);
            }
        });
        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });
        textName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNameKeyTyped(evt);
            }
        });

        name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name.setText("Nombres:");

        name1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name1.setText("Numero de equipo:");

        name2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name2.setText("Serial Univalle:");

        name4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name4.setText("Estado:");

        name5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name5.setText("Estado actual:");

        name6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name6.setText("Descripcion: ");

        textDescription.setColumns(20);
        textDescription.setRows(5);
        jScrollPane1.setViewportView(textDescription);

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        listState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Prestado", "Reservado", "Prestado y en reserva" }));

        State.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        State.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateActionPerformed(evt);
            }
        });

        textNameEquipment.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                textNameEquipmentComponentAdded(evt);
            }
        });
        textNameEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameEquipmentActionPerformed(evt);
            }
        });
        textNameEquipment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNameEquipmentKeyTyped(evt);
            }
        });

        textNumberEquipment.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                textNumberEquipmentComponentAdded(evt);
            }
        });
        textNumberEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumberEquipmentActionPerformed(evt);
            }
        });
        textNumberEquipment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNumberEquipmentKeyTyped(evt);
            }
        });

        textSerial.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                textSerialComponentAdded(evt);
            }
        });
        textSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSerialActionPerformed(evt);
            }
        });
        textSerial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textSerialKeyTyped(evt);
            }
        });

        jTableEquipment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Numero_equipo", "Nombre_equipo"
            }
        ));
        jTableEquipment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEquipmentMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableEquipmentMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTableEquipment);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(name5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                    .addComponent(listState, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(State, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textSerial))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textNumberEquipment))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textNameEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name)
                            .addComponent(textNameEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name1)
                            .addComponent(textNumberEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name2)
                            .addComponent(textSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name4)
                            .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name5)
                            .addComponent(listState, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(name6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void StateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateActionPerformed

    }//GEN-LAST:event_StateActionPerformed

    private void textNameComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_textNameComponentAdded
 
    }//GEN-LAST:event_textNameComponentAdded

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed

    }//GEN-LAST:event_textNameActionPerformed

    private void textNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNameKeyTyped

    }//GEN-LAST:event_textNameKeyTyped

    private void textNameEquipmentComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_textNameEquipmentComponentAdded
      
    }//GEN-LAST:event_textNameEquipmentComponentAdded

    private void textNameEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameEquipmentActionPerformed

    }//GEN-LAST:event_textNameEquipmentActionPerformed

    private void textNameEquipmentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNameEquipmentKeyTyped

        if(validation.IsString(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textNameEquipmentKeyTyped

    private void textNumberEquipmentComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_textNumberEquipmentComponentAdded

    }//GEN-LAST:event_textNumberEquipmentComponentAdded

    private void textNumberEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumberEquipmentActionPerformed
 
    }//GEN-LAST:event_textNumberEquipmentActionPerformed

    private void textNumberEquipmentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNumberEquipmentKeyTyped
        if(validation.IsInteger(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textNumberEquipmentKeyTyped

    private void textSerialComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_textSerialComponentAdded
   
    }//GEN-LAST:event_textSerialComponentAdded

    private void textSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSerialActionPerformed
   
    }//GEN-LAST:event_textSerialActionPerformed

    private void textSerialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSerialKeyTyped
         if(validation.IsInteger(evt)){
            evt.consume();
        }    
    }//GEN-LAST:event_textSerialKeyTyped

    private void stateloan(String state,int code){
        if(state.equals("Disponible")){
            controlloal.ModificarEstado(state, code);
        }
        
    }    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name,descripcion,state,liststate;
        int number,serial;
       
        if(!textNameEquipment.getText().equals("")||!textNumberEquipment.getText().equals("")
                ||!textSerial.getText().equals("")){
                name = textNameEquipment.getText();
                descripcion = textDescription.getText();
                state = State.getSelectedItem().toString();
                liststate = listState.getSelectedItem().toString();
                number = Integer.parseInt(textNumberEquipment.getText());
                stateloan(liststate,number);
                serial = Integer.parseInt(textSerial.getText());
                
                int numFilas = control.editequipment(name,descripcion,state,liststate,number,serial,numero,nombre);

                if (numFilas>0) {

                    JOptionPane.showMessageDialog(null, "Equipo editado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al editar el equipo");
                }
            }else{
                 textNameEquipment.setText(equipment.getEquipmentName());
                 textNumberEquipment.setText(Integer.toString(equipment.getNumeroEquipo()));
                 textSerial.setText(Integer.toString(equipment.getMake()));
                 for(int i=0;i<State.getItemCount();i++){
                    if(State.getItemAt(i).equals(equipment.getState())){
                        State.setSelectedIndex(i);
                    }
                }
                for(int i=0;i<listState.getItemCount();i++){
                    if(listState.getItemAt(i).equals(equipment.getStateequipment())){
                    listState.setSelectedIndex(i);
                    }
                }
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableEquipmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEquipmentMouseClicked
       
        
    }//GEN-LAST:event_jTableEquipmentMouseClicked

    private void jTableEquipmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEquipmentMousePressed
        int row = jTableEquipment.rowAtPoint(evt.getPoint());
        DefaultTableModel tablaequipment = (DefaultTableModel) jTableEquipment.getModel();
        String number=String.valueOf(tablaequipment.getValueAt(jTableEquipment.getSelectedRow(), 0));
        String name=String.valueOf(tablaequipment.getValueAt(jTableEquipment.getSelectedRow(), 1));
        numero=Integer.parseInt(number);
        nombre=name;
        
        equipmentDao.MostrarDatos(equipment, number, name);
        Fields();
    }//GEN-LAST:event_jTableEquipmentMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> State;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableEquipment;
    private javax.swing.JComboBox<String> listState;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JTextArea textDescription;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textNameEquipment;
    private javax.swing.JTextField textNumberEquipment;
    private javax.swing.JTextField textSerial;
    // End of variables declaration//GEN-END:variables
}
