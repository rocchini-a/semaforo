public class App {
    protected static int x=100;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Contatore conta = new Contatore(0, 1);
        Thread thr1 = new UnThread1("yogi", conta);
        Thread thr2 = new UnThread1("bubu", conta);

        thr1.start();
        thr2.start();
    }
}
