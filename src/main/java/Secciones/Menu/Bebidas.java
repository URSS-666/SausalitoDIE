/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Secciones.Menu;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.Vista.secciones.facturaPanel;

/**
 *
 * @author Sofia Useche
 */
public class Bebidas extends javax.swing.JPanel {

    private facturaPanel facturaPanel;

    /**
     * Creates new form Bebidas
     */
    public Bebidas() {
        initComponents();
        configurarBoton(BotonJugos, "Jugos naturales", "/jugos-naturales-.jpg","", "$4000");
        configurarBoton(BotonLimonada, "Limonada natural", "/limonada-natural-.jpg","", "$4000");
        configurarBoton(BotonCerezada, "Cerezada", "/cerezada-.jpg","", "$5000");
        configurarBoton(BotonSorbetes, "Sorbetes", "/sorbetes-.jpg","", "$6000");
        configurarBoton(BotonPoker, "Poker", "/poker-.jpg","", "$3500");
        configurarBoton(BotonAguila, "Aguila", "/aguila-.jpg","", "$3500");
        configurarBoton(BotonCosteña, "Costeña", "/costeña-.jpg","", "$3500");
        configurarBoton(BotonAndina, "Andina", "/andina-.jpg","", "$3500");
        configurarBoton(BotonAguilaLight, "Agula Light", "/aguila-light-.jpg","", "$4000");
        configurarBoton(BotonClubColombia, "Club colombia", "/club-colombia-.jpg","", "$4500");
        configurarBoton(BotonCoronita, "Coronita", "/coronita-.jpg","", "$5000");
        configurarBoton(BotonCorona, "Corona", "/corona-.jpg","", "$8000");
        configurarBoton(BotonAgua, "Botella de agua", "/botella-agua-.png","", "$2500");
        configurarBoton(BotonGaseosa350, "Gaseosa 350 ml", "/gaseosa-350ml-.jpg","", "$3000");
        configurarBoton(BotonGaseosa1_2, "Gaseosa 1.5 litros", "/gaseosa-1.5litros-.jpg","", "$7000");
        configurarBoton(BotonGaseosa3, "Gaseosa 3 litros", "/gaseosa-3litros-.jpg","", "$10000");
        configurarBoton(BotonColaPola, "Cola y pola 1.5 litros", "/cola-y-pola-1.5litros-.jpg","", "$7000");

        facturaPanel = new facturaPanel();
        facturaPanel.setVisible(false);

        addActionListenerToButton(BotonJugos);
        addActionListenerToButton(BotonLimonada);
        addActionListenerToButton(BotonCerezada);
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
    private void configurarBoton(javax.swing.JButton boton, String texto, String urlImagen, String precio, String descripcion) {
        boton.setIcon(icono(urlImagen, 143, 120)); 
        boton.setText("<html>\n    <div style=\"text-align: center; margin-top: 10px;\">\n"
                    + "        <font style=\"font-size:12px;\"><b>" + texto + "</b></font>\n"
                    + "        </div>\n"
                    + "        <div style=\"text-align: center; margin-top: 10px;\">\n"
                    + "        <font style=\"font-size:10px;\">" + descripcion + "</font>\n"
                    + "        </div>\n"
                    +"         <div style=\"text-align: center; margin-top: 10px;\">\n"
                    + "        <font style=\"font-size:10px;\">" + precio + "</font>\n"
                    + "    </div>\n</html>");
        boton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM); 
        boton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    }
    
