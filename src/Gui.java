import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame{
    JTextField txt;
    JRadioButton rb=new JRadioButton();
    JButton button =new JButton();
    JTextArea ta=new JTextArea();


    public Gui(){


    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setTitle("Arbetsminne test");

        rb.setText("Framvänd ordning");
        rb.setPreferredSize(new Dimension(160,20));
        rb.setBackground(Color.DARK_GRAY);
        rb.setForeground(Color.WHITE);
        rb.setSelected(true);

    txt=new JTextField();
    txt.setEditable(true);
    txt.setPreferredSize(new Dimension(70,50));
    txt.setFont(new Font("Arial",0,25));



    ta.setPreferredSize(new Dimension(300,250));
    ta.setFont(new Font("Arial",0,18));
    ta.setEditable(false);
    ta.setLineWrap(true);
    ta.setText("Skriv in i fältet hur många siffror som ska testas. De kommer visas en stund, memorera de och skriv tillbaka de sedan. \n Normalt är 5-9 siffror med snitt på 7.");









    button.setPreferredSize(new Dimension(120,20));
    button.setBackground(Color.DARK_GRAY);
    button.setForeground(Color.WHITE);
    button.setText("Bekräfta");






    this.setLayout(new FlowLayout());
    this.add(button);
    this.add(txt);
    this.add(ta);
    this.add(rb);
    this.pack();
    this.setVisible(true);


    }
}
