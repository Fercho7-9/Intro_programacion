package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaNumero {
    private JPanel PanelPrincipal;
    private JTextField txt_n1;
    private JTextField txt_n2;
    private JLabel lbl_resultado;
    private JButton btn_suma;
    private JButton btn_multiplicacion;
    private JButton btn_resta;
    private JButton btn_divide;

    //Integer.parseInt
    public SumaNumero() {
        btn_suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double suma = Double.parseDouble(txt_n2.getText())
                        / Double.parseDouble(txt_n1.getText());
                System.out.println(suma);
                lbl_resultado.setText(String.valueOf(suma));
            }
        });
        btn_resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double resta = Double.parseDouble(txt_n2.getText())
                        - Double.parseDouble(txt_n1.getText());
                System.out.println(resta);
                lbl_resultado.setText(String.valueOf(resta));
            }
        });
        btn_multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double mult = Double.parseDouble(txt_n2.getText())
                        * Double.parseDouble(txt_n1.getText());
                System.out.println(mult);
                lbl_resultado.setText(String.valueOf(mult));
            }
        });
        btn_divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double divi = Double.parseDouble(txt_n2.getText())
                        / Double.parseDouble(txt_n1.getText());
                System.out.println(divi);
                lbl_resultado.setText(String.valueOf(divi));
            }
        });

    }

    public static void main(String[] args) {
        JFrame inicio = new JFrame("SumaNumero");
        inicio.setContentPane(new SumaNumero().PanelPrincipal);
        inicio.pack();
        inicio.setVisible(true);
    }
}
