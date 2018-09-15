
package tcServer;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * 
 */
public class MessageBox extends javax.swing.JDialog {
    
    /** Creates new form MessageBox */
    public MessageBox(java.awt.Frame parent, String message) {
        super(parent, true);
        initComponents();
        //setLocation(this.getParent().getWidth()/2 - this.getWidth()/2,this.getParent().getWidth()/2 - this.getWidth()/2);
        
        jLabelMain.setText(message);
        Dimension sd  = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(sd.width / 2 - this.getWidth()/ 2, sd.height / 2 - this.getHeight()/ 2);
        
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabelMain = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabelMain.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabelMain.setForeground(new java.awt.Color(102, 0, 0));
        jLabelMain.setText("jLabel1");
        jLabelMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(jLabelMain, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jButton1)
                .add(jLabelMain))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
        setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelMain;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
}