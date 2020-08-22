package foo.bar;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PizzaDeliveryServiceTest {

  class TestHelper {
    private final PizzaRepositoryStub stub;
    private final PizzaDeliveryService sut;

    private List<Pizza> result;

    TestHelper() {
      this.stub = new PizzaRepositoryStub();
      this.sut = new PizzaDeliveryService(stub);
    }

    TestHelper whenCustomerAsksForMenu() {
      result = this.sut.menu();
      return this;
    }

    TestHelper thenCustomerShouldSeePizzasInMenu() {
      Assertions.assertEquals(this.stub.dump().size(), result.size());
      return this;
    }

  }

  private TestHelper givenAStandardMenu() {
    return new TestHelper();
  }

  @Test
  @DisplayName("Should retrieve the pizza menu")
  void test1() {
    givenAStandardMenu()
        .whenCustomerAsksForMenu()
        .thenCustomerShouldSeePizzasInMenu();
  }
}
