package foo.bar;


enum Currency {
  Euros,
}

public class Price {
  public Price(Double amount, Currency currency) {
    this.amount = amount;
    this.currency = currency;
  }

  Double in(Currency currency) {
    return amount * rate(currency);
  }

  private Double rate(Currency currency) {
    if (currency == this.currency)
      return 1.0;
    return 2.0; // TODO handle other rate
  }

  Currency currency;
  Double amount;
}
