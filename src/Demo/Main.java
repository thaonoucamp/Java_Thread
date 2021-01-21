package Demo;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();

        Thread t = new Thread(demo);

        Demo_2 demo_2 = new Demo_2();



        t.run();

        demo_2.run();
    }
}
// giup 2 class chay song song;