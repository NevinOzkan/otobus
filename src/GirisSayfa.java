
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class GirisSayfa extends javax.swing.JFrame {
    
    private JPanel contentPane;	
	private JTextField txtEmail;
	private JPasswordField pswSifre;
	static String eMail;
	static String sifre;
	static String cepTelefonu;
         private boolean girisYapildi = false; // Bayrak değişkeni

    public GirisSayfa() {
        initComponents();
        
        sys_email = new javax.swing.JTextField();
        JButton btnGirisYap = new JButton("Giriş Yap");
		btnGirisYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            bul();
                            //hide();
			}
                        
            private void bul() {
                String sys_parola = "656565";
                char[] parola_al = sys_sifre.getPassword();
                String parola_calıstır = String.copyValueOf(parola_al);
                if (parola_calıstır.equals(sys_parola)) {
                    String entry_message = "Giriş başarılı";
                    if (!girisYapildi) { // Eğer giriş daha önce yapılmadıysa
                        JOptionPane.showMessageDialog(rootPane, entry_message);
                        girisYapildi = true; // Bayrağı true olarak ayarla
                        dispose(); // Pencereyi kapat
                        BiletBul biletBul = new BiletBul();
                        biletBul.setVisible(true);
                    }
                } else {
                    String error_message = "Giriş hatası";
                    JOptionPane.showMessageDialog(rootPane, error_message);
                }
            }
        });
    }

                
 

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sys_email = new javax.swing.JTextField();
        sys_sifre = new javax.swing.JPasswordField();
        sys_girisyap = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sys_üyeol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("EMAİL");

        jLabel2.setText("ŞİFRE");

        sys_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_emailActionPerformed(evt);
            }
        });

        sys_sifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_sifreActionPerformed(evt);
            }
        });

        sys_girisyap.setText("Giriş Yap");
        sys_girisyap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_girisyapActionPerformed(evt);
            }
        });

        jLabel3.setText("ÜYE DEĞİL MİSİNİZ?");

        sys_üyeol.setText("ÜYE OL");
        sys_üyeol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_üyeolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sys_email, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sys_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(sys_girisyap)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(sys_üyeol)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sys_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sys_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addComponent(sys_girisyap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sys_üyeol)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sys_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_emailActionPerformed
       
    }//GEN-LAST:event_sys_emailActionPerformed

    private void sys_sifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_sifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sys_sifreActionPerformed

    private void sys_üyeolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_üyeolActionPerformed
        UyeOl üyeOl = new UyeOl();
        üyeOl.setVisible(true);
    }//GEN-LAST:event_sys_üyeolActionPerformed

    private void sys_girisyapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_girisyapActionPerformed
       String sys_parola = "656565";
        char[] parola_al = sys_sifre.getPassword();
        String parola_calıstır = String.copyValueOf(parola_al);
        if (parola_calıstır.equals(sys_parola)) {
            String entry_message = "Giriş başarılı";
            if (!girisYapildi) { // Eğer giriş daha önce yapılmadıysa
                JOptionPane.showMessageDialog(rootPane, entry_message);
                girisYapildi = true; // Bayrağı true olarak ayarla
                dispose(); // Pencereyi kapat
                BiletBul biletBul = new BiletBul();
                biletBul.setVisible(true);
            }
        } else {
            String error_message = "Giriş hatası";
            JOptionPane.showMessageDialog(rootPane, error_message);
        }    
    }//GEN-LAST:event_sys_girisyapActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisSayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField sys_email;
    private javax.swing.JButton sys_girisyap;
    private javax.swing.JPasswordField sys_sifre;
    private javax.swing.JButton sys_üyeol;
    // End of variables declaration//GEN-END:variables
}
