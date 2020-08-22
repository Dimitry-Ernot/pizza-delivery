package foo.bar;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
public class PizzaDeliveryControlerTest {
  private MockMvc mvc;

  @Before
  public void setup() {
    PizzaDeliveryControler controller = new PizzaDeliveryControler(new PizzaDeliveryService(new PizzaRepositoryStub()));
    mvc = MockMvcBuilders.standaloneSetup(controller).build();
  }

  @Test
  public void shouldReturnAllPizzas() throws Exception {
    mvc.perform(get("/pizzas").contentType(APPLICATION_JSON))
        .andDo(print()).andExpect(status().isOk()).andExpect(jsonPath("$", hasSize(2)));
  }
}