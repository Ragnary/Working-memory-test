public class Timer extends Thread{
    Gui g;
    Brain b;

    int numturns;
    public  Timer(Gui g,Brain b){
        this. g=g;
        this.b=b;



    }

    public void run(){
        numturns= Integer.parseInt((g.txt.getText()));

        g.txt.setText("");
        g.ta.setText("");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        for(int i=0;i<numturns;i++){
            int rand= (int)(10* (Math.random()));
            g. txt.setText(Integer.toString(rand));

            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            g.txt.setText("");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            Brain.list.add(rand);

        }
        b.testing=true;
        b.g.txt.setText("");
        b.g.ta.setText("Skriv siffrorna med ett mellanslag mellan");


    }

}
