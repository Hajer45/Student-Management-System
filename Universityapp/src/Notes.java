
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ABOURA
 */
public class Notes extends javax.swing.JFrame {

    /**
     * Creates new form Notes
     */
    public Notes() {
        initComponents();
        table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        saisirBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        noteField = new javax.swing.JTextField();
        matiereField = new javax.swing.JTextField();
        etudiantField = new javax.swing.JTextField();
        homeBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Note :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Id Matiére :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Id Etudiant :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        saisirBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        saisirBtn.setForeground(new java.awt.Color(0, 102, 204));
        saisirBtn.setText("Saisir");
        saisirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saisirBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saisirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 110, 50));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "note", "matiere", "etudiant"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 330, 260));

        noteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteFieldActionPerformed(evt);
            }
        });
        getContentPane().add(noteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 100, -1));

        matiereField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matiereFieldActionPerformed(evt);
            }
        });
        getContentPane().add(matiereField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 100, -1));

        etudiantField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etudiantFieldActionPerformed(evt);
            }
        });
        getContentPane().add(etudiantField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, -1));

        homeBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(0, 102, 204));
        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, 50));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        Connection con2;
    PreparedStatement insert;
    private void table(){
        int c;
        try{
            Connect c1 = new Connect();
            con2 = c1.getConnection();
            insert = con2.prepareStatement("select * from note");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            c = rss.getColumnCount();
            DefaultTableModel Df= (DefaultTableModel)Table.getModel();
            Df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a=1;a<=c;a++){
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("note"));
                    v2.add(rs.getString("idMat"));
                    v2.add(rs.getString("idEt"));


                }
                Df.addRow(v2);
            }
           
            
        }catch(Exception e) {
            System.err.println(e);
        }
    }
    
    private void noteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noteFieldActionPerformed

    private void matiereFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matiereFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matiereFieldActionPerformed

    private void etudiantFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etudiantFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etudiantFieldActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
         dispose();
            Home h = new Home();
            h.show();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void saisirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saisirBtnActionPerformed
        // TODO add your handling code here:
        String note = noteField.getText();
         String matiere = matiereField.getText();
         String etudiant = etudiantField.getText();

        try{
        Connect c = new Connect();
        con2 = c.getConnection();
        insert = con2.prepareStatement("insert into note(note,idMat,idEt)values(?,?,?)");
        insert.setString(1, note);
        insert.setString(2, matiere);
        insert.setString(3, etudiant);
        insert.executeUpdate();
        JOptionPane.showMessageDialog(this, "note ajoutée");
        noteField.setText("");
        matiereField.setText("");
        etudiantField.setText("");
        noteField.requestFocus();
        table();
        
    }catch(Exception e){
        System.err.println(e);
    }
    }//GEN-LAST:event_saisirBtnActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
           DefaultTableModel Df= (DefaultTableModel)Table.getModel();
            int selectedIndex = Table.getSelectedRow();
            noteField.setText(Df.getValueAt(selectedIndex, 1).toString());
            matiereField.setText(Df.getValueAt(selectedIndex, 2).toString());
            etudiantField.setText(Df.getValueAt(selectedIndex, 3).toString());
    }//GEN-LAST:event_TableMouseClicked

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
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JTextField etudiantField;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField matiereField;
    private javax.swing.JTextField noteField;
    private javax.swing.JButton saisirBtn;
    // End of variables declaration//GEN-END:variables
}
