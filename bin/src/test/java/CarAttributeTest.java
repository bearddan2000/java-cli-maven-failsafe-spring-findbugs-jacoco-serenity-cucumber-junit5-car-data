import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;

public class CarAttributeTest {

  example.service.CarService service;

  example.model.Car car;

  @When("Car created")
  public void createCar() {
     service = new example.service.CarServiceImpl();
     car = service.createCar();
  }

  @Then("Car price should be 0.0")
  public void checkPrice() {
     Assertions.assertEquals(car.getPrice(), 0.0);
  }

  @Then("Car model should be test")
  public void checkModel() {
     Assertions.assertEquals(car.getModel(), "test");
  }

  @Then("Car year should be 0")
  public void checkYear() {
     Assertions.assertEquals(car.getYear(), 0);
  }

  @Then("Car make should be test")
  public void checkMake() {
    Assertions.assertEquals(car.getMake(), "test");
  }

}
