public class UnThread1 extends Thread {
    private int inizia =0;
    private int delta =1;
    private String mionome = "";
    Contatore conta;

    UnThread1 (String nomeThread, Contatore conta){
        this.mionome= nomeThread;
        this.conta=conta;
    }

    public void run(){
        for(;;){
            System.out.println(mionome+"inizia"+inizia+", x= "+App.x+", contatore"+ conta.getValore());
            inizia+= delta;
            App.x++;
            conta.incrementa();
            try {Thread.sleep(1500);} 
            catch (InterruptedException e) {
                System.out.println(e);
            }
            if(inizia>5){
                return;
            }

        }
    }
}
