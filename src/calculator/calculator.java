/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

/**
 *
 * @author ~CHEMUTAI~
 */
public class calculator extends javax.swing.JFrame {

    /**
     * Creates new form calculator
     */
   double NumEnter1;
   double NumEnter2;
    double Result;
    String Op;

    public calculator() {
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

        screen = new javax.swing.JTextField();
        GTbtn = new javax.swing.JButton();
        M1btn = new javax.swing.JButton();
        M2btn = new javax.swing.JButton();
        MRCbtn = new javax.swing.JButton();
        PERCENT = new javax.swing.JButton();
        SEVEN = new javax.swing.JButton();
        EIGHT = new javax.swing.JButton();
        NINE = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        MULT = new javax.swing.JButton();
        FOUR = new javax.swing.JButton();
        FIVE = new javax.swing.JButton();
        SIX = new javax.swing.JButton();
        PLUS = new javax.swing.JButton();
        ONE = new javax.swing.JButton();
        TWO = new javax.swing.JButton();
        THREE = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        ZERO = new javax.swing.JButton();
        ZEROO = new javax.swing.JButton();
        ZEROPOINT = new javax.swing.JButton();
        CEBTN = new javax.swing.JButton();
        ADDSUB = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        DIV = new javax.swing.JButton();
        SUB = new javax.swing.JButton();
        EQUAL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(51, 0, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        screen.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 280, 80));

