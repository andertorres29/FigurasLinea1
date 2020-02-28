/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometrica;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.math.plot.Plot2DPanel;

/**
 *
 * @author Ander
 */
public class Grafica extends javax.swing.JFrame {


    
    /**
     * Creates new form Grafica
     */
    public Grafica() {
        initComponents();
        ocultarComponentes();
  
    }
    
    public void ocultarComponentes(){
        labelLado1.setVisible(false);
        labelLado2.setVisible(false);
        labelLado3.setVisible(false);
        
        txtLado1.setVisible(false);
        txtLado2.setVisible(false);
        txtLado3.setVisible(false);

        labelFigura.setVisible(false);
        labelPerimetro.setVisible(false);
        labelArea.setVisible(false);
        
        labelResTipo.setVisible(false);
        labelResPeri.setVisible(false);
        labelResArea.setVisible(false);
        
        labelCoordenadaX.setVisible(false);
        labelCoordenadaY.setVisible(false);
        
        txtCoordenadaX.setVisible(false);
        txtCoordenadaY.setVisible(false);
    }
    
    public void mostrarComponentes(){
        labelLado1.setVisible(true);
        labelLado2.setVisible(true);
        labelLado3.setVisible(true);
        
        txtLado1.setVisible(true);
        txtLado2.setVisible(true);
        txtLado3.setVisible(true);

        labelFigura.setVisible(true);
        labelPerimetro.setVisible(true);
        labelArea.setVisible(true);
        
        labelResTipo.setVisible(true);
        labelResPeri.setVisible(true);
        labelResArea.setVisible(true);
        
        labelCoordenadaX.setVisible(true);
        labelCoordenadaY.setVisible(true);
        
        txtCoordenadaX.setVisible(true);
        txtCoordenadaY.setVisible(true);
    }
    
    public void mostrarComponentesCuaRec(){
        labelLado1.setVisible(true);
        labelLado2.setVisible(true);
        txtLado1.setVisible(true);
        txtLado2.setVisible(true);
        txtLado3.setVisible(false);
        txtLado1.setText("");
        txtLado2.setText("");
        labelLado3.setText("");
        
        labelFigura.setVisible(true);
        labelPerimetro.setVisible(true);
        labelArea.setVisible(true);
        labelResTipo.setVisible(true);
        labelResPeri.setVisible(true);
        labelResArea.setVisible(true);
        labelResTipo.setText("");
        labelResPeri.setText("");
        labelResArea.setText("");
        
        labelCoordenadaX.setVisible(true);
        labelCoordenadaY.setVisible(true);
        txtCoordenadaX.setVisible(true);
        txtCoordenadaY.setVisible(true);
        txtCoordenadaX.setText("");
        txtCoordenadaY.setText("");
  
    }
    
    public void mostrarComponentesTriangulo(){
        labelLado1.setVisible(true);
        labelLado2.setVisible(true);
        labelLado3.setVisible(true);
        txtLado1.setVisible(true);
        txtLado2.setVisible(true);
        txtLado3.setVisible(true);
        txtLado1.setText("");
        txtLado2.setText("");
        txtLado3.setText("");
        labelLado3.setText("Lado 3");
        

        labelFigura.setVisible(true);
        labelPerimetro.setVisible(true);
        labelArea.setVisible(true);
        labelResTipo.setVisible(true);
        labelResPeri.setVisible(true);
        labelResArea.setVisible(true);
        labelResTipo.setText("");
        labelResPeri.setText("");
        labelResArea.setText("");
        
        labelCoordenadaX.setVisible(true);
        labelCoordenadaY.setVisible(true);
        txtCoordenadaX.setVisible(true);
        txtCoordenadaY.setVisible(true);
        txtCoordenadaX.setText("");
        txtCoordenadaY.setText("");
    }
    
    public void calcularDatosCuadrado(){
        String tipo = "Cuadrado";
        int lad1, lad2, perimetro, area;
        try {
            labelResTipo.setText(tipo);
            lad1 = Integer.parseInt(txtLado1.getText());
            lad2 = Integer.parseInt(txtLado2.getText());
            perimetro = (lad1 * 2) + (lad2 * 2);
            area = lad1 * lad2;
            String per = String.valueOf(perimetro);
            String are = String.valueOf(area);
            labelResPeri.setText(per);
            labelResArea.setText(are);
        } catch (NumberFormatException ex) {

        }
    }
    
