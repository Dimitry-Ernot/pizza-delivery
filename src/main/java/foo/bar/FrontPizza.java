package foo.bar;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class FrontPizza {
  public FrontPizza(String name, FrontPrice price, List<FrontIngredient> ingredients) {
    this.name = name;
    this.price = price;
    this.ingredients = ingredients;
  }

  @JsonProperty
  String name() {
    return name;
  }

  @JsonProperty
  FrontPrice price() {
    return price;
  }

  @JsonProperty
  List<FrontIngredient> ingredients() {
    return ingredients;
  }


  String name;
  FrontPrice price;
  List<FrontIngredient> ingredients;
}
