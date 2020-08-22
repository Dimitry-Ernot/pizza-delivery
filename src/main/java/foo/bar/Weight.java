package foo.bar;

public class Weight {
  private Weight(Double value) {
    this.value = value;
  }

  public static Weight inGram(Double grams) {
    return new Weight(grams);
  }

  @Override
  public String toString() {
    return value + "gr";
  }

  private Double value;
}