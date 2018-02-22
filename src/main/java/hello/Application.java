package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;


@SpringBootApplication
public class Application{

    public static void main(String args[]) throws InterruptedException {
        SpringApplication.run(Application.class);

        CryptoCurrencyController cryptoCurrencyController = new CryptoCurrencyController(new DataRetriever());
        cryptoCurrencyController.getData();
        cryptoCurrencyController.selectCryptocurrencies();
        //cryptoCurrencyController.displayData();
    }

}