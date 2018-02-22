package hello;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class CryptoCurrencyTableView extends JPanel{

    private CurrencyTableModel currencyTableModel;
    private JTable table;

    public CryptoCurrencyTableView() {
        super(new GridLayout(1, 0));

        currencyTableModel = new CurrencyTableModel();
        table = new JTable(currencyTableModel);
        table.setPreferredScrollableViewportSize(new Dimension(1600, 800));
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane);
    }

    public CurrencyTableModel getCurrencyTableModel() {
        return currencyTableModel;
    }

    class CurrencyTableModel extends AbstractTableModel {

        private String[] columnNames = new String[]{
                "Id", "Name", "Symbol", "Rank", "PriceUSD", "PriceBTC", "USDvolume24h", "MarketCapUSD",
                "AvailableSupply", "TotalSupply", "MaxSupply", "PercentChange1h", "PercentChange24h",
                "PercentChange7d", "LastUpdated"
        };

        int tableSize = CryptoCurrencyRepository.getCryptoCurrencies().size();

        private Object[][] currencies = fillCurrenciesData();

        private Object[][] fillCurrenciesData() {
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
            return currencies;
        }

        public int getColumnCount() {
            return columnNames.length;
        }

        public int getRowCount() {
            return currencies.length;
        }

        public String getColumnName(int col) {
            return columnNames[col];
        }

        public Object getValueAt(int row, int col) {
            return currencies[row][col];
        }

        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }

        public void refresh() {
            this.fireTableDataChanged();
        }
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("CryptoCurrency table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CryptoCurrencyTableView newContentPane = new CryptoCurrencyTableView();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);

        frame.pack();
        frame.setVisible(true);
    }
}
