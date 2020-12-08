import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import java.util.Observable;

import javax.swing.Timer;

public class Clock extends Observable implements ActionListener {

    public static Timer ajastin;

    public Clock(){
        this.startClock();
    }

    public String getTime(){
        String aika = "";

        GregorianCalendar kalenteri = new GregorianCalendar();
        int h = kalenteri.get(GregorianCalendar.HOUR_OF_DAY);
        int m = kalenteri.get(GregorianCalendar.MINUTE);
        int s = kalenteri.get(GregorianCalendar.SECOND);
        aika += ((h < 10) ? "0" : "") + h + ":";
        aika += ((m < 10) ? "0" : "") + m + ":";
        aika += ((s < 10) ? "0" : "") + s;

        return aika;
    }

    public void actionPerformed(ActionEvent e) {
        setChanged();
        notifyObservers(this.getTime());
    }

    public void startClock() {
        if (ajastin == null) {
            ajastin = new javax.swing.Timer(1000, this);
            ajastin.setInitialDelay(0);
            ajastin.start();
        }
    }

    public void restartClock(){
        if (!ajastin.isRunning()){
            ajastin.restart();
        }
    }

    public void stopClock() {
        if (ajastin != null) {
            ajastin.stop();
        }
    }
}