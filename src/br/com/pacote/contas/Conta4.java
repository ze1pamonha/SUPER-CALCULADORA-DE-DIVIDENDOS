package br.com.pacote.contas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Locale;

public class Conta4 extends JFrame implements ActionListener {
    JTextField num1;
    JTextField num2;
    JTextField num3;
    JLabel caixaDeNumero1;
    JLabel caixaDeNumero2;
    JLabel caixaDeNumero3;
    JLabel texto1;
    JLabel texto2;
    JTextPane texto3;

    JTextPane texto4;

    JFrame calculo;
    public Conta4(){

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
        num1.setBounds(95 ,200 ,200 ,50);
        num1.setText("0,06");

        num2=new JTextField();
        num2.setFont(new Font("Arial",Font.BOLD,40));
        num2.setBounds(100,100,200,50);
        num2.setText("");





        caixaDeNumero1=new JLabel("Dividendo Anual (R$)");
        caixaDeNumero1.setBounds(100 ,-80 ,400 ,300);
        caixaDeNumero1.setFont(new Font("Arial",Font.PLAIN,14));

        caixaDeNumero2=new JLabel("Dividend Yield Desejado (%) ");
        caixaDeNumero2.setBounds(100 ,30 ,400 ,300);
        caixaDeNumero2.setFont(new Font("Arial",Font.PLAIN,14));




        texto1=new JLabel("o resultado e ?");
        texto1.setBounds(50 ,300 ,8300 ,300);
        texto1.setFont(new Font("Arial",Font.PLAIN,26));
        calculo.add(texto1);

        texto2=new JLabel("zum");
        texto2.setBounds(50 ,350 ,8300 ,300);
        texto2.setFont(new Font("Arial",Font.PLAIN,26));



        JButton resultado=new JButton("resultado");

        resultado.setBounds(450,170,250,70);
        resultado.setFont(new Font("Arial",Font.BOLD,30));
        resultado.setForeground(new Color(234, 10, 10));
        resultado.setBackground(new Color(0, 0, 0));


        calculo.add(num1);
        calculo.add(num2);
        calculo.add(caixaDeNumero1);
        calculo.add(caixaDeNumero2);
        calculo.add(resultado);
        resultado.addActionListener(this::resultado);

        texto4= new JTextPane();
        texto4.setEditable(false);




        texto4.setBounds(50 ,370 ,700 ,100);
        texto4.setFont(new Font("Arial",Font.PLAIN,26));
        num1.setText("0,06");
    }

    private void resultado(ActionEvent actionEvent) {

        double conteudo1=Double.parseDouble(num1.getText().replace(",","."));
        double conteudo2=Double.parseDouble(num2.getText().replace(",","."));

        var valorSomado=conteudo2/conteudo1;

        var ff=Math.floor(valorSomado);


        texto4.setText("eo preço teto deese FII deve ser "+new DecimalFormat("##.##").format(valorSomado)+" ou de maneira menas precisa "+new DecimalFormat("##.##").format(ff));

        calculo.add(texto4);
        //nao tire o 0 ele e inportante
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

//dividendo pago nos últimos 12 meses
//dividido por 0,06