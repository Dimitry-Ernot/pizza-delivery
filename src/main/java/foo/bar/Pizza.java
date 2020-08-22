package foo.bar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza {
  public Pizza(String name, Price price) {
    this.name = name;
    this.price = price;
    this.topping = new ArrayList<>();
  }

  private Pizza(String name, Price price, List<Ingredient> ingredients) {
    this.name = name;
    this.price = price;
    this.topping = ingredients;
  }

  public Pizza with(Ingredient ingredient) {
    List<Ingredient> i = new ArrayList(topping);
    i.add(ingredient);
    return new Pizza(this.name, this.price, i);
  }

  public List<Ingredient> topping() {
    return topping;
  }

  String name;
  Price price;
  List<Ingredient> topping;
}
