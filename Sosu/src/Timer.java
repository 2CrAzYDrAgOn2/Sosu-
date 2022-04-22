import java.util.Date;
import java.util.TimerTask;

/**
 *
 * @author cdkaw
 */
public class Timer extends TimerTask {
    public void run() {
        System.out.println("TimerTask начал своё выполнение в:" + new Date());
        completeTask();
    }
    
    private void completeTask() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
