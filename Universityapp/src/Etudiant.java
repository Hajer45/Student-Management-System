
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
 * @author 21654
 */
public class Etudiant extends javax.swing.JFrame {

    /**
     * Creates new form Etudiant
     */
    public Etudiant() {
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

        nomField = new javax.swing.JTextField();
        prenomField = new javax.swing.JTextField();
        filiereField = new javax.swing.JTextField();
        ajouterBtn = new javax.swing.JButton();
        supprimerBtn = new javax.swing.JButton();
        modifierBtn = new javax.swing.JButton();
        notesBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        homeBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nomField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 120, -1));

        prenomField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomFieldActionPerformed(evt);
            }
        });
        getContentPane().add(prenomField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 120, -1));
        getContentPane().add(filiereField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 120, -1));

        ajouterBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        ajouterBtn.setForeground(new java.awt.Color(0, 153, 204));
        ajouterBtn.setText("Ajouter ");
        ajouterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ajouterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, 49));

        supprimerBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        supprimerBtn.setForeground(new java.awt.Color(0, 153, 204));
        supprimerBtn.setText("Supprimer ");
        supprimerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(supprimerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 150, 50));

        modifierBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        modifierBtn.setForeground(new java.awt.Color(0, 153, 204));
        modifierBtn.setText("Modifier");
        modifierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierBtnActionPerformed(evt);
            }
        });
        getContentPane().add(modifierBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 130, 50));

        notesBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        notesBtn.setForeground(new java.awt.Color(0, 153, 255));
        notesBtn.setText("Notes");
        notesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notesBtnActionPerformed(evt);
            }
        });
        getContentPane().add(notesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 110, 47));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nom :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Prénom :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Id Filiére :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "nom", "prenom", "filiére"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 20, 300, 250));

        homeBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(0, 153, 204));
        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 120, 50));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection con2;
    PreparedStatement insert;
    private void table(){
        int c;
        try{
            Connect c1 = new Connect();
            con2 = c1.getConnection();
            insert = con2.prepareStatement("select * from etudiant");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            c = rss.getColumnCount();
            DefaultTableModel Df= (DefaultTableModel)Table.getModel();
            Df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a=1;a<=c;a++){
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("nom"));
                    v2.add(rs.getString("prenom"));
                    v2.add(rs.getString("idFil"));


                }
                Df.addRow(v2);
            }
           
            
        }catch(Exception e) {
            System.err.println(e);
        }
    }
    private void nomFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomFieldActionPerformed

    private void ajouterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterBtnActionPerformed
        // TODO add your handling code here:
          String name = nomField.getText();
         String prenom = prenomField.getText();
         String filiere = filiereField.getText();

        try{
        Connect c = new Connect();
        con2 = c.getConnection();
        insert = con2.prepareStatement("insert into etudiant(nom,prenom,idfil)values(?,?,?)");
        insert.setString(1, name);
        insert.setString(2, prenom);
        insert.setString(3, filiere);
        insert.executeUpdate();
        JOptionPane.showMessageDialog(this, "Etudiant ajoutée");
        nomField.setText("");
        prenomField.setText("");
        filiereField.setText("");
        nomField.requestFocus();
        table();
        
    }catch(Exception e){
        System.err.println(e);
    }
    }//GEN-LAST:event_ajouterBtnActionPerformed

    private void prenomFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomFieldActionPerformed

    private void modifierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierBtnActionPerformed
        // TODO add your handling code here:
         DefaultTableModel Df= (DefaultTableModel)Table.getModel();
        int selectedIndex = Table.getSelectedRow();
        
        try{
            int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            String name = nomField.getText();
            String prenom = prenomField.getText();
            int idFil = Integer.parseInt(filiereField.getText()); 
            Connect c = new Connect();
            con2 = c.getConnection();
            insert = con2.prepareStatement("update etudiant set nom=? ,prenom=?,idFil= ? where id =?");
            insert.setString(1, name);
            insert.setString(2, prenom);
            insert.setInt(3, idFil);
            insert.setInt(4, id);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Etudiant modifiée");
        nomField.setText("");
        prenomField.setText("");
        filiereField.setText("");
        nomField.requestFocus();
        table();
        
    }catch(Exception e){
        System.err.println(e);
    }
    }//GEN-LAST:event_modifierBtnActionPerformed

    private void supprimerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Df= (DefaultTableModel)Table.getModel();
        int selectedIndex = Table.getSelectedRow();
        
        try{
            int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            int dialogResult = JOptionPane.showConfirmDialog(null,"voulez vous supprimer cet etudiant","warning",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
                Connect c = new Connect();
                con2 = c.getConnection();
                insert = con2.prepareStatement("delete from etudiant where id =?");
                insert.setInt(1, id);
                insert.executeUpdate();
                JOptionPane.showMessageDialog(this, "Etudiant suprimée");
                nomField.setText("");
                prenomField.setText("");
                filiereField.setText("");
                nomField.requestFocus();
                table();
            }
            
            
            
        
    }catch(Exception e){
        System.err.println(e);
    }
        
    }//GEN-LAST:event_supprimerBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        dispose();
            Home h = new Home();
            h.show();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void notesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notesBtnActionPerformed
        // TODO add your handling code here:
        dispose();
           Notes n = new Notes();
            n.show();
    }//GEN-LAST:event_notesBtnActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
         DefaultTableModel Df= (DefaultTableModel)Table.getModel();
            int selectedIndex = Table.getSelectedRow();
            nomField.setText(Df.getValueAt(selectedIndex, 1).toString());
            prenomField.setText(Df.getValueAt(selectedIndex, 2).toString());
            filiereField.setText(Df.getValueAt(selectedIndex, 3).toString());
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
            java.util.logging.Logger.getLogger(Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Etudiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton ajouterBtn;
    private javax.swing.JTextField filiereField;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifierBtn;
    private javax.swing.JTextField nomField;
    private javax.swing.JButton notesBtn;
    private javax.swing.JTextField prenomField;
    private javax.swing.JButton supprimerBtn;
    // End of variables declaration//GEN-END:variables
}
