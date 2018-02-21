package hello;

import com.sun.corba.se.spi.ior.ObjectKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application extends JFrame {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) throws InterruptedException {
        SpringApplication.run(Application.class);
        DataRetriever dataRetriever = new DataRetriever();
        dataRetriever.start();

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