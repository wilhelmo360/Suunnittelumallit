
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction implements ActionListener {

    private Clock kello = new Clock();
    @Override
    public void actionPerformed(ActionEvent e) {
        if (kello.ajastin.isRunning()){
            kello.stopClock();
        } else {
            kello.restartClock();
        }
    }
}