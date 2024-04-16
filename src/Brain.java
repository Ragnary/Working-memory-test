import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Brain  {

    Boolean testing=false;
    Brain b;
 static ArrayList list;
Gui g;
String ans;
    public Brain(Gui g){

        this.g=g;
        b=this;
        list=new ArrayList();

    g.txt.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==10){
            g.button.doClick();
        }
        }
    });
    g.button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            g.txt.setForeground(Color.black);

            if(!testing){
                new Timer(g,b).start();

            }else if(testing){

                Checkanswer();







            }
            testing=false;
            g.ta.append("\n Skriv i hur många siffror som ska testas");
            list.clear();
        }
    });



    }

    public void Checkanswer(){

        System.out.println("Radio button:"+g.rb.isSelected());
        ans=g.txt.getText();
        String ans1=""; //Rätt svar
        String ans2=""; //Användarens svar
        if(ans.contains(" ")){
            String answers[]=ans.split(" "); //bryter ned användarens svar till en lista
            for(int j=0;j<list.size();j++){

                if(g.rb.isSelected()){
                    ans1+=list.get(j); //Får fram rätt svar och omvandlar till en string
                    ans2+=answers[j]; //Omvandlar användarens svar till en string
                } else{
                    ans1+=list.get(list.size()-j-1); //Får fram rätt svar och omvandlar till en string
                    ans2+=answers[j]; //Omvandlar användarens svar till en string
                }

            }
        } else {
            ans2=ans;
            for (int i = 0; i < list.size(); i++) {
                if(g.rb.isSelected())
                ans1 += list.get(i);
                else
                    ans1+=list.get(list.size()-i-1);
            }
        }



            if(ans1.equals(ans2)){
                g.txt.setForeground(Color.green);
                g.txt.setText("Rätt");
                g.ta.setText(list.size()+" siffror visades\n"+ ans1+": Rätta svaren"+"\n" +ans2+":Dina svar");
            }

            else{
                g.txt.setForeground(Color.red);
                g.txt.setText("Fel");
                g.ta.setText(list.size()+" siffror visades\n"+ ans1+": Rätta svaren"+"\n" +ans2+":Dina svar");
            }

        }
    }



