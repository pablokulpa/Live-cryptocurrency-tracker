package hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataRetriever extends Thread{

    RestTemplate restTemplate = new RestTemplate();


    public void run() {

        while (true){
            try {

                ResponseEntity<CryptoCurrency[]> cryptoCurrencies = restTemplate
                        .getForEntity("https://api.coinmarketcap.com/v1/ticker/?limit=10",CryptoCurrency[].class);
                CryptoCurrencyRepository.setCryptoCurrencies(Arrays.asList(cryptoCurrencies.getBody()));

                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
