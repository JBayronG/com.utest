package com.utest.interactions;


import com.utest.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Interaction{

	
	private RegisterPage registerPage;
	
	public static OpenUp thepage() {
		
		return Tasks.instrumented(OpenUp.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(registerPage));
	}

}
