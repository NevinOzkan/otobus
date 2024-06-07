
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BiletBul extends javax.swing.JFrame {
private JComboBox kalkis;
	private JComboBox varis;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
        
    public BiletBul() {
        initComponents();
        setTitle("Otobus Uygulamasi");
		
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sys_nereden = new javax.swing.JTextField();
        sys_nereye = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sys_bugün = new javax.swing.JCheckBox();
        sys_yarın = new javax.swing.JCheckBox();
        sys_biletbul = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NEREDEN");

        jLabel2.setText("NEREYE");

        sys_nereden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_neredenActionPerformed(evt);
            }
        });

        sys_nereye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_nereyeActionPerformed(evt);
            }
        });

        jLabel3.setText("NE ZAMAN");

        sys_bugün.setText("BUGÜN");
        sys_bugün.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_bugünActionPerformed(evt);
            }
        });

        sys_yarın.setText("YARIN");
        sys_yarın.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_yarınActionPerformed(evt);
            }
        });

        sys_biletbul.setText("OTOBÜS BİLETİ BUL");
        sys_biletbul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_biletbulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(sys_bugün, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(sys_yarın, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sys_nereye, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(sys_nereden)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(sys_biletbul)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sys_nereden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sys_nereye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sys_bugün)
                    .addComponent(sys_yarın))
                .addGap(39, 39, 39)
                .addComponent(sys_biletbul)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sys_neredenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_neredenActionPerformed
       JLabel text1 = new JLabel("sys_nereden");
		text1.setBounds(55, 65, 56, 16);
		text1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(text1);
    }//GEN-LAST:event_sys_neredenActionPerformed

    private void sys_nereyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_nereyeActionPerformed
       JLabel text2 = new JLabel("sys_nereye");
		text2.setBounds(55, 95, 56, 28);
		text2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(text2);
    }//GEN-LAST:event_sys_nereyeActionPerformed

    private void sys_bugünActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_bugünActionPerformed
       JCheckBox bugun = new JCheckBox("sys_bugün");
		bugun.setBounds(133, 133, 63, 21);
		buttonGroup.add(bugun);
		bugun.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(bugun);
    }//GEN-LAST:event_sys_bugünActionPerformed

    private void sys_yarınActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_yarınActionPerformed
        JCheckBox yarin = new JCheckBox("sys_yarın");
		yarin.setBounds(198, 133, 63, 21);
		buttonGroup.add(yarin);
		yarin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(yarin);
    }//GEN-LAST:event_sys_yarınActionPerformed

    private void sys_biletbulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_biletbulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sys_biletbulActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new BiletBul().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton sys_biletbul;
    private javax.swing.JCheckBox sys_bugün;
    private javax.swing.JTextField sys_nereden;
    private javax.swing.JTextField sys_nereye;
    private javax.swing.JCheckBox sys_yarın;
    // End of variables declaration//GEN-END:variables
}
