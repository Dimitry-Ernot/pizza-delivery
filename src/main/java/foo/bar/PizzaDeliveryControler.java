package foo.bar;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping({"/pizzas"})
@CrossOrigin
public class PizzaDeliveryControler {
  private final PizzaDeliveryService service;

  @GetMapping(value = "", produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<FrontPizza> getPizzaMenu() {
      return service.menu().stream().map((pizza) -> map(pizza)).collect(Collectors.toList());
  }

  public PizzaDeliveryControler(PizzaDeliveryService service) {
    this.service = service;
  }


  private FrontPizza map(Pizza pizza) {
    return new FrontPizza(
        pizza.name,
        new FrontPrice(pizza.price, Currency.Euros),
        pizza.topping().stream().map((i) -> new FrontIngredient(i.name())).collect(Collectors.toList()));
  }
}