    public void calcularDatosRectangulo(){
        String tipo = "Rectangulo";
        int lad1, lad2, perimetro, area;
        try {
            labelResTipo.setText(tipo);
            lad1 = Integer.parseInt(txtLado1.getText());
            lad2 = Integer.parseInt(txtLado2.getText());
            perimetro = (lad1 * 2) + (lad2 * 2);
            area = lad1 * lad2;
            String per = String.valueOf(perimetro);
            String are = String.valueOf(area);
            labelResPeri.setText(per);
            labelResArea.setText(are);
        } catch (NumberFormatException ex) {

        }
    }
    
    public void calcularDatosTriangulo(){
      
        int lad1, lad2, lad3, perimetro, area;
        try {
            lad1 = Integer.parseInt(txtLado1.getText());
            lad2 = Integer.parseInt(txtLado2.getText());
            lad3 = Integer.parseInt(txtLado3.getText());
            if (lad1 == lad2 && lad1 == lad3){
                String tipo = "Triangulo Equilatero";
                labelResTipo.setText(tipo);
            } else if ((lad1 == lad2 && lad1 != lad3) || (lad2 == lad3 && lad2 != lad1) || (lad3 == lad1 && lad3 != lad2)){
                String tipo = "Triangulo Isosceles";
                labelResTipo.setText(tipo);
            } else if (lad1 != lad2 && lad1 != lad3 && lad2 != lad3){
                String tipo = "Triangulo Escaleno";
                labelResTipo.setText(tipo);
            }
            perimetro = lad1 + lad2 + lad3;
            area = (lad1 * lad2) / 2;
            String per = String.valueOf(perimetro);
            String are = String.valueOf(area);
            labelResPeri.setText(per);
            labelResArea.setText(are);
            
        } catch (NumberFormatException ex) {

        }
    }
    
    public void pintar(Graphics g) {
        super.paint(g);
        g.drawLine(50, 150, 390, 150); // Eje x
        g.drawLine(150, 50, 150, 350); // Ejey
    }
    
