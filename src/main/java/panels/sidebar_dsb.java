/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panels;

import com.mycompany.liecap.home_dsb;
import com.mycompany.liecap.bidding_dsb;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author predator 300
 */
public class sidebar_dsb extends javax.swing.JPanel {

    private List<JFrame> openFrames;
    /**
     * Creates new form sidebar_dsb
     */
    public sidebar_dsb() {
        initComponents();
        setOpaque(false);
        openFrames = new ArrayList<>();
    }
    
    public void addFrame(JFrame frame) {
        openFrames.add(frame);
    }
        
    private void closeAllFrames() {
        for (JFrame frame : openFrames) {
            if (frame != null) {
                frame.dispose();
            }
        }
        openFrames.clear();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        RFQ = new javax.swing.JButton();
        Bidding = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jDesktopPane1.setBackground(new java.awt.Color(0, 0, 102));

        Home.setFont(new java.awt.Font("Helvetica", 1, 25)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setText("HOME");
        Home.setBorder(null);
        Home.setBorderPainted(false);
        Home.setContentAreaFilled(false);
        Home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Home.setMaximumSize(new java.awt.Dimension(68, 23));
        Home.setMinimumSize(new java.awt.Dimension(68, 23));
        Home.setRequestFocusEnabled(false);
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        RFQ.setFont(new java.awt.Font("Helvetica", 1, 25)); // NOI18N
        RFQ.setForeground(new java.awt.Color(255, 255, 255));
        RFQ.setText("DATABASE");
        RFQ.setBorder(null);
        RFQ.setBorderPainted(false);
        RFQ.setContentAreaFilled(false);
        RFQ.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RFQ.setMaximumSize(new java.awt.Dimension(68, 23));
        RFQ.setMinimumSize(new java.awt.Dimension(68, 23));
        RFQ.setRequestFocusEnabled(false);
        RFQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RFQActionPerformed(evt);
            }
        });

        Bidding.setFont(new java.awt.Font("Helvetica", 1, 25)); // NOI18N
        Bidding.setForeground(new java.awt.Color(255, 255, 255));
        Bidding.setText("VISITOR");
        Bidding.setBorder(null);
        Bidding.setBorderPainted(false);
        Bidding.setContentAreaFilled(false);
        Bidding.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Bidding.setMaximumSize(new java.awt.Dimension(68, 23));
        Bidding.setMinimumSize(new java.awt.Dimension(68, 23));
        Bidding.setRequestFocusEnabled(false);
        Bidding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiddingActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Helvetica", 1, 25)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("BTN4");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setMaximumSize(new java.awt.Dimension(68, 23));
        jButton4.setMinimumSize(new java.awt.Dimension(68, 23));
        jButton4.setRequestFocusEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Home, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(RFQ, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Bidding, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bidding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RFQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RFQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bidding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        RFQ.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
//        JOptionPane.showMessageDialog(this, "\"Home\" Is Pressed");
        closeAllFrames(); // Close all open frames
        JFrame currentFrame = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
        if (currentFrame != null) {
            currentFrame.dispose();
        }
        home_dsb home = new home_dsb(); // Create a new home_dsb frame
        home.setVisible(true); // Set the new frame to visible
        openFrames.add(home); // Add the new frame to the list of open frames
    }//GEN-LAST:event_HomeActionPerformed

    private void RFQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RFQActionPerformed
//        JOptionPane.showMessageDialog(this, "\"RFQ\" Is Pressed");
        closeAllFrames(); // Close all open frames
        JFrame currentFrame = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
        if (currentFrame != null) {
            currentFrame.dispose();
        }
//        RFQ_dsb rfq_dsb = new RFQ_dsb(); // Create a new RFQ_dsb frame
//        rfq_dsb.setVisible(true); // Set the new frame to visible
//        openFrames.add(rfq_dsb); // Add the new frame to the list of open frames
    }//GEN-LAST:event_RFQActionPerformed

    private void BiddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiddingActionPerformed
        closeAllFrames(); // Close all open frames
        JFrame currentFrame = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
        if (currentFrame != null) {
            currentFrame.dispose();
        }
        bidding_dsb bidding_dsb = new bidding_dsb(); // Create a new bidding_dsb frame
        bidding_dsb.setVisible(true); // Set the new frame to visible
        openFrames.add(bidding_dsb); // Add the new frame to the list of open frames   
    }//GEN-LAST:event_BiddingActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        closeAllFrames();
        JFrame currentFrame = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
        if (currentFrame != null) {
            currentFrame.dispose();
        }
        JOptionPane.showMessageDialog(this, "\"Btn4\" Is Pressed");
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bidding;
    private javax.swing.JButton Home;
    private javax.swing.JButton RFQ;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
