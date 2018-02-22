package hello;

import javax.swing.*;

public class DataDisplay extends Thread{

    CryptoCurrencyTableView newContentPane = new CryptoCurrencyTableView();


    @Override
    public void run() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("CryptoCurrency table");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                newContentPane.setOpaque(true);
                frame.setContentPane(newContentPane);

                frame.pack();
                frame.setVisible(true);
            }
        });

        while (true) {
            try {
                Thread.sleep(2000);
                newContentPane.getCurrencyTableModel().refresh();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
