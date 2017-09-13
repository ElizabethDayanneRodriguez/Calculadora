/*
 * Examen primer parcial: Calculadora de Dolares.
 * @author: Rodriguez de la Mora Elizabeth Dayanne 
 * @version:  1.0 
 * @fecha; 12/09/2017
*/
package ExamenDolares;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Grafico extends JFrame implements ActionListener {

    /* CONSTRUCTOR GRAFICO DEL PROGRAMA*/
    JButton Convertir, borrar, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, punto;
    JTextField Uno;
    JLabel Termino1;
    Font font = new Font("Century Gothic", Font.LAYOUT_RIGHT_TO_LEFT, 16);
    String Pantalla = "";

    public Grafico() {
        setTitle("Convertidor a dolares");
        setLayout(null);
        this.getContentPane().setBackground(Color.white);

        Termino1 = new JLabel("Convertidor a dolares");
        Termino1.setFont(font);
        Termino1.setBounds(20, 20, 300, 30);
        add(Termino1);

        Uno = new JTextField("");
        Uno.setBounds(200, 100, 100, 30);
        Uno.setEditable(false);
        add(Uno);

        uno = new JButton("1");
        uno.setBounds(0, 50, 50, 50);
        uno.addActionListener(this);
        uno.setBackground(Color.pink);
        add(uno);

        dos = new JButton("2");
        dos.setBounds(50, 50, 50, 50);
        dos.addActionListener(this);
        dos.setBackground(Color.pink);
        add(dos);

        tres = new JButton("3");
        tres.setBounds(100, 50, 50, 50);
        tres.addActionListener(this);
        tres.setBackground(Color.pink);
        add(tres);

        cuatro = new JButton("4");
        cuatro.setBounds(0, 100, 50, 50);
        cuatro.addActionListener(this);
        cuatro.setBackground(Color.pink);
        add(cuatro);

        cinco = new JButton("5");
        cinco.setBounds(50, 100, 50, 50);
        cinco.addActionListener(this);
        cinco.setBackground(Color.pink);
        add(cinco);

        seis = new JButton("6");
        seis.setBounds(50, 150, 50, 50);
        seis.addActionListener(this);
        seis.setBackground(Color.pink);
        add(seis);

        siete = new JButton("7");
        siete.setBounds(0, 150, 50, 50);
        siete.addActionListener(this);
        siete.setBackground(Color.pink);
        add(siete);

        ocho = new JButton("8");
        ocho.setBounds(100, 100, 50, 50);
        ocho.addActionListener(this);
        ocho.setBackground(Color.pink);
        add(ocho);

        nueve = new JButton("9");
        nueve.setBounds(100, 150, 50, 50);
        nueve.addActionListener(this);
        nueve.setBackground(Color.pink);
        add(nueve);

        cero = new JButton("0");
        cero.setBounds(50, 200, 50, 50);
        cero.addActionListener(this);
        cero.setBackground(Color.pink);
        add(cero);
        
        punto = new JButton(".");
        punto.setBounds(00, 200, 50, 50);
        punto.addActionListener(this);
        punto.setBackground(Color.pink);
        add(punto);

        Convertir = new JButton("Convertir a dolares");
        Convertir.setBounds(200, 200, 300, 30);
        Convertir.setFont(font);
        Convertir.setBackground(Color.orange);
        Convertir.addActionListener(this);
        add(Convertir);

        borrar = new JButton("Borrar");
        borrar.setBounds(200, 200, 300, 30);
        borrar.setFont(font);
        borrar.setBackground(Color.orange);
        borrar.addActionListener(this);
        add(borrar);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 300);
    }

    //Sobrescribimos metodo de Evento por ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        //Comparamos que valor ingresa el usuario para ponerlo en el JTextField
        if (e.getSource() == uno) {
            Pantalla = Pantalla + "1";
            Uno.setText(Pantalla);
        } else if (e.getSource() == dos) {
            Pantalla = Pantalla + "2";
            Uno.setText(Pantalla);
        } else if (e.getSource() == tres) {
            Pantalla = Pantalla + "3";
            Uno.setText(Pantalla);
        } else if (e.getSource() == cuatro) {
            Pantalla = Pantalla + "4";
            Uno.setText(Pantalla);
        } else if (e.getSource() == cinco) {
            Pantalla = Pantalla + "5";
            Uno.setText(Pantalla);
        } else if (e.getSource() == seis) {
            Pantalla = Pantalla + "6";
            Uno.setText(Pantalla);
        } else if (e.getSource() == siete) {
            Pantalla = Pantalla + "7";
            Uno.setText(Pantalla);
        } else if (e.getSource() == ocho) {
            Pantalla = Pantalla + "8";
            Uno.setText(Pantalla);
        } else if (e.getSource() == nueve) {
            Pantalla = Pantalla + "9";
            Uno.setText(Pantalla);
        } else if (e.getSource() == cero) {
            Pantalla = Pantalla + "0";
            Uno.setText(Pantalla);
        } else {
            //Borra contenido del JTextField
            if (e.getSource() == borrar) {
                Pantalla = "";
                Uno.setText(Pantalla);
                //Recupera y despliega el resultado del calculo de la clase Convertidor
            } else if (e.getSource() == Convertir) {
                Convertidor Datos = new Convertidor();
                Datos.setPesos(Integer.parseInt(Uno.getText()));
                float Resultados = Datos.Converter();
                JOptionPane.showMessageDialog(borrar, "El resultado es" + Resultados);

            }

        }

    }
}
