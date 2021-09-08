package com.utest.stepdefinitions;

import java.util.List;

import com.utest.interactions.OpenUp;
import com.utest.models.UtestData;
import com.utest.tasks.Register;

import com.utest.questions.Answer;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CreateUserStepDefinitions {
	
	@Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
    }
	
	@Given("^that Juan wants to register on the Utest page, he enters$")
	public void thatJuanWantsToRegisterOnTheUtestPageHeEnters() {
		OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thepage());
	}


	@When("^el Enter all the information they ask me in the form$")
	public void elEnterAllTheInformationTheyAskMeInTheForm(List<UtestData> utestData) {
		OnStage.theActorInTheSpotlight().attemptsTo(Register.the(utestData.get(0).getFirtsName(),
				utestData.get(0).getLastName(),utestData.get(0).getEmail(),utestData.get(0).getPostalCode(),
				utestData.get(0).getPassword(), utestData.get(0).getConfPassword()));
		
	}

	@Then("^validate that the message appears$")
	public void validateThatTheMessageAppears(List<UtestData> utestData) {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrTitle())));
		
	}

}
