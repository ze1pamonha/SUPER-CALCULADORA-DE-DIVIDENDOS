package br.com.pacote.contas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Locale;

public class Conta2 extends JFrame  implements ActionListener {
    JTextField num1;
    JTextField num2;

    JLabel caixaDeNumero1;
    JLabel caixaDeNumero2;

    JTextPane texto3;

    JTextPane texto4;

    JFrame calculo;

    public Conta2(){

        calculo=new JFrame();
        calculo.setLocale(Locale.of("brasilian"));
        calculo.setBounds(200,200,200,200);
        calculo.setVisible(true);

        calculo.setTitle("indo ali");

        calculo.setSize(900,600);

        calculo.setLocationRelativeTo(null);
        calculo.setLayout(null);
        calculo.setResizable(false);
        calculo.setLocale(null);

        num1=new JTextField();
        num1.setFont(new Font("Arial",Font.BOLD,40));
        num1.setBounds(180 ,150 ,200 ,50);
        num1.setText("1");

        num2=new JTextField();
        num2.setFont(new Font("Arial",Font.BOLD,40));
        num2.setBounds(480,150,200,50);
        num2.setText("2");

        caixaDeNumero1=new JLabel("qual o preço das açoes");
        caixaDeNumero1.setBounds(480 ,-20 ,400 ,300);
        caixaDeNumero1.setFont(new Font("Arial",Font.PLAIN,14));

        caixaDeNumero2=new JLabel("quanto voce possui?");
        caixaDeNumero2.setBounds(180 ,-20 ,400 ,300);
        caixaDeNumero2.setFont(new Font("Arial",Font.PLAIN,14));


        JButton resultado=new JButton("resultado");

        resultado.setBounds(300,250,250,70);
        resultado.setFont(new Font("Arial",Font.BOLD,30));
        resultado.setForeground(new Color(234, 10, 10));
        resultado.setBackground(new Color(0, 0, 0));



        calculo.add(num1);
        calculo.add(num2);
        calculo.add(caixaDeNumero1);
        calculo.add(caixaDeNumero2);
        calculo.add(resultado);
        resultado.addActionListener(this::resultado2);

        texto3=new JTextPane();
        texto3.setBounds(50 ,480 ,500 ,100);
        texto3.setFont(new Font("Arial",Font.PLAIN,26));

        texto4= new JTextPane();
        texto4.setText("teste");

    }

    private void resultado2(ActionEvent actionEvent) {

        double conteudo1=Double.parseDouble(num1.getText().replace(",","."));
        double conteudo2=Double.parseDouble(num2.getText().replace(",","."));
        var sominha =conteudo1*conteudo2;

        texto4.setBounds(50 ,370 ,600 ,90);
        texto4.setFont(new Font("Arial",Font.PLAIN,26));
        texto4.setText("Se você tem "+ num1.getText()+ " e deseja comprar ações que custam "+num2.getText()+" cada ");



        var suma=Math.floor(sominha);


        texto3.setText("voce teria comprado "+new DecimalFormat("#,##0.00").format(suma) +" de fundos imobiliarios");


        texto3.setEditable(false);
        texto4.setEditable(false);
        calculo.add(texto4);
        calculo.add(texto3);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
