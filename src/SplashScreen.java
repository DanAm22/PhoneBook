
public class SplashScreen extends javax.swing.JFrame {
    
    //SplashScreen-ul afisat la initierea aplicatiei
    public SplashScreen() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplashPanel = new javax.swing.JPanel();
        lblPoza = new javax.swing.JLabel();
        lblStudentNume = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        lblPoza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Iron Man.jpg"))); // NOI18N

        lblStudentNume.setBackground(new java.awt.Color(204, 102, 0));
        lblStudentNume.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblStudentNume.setForeground(new java.awt.Color(0, 51, 255));
        lblStudentNume.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentNume.setText("Amariutei Marius-Daniel - Java 05 Mar");

        javax.swing.GroupLayout SplashPanelLayout = new javax.swing.GroupLayout(SplashPanel);
        SplashPanel.setLayout(SplashPanelLayout);
        SplashPanelLayout.setHorizontalGroup(
            SplashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SplashPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(SplashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SplashPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblStudentNume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(SplashPanelLayout.createSequentialGroup()
                        .addComponent(lblPoza)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        SplashPanelLayout.setVerticalGroup(
            SplashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SplashPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblPoza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStudentNume, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SplashPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplashPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        SplashScreen splash = new SplashScreen();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                splash.setVisible(true);
            }
        });
        GUI n = new GUI();
        try {
            Thread.sleep(5000);
            splash.dispose();
        } catch (InterruptedException e) {

        }
        n.setVisible(true);
        GUI.rulareReclame();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SplashPanel;
    private javax.swing.JLabel lblPoza;
    private javax.swing.JLabel lblStudentNume;
    // End of variables declaration//GEN-END:variables
}
