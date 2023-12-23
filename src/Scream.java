import br.com.pacote.contas.Conta1;
import br.com.pacote.contas.Conta2;
import br.com.pacote.contas.Conta3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Locale;

public class Scream extends JFrame  implements ActionListener{



    JTextPane texto4;


    public Scream(){

        setTitle("SUPER CALCULADORA DE DIVIDENDOS");
        setSize(1240,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
       setLayout(null);
        setResizable(false);
        setLocale(null);
setLocale(Locale.of("brasilian"));


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

       texto4= new JTextPane();
       texto4.setText("teste");
       texto4.setEditable(false);

        setVisible(true);
    }





    @Override
    public void actionPerformed(ActionEvent e) {



        JOptionPane.showMessageDialog(null,
                "                                                                                         ESSE BUTÃO FARA: \n" +
                        "                        exemplo: se uma ação custa 8,00 e ela retorna 0,06 centavos com 900 açoes ela daria 54,00 rais por mes\n" +
                        "                        então vai calcular o preço da ação e o retorno vai pegar um tanto de ação 900 voltaria um tanto\n" +
                        "                        vai calcular se voce tiver um tanto de ação quanto ela ira dar de retorno e quanto voce precisa apar comprar essas ação","calculo1",JOptionPane.WARNING_MESSAGE);

        new Conta1();

    }



    private void teste(ActionEvent actionEvent) {

        JOptionPane.showMessageDialog(null,
                " suponhamos que voce teria uma certa quantia e queira comprar tudo e uma so ação isso mostraria quantas ação teria com esse valor", "opção 2", JOptionPane.WARNING_MESSAGE);
        new Conta2();
    }

    private void calculo3(ActionEvent actionEvent) {

        JOptionPane.showMessageDialog(null,
                " suponhamos que voce queira ter mil reais de dividendos isso calcularia quantas ação seria preciso para ter esse valor","futuro",JOptionPane.WARNING_MESSAGE);


        new Conta3();

    }


}
