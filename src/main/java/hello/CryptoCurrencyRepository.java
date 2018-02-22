package hello;

import java.util.ArrayList;
import java.util.List;

public class CryptoCurrencyRepository {

    private static List<CryptoCurrency> cryptoCurrencies = new ArrayList<>();
    private static List<String> tracksCryptocurrencies = new ArrayList<>();




    public static List<CryptoCurrency> getCryptoCurrencies() {
        return cryptoCurrencies;
    }

    public static void setCryptoCurrencies(List<CryptoCurrency> cryptoCurrencies) {
        CryptoCurrencyRepository.cryptoCurrencies = cryptoCurrencies;
    }
}
