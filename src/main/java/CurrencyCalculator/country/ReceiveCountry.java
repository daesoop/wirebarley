package CurrencyCalculator.country;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public enum ReceiveCountry {
    한국("USDKRW", "한국"),
    일본("USDJPY", "일본"),
    필리핀("USDPHP", "필리핀");


    private double money;
    private String moneyType;
    private String country;

    ReceiveCountry(String moneyType, String country) {
        this.moneyType = moneyType;
        this.country = country;
    }

    public void inputMoneyInfo(Map<String, Double> quotes) {
        for (ReceiveCountry country : values()) {
            if (country.moneyType.equals(quotes.get(country.moneyType))) {
                country.money = quotes.get(country.moneyType);
            }
        }
    }

    public String getMoneyType() {
        return moneyType;
    }

    public static List<String> getCountry() {
        List<String> countrys = new ArrayList<>();
        for (ReceiveCountry country : values()) {
            countrys.add(country.country);
        }
        return countrys;
    }

    public double getMoney() {
        return money;
    }

    public double moneyInfo(Map<String, Double> quotes) {
        return quotes.get(this.moneyType);
    }

}
