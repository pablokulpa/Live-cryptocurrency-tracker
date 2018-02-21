package hello;

import java.util.List;

public class CryptoCurrencyRepository {

    private static List<CryptoCurrency> cryptoCurrencies;


    public static List<CryptoCurrency> getCryptoCurrencies() {
        return cryptoCurrencies;
    }

    public static void setCryptoCurrencies(List<CryptoCurrency> cryptoCurrencies) {
        CryptoCurrencyRepository.cryptoCurrencies = cryptoCurrencies;
    }
}
