package hello;

import javax.swing.*;
import java.util.Scanner;

public class CryptoCurrencyController {

    DataRetriever dataRetriever;

    public CryptoCurrencyController(DataRetriever dataRetriever) {
        this.dataRetriever = dataRetriever;
    }

    public void getData() throws InterruptedException {
        dataRetriever.start();
        Thread.sleep(3000);
    }


    public void displayData() throws InterruptedException {
        DataDisplay dataDisplay = new DataDisplay();
        dataDisplay.displayData();
    }


    public void selectCryptocurrencies(){
        CryptoCurrencyRepository.getCryptoCurrencies().stream().map(x -> x.getId()).forEach(System.out::println);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String selected = scanner.next();
            if(CryptoCurrencyRepository
                    .getCryptoCurrencies()
                    .stream().map(x -> x.getId())
                    .filter( data -> data.contains(selected))
                    .findFirst()
                    .orElse(null) != null)
            CryptoCurrencyRepository.getTracksCryptocurrencies().add(selected);
        }
    }
}
