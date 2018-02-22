package hello;

import javax.swing.*;

public class DataDisplay extends JFrame {

    public void displayData() throws InterruptedException {
        while (true) {
            Thread.sleep(7000);
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new CryptoCurrencyTableView();
                }
            });
        }
    }
}
