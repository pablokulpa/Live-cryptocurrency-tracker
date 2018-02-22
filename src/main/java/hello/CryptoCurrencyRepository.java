package hello;

import java.util.ArrayList;
import java.util.List;

public class CryptoCurrencyRepository {

    private static List<CryptoCurrency> cryptoCurrencies = new ArrayList<>();
    private static List<String> tracksCryptocurrencies = new ArrayList<>();

    private static List<CryptoCurrency> commonList = new ArrayList<>();

    public static List<CryptoCurrency> getCommonList() {
        return commonList;
    }

    public static void setCommonList(List<CryptoCurrency> commonList) {
        CryptoCurrencyRepository.commonList = commonList;
    }

    public static List<String> getTracksCryptocurrencies() {
        return tracksCryptocurrencies;
    }

    public static void setTracksCryptocurrencies(List<String> tracksCryptocurrencies) {
        CryptoCurrencyRepository.tracksCryptocurrencies = tracksCryptocurrencies;
    }

    public static List<CryptoCurrency> getCryptoCurrencies() {
        return cryptoCurrencies;
    }

    public static void setCryptoCurrencies(List<CryptoCurrency> cryptoCurrencies) {
        CryptoCurrencyRepository.cryptoCurrencies = cryptoCurrencies;
    }
}
