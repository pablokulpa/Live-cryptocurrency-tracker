package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class DataRetriever extends Thread{

    RestTemplate restTemplate = new RestTemplate();


    public void run() {


        while (true){
            try {
                Thread.sleep(7000);
                ResponseEntity<CryptoCurrency[]> cryptoCurrencies = restTemplate
                        .getForEntity("https://api.coinmarketcap.com/v1/ticker",CryptoCurrency[].class);

                CryptoCurrencyRepository.setCryptoCurrencies(Arrays.asList(cryptoCurrencies.getBody()));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
