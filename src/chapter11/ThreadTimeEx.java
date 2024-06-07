package chapter11;
import javax.swing.*;
import java.awt.*;

public class ThreadTimeEx extends Thread {
    private JLabel timerLabel;
    public TimerThread(JLabel timerLabel){
        this.timerLabel = timerLabel;
    }
    
    Override
    public void run(){
        int n=0;
        while(true){
            timerLabel.setText(Integer.toString(n));
            n++;
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){return;}
        }
    }
}