    public Icon icono(String url, int ancho, int alto) {
    ImageIcon img = new ImageIcon(getClass().getResource(url));
    return new ImageIcon(img.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Buttons_Bebidas = new javax.swing.JPanel();
        BotonJugos = new javax.swing.JButton();
        BotonLimonada = new javax.swing.JButton();
        BotonCerezada = new javax.swing.JButton();
        BotonSorbetes = new javax.swing.JButton();
        BotonPoker = new javax.swing.JButton();
        BotonAguila = new javax.swing.JButton();
        BotonCosteña = new javax.swing.JButton();
        BotonAndina = new javax.swing.JButton();
        BotonAguilaLight = new javax.swing.JButton();
        BotonClubColombia = new javax.swing.JButton();
        BotonCoronita = new javax.swing.JButton();
        BotonCorona = new javax.swing.JButton();
        BotonAgua = new javax.swing.JButton();
        BotonGaseosa350 = new javax.swing.JButton();
        BotonGaseosa1_2 = new javax.swing.JButton();
        BotonGaseosa3 = new javax.swing.JButton();
        BotonColaPola = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Buttons_Bebidas.setBackground(new java.awt.Color(204, 204, 204));

        BotonJugos.setBackground(new java.awt.Color(255, 255, 255));
        BotonJugos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonJugos.setForeground(new java.awt.Color(0, 0, 0));
        BotonJugos.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonJugos.setBorderPainted(false);
        BotonJugos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonJugos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugosActionPerformed(evt);
            }
        });

        BotonLimonada.setBackground(new java.awt.Color(255, 255, 255));
        BotonLimonada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonLimonada.setForeground(new java.awt.Color(0, 0, 0));
        BotonLimonada.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonLimonada.setBorderPainted(false);
        BotonLimonada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonLimonada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimonadaActionPerformed(evt);
            }
        });

        BotonCerezada.setBackground(new java.awt.Color(255, 255, 255));
        BotonCerezada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonCerezada.setForeground(new java.awt.Color(0, 0, 0));
        BotonCerezada.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonCerezada.setBorderPainted(false);
        BotonCerezada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCerezada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerezadaActionPerformed(evt);
            }
        });

        BotonSorbetes.setBackground(new java.awt.Color(255, 255, 255));
        BotonSorbetes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonSorbetes.setForeground(new java.awt.Color(0, 0, 0));
        BotonSorbetes.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonSorbetes.setBorderPainted(false);
        BotonSorbetes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonSorbetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSorbetesActionPerformed(evt);
            }
        });

        BotonPoker.setBackground(new java.awt.Color(255, 255, 255));
        BotonPoker.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonPoker.setForeground(new java.awt.Color(0, 0, 0));
        BotonPoker.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonPoker.setBorderPainted(false);
        BotonPoker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonPoker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPokerActionPerformed(evt);
            }
        });

        BotonAguila.setBackground(new java.awt.Color(255, 255, 255));
        BotonAguila.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonAguila.setForeground(new java.awt.Color(0, 0, 0));
        BotonAguila.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonAguila.setBorderPainted(false);
        BotonAguila.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAguila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAguilaActionPerformed(evt);
            }
        });

        BotonCosteña.setBackground(new java.awt.Color(255, 255, 255));
        BotonCosteña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonCosteña.setForeground(new java.awt.Color(0, 0, 0));
        BotonCosteña.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonCosteña.setBorderPainted(false);
        BotonCosteña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCosteña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCosteñaActionPerformed(evt);
            }
        });

        BotonAndina.setBackground(new java.awt.Color(255, 255, 255));
        BotonAndina.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonAndina.setForeground(new java.awt.Color(0, 0, 0));
        BotonAndina.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonAndina.setBorderPainted(false);
        BotonAndina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAndina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAndinaActionPerformed(evt);
            }
        });

        BotonAguilaLight.setBackground(new java.awt.Color(255, 255, 255));
        BotonAguilaLight.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonAguilaLight.setForeground(new java.awt.Color(0, 0, 0));
        BotonAguilaLight.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonAguilaLight.setBorderPainted(false);
        BotonAguilaLight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAguilaLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAguilaLightActionPerformed(evt);
            }
        });

        BotonClubColombia.setBackground(new java.awt.Color(255, 255, 255));
        BotonClubColombia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonClubColombia.setForeground(new java.awt.Color(0, 0, 0));
        BotonClubColombia.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonClubColombia.setBorderPainted(false);
        BotonClubColombia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonClubColombia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonClubColombiaActionPerformed(evt);
            }
        });

        BotonCoronita.setBackground(new java.awt.Color(255, 255, 255));
        BotonCoronita.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonCoronita.setForeground(new java.awt.Color(0, 0, 0));
        BotonCoronita.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonCoronita.setBorderPainted(false);
        BotonCoronita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCoronita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCoronitaActionPerformed(evt);
            }
        });

        BotonCorona.setBackground(new java.awt.Color(255, 255, 255));
        BotonCorona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonCorona.setForeground(new java.awt.Color(0, 0, 0));
        BotonCorona.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonCorona.setBorderPainted(false);
        BotonCorona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCorona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCoronaActionPerformed(evt);
            }
        });

        BotonAgua.setBackground(new java.awt.Color(255, 255, 255));
        BotonAgua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonAgua.setForeground(new java.awt.Color(0, 0, 0));
        BotonAgua.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonAgua.setBorderPainted(false);
        BotonAgua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAguaActionPerformed(evt);
            }
        });

        BotonGaseosa350.setBackground(new java.awt.Color(255, 255, 255));
        BotonGaseosa350.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonGaseosa350.setForeground(new java.awt.Color(0, 0, 0));
        BotonGaseosa350.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonGaseosa350.setBorderPainted(false);
        BotonGaseosa350.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGaseosa350.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGaseosa350ActionPerformed(evt);
            }
        });

        BotonGaseosa1_2.setBackground(new java.awt.Color(255, 255, 255));
        BotonGaseosa1_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonGaseosa1_2.setForeground(new java.awt.Color(0, 0, 0));
        BotonGaseosa1_2.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonGaseosa1_2.setBorderPainted(false);
        BotonGaseosa1_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGaseosa1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGaseosa1_2ActionPerformed(evt);
            }
        });

        BotonGaseosa3.setBackground(new java.awt.Color(255, 255, 255));
        BotonGaseosa3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonGaseosa3.setForeground(new java.awt.Color(0, 0, 0));
        BotonGaseosa3.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonGaseosa3.setBorderPainted(false);
        BotonGaseosa3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGaseosa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGaseosa3ActionPerformed(evt);
            }
        });

        BotonColaPola.setBackground(new java.awt.Color(255, 255, 255));
        BotonColaPola.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonColaPola.setForeground(new java.awt.Color(0, 0, 0));
        BotonColaPola.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        BotonColaPola.setBorderPainted(false);
        BotonColaPola.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonColaPola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonColaPolaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Buttons_BebidasLayout = new javax.swing.GroupLayout(Buttons_Bebidas);
        Buttons_Bebidas.setLayout(Buttons_BebidasLayout);
        Buttons_BebidasLayout.setHorizontalGroup(
            Buttons_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Buttons_BebidasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Buttons_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Buttons_BebidasLayout.createSequentialGroup()
                        .addComponent(BotonJugos, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(BotonLimonada, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(BotonCerezada, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(BotonSorbetes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Buttons_BebidasLayout.createSequentialGroup()
                        .addComponent(BotonPoker, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(BotonAguila, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(BotonCosteña, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(BotonAndina, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Buttons_BebidasLayout.createSequentialGroup()
                        .addComponent(BotonAguilaLight, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(BotonClubColombia, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(BotonCoronita, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(BotonCorona, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Buttons_BebidasLayout.createSequentialGroup()
                        .addComponent(BotonAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(BotonGaseosa350, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(BotonGaseosa1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(BotonGaseosa3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotonColaPola, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        Buttons_BebidasLayout.setVerticalGroup(
            Buttons_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Buttons_BebidasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Buttons_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonJugos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonLimonada, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCerezada, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonSorbetes, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(Buttons_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonPoker, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAguila, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCosteña, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAndina, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(Buttons_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonAguilaLight, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonClubColombia, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCoronita, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCorona, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(Buttons_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGaseosa350, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGaseosa1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGaseosa3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(BotonColaPola, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(Buttons_Bebidas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPokerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPokerActionPerformed

    private void BotonCosteñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCosteñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCosteñaActionPerformed

    private void BotonJugosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonJugosActionPerformed

    private void BotonLimonadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimonadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonLimonadaActionPerformed

    private void BotonCerezadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerezadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCerezadaActionPerformed

    private void BotonSorbetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSorbetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSorbetesActionPerformed

    private void BotonAguilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAguilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAguilaActionPerformed

    private void BotonAndinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAndinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAndinaActionPerformed

    private void BotonAguilaLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAguilaLightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAguilaLightActionPerformed

    private void BotonClubColombiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClubColombiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonClubColombiaActionPerformed

    private void BotonCoronitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCoronitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCoronitaActionPerformed

    private void BotonCoronaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCoronaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCoronaActionPerformed

    private void BotonAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAguaActionPerformed

    private void BotonGaseosa350ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGaseosa350ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonGaseosa350ActionPerformed

    private void BotonGaseosa1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGaseosa1_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonGaseosa1_2ActionPerformed

    private void BotonGaseosa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGaseosa3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonGaseosa3ActionPerformed

    private void BotonColaPolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonColaPolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonColaPolaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgua;
    private javax.swing.JButton BotonAguila;
    private javax.swing.JButton BotonAguilaLight;
    private javax.swing.JButton BotonAndina;
    private javax.swing.JButton BotonCerezada;
    private javax.swing.JButton BotonClubColombia;
    private javax.swing.JButton BotonColaPola;
    private javax.swing.JButton BotonCorona;
    private javax.swing.JButton BotonCoronita;
    private javax.swing.JButton BotonCosteña;
    private javax.swing.JButton BotonGaseosa1_2;
    private javax.swing.JButton BotonGaseosa3;
    private javax.swing.JButton BotonGaseosa350;
    private javax.swing.JButton BotonJugos;
    private javax.swing.JButton BotonLimonada;
    private javax.swing.JButton BotonPoker;
    private javax.swing.JButton BotonSorbetes;
    private javax.swing.JPanel Buttons_Bebidas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
