package starter.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.register.RegisterEmailAccount;
import starter.register.ClickCreateAccount;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AccessRegistrationEmailStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) is on the sign in page")
    public void on_the_sign_in_page(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.theNewExperienceSignInPage());
    }

    @When("she/he writes his mail {string}")
    public void writes_his_mail(String term) {

        withCurrentActor(
               RegisterEmailAccount.term(term)
        );
    }

    @And("she/he select the button to create an account")
    public void select_the_button_to_create_an_account(){

        withCurrentActor(
              ClickCreateAccount.clickButton()
        );

    }

    @Then("she/he is on the registration page")
    public void on_the_registration_page() {
    }


}
