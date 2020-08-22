package foo.bar;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PizzaRepositoryStub implements PizzaRepository {

  public PizzaRepositoryStub() {
    pizzas = Arrays.asList(new Pizza("Margherita", new Price(9D, Currency.Euros))
                              .with(Ingredient.TomatoSauce)
                              .with(Ingredient.Mozzarella)
                              .with(Ingredient.Olives),
                           new Pizza("Regina", new Price(13D, Currency.Euros))
                              .with(Ingredient.TomatoSauce)
                              .with(Ingredient.Mozzarella)
                              .with(Ingredient.Ham)
                              .with(Ingredient.Mushrooms));
  }

  List<Pizza> dump() {
    return pizzas;
  }

  public List<Pizza> findAll() {
    return pizzas;
  }

  public List<Pizza> findAll(Sort sort) {
    return null;
  }

  public Page<Pizza> findAll(Pageable pageable) {
    return null;
  }

  public List<Pizza> findAllById(Iterable<Integer> iterable) {
    return null;
  }

  public long count() {
    return 0;
  }

  public void deleteById(Integer integer) {

  }

  public void delete(Pizza pizza) {

  }

  public void deleteAll(Iterable<? extends Pizza> iterable) {

  }

  public void deleteAll() {

  }

  public <S extends Pizza> S save(S s) {
    return null;
  }

  public <S extends Pizza> List<S> saveAll(Iterable<S> iterable) {
    return null;
  }

  public Optional<Pizza> findById(Integer integer) {
    return Optional.empty();
  }

  public boolean existsById(Integer integer) {
    return false;
  }

  public void flush() {

  }

  public <S extends Pizza> S saveAndFlush(S s) {
    return null;
  }

  public void deleteInBatch(Iterable<Pizza> iterable) {

  }

  public void deleteAllInBatch() {

  }

  public Pizza getOne(Integer integer) {
    return null;
  }

  public <S extends Pizza> Optional<S> findOne(Example<S> example) {
    return Optional.empty();
  }

  public <S extends Pizza> List<S> findAll(Example<S> example) {
    return null;
  }

  public <S extends Pizza> List<S> findAll(Example<S> example, Sort sort) {
    return null;
  }

  public <S extends Pizza> Page<S> findAll(Example<S> example, Pageable pageable) {
    return null;
  }

  public <S extends Pizza> long count(Example<S> example) {
    return 0;
  }

  public <S extends Pizza> boolean exists(Example<S> example) {
    return false;
  }


  private List<Pizza> pizzas;
}
