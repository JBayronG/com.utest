package com.utest.tasks;

import com.utest.userinterface.RegisterPage;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {
	
	private String firstName;
	private String lastName;
	private String email;
	private String postalCode;
	private String password;
	private String confPassword;
	
	public Register (String firstName, String lastName, String email, String postalCode, String password, String confPassword) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.postalCode = postalCode;
		this.password = password;
		this.confPassword = confPassword;
	}
	
	
	public static Register the(String firstName, String lastName, String email, String postalCode, String password, String confPassword) {

		return Tasks.instrumented(Register.class,firstName,lastName,email,postalCode,password,confPassword);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(RegisterPage.JOIN_TODAY),
				Enter.theValue(firstName).into(RegisterPage.INPUT_FIRTNAME),
				Enter.theValue(lastName).into(RegisterPage.INPUT_LASTNAME),
				Enter.theValue(email).into(RegisterPage.INPUT_EMAIL),
				Click.on(RegisterPage.DATA_OF_BIRTH),
				Click.on(RegisterPage.DATA_OF_BIRTH1),
				Click.on(RegisterPage.DATA_OF_BIRTH2),
				Click.on(RegisterPage.NEXT_LOCATION),
				Enter.theValue(postalCode).into(RegisterPage.INPUT_POSTAL_CODE),
				Click.on(RegisterPage.NEXT_DEVICES),
				Click.on(RegisterPage.YOUR_MOBILE),
				Click.on(RegisterPage.YOUR_MOBILE_DIVICE),
				Click.on(RegisterPage.SPAN_MODEL),
				Click.on(RegisterPage.MODEL),
				Click.on(RegisterPage.OPERATING_SYSTEM),
				Click.on(RegisterPage.OPERATING_SYSTEM1),
				Click.on(RegisterPage.NEXT_LAST_STEP),
				Enter.theValue(password).into(RegisterPage.PASWORD),
				Enter.theValue(confPassword).into(RegisterPage.CONF_PASWORD),
				Click.on(RegisterPage.ACCEPT1),
				Click.on(RegisterPage.ACCEPT2),
				Click.on(RegisterPage.COMPLETE_SETUD)
				);
	
		   
	}

	

}
