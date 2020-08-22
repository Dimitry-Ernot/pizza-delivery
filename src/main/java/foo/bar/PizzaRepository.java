package foo.bar;

import org.springframework.data.jpa.repository.JpaRepository;

interface PizzaRepository extends JpaRepository<Pizza, Integer> {}
