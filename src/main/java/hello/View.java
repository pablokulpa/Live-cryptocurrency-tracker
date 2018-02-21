package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class View {

    public static void viewTable() {
        System.out.println(String.format("%15s %15s %10s %10s %15s %15s %20s %20s %20s %20s %20s %20s %20s %20s %20s",
                "id", "name", "symbol", "rank", "priceUSD", "priceBTC", "usdVolume24h", "marketCapUSD",
                "availableSupply", "totalSupply", "maxSupply", "percentChange1h", "percentChange24h",
                "percentChange7d", "lastUpdated"));
        for (CryptoCurrency currency : CryptoCurrencyRepository.getCryptoCurrencies()) {
            System.out.println(String.format("%15s %15s %10s %10s %15s %15s %20s %20s %20s %20s %20s %20s %20s %20s %20s",
                    currency.getId(), currency.getName(), currency.getSymbol(), currency.getRank(),
                    currency.getPriceUSD(), currency.getPriceBTC(), currency.getUsdVolume24h(),
                    currency.getMarketCapUSD(), currency.getAvailableSupply(), currency.getTotalSupply(),
                    currency.getMaxSupply(), currency.getPercentChange1h(), currency.getPercentChange24h(),
                    currency.getPercentChange7d(), currency.getLastUpdated());
        }
    }
}
