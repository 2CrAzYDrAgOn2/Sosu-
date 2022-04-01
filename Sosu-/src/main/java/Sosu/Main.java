package Sosu;

/**
 *
 * @author Daun&Down
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        GameThread t = new GameThread();
        t.setPriority(10);
        t.start();
        t.threadStart();
        
    }
}