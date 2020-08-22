package foo.bar;

public class Ingredient {
  public static final Ingredient TomatoSauce = new Ingredient("Tomato Sauce", Weight.inGram(100D));
  public static final Ingredient Mozzarella = new Ingredient("Mozzarella", Weight.inGram(200D));
  public static final Ingredient Ham = new Ingredient("Ham", Weight.inGram(250D));
  public static final Ingredient Olives = new Ingredient("Olives", Weight.inGram(40D));
  public static final Ingredient Mushrooms = new Ingredient("Mushrooms", Weight.inGram(150D));

  private Ingredient(String name, Weight quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  private String name;
  private Weight quantity;

  public String name() {
    return name;
  }
}