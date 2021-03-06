package Form;

import Control.ControlProyect;
import Control.Validation;
import Database_access.DaoProyect;
import Logic.Proyect;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditProyect extends javax.swing.JPanel {
    ControlProyect control = new ControlProyect();
    Validation validation = new Validation();
    DaoProyect proyectDao = new DaoProyect();
    Proyect proyect = new Proyect();
    private int numero;
    private String nombre;

    public EditProyect() {
        initComponents();
        DefaultTableModel model;
        model = new DefaultTableModel();
        jTableEquipment.setModel(model);
        jTableEquipment.setModel(model);
        model.addColumn("Codigo");
        model.addColumn("Nombre proyecto");
        jTableEquipment.getTableHeader().setReorderingAllowed(false);
        proyectDao.consultarProyecto(model);
        jScrollPane2.setViewportView(jTableEquipment);
    }
    
     private void Fields(){
        textName.setText(proyect.getName());
        textCode.setText(Integer.toString(proyect.getId()));
        textCode.setEnabled(false);
        textCodeDirector.setText(Integer.toString(proyect.getDirectorCode()));
        textDescription.setText(proyect.getDescription());
         for(int i=0;i<State.getItemCount();i++){
           if(State.getItemAt(i).equals(proyect.getState())){
                State.setSelectedIndex(i);
            }
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Add = new javax.swing.JButton();
        State = new javax.swing.JComboBox<>();
        textName = new javax.swing.JTextField();
        textCode = new javax.swing.JTextField();
        textCodeDirector = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEquipment = new javax.swing.JTable();
        name = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        name6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescription = new javax.swing.JTextArea();

        Add.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Add.setText("Aceptar");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        State.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        State.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateActionPerformed(evt);
            }
        });

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

        textCode.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                textCodeComponentAdded(evt);
            }
        });
        textCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodeActionPerformed(evt);
            }
        });
        textCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCodeKeyTyped(evt);
            }
        });

        textCodeDirector.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                textCodeDirectorComponentAdded(evt);
            }
        });
        textCodeDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodeDirectorActionPerformed(evt);
            }
        });
        textCodeDirector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCodeDirectorKeyTyped(evt);
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

        name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name.setText("Nombres:");

        name1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name1.setText("Codigo Proyecto");

        name2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name2.setText("Codigo Director");

        name4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name4.setText("Estado:");

        name6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name6.setText("Descripcion: ");

        textDescription.setColumns(20);
        textDescription.setRows(5);
        jScrollPane1.setViewportView(textDescription);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(State, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(textCodeDirector))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(textCode))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name)
                            .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name1)
                            .addComponent(textCode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name2)
                            .addComponent(textCodeDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name4)
                            .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(name6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        String name,descripcion,state,liststate;
        int code,codeD;

        if(!textName.getText().equals("")||textDescription.getText().equals("")
            ||!textCodeDirector.getText().equals("")){
            name = textName.getText();
            descripcion = textDescription.getText();
            state = State.getSelectedItem().toString();
            code = Integer.parseInt(textCode.getText());
            codeD= Integer.parseInt(textCodeDirector.getText());

            int numFilas = control.editproyect(name,descripcion,state,code,codeD,numero,nombre);

            System.out.println("Filas " + numFilas);
            if (numFilas>0) {

                JOptionPane.showMessageDialog(null, "Proyecto editado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un problema al editar el proyecto");
            }
        }else{
            textName.setText(proyect.getName());
            textCode.setText(Integer.toString(proyect.getId()));
            textCodeDirector.setText(Integer.toString(proyect.getDirectorCode()));
            textDescription.setText(proyect.getDescription());
            for(int i=0;i<State.getItemCount();i++){
                if(State.getItemAt(i).equals(proyect.getState())){
                    State.setSelectedIndex(i);
                }
            }
        }
    }//GEN-LAST:event_AddActionPerformed

    private void StateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateActionPerformed

    }//GEN-LAST:event_StateActionPerformed

    private void textNameComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_textNameComponentAdded

    }//GEN-LAST:event_textNameComponentAdded

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed

    }//GEN-LAST:event_textNameActionPerformed

    private void textNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNameKeyTyped

        if(validation.IsString(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textNameKeyTyped

    private void textCodeComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_textCodeComponentAdded

    }//GEN-LAST:event_textCodeComponentAdded

    private void textCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodeActionPerformed

    }//GEN-LAST:event_textCodeActionPerformed

    private void textCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCodeKeyTyped
        if(validation.IsInteger(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textCodeKeyTyped

    private void textCodeDirectorComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_textCodeDirectorComponentAdded

    }//GEN-LAST:event_textCodeDirectorComponentAdded

    private void textCodeDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodeDirectorActionPerformed

    }//GEN-LAST:event_textCodeDirectorActionPerformed

    private void textCodeDirectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCodeDirectorKeyTyped
        if(validation.IsInteger(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textCodeDirectorKeyTyped

    private void jTableEquipmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEquipmentMouseClicked

    }//GEN-LAST:event_jTableEquipmentMouseClicked

    private void jTableEquipmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEquipmentMousePressed
        int row = jTableEquipment.rowAtPoint(evt.getPoint());
        DefaultTableModel tablaequipment = (DefaultTableModel) jTableEquipment.getModel();
        String number=String.valueOf(tablaequipment.getValueAt(jTableEquipment.getSelectedRow(), 0));
        String name=String.valueOf(tablaequipment.getValueAt(jTableEquipment.getSelectedRow(), 1));
        numero=Integer.parseInt(number);
        nombre=name;

        proyectDao.MostrarDatos(proyect, number, name);
        Fields();
    }//GEN-LAST:event_jTableEquipmentMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JComboBox<String> State;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableEquipment;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name6;
    private javax.swing.JTextField textCode;
    private javax.swing.JTextField textCodeDirector;
    private javax.swing.JTextArea textDescription;
    private javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables
}
