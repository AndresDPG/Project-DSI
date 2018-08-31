package Form;

import Control.ControlProyect;
import Control.Validation;
import javax.swing.JOptionPane;

public class ProyectForm extends javax.swing.JPanel {

    ControlProyect control = new ControlProyect();
    Validation validation;
    
    public ProyectForm() {
        validation = new Validation();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameProyect = new javax.swing.JLabel();
        textNameProyect = new javax.swing.JTextField();
        codeDirector = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        textCodeDirector = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescription = new javax.swing.JTextArea();
        addProyect = new javax.swing.JButton();

        nameProyect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameProyect.setText("Nombre del proyecto:");

        textNameProyect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameProyectActionPerformed(evt);
            }
        });

        codeDirector.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codeDirector.setText("Codigo del director:");

        description.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        description.setText("Descripcion:");

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

        textDescription.setColumns(20);
        textDescription.setRows(5);
        jScrollPane1.setViewportView(textDescription);

        addProyect.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addProyect.setText("Agregar");
        addProyect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProyectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(description)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameProyect)
                                    .addComponent(codeDirector))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textNameProyect)
                                    .addComponent(textCodeDirector))))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameProyect)
                    .addComponent(textNameProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codeDirector)
                    .addComponent(textCodeDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(description)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addProyect, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textNameProyectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameProyectActionPerformed
    
    }//GEN-LAST:event_textNameProyectActionPerformed

    private void textCodeDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodeDirectorActionPerformed
    
    }//GEN-LAST:event_textCodeDirectorActionPerformed

    private void addProyectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProyectActionPerformed
  
        String proyectName, description;
        int codigo;

        if(textCodeDirector.getText().equals("")||textNameProyect.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
        }else{
            codigo = Integer.parseInt(textCodeDirector.getText());
            proyectName = textNameProyect.getText();
            description = textDescription.getText();
        
            int numFilas = control.insertarProyecto(proyectName, description, codigo);

            System.out.println("Filas " + numFilas);
            if (numFilas == 1) {

               JOptionPane.showMessageDialog(null, "Proyecto guardado exitosamente");
            } else {
               JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el Proyecto");
            }
        }
    }//GEN-LAST:event_addProyectActionPerformed

    private void textCodeDirectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCodeDirectorKeyTyped
        if(validation.IsInteger(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textCodeDirectorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProyect;
    private javax.swing.JLabel codeDirector;
    private javax.swing.JLabel description;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameProyect;
    private javax.swing.JTextField textCodeDirector;
    private javax.swing.JTextArea textDescription;
    private javax.swing.JTextField textNameProyect;
    // End of variables declaration//GEN-END:variables
}
