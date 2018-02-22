package hello;

import javax.swing.*;

public class DataDisplay extends Thread{

    @Override
    public void run() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CryptoCurrencyTableView();
            }
        });

        while (true) {
            try {
                Thread.sleep(7000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
