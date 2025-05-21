package hms;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.AWTException;
import javax.swing.SwingUtilities;

public class HMS {

    public static void main(String[] args) throws AWTException {
        try {
            FlatIntelliJLaf.registerCustomDefaultsSource("hms.style");
            FlatIntelliJLaf.setup();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Splash sp = new Splash();
        Login lo = new Login();

        // Use a separate thread for splash logic to avoid blocking the Event Dispatch Thread
        new Thread(() -> {
            sp.setVisible(true);
            try {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(40);
                    sp.out.setText(i + "%");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Switch to Login on the Event Dispatch Thread
            SwingUtilities.invokeLater(() -> {
                sp.setVisible(false);
                lo.setVisible(true);
            });
        }).start();
    }
}
