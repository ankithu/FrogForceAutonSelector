/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ankith
 */
public class MainScreen extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        this.setVisible(true);
    }

  
    
  
    private void initComponents() {

        allianceColorChoice = new javax.swing.ButtonGroup();
        pegChoice = new javax.swing.ButtonGroup();
        dumpBinChoice = new javax.swing.ButtonGroup();
        shootBallsChoice = new javax.swing.ButtonGroup();
        doNothingChoices = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        redAlliance = new javax.swing.JRadioButton();
        blueAlliance = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        leftPeg = new javax.swing.JRadioButton();
        centerPeg = new javax.swing.JRadioButton();
        rightPeg = new javax.swing.JRadioButton();
        noPeg = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        dumpHopper = new javax.swing.JRadioButton();
        dontDumpHopper = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        shootBalls = new javax.swing.JRadioButton();
        dontShootBalls = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        doNothing = new javax.swing.JRadioButton();
        dontDoNothing = new javax.swing.JRadioButton();
        saveSelection = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("frogforce503_logo_2.png"))); // NOI18N

        jLabel2.setText("Alliance");

        allianceColorChoice.add(redAlliance);
        redAlliance.setText("Red Alliance");
        redAlliance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redAllianceActionPerformed(evt);
            }
        });

        allianceColorChoice.add(blueAlliance);
        blueAlliance.setText("Blue Alliance");
        blueAlliance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueAllianceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redAlliance)
                    .addComponent(blueAlliance))
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redAlliance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blueAlliance)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jLabel1.setText("Peg");

        pegChoice.add(leftPeg);
        leftPeg.setText("Left Peg");

        pegChoice.add(centerPeg);
        centerPeg.setText("Center Peg");
        centerPeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centerPegActionPerformed(evt);
            }
        });

        pegChoice.add(rightPeg);
        rightPeg.setText("Right Peg");

        pegChoice.add(noPeg);
        noPeg.setText("No Peg");
        noPeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noPegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leftPeg)
                    .addComponent(centerPeg)
                    .addComponent(rightPeg)
                    .addComponent(noPeg))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(leftPeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(centerPeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(noPeg)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Monaco", 0, 24)); // NOI18N
        jLabel3.setText("FROG FORCE AUTONOMOUS MODE SELCECTOR");

        jLabel4.setText("Dump Hopper");

        dumpBinChoice.add(dumpHopper);
        dumpHopper.setText("Yes");
        dumpHopper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dumpHopperActionPerformed(evt);
            }
        });

        dumpBinChoice.add(dontDumpHopper);
        dontDumpHopper.setText("No");
        dontDumpHopper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dontDumpHopperActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dumpHopper)
                    .addComponent(dontDumpHopper))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dumpHopper)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dontDumpHopper)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jLabel5.setText("Shoot");

        shootBallsChoice.add(shootBalls);
        shootBalls.setText("Yes");
        shootBalls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shootBallsActionPerformed(evt);
            }
        });

        shootBallsChoice.add(dontShootBalls);
        dontShootBalls.setText("No");
        dontShootBalls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dontShootBallsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5))
                    .addComponent(shootBalls)
                    .addComponent(dontShootBalls))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shootBalls)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dontShootBalls)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel6.setText("Do Nothing");

        doNothingChoices.add(doNothing);
        doNothing.setText("Yes");
        doNothing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doNothingActionPerformed(evt);
            }
        });

        doNothingChoices.add(dontDoNothing);
        dontDoNothing.setText("No");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dontDoNothing)
                    .addComponent(doNothing))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(doNothing)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(dontDoNothing))
        );

        saveSelection.setBackground(new java.awt.Color(0, 238, 0));
        saveSelection.setText("Save Selection");
        saveSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSelectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(779, 779, 779))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveSelection)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(saveSelection)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redAllianceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redAllianceActionPerformed
    }//GEN-LAST:event_redAllianceActionPerformed

    private void blueAllianceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueAllianceActionPerformed
    }//GEN-LAST:event_blueAllianceActionPerformed

    private void centerPegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centerPegActionPerformed
    }//GEN-LAST:event_centerPegActionPerformed

    private void noPegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noPegActionPerformed
    }//GEN-LAST:event_noPegActionPerformed

    private void dumpHopperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dumpHopperActionPerformed
    }//GEN-LAST:event_dumpHopperActionPerformed

    private void dontDumpHopperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dontDumpHopperActionPerformed

    }//GEN-LAST:event_dontDumpHopperActionPerformed

    private void shootBallsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shootBallsActionPerformed
    }//GEN-LAST:event_shootBallsActionPerformed

    private void dontShootBallsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dontShootBallsActionPerformed
    }//GEN-LAST:event_dontShootBallsActionPerformed

    private void doNothingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doNothingActionPerformed
    }//GEN-LAST:event_doNothingActionPerformed

    private void saveSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSelectionActionPerformed
    	fetchValues();
    	
            
    }//GEN-LAST:event_saveSelectionActionPerformed
    
    private void fetchValues(){
        System.out.println("fetchingValues");
        if (shootBalls.isSelected()){
           SelectorState.setShootingOption(SelectorState.SHOOTING_OPTIONS.YES);
           System.out.println("Shooting, ");
        }
        else{
           SelectorState.setShootingOption(SelectorState.SHOOTING_OPTIONS.NO);
           System.out.println("Not Shooting, ");
        }
        
        if (doNothing.isSelected()){
            SelectorState.setDoNothingOption(SelectorState.DO_NOTHING_OPTIONS.YES);
            System.out.print("Doing Nothing, ");
        }
        else{
            SelectorState.setDoNothingOption(SelectorState.DO_NOTHING_OPTIONS.NO);
            System.out.print("Not Doing Nothing, ");
        }
        
        if (dumpHopper.isSelected()){
            SelectorState.setHopperOption(SelectorState.HOPPER_OPTIONS.YES);
            System.out.print("Dumping Hopper, ");
        }
        else{
            SelectorState.setHopperOption(SelectorState.HOPPER_OPTIONS.NO);
            System.out.print("Not Dumping Hopper, ");   
        }
        
        if (redAlliance.isSelected()){
            SelectorState.setAllianceOption(SelectorState.ALLIANCE_OPTIONS.RED_ALLIANCE);
            System.out.print("Red alliance, ");
        }
        else{
            SelectorState.setAllianceOption(SelectorState.ALLIANCE_OPTIONS.BLUE_ALLIANCE);
            System.out.print("Blue alliance, ");
        }
        
        if (leftPeg.isSelected()){
            SelectorState.setPegOption(SelectorState.PEG_OPTIONS.LEFT_PEG);
            System.out.print("left peg, ");
        }
        else if (rightPeg.isSelected()){
            SelectorState.setPegOption(SelectorState.PEG_OPTIONS.RIGHT_PEG);
            System.out.print("right peg, ");
        }
        else if (centerPeg.isSelected()){
            SelectorState.setPegOption(SelectorState.PEG_OPTIONS.CENTER_PEG);
            System.out.print("center peg, ");
        }
        else{
            SelectorState.setPegOption(SelectorState.PEG_OPTIONS.NO_PEG);
            System.out.print("no peg, ");
        }
        
        SelectorState.readyToSend = true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup allianceColorChoice;
    private javax.swing.JRadioButton blueAlliance;
    private javax.swing.JRadioButton centerPeg;
    private javax.swing.JRadioButton doNothing;
    private javax.swing.ButtonGroup doNothingChoices;
    private javax.swing.JRadioButton dontDoNothing;
    private javax.swing.JRadioButton dontDumpHopper;
    private javax.swing.JRadioButton dontShootBalls;
    private javax.swing.ButtonGroup dumpBinChoice;
    private javax.swing.JRadioButton dumpHopper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton leftPeg;
    private javax.swing.JLabel logo;
    private javax.swing.JRadioButton noPeg;
    private javax.swing.ButtonGroup pegChoice;
    private javax.swing.JRadioButton redAlliance;
    private javax.swing.JRadioButton rightPeg;
    private javax.swing.JButton saveSelection;
    private javax.swing.JRadioButton shootBalls;
    private javax.swing.ButtonGroup shootBallsChoice;
    // End of variables declaration//GEN-END:variables
}
