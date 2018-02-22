package hello;

import javax.swing.*;

public class CryptoCurrencyController {

    DataRetriever dataRetriever;

    public CryptoCurrencyController(DataRetriever dataRetriever) {
        this.dataRetriever = dataRetriever;
    }

    public void getData(){
        dataRetriever.start();
    }


    public void displayData() throws InterruptedException {
        while (true){
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
