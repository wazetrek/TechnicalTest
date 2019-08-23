package co.com.screenplay.stepdefinitions;

import co.com.screenplay.questions.Response;
import co.com.screenplay.tasks.AddCart;
import co.com.screenplay.tasks.Open;
import co.com.screenplay.tasks.Select;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static org.hamcrest.Matchers.equalTo;

public class ShopDressStepDefinition  {

    private String autor;

    @Before
    public void initialConfig() throws Exception {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) enters the web$")
    public void meganEntersTheWeb(String Autor) throws Exception {
        this.autor = Autor;
        OnStage.theActorCalled(autor).wasAbleTo(Open.webPage());
    }


    @When("^she select dresses$")
    public void sheDoesNotLogin() throws Exception {
        OnStage.theActorCalled(autor).attemptsTo(Select.dresses());
    }

    @Then("^add shopping cart the most expensive$")
    public void addShoppingCartTheMostExpensive() throws Exception {
        OnStage.theActorCalled(autor).attemptsTo(AddCart.dress());
    }

    @Then("^she should see the purchase receipt$")
    public void sheShouldSeeThePurchaseReceipt() throws Exception {
        OnStage.theActorInTheSpotlight().should(seeThat(Response.succesfully(), equalTo("Your order on My Store is complete.")));
    }
}
