package hello;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CryptoCurrencyTableView extends JFrame{

    public CryptoCurrencyTableView(){

        String [] columns = new String[] {
                "Id", "Name", "Symbol", "Rank", "PriceUSD", "PriceBTC", "USDvolume24h", "MarketCapUSD",
                "AvailableSupply", "TotalSupply", "MaxSupply", "PercentChange1h", "PercentChange24h",
                "PercentChange7d", "LastUpdated"
        };

        int tableSize = CryptoCurrencyRepository.getCryptoCurrencies().size();

        Object[][] currencies = new Object[tableSize][15];

        for (int i = 0; i < tableSize; i++) {
            List<Object> currencyData = new ArrayList<>();
            CryptoCurrency currency = CryptoCurrencyRepository.getCryptoCurrencies().get(i);
            currencyData.add(currency.getId());
            currencyData.add(currency.getName());
            currencyData.add(currency.getSymbol());
            currencyData.add(currency.getRank());
            currencyData.add(currency.getPriceUSD());
            currencyData.add(currency.getPriceBTC());
            currencyData.add(currency.getUsdVolume24h());
            currencyData.add(currency.getMarketCapUSD());
            currencyData.add(currency.getAvailableSupply());
            currencyData.add(currency.getTotalSupply());
            currencyData.add(currency.getMaxSupply());
            currencyData.add(currency.getPercentChange1h());
            currencyData.add(currency.getPercentChange24h());
            currencyData.add(currency.getPercentChange7d());
            currencyData.add(currency.getLastUpdated());
            for (int k = 0; k < currencyData.size(); k++) {
                currencies[i][k] = currencyData.get(k);
            }
        }

        JTable table = new JTable(currencies, columns);

        this.add(new JScrollPane(table));

        this.setTitle("Currencies Table");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

//    final Class[] columnClass = new Class[] {
//            String.class, String.class, String.class, Integer.class, Double.class,
//            Double.class, Double.class, Double.class, Double.class, Double.class,
//            Double.class, Double.class, Double.class, Double.class, Double.class
//    };


}
