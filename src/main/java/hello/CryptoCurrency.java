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
    private Integer rank;
    @JsonProperty("price_usd")
    private Double priceUSD;
    @JsonProperty("price_btc")
    private Double priceBTC;
    @JsonProperty("24h_volume_usd")
    private Double usdVolume24h;
    @JsonProperty("market_cap_usd")
    private Double marketCapUSD;
    @JsonProperty("available_supply")
    private Double availableSupply;
    @JsonProperty("total_supply")
    private Double totalSupply;
    @JsonProperty("max_supply")
    private Double maxSupply;
    @JsonProperty("percent_change_1h")
    private Double percentChange1h;
    @JsonProperty("percent_change_24h")
    private Double percentChange24h;
    @JsonProperty("percent_change_7d")
    private Double percentChange7d;
    @JsonProperty("last_updated")
    private Double lastUpdated;

    public CryptoCurrency() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Double getPriceUSD() {
        return priceUSD;
    }

    public void setPriceUSD(Double priceUSD) {
        this.priceUSD = priceUSD;
    }

    public Double getPriceBTC() {
        return priceBTC;
    }

    public void setPriceBTC(Double priceBTC) {
        this.priceBTC = priceBTC;
    }

    public Double getUsdVolume24h() {
        return usdVolume24h;
    }

    public void setUsdVolume24h(Double usdVolume24h) {
        this.usdVolume24h = usdVolume24h;
    }

    public Double getMarketCapUSD() {
        return marketCapUSD;
    }

    public void setMarketCapUSD(Double marketCapUSD) {
        this.marketCapUSD = marketCapUSD;
    }

    public Double getAvailableSupply() {
        return availableSupply;
    }

    public void setAvailableSupply(Double availableSupply) {
        this.availableSupply = availableSupply;
    }

    public Double getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(Double totalSupply) {
        this.totalSupply = totalSupply;
    }

    public Double getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(Double maxSupply) {
        this.maxSupply = maxSupply;
    }

    public Double getPercentChange1h() {
        return percentChange1h;
    }

    public void setPercentChange1h(Double percentChange1h) {
        this.percentChange1h = percentChange1h;
    }

    public Double getPercentChange24h() {
        return percentChange24h;
    }

    public void setPercentChange24h(Double percentChange24h) {
        this.percentChange24h = percentChange24h;
    }

    public Double getPercentChange7d() {
        return percentChange7d;
    }

    public void setPercentChange7d(Double percentChange7d) {
        this.percentChange7d = percentChange7d;
    }

    public Double getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Double lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
