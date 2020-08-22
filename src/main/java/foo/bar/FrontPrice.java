package foo.bar;

import com.fasterxml.jackson.annotation.JsonProperty;

class FrontPrice {
  public FrontPrice(Price price, Currency currency) {
    this.amount = price.in(currency);
  }

  @JsonProperty
  public Double amount() {
    return this.amount;
  }

  private Double amount;
}
