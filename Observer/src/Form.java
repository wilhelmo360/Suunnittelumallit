import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Form implements Observer {

    private Clock kello = new Clock();
    private JLabel näyttönimi = new JLabel();
    private JButton button = new JButton("Start/Stop");
    private static JFrame frame = new JFrame("Kello :-D");

    public Form(){
        this.mountDisplay();
        kello.addObserver(this);
    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Form main = new Form();
            }
        });
    }

    public void mountDisplay(){
        JPanel panel = new JPanel();
        panel.add(näyttönimi);
        panel.add(button);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        näyttönimi.setFont(new Font("Arial", Font.ITALIC, 25));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(new ButtonAction());
        näyttönimi.setText(kello.getTime());

    }

    @Override
    public void update(Observable arg0, Object arg1) {
        System.out.println("Hora: " + arg1);
        näyttönimi.setText((String)arg1);
    }
}