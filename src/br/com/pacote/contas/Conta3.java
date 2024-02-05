package br.com.pacote.contas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Conta3 extends JFrame  implements ActionListener {
    JTextField num1;
    JTextField num2;

    JLabel caixaDeNumero1;
    JLabel caixaDeNumero2;

    JTextPane texto3;

    JTextPane texto4;

    JFrame calculo;
    public Conta3(){

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

        num1.setBounds(100,100,200,50);
        num1.setText("");

    num2=new JTextField();
        num2.setFont(new Font("Arial",Font.BOLD,40));
      num2.setBounds(95 ,200 ,200 ,50);

        num2.setText("");

    caixaDeNumero1=new JLabel("qual e o valor desejado dos dividendos alcançara?");
        caixaDeNumero1.setBounds(100 ,-80 ,400 ,300);
        caixaDeNumero1.setFont(new Font("Arial",Font.PLAIN,14));

    caixaDeNumero2=new JLabel("quanto que o fundo dara de retorno?");
        caixaDeNumero2.setBounds(100 ,30 ,400 ,300);
        caixaDeNumero2.setFont(new Font("Arial",Font.PLAIN,14));

    JButton resultado=new JButton("resultado");

        resultado.setBounds(400,150,250,70);
        resultado.setFont(new Font("Arial",Font.BOLD,30));
        resultado.setForeground(new Color(234, 10, 10));
        resultado.setBackground(new Color(0, 0, 0));
        texto3=new JTextPane();
        texto3.setBounds(50 ,380 ,600 ,100);
        texto3.setFont(new Font("Arial",Font.PLAIN,26));

        calculo.add(num1);
        calculo.add(num2);
        calculo.add(caixaDeNumero1);
        calculo.add(caixaDeNumero2);
        calculo.add(resultado);
        resultado.addActionListener(this::resultado3);
        texto4= new JTextPane();
        texto4.setText("teste");
        texto4.setEditable(false);

}

    private void resultado3(ActionEvent actionEvent) {
        double conteudo1=Double.parseDouble(num1.getText().replace(",","."));
        double conteudo2=Double.parseDouble(num2.getText().replace(",","."));
        var sominha =conteudo1/conteudo2;




        texto3.setText(" voce precisaria no total de "+Math.floor(sominha) +" fundos para ter o valor de dividendos por mes de "+num1.getText() );

        texto3.setEditable(false);

        calculo.add(texto3);
}

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
