/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Frame5 extends javax.swing.JFrame {

    /**
     * Creates new form Frame5
     */
    public Frame5() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hb1 = new javax.swing.JTextField();
        hb2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hb3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Diskon = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pembayaran");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 0, 90, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Harga Barang 1");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 40, 110, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga Barang 2");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 80, 110, 30);
        jPanel1.add(hb1);
        hb1.setBounds(150, 40, 160, 30);
        jPanel1.add(hb2);
        hb2.setBounds(150, 80, 160, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Harga Barang 3");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 120, 110, 30);
        jPanel1.add(hb3);
        hb3.setBounds(150, 120, 160, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Diskon");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 160, 110, 30);
        jPanel1.add(Diskon);
        Diskon.setBounds(150, 160, 160, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 210, 80, 30);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(100, 250, 270, 150);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 470, 410);

        setBounds(0, 0, 482, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int barang1 = Integer.parseInt(hb1.getText());
        int barang2 = Integer.parseInt(hb2.getText());
        int barang3 = Integer.parseInt(hb3.getText());
        int diskon = Integer.parseInt(Diskon.getText());
        double Totalharga = (barang1+barang2+barang3);
        double Totalbayar = ((barang1+barang2+barang3)-(barang1+barang2+barang3)*diskon/100);
         
                
        TA.setText("Harga Barang 1"+barang1+"\nHarga barang 2"+barang2+"\nHarga barang 3"+barang3+"\nDiskon"+diskon+"\nTotal Harga"+Totalharga+"\nTotal Bayar"+Totalbayar);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Diskon;
    private javax.swing.JTextArea TA;
    private javax.swing.JTextField hb1;
    private javax.swing.JTextField hb2;
    private javax.swing.JTextField hb3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
