/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatdesdecero;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author david.salas
 */
public class ChatGUI extends javax.swing.JFrame {

    private DefaultListModel<Contact> modeloContactos = new DefaultListModel();
    
    /**
     * Creates new form ChatGUI
     */
    public ChatGUI() {
        initComponents();
        listContactos.setModel(modeloContactos);
    }

    public JTextArea getTextAreaIncommingMsg() {
        return textAreaIncommingMsg;
    }

    public void setLabelClientAddress(JLabel labelClientAddress) {
        this.labelClientAddress = labelClientAddress;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHost = new javax.swing.JLabel();
        labelPort = new javax.swing.JLabel();
        textFieldPort = new javax.swing.JTextField();
        textFieldHost = new javax.swing.JTextField();
        buttonAddContact = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listContactos = new javax.swing.JList<>();
        labelSendMessage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaSendMessage = new javax.swing.JTextArea();
        labelStatus = new javax.swing.JLabel();
        labelContactList = new javax.swing.JLabel();
        buttonSend = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonSendFile = new javax.swing.JButton();
        labelIncommingMessages = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaIncommingMsg = new javax.swing.JTextArea();
        labelClientAddress = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelHost.setText("host");

        labelPort.setText("port");

        buttonAddContact.setText("Añadir contacto");
        buttonAddContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddContactActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listContactos);

        labelSendMessage.setText("text");

        textAreaSendMessage.setColumns(20);
        textAreaSendMessage.setRows(30);
        jScrollPane2.setViewportView(textAreaSendMessage);

        labelContactList.setText("Lista de contactos");

        buttonSend.setText("Send");
        buttonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSendActionPerformed(evt);
            }
        });

        buttonClear.setText("Clear");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        buttonSendFile.setText("Send File");
        buttonSendFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSendFileActionPerformed(evt);
            }
        });

        labelIncommingMessages.setText("Incomming messages");

        textAreaIncommingMsg.setColumns(20);
        textAreaIncommingMsg.setRows(5);
        jScrollPane3.setViewportView(textAreaIncommingMsg);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelHost)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldHost, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(buttonAddContact)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelPort)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelContactList)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSendMessage)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelIncommingMessages)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonSend)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonSendFile)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonClear)
                                        .addGap(36, 36, 36)
                                        .addComponent(labelStatus))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelClientAddress))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelClientAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelHost)
                            .addComponent(textFieldHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPort))
                        .addGap(18, 18, 18)
                        .addComponent(buttonAddContact)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelContactList))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelSendMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(labelStatus))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSend)
                            .addComponent(buttonSendFile)
                            .addComponent(buttonClear))
                        .addGap(38, 38, 38)
                        .addComponent(labelIncommingMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddContactActionPerformed
        try {
            Contact contact = new Contact();
            contact.setInetAddress(InetAddress.getByName(textFieldHost.getText()));
            contact.setPort(Integer.parseInt(textFieldPort.getText()));
            modeloContactos.addElement(contact);
        } catch (UnknownHostException ex) {
            Logger.getLogger(ChatGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonAddContactActionPerformed

    private void buttonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSendActionPerformed
        Contact contact = (Contact) listContactos.getSelectedValue();
        
        if (contact != null) {
            MessageSender messageSender = new MessageSender(contact, labelStatus, textAreaSendMessage.getText());
            messageSender.start();
        } else {
            labelStatus.setText("Seleccione un contacto!");
        }
    }//GEN-LAST:event_buttonSendActionPerformed

    private void buttonSendFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSendFileActionPerformed
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(this);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            Contact contact = (Contact) listContactos.getSelectedValue();
            if (contact != null) {
                FileSender filesender = new FileSender(contact, labelStatus, file);
                filesender.start();
            }
        }
    }//GEN-LAST:event_buttonSendFileActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        textAreaIncommingMsg.setText("");
        labelStatus.setForeground(new java.awt.Color(102, 255, 51));
        labelStatus.setText("Envie un mensaje ...");
    }//GEN-LAST:event_buttonClearActionPerformed

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
            java.util.logging.Logger.getLogger(ChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddContact;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonSend;
    private javax.swing.JButton buttonSendFile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelClientAddress;
    private javax.swing.JLabel labelContactList;
    private javax.swing.JLabel labelHost;
    private javax.swing.JLabel labelIncommingMessages;
    private javax.swing.JLabel labelPort;
    private javax.swing.JLabel labelSendMessage;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JList<Contact> listContactos;
    private javax.swing.JTextArea textAreaIncommingMsg;
    private javax.swing.JTextArea textAreaSendMessage;
    private javax.swing.JTextField textFieldHost;
    private javax.swing.JTextField textFieldPort;
    // End of variables declaration//GEN-END:variables
}