    public void graficar(){
        int dm;
        int y1=160;
        int x1=160; 
        dm = Integer.parseInt(txtCoordenadaX.getText());
        Graphics g = getGraphics();
        for (int i = 150; i < 350; i+=8){
            g.drawLine(145, i, 155, i);
            g.drawLine(i, 145, i, 155);
        }
        String fig = cbxTipoFigura.getSelectedItem().toString();
        switch(fig){
            case "Cuadrado":
                g.setColor(Color.red);
                g.drawOval(150, 150, dm, dm);
                break;
            case "Rectangulo":
                g.setColor(Color.red);
                g.drawOval(150, 150, dm, dm);
                break;
            case "Triangulo":
                g.setColor(Color.red);
                x1 = x1 + dm;
                y1 = y1 + dm;
                g.setColor(Color.red);
                g.drawLine(140, y1, x1, 140);
                break;
        }
    }
    
      
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        labelTituloConfiguraciones = new javax.swing.JLabel();
        labelTituloPrincipal = new javax.swing.JLabel();
        labelTituloGrafica = new javax.swing.JLabel();
        panelConfiguracion = new javax.swing.JPanel();
        labelTipo = new javax.swing.JLabel();
        cbxTipoFigura = new javax.swing.JComboBox();
        labelLado1 = new javax.swing.JLabel();
        labelLado2 = new javax.swing.JLabel();
        labelLado3 = new javax.swing.JLabel();
        txtLado1 = new javax.swing.JTextField();
        txtLado2 = new javax.swing.JTextField();
        txtLado3 = new javax.swing.JTextField();
        labelFigura = new javax.swing.JLabel();
        labelPerimetro = new javax.swing.JLabel();
        labelArea = new javax.swing.JLabel();
        labelResTipo = new javax.swing.JLabel();
        labelResArea = new javax.swing.JLabel();
        labelResPeri = new javax.swing.JLabel();
        labelCoordenadaX = new javax.swing.JLabel();
        labelCoordenadaY = new javax.swing.JLabel();
        txtCoordenadaX = new javax.swing.JTextField();
        txtCoordenadaY = new javax.swing.JTextField();
        panelGrafica = new javax.swing.JPanel();
        btnGraficar = new javax.swing.JButton();
        btnRestablecer = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(0, 153, 153));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTituloConfiguraciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTituloConfiguraciones.setText("Panel Configuraciones");
        panelPrincipal.add(labelTituloConfiguraciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        labelTituloPrincipal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTituloPrincipal.setText("FIGURAS GEOMETRICAS");
        panelPrincipal.add(labelTituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        labelTituloGrafica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTituloGrafica.setText("Panel Grafica");
        panelPrincipal.add(labelTituloGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        panelConfiguracion.setBackground(new java.awt.Color(255, 255, 255));
        panelConfiguracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTipo.setText("Figura");
        panelConfiguracion.add(labelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        cbxTipoFigura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione:", "Cuadrado", "Rectangulo", "Triangulo" }));
        cbxTipoFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoFiguraActionPerformed(evt);
            }
        });
        panelConfiguracion.add(cbxTipoFigura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 20));

        labelLado1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelLado1.setText("Lado 1");
        panelConfiguracion.add(labelLado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        labelLado2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelLado2.setText("Lado 2");
        panelConfiguracion.add(labelLado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        labelLado3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelLado3.setText("Lado 3");
        panelConfiguracion.add(labelLado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));
        panelConfiguracion.add(txtLado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 40, 20));
        panelConfiguracion.add(txtLado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 40, 20));
        panelConfiguracion.add(txtLado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 40, 20));

        labelFigura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelFigura.setText("Tipo");
        panelConfiguracion.add(labelFigura, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 30, -1));

        labelPerimetro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPerimetro.setText("Perimetro");
        panelConfiguracion.add(labelPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 80, -1));

        labelArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelArea.setText("Area");
        panelConfiguracion.add(labelArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 30, -1));

        labelResTipo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        panelConfiguracion.add(labelResTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 100, 20));
        panelConfiguracion.add(labelResArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 50, 20));
        panelConfiguracion.add(labelResPeri, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 50, 20));

        labelCoordenadaX.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelCoordenadaX.setText("Coordenada X");
        panelConfiguracion.add(labelCoordenadaX, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        labelCoordenadaY.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelCoordenadaY.setText("Coordenada Y");
        panelConfiguracion.add(labelCoordenadaY, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));
        panelConfiguracion.add(txtCoordenadaX, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 70, 20));
        panelConfiguracion.add(txtCoordenadaY, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 70, 20));

        panelPrincipal.add(panelConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 790, 60));

        panelGrafica.setBackground(new java.awt.Color(255, 255, 255));
        panelGrafica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelPrincipal.add(panelGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 400, 260));

        btnGraficar.setText("GRAFICAR");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnGraficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 220, 50));

        btnRestablecer.setText("RESTABLECER");
        btnRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnRestablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 220, 50));

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 220, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoFiguraActionPerformed
        String figu = cbxTipoFigura.getSelectedItem().toString();
        if (figu.equals("Cuadrado")) {
            mostrarComponentesCuaRec();
        } else if (figu.equals("Rectangulo")) {
            mostrarComponentesCuaRec();
        } else if (figu.equals("Triangulo")) {
            mostrarComponentesTriangulo();
        } else {
            ocultarComponentes();
        }
    }//GEN-LAST:event_cbxTipoFiguraActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String figu = cbxTipoFigura.getSelectedItem().toString();
        if (figu.equals("Cuadrado")) {
            calcularDatosCuadrado();
        } else if (figu.equals("Rectangulo")) {
            calcularDatosRectangulo();
        } else if (figu.equals("Triangulo")) {
            calcularDatosTriangulo();
        } else {
            ocultarComponentes();
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        graficar();
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void btnRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestablecerActionPerformed

   
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
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnRestablecer;
    private javax.swing.JComboBox cbxTipoFigura;
    private javax.swing.JLabel labelArea;
    private javax.swing.JLabel labelCoordenadaX;
    private javax.swing.JLabel labelCoordenadaY;
    private javax.swing.JLabel labelFigura;
    private javax.swing.JLabel labelLado1;
    private javax.swing.JLabel labelLado2;
    private javax.swing.JLabel labelLado3;
    private javax.swing.JLabel labelPerimetro;
    private javax.swing.JLabel labelResArea;
    private javax.swing.JLabel labelResPeri;
    private javax.swing.JLabel labelResTipo;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labelTituloConfiguraciones;
    private javax.swing.JLabel labelTituloGrafica;
    private javax.swing.JLabel labelTituloPrincipal;
    private javax.swing.JPanel panelConfiguracion;
    private javax.swing.JPanel panelGrafica;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtCoordenadaX;
    private javax.swing.JTextField txtCoordenadaY;
    private javax.swing.JTextField txtLado1;
    private javax.swing.JTextField txtLado2;
    private javax.swing.JTextField txtLado3;
    // End of variables declaration//GEN-END:variables
}
