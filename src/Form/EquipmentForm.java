package Form;

import Control.ControlEquipment;
import Control.Validation;
import javax.swing.JOptionPane;

public class EquipmentForm extends javax.swing.JPanel {

   ControlEquipment control = new ControlEquipment();
   Validation validation;
    
    public EquipmentForm() {
        setVisible(true);
        validation = new Validation();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textNameEquipment = new javax.swing.JTextField();
        textSerialU = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EquipmentAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescription = new javax.swing.JTextArea();

        jLabel1.setText("Nombre del equipo:");

        textNameEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameEquipmentActionPerformed(evt);
            }
        });

        textSerialU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSerialUActionPerformed(evt);
            }
        });
        textSerialU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textSerialUKeyTyped(evt);
            }
        });

        jLabel2.setText("Serial de Univalle:");

        jLabel3.setText("Descripción:");

        EquipmentAdd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EquipmentAdd.setText("Agregar");
        EquipmentAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipmentAddActionPerformed(evt);
            }
        });

        textDescription.setColumns(20);
        textDescription.setRows(5);
        jScrollPane1.setViewportView(textDescription);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textSerialU, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNameEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(EquipmentAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNameEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSerialU, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 196, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(EquipmentAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textNameEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameEquipmentActionPerformed

    }//GEN-LAST:event_textNameEquipmentActionPerformed

    private void textSerialUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSerialUActionPerformed

    }//GEN-LAST:event_textSerialUActionPerformed

    private void EquipmentAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipmentAddActionPerformed

        int serialUV;
        
        String equipmentName, description;

        if(textSerialU.getText().equals("")||textNameEquipment.getText().equals("")||textDescription.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
        }else{
            serialUV = Integer.parseInt(textSerialU.getText());
            equipmentName = textNameEquipment.getText();
            description = textDescription.getText();
            String estado ="Disponible";

        int numFilas = control.insertarEquipo(equipmentName, serialUV, description, estado);

        System.out.println("Filas " + numFilas);
        if (numFilas == 1) {

            JOptionPane.showMessageDialog(null, "Equipo guardado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el Equipo");
        }
        }
    }//GEN-LAST:event_EquipmentAddActionPerformed

    private void textSerialUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSerialUKeyTyped
        if(validation.IsInteger(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textSerialUKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EquipmentAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textDescription;
    private javax.swing.JTextField textNameEquipment;
    private javax.swing.JTextField textSerialU;
    // End of variables declaration//GEN-END:variables
}
