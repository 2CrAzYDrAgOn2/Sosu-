/**
 *
 * @author cdkaw
 */
public class Sosu {
    public static void main(String[] args) throws InterruptedException {
        GameThread t = new GameThread();
        t.setPriority(10);
        t.start();
        t.threadStart();
    }
}
