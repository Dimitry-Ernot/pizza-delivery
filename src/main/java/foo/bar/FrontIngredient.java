package foo.bar;

import com.fasterxml.jackson.annotation.JsonProperty;

class FrontIngredient {
  public FrontIngredient(String name) {
    this.name = name;
  }

  @JsonProperty
  public String name() {
    return this.name;
  }

  private final String name;
}
