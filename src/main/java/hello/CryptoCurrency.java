package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CryptoCurrency {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("rank")
    private int rank;
    @JsonProperty("price_usd")
    private double priceUSD;
    @JsonProperty("price_btc")
    private double priceBTC;
    @JsonProperty("24h_volume_usd")
    private double usdVolume24h;
    @JsonProperty("market_cap_usd")
    private double marketCapUSD;
    @JsonProperty("available_supply")
    private double availableSupply;
    @JsonProperty("total_supply")
    private double totalSupply;
    @JsonProperty("max_supply")
    private double maxSupply;
    @JsonProperty("percent_change_1h")
    private double percentChange1h;
    @JsonProperty("percent_change_24h")
    private double percentChange24h;
    @JsonProperty("percent_change_7d")
    private double percentChange7d;
    @JsonProperty("last_updated")
    private double lastUpdated;

    public CryptoCurrency() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getPriceUSD() {
        return priceUSD;
    }

    public void setPriceUSD(double priceUSD) {
        this.priceUSD = priceUSD;
    }

    public double getPriceBTC() {
        return priceBTC;
    }

    public void setPriceBTC(double priceBTC) {
        this.priceBTC = priceBTC;
    }

    public double getUsdVolume24h() {
        return usdVolume24h;
    }

    public void setUsdVolume24h(double usdVolume24h) {
        this.usdVolume24h = usdVolume24h;
    }

    public double getMarketCapUSD() {
        return marketCapUSD;
    }

    public void setMarketCapUSD(double marketCapUSD) {
        this.marketCapUSD = marketCapUSD;
    }

    public double getAvailableSupply() {
        return availableSupply;
    }

    public void setAvailableSupply(double availableSupply) {
        this.availableSupply = availableSupply;
    }

    public double getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(double totalSupply) {
        this.totalSupply = totalSupply;
    }

    public double getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(double maxSupply) {
        this.maxSupply = maxSupply;
    }

    public double getPercentChange1h() {
        return percentChange1h;
    }

    public void setPercentChange1h(double percentChange1h) {
        this.percentChange1h = percentChange1h;
    }

    public double getPercentChange24h() {
        return percentChange24h;
    }

    public void setPercentChange24h(double percentChange24h) {
        this.percentChange24h = percentChange24h;
    }

    public double getPercentChange7d() {
        return percentChange7d;
    }

    public void setPercentChange7d(double percentChange7d) {
        this.percentChange7d = percentChange7d;
    }

    public double getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(double lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