        GTbtn.setBackground(new java.awt.Color(204, 0, 204));
        GTbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GTbtn.setText("GT");
        GTbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GTbtnActionPerformed(evt);
            }
        });
        getContentPane().add(GTbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 55, 30));

        M1btn.setBackground(new java.awt.Color(204, 0, 204));
        M1btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        M1btn.setText("M+");
        M1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1btnActionPerformed(evt);
            }
        });
        getContentPane().add(M1btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 55, 30));

        M2btn.setBackground(new java.awt.Color(204, 0, 204));
        M2btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        M2btn.setText("M-");
        M2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2btnActionPerformed(evt);
            }
        });
        getContentPane().add(M2btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 55, 30));

        MRCbtn.setBackground(new java.awt.Color(204, 0, 204));
        MRCbtn.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        MRCbtn.setText("MRC");
        MRCbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRCbtnActionPerformed(evt);
            }
        });
        getContentPane().add(MRCbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 55, 30));

        PERCENT.setBackground(new java.awt.Color(204, 0, 204));
        PERCENT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PERCENT.setText("%");
        PERCENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PERCENTActionPerformed(evt);
            }
        });
        getContentPane().add(PERCENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 55, 30));

        SEVEN.setBackground(new java.awt.Color(204, 0, 204));
        SEVEN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SEVEN.setText("7");
        SEVEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEVENActionPerformed(evt);
            }
        });
        getContentPane().add(SEVEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 55, 30));

        EIGHT.setBackground(new java.awt.Color(204, 0, 204));
        EIGHT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        EIGHT.setText("8");
        EIGHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EIGHTActionPerformed(evt);
            }
        });
        getContentPane().add(EIGHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 55, 30));

        NINE.setBackground(new java.awt.Color(204, 0, 204));
        NINE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NINE.setText("9");
        NINE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NINEActionPerformed(evt);
            }
        });
        getContentPane().add(NINE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 55, 30));

        jButton9.setBackground(new java.awt.Color(204, 0, 204));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 55, 30));

        jButton10.setBackground(new java.awt.Color(204, 0, 204));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 55, 30));

        jButton11.setBackground(new java.awt.Color(204, 0, 204));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 55, 30));

        jButton12.setBackground(new java.awt.Color(204, 0, 204));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 55, 30));

        MULT.setBackground(new java.awt.Color(204, 0, 204));
        MULT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        MULT.setText("×");
        MULT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MULTActionPerformed(evt);
            }
        });
        getContentPane().add(MULT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 55, 30));

        FOUR.setBackground(new java.awt.Color(204, 0, 204));
        FOUR.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        FOUR.setText("4");
        FOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FOURActionPerformed(evt);
            }
        });
        getContentPane().add(FOUR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 55, 30));

        FIVE.setBackground(new java.awt.Color(204, 0, 204));
        FIVE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        FIVE.setText("5");
        FIVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIVEActionPerformed(evt);
            }
        });
        getContentPane().add(FIVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 55, 30));

        SIX.setBackground(new java.awt.Color(204, 0, 204));
        SIX.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SIX.setText("6");
        SIX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIXActionPerformed(evt);
            }
        });
        getContentPane().add(SIX, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 55, 30));

        PLUS.setBackground(new java.awt.Color(204, 0, 204));
        PLUS.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PLUS.setText("+");
        PLUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLUSActionPerformed(evt);
            }
        });
        getContentPane().add(PLUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 55, 30));

        ONE.setBackground(new java.awt.Color(204, 0, 204));
        ONE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ONE.setText("1");
        getContentPane().add(ONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 55, 30));

        TWO.setBackground(new java.awt.Color(204, 0, 204));
        TWO.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TWO.setText("2");
        TWO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TWOActionPerformed(evt);
            }
        });
        getContentPane().add(TWO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 55, 30));

        THREE.setBackground(new java.awt.Color(204, 0, 204));
        THREE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        THREE.setText("3");
        THREE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THREEActionPerformed(evt);
            }
        });
        getContentPane().add(THREE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 55, 30));

        DELETE.setBackground(new java.awt.Color(204, 0, 204));
        DELETE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DELETE.setText("␡");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        getContentPane().add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 55, 30));

        ZERO.setBackground(new java.awt.Color(204, 0, 204));
        ZERO.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ZERO.setText("o");
        ZERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZEROActionPerformed(evt);
            }
        });
        getContentPane().add(ZERO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 55, 30));

        ZEROO.setBackground(new java.awt.Color(204, 0, 204));
        ZEROO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ZEROO.setText("00");
        ZEROO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZEROOActionPerformed(evt);
            }
        });
        getContentPane().add(ZEROO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 55, 30));

        ZEROPOINT.setBackground(new java.awt.Color(204, 0, 204));
        ZEROPOINT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ZEROPOINT.setText("0.0");
        ZEROPOINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZEROPOINTActionPerformed(evt);
            }
        });
        getContentPane().add(ZEROPOINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 55, 30));

        CEBTN.setBackground(new java.awt.Color(204, 0, 204));
        CEBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CEBTN.setText("CE");
        CEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEBTNActionPerformed(evt);
            }
        });
        getContentPane().add(CEBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 55, 30));

        ADDSUB.setBackground(new java.awt.Color(204, 0, 204));
        ADDSUB.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ADDSUB.setText("±");
        ADDSUB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDSUBActionPerformed(evt);
            }
        });
        getContentPane().add(ADDSUB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 55, 30));

        jButton27.setBackground(new java.awt.Color(204, 0, 204));
        jButton27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 55, 30));

        DIV.setBackground(new java.awt.Color(204, 0, 204));
        DIV.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DIV.setText("/");
        DIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIVActionPerformed(evt);
            }
        });
        getContentPane().add(DIV, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 55, 30));

        SUB.setBackground(new java.awt.Color(204, 0, 204));
        SUB.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SUB.setText("-");
        SUB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBActionPerformed(evt);
            }
        });
        getContentPane().add(SUB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 55, 30));

        EQUAL.setBackground(new java.awt.Color(204, 0, 204));
        EQUAL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        EQUAL.setText("=");
        EQUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EQUALActionPerformed(evt);
            }
        });
        getContentPane().add(EQUAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 55, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void EnterNumbers(String h){
     String Nums = screen.getText()+ h;
     screen.setText(Nums);
     
     
     }
    
    private void GTbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GTbtnActionPerformed
EnterNumbers("GT");         // TODO add your handling code here:
    }//GEN-LAST:event_GTbtnActionPerformed

    private void M2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2btnActionPerformed
EnterNumbers("M-");         // TODO add your handling code here:
    }//GEN-LAST:event_M2btnActionPerformed

    private void MRCbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRCbtnActionPerformed
EnterNumbers("MRC");         // TODO add your handling code here:
    }//GEN-LAST:event_MRCbtnActionPerformed

    private void PERCENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PERCENTActionPerformed
EnterNumbers("%");         // TODO add your handling code here:
    }//GEN-LAST:event_PERCENTActionPerformed

    private void EIGHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EIGHTActionPerformed
