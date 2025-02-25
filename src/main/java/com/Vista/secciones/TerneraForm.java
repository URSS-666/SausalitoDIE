package com.Vista.secciones;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TerneraForm extends JFrame {

    public TerneraForm() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Ternera Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        JLabel label = new JLabel("This is the Ternera Form");
        panel.add(label);

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        panel.add(closeButton);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TerneraForm().setVisible(true);
            }
        });
    }
}
