package foo.bar;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PizzaDeliveryService {
  public PizzaDeliveryService(PizzaRepository repository) {
    this.repository = repository;
  }

  public List<Pizza> menu() {
    return this.repository.findAll();
  }

  private PizzaRepository repository;
}
