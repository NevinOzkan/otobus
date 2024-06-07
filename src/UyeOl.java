
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class UyeOl extends javax.swing.JFrame {
    private JPanel contentPane;
	private JTextField txtAdSoyad;
	private JTextField txtTcKimlikNo;
	private JTextField txtCepTelefonu;
	private JTextField txtEmail;
	private JPasswordField pswSifre;
	static String eMail;
	static String cepTelefonu;

    DefaultTableModel tablo = new DefaultTableModel();
        
    private static void setColumnIdentifiers(String[] string) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public UyeOl() {
        initComponents();
    sys_üyeol.setModel(tablo);
    tablo.setColumnIdentifiers(new String[]{"AD", "SOYAD", "TELEFONNO", "E-MAİL", "ŞİFRE"});
}

    
   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sys_ad = new javax.swing.JTextField();
        sys_soyad = new javax.swing.JTextField();
        sys_telefonno = new javax.swing.JTextField();
        sys_email = new javax.swing.JTextField();
        sys_şifre = new javax.swing.JPasswordField();
        sys_ekle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sys_üyeol = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AD");

        jLabel2.setText("SOYAD");

        jLabel3.setText("TELEFON NO");

        jLabel4.setText("E-MAİL");

        jLabel5.setText("ŞİFRE");

        sys_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_adActionPerformed(evt);
            }
        });

        sys_soyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_soyadActionPerformed(evt);
            }
        });

        sys_telefonno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_telefonnoActionPerformed(evt);
            }
        });

        sys_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_emailActionPerformed(evt);
            }
        });

        sys_şifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_şifreActionPerformed(evt);
            }
        });

        sys_ekle.setText("EKLE");
        sys_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_ekleActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(sys_üyeol);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(182, 182, 182)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sys_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sys_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sys_telefonno, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sys_email, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sys_şifre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(sys_ekle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(sys_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sys_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sys_telefonno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(sys_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(sys_şifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(sys_ekle)))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  int hak=4;
    private void sys_şifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_şifreActionPerformed
       String sys_parola="656565";
        char[] parola_al=sys_sifre.getPassword();
       String parola_calıstır=String.copyValueOf(parola_al);
        System.out.println("parola_calıstır = " + parola_calıstır);
       if(parola_calıstır.equals(sys_parola))
       {
           String entry_message="giriş başarılı";
           JOptionPane.showMessageDialog(rootPane, entry_message);
           
           
           if (hak>1)
           {
               String error_message="giriş hatası";
               JOptionPane.showMessageDialog(rootPane,error_message);
               hak=-1;
           }
           else
           {
               String finish_mesage="giriş hakkınız bitmiştir";
               Object fnish_message = null;
               JOptionPane.showMessageDialog(rootPane,fnish_message);
               dispose();
           }
           {
               
           }
       } else {
       }
    }//GEN-LAST:event_sys_şifreActionPerformed

    private void sys_telefonnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_telefonnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sys_telefonnoActionPerformed

    private void sys_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sys_adActionPerformed

    private void sys_soyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_soyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sys_soyadActionPerformed

    private void sys_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sys_emailActionPerformed

    private void sys_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_ekleActionPerformed
       String ad = sys_ad.getText();
        String soyad = sys_soyad.getText();
        String telefonno = sys_telefonno.getText();
        String eposta = sys_email.getText();
        String adres = sys_şifre.getText();
        sys_ad.setText("");
        sys_soyad.setText("");
        sys_telefonno.setText("");
        sys_email.setText("");
        sys_şifre.setText("");
        String email = null;
        String şifre = null;
        tablo.addRow(new String[]{ad, soyad, telefonno, email, şifre});

    }//GEN-LAST:event_sys_ekleActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UyeOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(() -> {
            new UyeOl().setVisible(true);
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sys_ad;
    private javax.swing.JButton sys_ekle;
    private javax.swing.JTextField sys_email;
    private javax.swing.JTextField sys_soyad;
    private javax.swing.JTextField sys_telefonno;
    private javax.swing.JTable sys_üyeol;
    private javax.swing.JPasswordField sys_şifre;
    // End of variables declaration//GEN-END:variables
}
