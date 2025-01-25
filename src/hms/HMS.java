package hms;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.AWTException;

public class HMS {

    public static void main(String[] args) throws AWTException {

        try {
            FlatIntelliJLaf.registerCustomDefaultsSource("hms.style");
            FlatIntelliJLaf.setup();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Splash sp = new Splash();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            sp.setVisible(true);
        });

        sp.setVisible(true);
        Login lo = new Login();

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                sp.out.setText(Integer.toString(i) + "%");
                if (i == 100) {
                    sp.setVisible(false);
                    lo.setVisible(true);
                }
            }
        } catch (InterruptedException e) {
        }
    }

}
