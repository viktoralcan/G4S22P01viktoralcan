package g4s22p1viktoralcan;

public class Frame_principal extends javax.swing.JFrame {

    public Frame_principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Lbl_bienvenida = new javax.swing.JLabel();
        Lbl_nombre = new javax.swing.JLabel();
        Txt_nombre = new javax.swing.JTextField();
        Bton_saludo = new javax.swing.JButton();
        Lbl_saludo = new javax.swing.JLabel();
        txt_a = new javax.swing.JTextField();
        txt_b = new javax.swing.JTextField();
        Bton_suma = new javax.swing.JButton();
        Bton_resta = new javax.swing.JButton();
        Bton_mul = new javax.swing.JButton();
        Bton_salir = new javax.swing.JButton();
        Lbl_op = new javax.swing.JLabel();
        Txt_op = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Bton_div = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setSize(new java.awt.Dimension(960, 530));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(228, 244, 237));
        jPanel1.setMaximumSize(new java.awt.Dimension(740, 487));
        jPanel1.setMinimumSize(new java.awt.Dimension(740, 487));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 487));

        Lbl_bienvenida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Lbl_bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_bienvenida.setText("Estamos empezando a programa en Netbeans");

        Lbl_nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Lbl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_nombre.setText("Ingresa tu nombre:");

        Txt_nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_nombreActionPerformed(evt);
            }
        });

        Bton_saludo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Bton_saludo.setText("Saludo");
        Bton_saludo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_saludoActionPerformed(evt);
            }
        });

        Lbl_saludo.setBackground(new java.awt.Color(255, 102, 102));
        Lbl_saludo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Lbl_saludo.setForeground(new java.awt.Color(255, 51, 51));
        Lbl_saludo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txt_a.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_a.setToolTipText("");

        txt_b.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_b.setToolTipText("");

        Bton_suma.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Bton_suma.setText("Sumar");
        Bton_suma.setToolTipText("");
        Bton_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_sumaActionPerformed(evt);
            }
        });

        Bton_resta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Bton_resta.setText("Restar");
        Bton_resta.setToolTipText("");
        Bton_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_restaActionPerformed(evt);
            }
        });

        Bton_mul.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Bton_mul.setText("Multiplicar");
        Bton_mul.setToolTipText("");
        Bton_mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_mulActionPerformed(evt);
            }
        });

        Bton_salir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Bton_salir.setText("Salir");
        Bton_salir.setToolTipText("");
        Bton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_salirActionPerformed(evt);
            }
        });

        Lbl_op.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Lbl_op.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_op.setText("El resultado de la operación es:");
        Lbl_op.setToolTipText("");

        Txt_op.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Txt_op.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_op.setToolTipText("");
        Txt_op.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_opActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Segundo número o divisor:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Primer número ó dividendo:");

        Bton_div.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Bton_div.setText("Dividir");
        Bton_div.setToolTipText("");
        Bton_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_divActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(Lbl_bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Lbl_nombre)
                .addGap(46, 46, 46)
                .addComponent(Txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(Bton_saludo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Lbl_saludo, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(Bton_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(Bton_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txt_b, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(Bton_mul, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(630, 630, 630)
                .addComponent(Bton_div, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Lbl_op, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(Txt_op, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(Bton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(Lbl_bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bton_saludo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_saludo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Bton_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bton_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_b, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Bton_mul, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(Bton_div, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_op, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_op, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Bton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 960, 529);

        setBounds(0, 0, 758, 521);
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_nombreActionPerformed

    private void Bton_saludoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_saludoActionPerformed
        /*Esto no es un botón*/
        Lbl_saludo.setText("Bienvenido " + Txt_nombre.getText().toString() + (", \nestamos empezando a programar"));
    }//GEN-LAST:event_Bton_saludoActionPerformed

    private void Txt_opActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_opActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_opActionPerformed

    private void Bton_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_sumaActionPerformed
        int a;
        int b;
        a = Integer.parseInt(txt_a.getText().toString());
        b = Integer.parseInt(txt_b.getText().toString());
        Txt_op.setText(String.valueOf(a + b));
    }//GEN-LAST:event_Bton_sumaActionPerformed

    private void Bton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_Bton_salirActionPerformed

    private void Bton_mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_mulActionPerformed
        int a;
        int b;
        a = Integer.parseInt(txt_a.getText().toString());
        b = Integer.parseInt(txt_b.getText().toString());
        Txt_op.setText(String.valueOf(a * b));
    }//GEN-LAST:event_Bton_mulActionPerformed

    private void Bton_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_restaActionPerformed
        int a;
        int b;
        a = Integer.parseInt(txt_a.getText().toString());
        b = Integer.parseInt(txt_b.getText().toString());
        Txt_op.setText(String.valueOf(a - b));
    }//GEN-LAST:event_Bton_restaActionPerformed

    private void Bton_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_divActionPerformed
        double a;
        double b;
        a = Integer.parseInt(txt_a.getText().toString());
        b = Integer.parseInt(txt_b.getText().toString());
        Txt_op.setText(String.valueOf(a / b));
    }//GEN-LAST:event_Bton_divActionPerformed

    
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
            java.util.logging.Logger.getLogger(Frame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bton_div;
    private javax.swing.JButton Bton_mul;
    private javax.swing.JButton Bton_resta;
    private javax.swing.JButton Bton_salir;
    private javax.swing.JButton Bton_saludo;
    private javax.swing.JButton Bton_suma;
    private javax.swing.JLabel Lbl_bienvenida;
    private javax.swing.JLabel Lbl_nombre;
    private javax.swing.JLabel Lbl_op;
    private javax.swing.JLabel Lbl_saludo;
    private javax.swing.JTextField Txt_nombre;
    private javax.swing.JTextField Txt_op;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_a;
    private javax.swing.JTextField txt_b;
    // End of variables declaration//GEN-END:variables
}