EnterNumbers("8");         // TODO add your handling code here:
    }//GEN-LAST:event_EIGHTActionPerformed

    private void NINEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NINEActionPerformed
EnterNumbers("9");         // TODO add your handling code here:
    }//GEN-LAST:event_NINEActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void MULTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MULTActionPerformed
      EnterNumbers("×");     // TODO add your handling code here:
    }//GEN-LAST:event_MULTActionPerformed

    private void FIVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIVEActionPerformed
EnterNumbers("5");           // TODO add your handling code here:
    }//GEN-LAST:event_FIVEActionPerformed

    private void SIXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIXActionPerformed
       EnterNumbers("6");    // TODO add your handling code here:
    }//GEN-LAST:event_SIXActionPerformed

    private void PLUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLUSActionPerformed
      EnterNumbers("+");     // TODO add your handling code here:
    }//GEN-LAST:event_PLUSActionPerformed

    private void TWOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TWOActionPerformed
       EnterNumbers("2");    // TODO add your handling code here:
    }//GEN-LAST:event_TWOActionPerformed

    private void THREEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THREEActionPerformed
      EnterNumbers("3");   // TODO add your handling code here:
    }//GEN-LAST:event_THREEActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        EnterNumbers("␡"); // TODO add your handling code here:
    }//GEN-LAST:event_DELETEActionPerformed

    private void ZEROOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZEROOActionPerformed
       EnterNumbers("00");  // TODO add your handling code here:
    }//GEN-LAST:event_ZEROOActionPerformed

    private void ZEROPOINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZEROPOINTActionPerformed
        EnterNumbers("0.0"); // TODO add your handling code here:
    }//GEN-LAST:event_ZEROPOINTActionPerformed

    private void CEBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEBTNActionPerformed
EnterNumbers("CE");        // TODO add your handling code here:    
    }//GEN-LAST:event_CEBTNActionPerformed

    private void ADDSUBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDSUBActionPerformed
     EnterNumbers("±");         // TODO add your handling code here:
    }//GEN-LAST:event_ADDSUBActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void DIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIVActionPerformed
       NumEnter1 = double.parseDouble(DIV.getText());   
       DIV.setText();
       Op ="/";
// TODO add your handling code here:
    }//GEN-LAST:event_DIVActionPerformed

    private void SUBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBActionPerformed
      EnterNumbers("-");   // TODO add your handling code here:
    }//GEN-LAST:event_SUBActionPerformed

    private void EQUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EQUALActionPerformed
      EnterNumbers("=");   // TODO add your handling code here:
    }//GEN-LAST:event_EQUALActionPerformed

    private void SEVENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEVENActionPerformed
        EnterNumbers("7");        // TODO add your handling code here:
    }//GEN-LAST:event_SEVENActionPerformed

    private void FOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FOURActionPerformed
       EnterNumbers("4");    // TODO add your handling code here:
    }//GEN-LAST:event_FOURActionPerformed

    private void M1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1btnActionPerformed
      EnterNumbers("M+");         // TODO add your handling code here:
    }//GEN-LAST:event_M1btnActionPerformed

    private void ZEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZEROActionPerformed
EnterNumbers("0");        // TODO add your handling code here:
    }//GEN-LAST:event_ZEROActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDSUB;
    private javax.swing.JButton CEBTN;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton DIV;
    private javax.swing.JButton EIGHT;
    private javax.swing.JButton EQUAL;
    private javax.swing.JButton FIVE;
    private javax.swing.JButton FOUR;
    private javax.swing.JButton GTbtn;
    private javax.swing.JButton M1btn;
    private javax.swing.JButton M2btn;
    private javax.swing.JButton MRCbtn;
    private javax.swing.JButton MULT;
    private javax.swing.JButton NINE;
    private javax.swing.JButton ONE;
    private javax.swing.JButton PERCENT;
    private javax.swing.JButton PLUS;
    private javax.swing.JButton SEVEN;
    private javax.swing.JButton SIX;
    private javax.swing.JButton SUB;
    private javax.swing.JButton THREE;
    private javax.swing.JButton TWO;
    private javax.swing.JButton ZERO;
    private javax.swing.JButton ZEROO;
    private javax.swing.JButton ZEROPOINT;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField screen;
    // End of variables declaration//GEN-END:variables
}
