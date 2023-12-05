import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Scream extends JFrame  implements ActionListener{

    JTextField num1;
    JTextField num2;
    JTextField num3;
    JLabel caixaDeNumero1;
    JLabel caixaDeNumero2;
    JLabel caixaDeNumero3;
    JLabel texto1;
    JLabel texto2;
    JLabel texto3;

    JFrame calculo;
    public Scream(){

        setTitle("SUPER CALCULADORA DE DIVIDENDOS");
        setSize(1240,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
       setLayout(null);
        setResizable(false);
        setLocale(null);



       JButton calculo1=new JButton("calculo 1");
calculo1.setBounds(200,380,250,70);
calculo1.setFont(new Font("Arial",Font.BOLD,40));
calculo1.setForeground(new Color(234, 10, 10));
calculo1.setBackground(new Color(0, 0, 0));

JButton calculo2 =new JButton();
calculo2.setText("calculo 2 ");
        calculo2.setBounds(500,380,250,70);
        calculo2.setFont(new Font("Arial",Font.BOLD,40));
        calculo2.setForeground(new Color(200, 20, 20));
        calculo2.setBackground(new Color(0, 0, 0));

        JButton calculo3 =new JButton();
        calculo3.setText("calculo 3 ");
        calculo3.setBounds(800,380,250,70);
        calculo3.setFont(new Font("Arial",Font.BOLD,40));
        calculo3.setForeground(new Color(200, 20, 20));
        calculo3.setBackground(new Color(0, 0, 0));






        JLabel BemVindo=new JLabel("SUPER CALCULADOR A DE DIVIDENDOS");
        BemVindo.setFont(new Font("Arial",Font.BOLD,40));
        BemVindo.setBounds(202,10,2000,200);



        add(calculo1);
        add(calculo2);
       add(calculo3);

       calculo1.addActionListener(this);
       calculo2.addActionListener(this::teste);
       calculo3.addActionListener((this::calculo3));


        add(BemVindo);
        setVisible(true);
    }





    @Override
    public void actionPerformed(ActionEvent e) {



        JOptionPane.showMessageDialog(null,
                "                                                                                         ESSE BUTAO FARA:\n" +
                        "                        explemplo: se uma açao custa 8,00 e ela retorna 0,06 centavos com 900 açoes ela daria 54,00 rais por mes\n" +
                        "                        entao vai calcular o preço da açao e o retorno vai pegar um tanto de açao 900 voltaria um tanto\n" +
                        "                        vai calcular se voce tiver um tanto de açao qunto ela ira dar de retorno e quanto voce precisa apar comprar essas açao","calculo1",JOptionPane.WARNING_MESSAGE);

        calculo=new JFrame();

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


        texto3=new JLabel("zum");
        texto3.setBounds(50 ,390 ,8300 ,300);
        texto3.setFont(new Font("Arial",Font.PLAIN,26));



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



    }

    private void resultado(ActionEvent actionEvent) {



      int conteudo1=Integer.parseInt(num1.getText());

double conteudo3=Double.parseDouble(num3.getText().replace(",","."));
double conteudo2=Double.parseDouble(num2.getText().replace(",","."));
var sominha =conteudo2*conteudo1;
       double valorSomado=(conteudo3*conteudo1);
       var tudo=Math.floor(valorSomado);


texto1.setText("ao todo com "+num3.getText()+" de dividendos e com "+num1.getText()+" de fundo imobiliario");
texto2.setText(" tudo\n deu "+tudo+ " reais por mes\n");
texto3.setText("voce iria precisar "+new DecimalFormat(".0").format(sominha)+"reais");
calculo.add(texto2);
calculo.add(texto3);



    }

    private void teste(ActionEvent actionEvent) {
      JOptionPane recado=new JOptionPane("futuro");
        JOptionPane.showMessageDialog(null,
                " isso ainda sera adicionado no futuro","futuro",JOptionPane.WARNING_MESSAGE);


    }
    private void calculo3(ActionEvent actionEvent) {
        JOptionPane recado=new JOptionPane("futuro");
        JOptionPane.showMessageDialog(null,
                " isso ainda sera adicionado no futuro","futuro",JOptionPane.WARNING_MESSAGE);
    }
}
