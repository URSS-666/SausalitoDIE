/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Secciones.Menu;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.Vista.secciones.facturaPanel;

/**
 *
 * @author Sofia Useche
 */
public class Carnes extends javax.swing.JPanel {

    private facturaPanel facturaPanel;

    /**
     * Creates new form Carnes
     */
    public Carnes() {
        initComponents();
        configurarBoton(BotonTernera, "Ternera a la llanera", "/ternera-a-la-llanera.jpeg", "$30000",null, "$40000" );
        configurarBoton(BotonCerdo, "Cerdo asado", "/cerdo-asado.jpeg", "$5000",null,"$40000");
        configurarBoton(BotonCordero, "Cordero al horno", "/cordero-al-horno-.jpeg", "$30000","Solo domingos","$40000");
        configurarBoton(BotonCarnesMixtas, "Carnes mixtas", "/carnes-mistas.jpeg", "$30000","Res/cerdo, res/cordero, cerdo/cordero","$40000");
        configurarBoton(BotonTricarne, "Tricarne", "/tricarne.jpeg", "$70000","Res, cerdo, cordero", null);

        facturaPanel = new facturaPanel();
        facturaPanel.setVisible(false);

        addActionListenerToButton(BotonTernera);
        addActionListenerToButton(BotonCerdo);
        addActionListenerToButton(BotonCordero);
    }

    private void addActionListenerToButton(JButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleFacturaPanelVisibility();
                registerPurchase();
            }
        });
    }

    private void toggleFacturaPanelVisibility() {
        facturaPanel.setVisible(!facturaPanel.isVisible());
    }

    private void registerPurchase() {
        // Add code to register the purchase in the Orden_Detalle table
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void configurarBoton(javax.swing.JButton boton, String texto, String urlImagen, String precio, String descripcion, String precio1) {
    // Inicia el texto HTML para el botón
    StringBuilder html = new StringBuilder();
    html.append("<html>")
        .append("    <div style=\"text-align: center; margin-top: 10px;\">")
        .append("        <font style=\"font-size:12px;\"><b>").append(texto).append("</b></font>")
        .append("    </div>");

    // Agrega descripción si está disponible
    if (descripcion != null && !descripcion.trim().isEmpty()) {
        html.append("    <div style=\"text-align: center; margin-top: 10px;\">")
            .append("        <font style=\"font-size:10px;\">").append(descripcion).append("</font>")
            .append("    </div>");
    }

    // Agrega el precio si está disponible
    if (precio != null && !precio.trim().isEmpty()) {
        html.append("    <div style=\"text-align: center; margin-top: 10px;\">")
            .append("        <font style=\"font-size:10px;\">").append(precio).append("</font>")
            .append("    </div>");
    }

    // Agrega precio1 si está disponible
    if (precio1 != null && !precio1.trim().isEmpty()) {
        html.append("    <div style=\"text-align: center; margin-top: 10px;\">")
            .append("        <font style=\"font-size:10px;\">").append(precio1).append("</font>")
            .append("    </div>");
    }

    html.append("</html>");

    // Configura el botón con la imagen y el texto generado
    boton.setIcon(icono(urlImagen, 143, 120)); 
    boton.setText(html.toString());
    boton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM); 
    boton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
}
    
    public Icon icono(String url, int ancho, int alto) {
    ImageIcon img = new ImageIcon(getClass().getResource(url));
    return new ImageIcon(img.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Buttons_Carnes = new javax.swing.JPanel();
        BotonTernera = new javax.swing.JButton();
        BotonCerdo = new javax.swing.JButton();
        BotonCordero = new javax.swing.JButton();
        BotonCarnesMixtas = new javax.swing.JButton();
        BotonTricarne = new javax.swing.JButton();

        Buttons_Carnes.setBackground(new java.awt.Color(204, 204, 204));
        Buttons_Carnes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonTernera.setBackground(new java.awt.Color(255, 255, 255));
        BotonTernera.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonTernera.setForeground(new java.awt.Color(0, 0, 0));
        BotonTernera.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonTernera.setBorderPainted(false);
        BotonTernera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonTernera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTerneraActionPerformed(evt);
            }
        });
        Buttons_Carnes.add(BotonTernera, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 173, 280));

        BotonCerdo.setBackground(new java.awt.Color(255, 255, 255));
        BotonCerdo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonCerdo.setForeground(new java.awt.Color(0, 0, 0));
        BotonCerdo.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonCerdo.setBorderPainted(false);
        BotonCerdo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCerdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerdoActionPerformed(evt);
            }
        });
        Buttons_Carnes.add(BotonCerdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 173, 280));

        BotonCordero.setBackground(new java.awt.Color(255, 255, 255));
        BotonCordero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonCordero.setForeground(new java.awt.Color(0, 0, 0));
        BotonCordero.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonCordero.setBorderPainted(false);
        BotonCordero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCordero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCorderoActionPerformed(evt);
            }
        });
        Buttons_Carnes.add(BotonCordero, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 173, 280));

        BotonCarnesMixtas.setBackground(new java.awt.Color(255, 255, 255));
        BotonCarnesMixtas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonCarnesMixtas.setForeground(new java.awt.Color(0, 0, 0));
        BotonCarnesMixtas.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonCarnesMixtas.setBorderPainted(false);
        BotonCarnesMixtas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCarnesMixtas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCarnesMixtasActionPerformed(evt);
            }
        });
        Buttons_Carnes.add(BotonCarnesMixtas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 175, 280));

        BotonTricarne.setBackground(new java.awt.Color(255, 255, 255));
        BotonTricarne.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonTricarne.setForeground(new java.awt.Color(0, 0, 0));
        BotonTricarne.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonTricarne.setBorderPainted(false);
        BotonTricarne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonTricarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTricarneActionPerformed(evt);
            }
        });
        Buttons_Carnes.add(BotonTricarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 173, 280));

        jScrollPane2.setViewportView(Buttons_Carnes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonTerneraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTerneraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonTerneraActionPerformed

    private void BotonCerdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerdoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCerdoActionPerformed

    private void BotonCorderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCorderoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCorderoActionPerformed

    private void BotonCarnesMixtasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCarnesMixtasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCarnesMixtasActionPerformed

    private void BotonTricarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTricarneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonTricarneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCarnesMixtas;
    private javax.swing.JButton BotonCerdo;
    private javax.swing.JButton BotonCordero;
    private javax.swing.JButton BotonTernera;
    private javax.swing.JButton BotonTricarne;
    private javax.swing.JPanel Buttons_Carnes;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
