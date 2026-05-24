package steps;

import io.cucumber.java.en.*;

public class UserSteps {

    @Given("I have a user")
    public void i_have_a_user() {
        System.out.println("Usuario creado");
    }

    @When("I send request")
    public void i_send_request() {
        System.out.println("Enviando request");
    }

    @Then("I receive response")
    public void i_receive_response() {
        System.out.println("Respuesta recibida");
    }
}
