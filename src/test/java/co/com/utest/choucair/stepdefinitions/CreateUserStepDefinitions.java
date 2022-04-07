package co.com.utest.choucair.stepdefinitions;

import co.com.utest.choucair.models.UtestData;
import co.com.utest.choucair.questions.Answer;
import co.com.utest.choucair.questions.AnswerTitle;
import co.com.utest.choucair.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CreateUserStepDefinitions {


    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^that Juan wants to register on the Utest page, he enters$")
    public void thatJuanWantsToRegisterOnTheUtestPageHeEnters() {
        theActorCalled("Juan").wasAbleTo(OpenUp.thepage());
    }


    @When("^el Enter all the information they ask me in the form$")
    public void elEnterAllTheInformationTheyAskMeInTheForm(List<UtestData> data) {
        theActorInTheSpotlight().attemptsTo(PersonalInformation.thepage(data));
        theActorInTheSpotlight().attemptsTo(Addyouraddress.thepage(data));
        theActorInTheSpotlight().attemptsTo(YourDevices.thepage(data));
       theActorInTheSpotlight().attemptsTo(FinalStep.thepage(data));
    }

    @Then("^validate that the message appears$")
    public void validateThatTheMessageAppears(List<UtestData> data) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(data)));
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerTitle.toThe(data)));
    }
}
