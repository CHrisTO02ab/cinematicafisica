/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class Pantalla extends javax.swing.JFrame {

    public Pantalla() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TiempField = new javax.swing.JTextField();
        DistancField = new javax.swing.JTextField();
        VelocField = new javax.swing.JTextField();
        Impresion = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        Amarillo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("MRU");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DIGITALIZE LOS DATOS QUE DISPONE PARA DETERMINAR LO QUE DESEA HALLAR:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Ojo: Los datos que desconozca lo coloca con un valor igual a 0");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DISTANCIA (v*t):");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VELOCIDAD (d/t):");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TIEMPO (d/v):");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        TiempField.setBackground(new java.awt.Color(102, 153, 255));
        TiempField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TiempField.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(TiempField, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 190, 40));

        DistancField.setBackground(new java.awt.Color(102, 153, 255));
        DistancField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DistancField.setForeground(new java.awt.Color(0, 0, 0));
        DistancField.setCaretColor(new java.awt.Color(204, 204, 204));
        DistancField.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        DistancField.setDoubleBuffered(true);
        DistancField.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        DistancField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistancFieldActionPerformed(evt);
            }
        });
        jPanel1.add(DistancField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 170, 40));

        VelocField.setBackground(new java.awt.Color(102, 153, 255));
        VelocField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        VelocField.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(VelocField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 210, 40));

        Impresion.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        Impresion.setForeground(new java.awt.Color(0, 0, 0));
        Impresion.setText("<html>El MRU(Movimiento Rectilíneo Uniforme) es el movimiento en el que el cuerpo se desplaza de forma horizontal recorriendo distancias iguales en intervalos de tiempo iguales.<html>");
        jPanel1.add(Impresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 360, 120));

        jToggleButton1.setBackground(new java.awt.Color(153, 153, 153));
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Aplicar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 160, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Carro .png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 350, 140));

        Amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Color amarillo.jpg"))); // NOI18N
        jPanel1.add(Amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 370, 140));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 170, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/Fondo.jpeg"))); // NOI18N
        Fondo.setText("jLabel5");
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DistancFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistancFieldActionPerformed
        
    }//GEN-LAST:event_DistancFieldActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try {
        double distancia = Double.parseDouble(DistancField.getText());
        double velocidad = Double.parseDouble(VelocField.getText());
        double tiempo = Double.parseDouble(TiempField.getText());
        String resultado = "";

        if (distancia == 0 && velocidad != 0 && tiempo != 0) {
            // Calcular distancia
            distancia = velocidad * tiempo;
            resultado = "Distancia calculada: " + distancia + " unidades.";
        } else if (velocidad == 0 && distancia != 0 && tiempo != 0) {
            // Calcular velocidad
            velocidad = distancia / tiempo;
            resultado = "Velocidad calculada: " + velocidad + " unidades de velocidad.";
        } else if (tiempo == 0 && distancia != 0 && velocidad != 0) {
            // Calcular tiempo
            tiempo = distancia / velocidad;
            resultado = "Tiempo calculado: " + tiempo + " unidades de tiempo.";
        } else {
            resultado = "Por favor, deje en 0 el valor que desea calcular y complete los otros dos.";
        }
        Impresion.setText("<html>" + resultado + "<html>");
    } catch (NumberFormatException e) {
        Impresion.setText("<html>Por favor, ingrese valores numéricos válidos.<html>");
    }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        principal ho = new principal();
        dispose();
        ho.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amarillo;
    private javax.swing.JTextField DistancField;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Impresion;
    private javax.swing.JTextField TiempField;
    private javax.swing.JTextField VelocField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
