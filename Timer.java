
package sosu;

import java.util.Date;
import java.util.TimerTask;

/**
 *
 * @author Daun&Down
 */
public class Timer extends TimerTask {
    public void run() {
        System.out.println("TimerTask начал свое выполнение в:" + new Date());
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