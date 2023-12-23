package br.com.pacote.contas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Locale;

public class Conta1 extends JFrame  implements ActionListener {
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

    public Conta1() {


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
        num1.setText("");

        num2=new JTextField();
        num2.setFont(new Font("Arial",Font.BOLD,40));
        num2.setBounds(100,100,200,50);
        num2.setText("");

        num3=new JTextField();
        num3.setFont(new Font("Arial",Font.BOLD,40));
        num3.setBounds(100,300,200,50);
        num3.setText("");



        caixaDeNumero1=new JLabel("qual o preço do fundo imobiliario?");
        caixaDeNumero1.setBounds(100 ,-80 ,400 ,300);
        caixaDeNumero1.setFont(new Font("Arial",Font.PLAIN,14));

        caixaDeNumero2=new JLabel("quantos fundos imobiliarios?");

        caixaDeNumero2.setBounds(100 ,30 ,400 ,300);
        caixaDeNumero2.setFont(new Font("Arial",Font.PLAIN,14));

        caixaDeNumero3=new JLabel("quanto de dividendos?");
        caixaDeNumero3.setBounds(100 ,130 ,400 ,300);
        caixaDeNumero3.setFont(new Font("Arial",Font.PLAIN,14));


        texto1=new JLabel("o resultado e ?");
        texto1.setBounds(50 ,300 ,8300 ,300);
        texto1.setFont(new Font("Arial",Font.PLAIN,26));
        calculo.add(texto1);

        texto2=new JLabel("zum");
        texto2.setBounds(50 ,350 ,8300 ,300);
        texto2.setFont(new Font("Arial",Font.PLAIN,26));


        texto3=new JTextPane();
        texto3.setBounds(50 ,480 ,500 ,100);
        texto3.setFont(new Font("Arial",Font.PLAIN,26));
        texto3.setEditable(false);


        JButton resultado=new JButton("resultado");

        resultado.setBounds(450,170,250,70);
        resultado.setFont(new Font("Arial",Font.BOLD,30));
        resultado.setForeground(new Color(234, 10, 10));
        resultado.setBackground(new Color(0, 0, 0));


        calculo.add(num1);
        calculo.add(num2);
        calculo.add(caixaDeNumero1);
        calculo.add(caixaDeNumero2);
        calculo.add(caixaDeNumero3);
        calculo.add(resultado);
        resultado.addActionListener(this::resultado);
        calculo.add(num3);
        texto4= new JTextPane();
        texto4.setText("teste");
        texto4.setEditable(false);



    }

    private void resultado(ActionEvent actionEvent) {



        Double conteudo1=Double.parseDouble(num1.getText());

        double conteudo3=Double.parseDouble(num3.getText().replace(",","."));
        double conteudo2=Double.parseDouble(num2.getText().replace(",","."));
        var sominha =conteudo2*conteudo1;
        double valorSomado=(conteudo3*conteudo1);
        var tudo=Math.floor(valorSomado);


        texto4.setBounds(50 ,370 ,700 ,100);
        texto4.setFont(new Font("Arial",Font.PLAIN,26));
        texto4.setEditable(false);

//texto2.setText(" tudo\n deu "+tudo+ " reais por mes\n");




        texto4.setText("ao todo com "+num3.getText()+" de dividendos e com "+num1.getText()+" de fundo imobiliario"+" tudo deu "+tudo+ " reais por mes\n");



        texto3.setText("voce iria precisar "+new DecimalFormat("#,##0.00").format(sominha)+" reais");


        calculo.add(texto4);
        calculo.add(texto3);





    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
