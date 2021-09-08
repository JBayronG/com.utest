package com.utest.questions;


import com.utest.userinterface.RegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

	private String strTitle;
	
   public Answer(String strTitle) {
		this.strTitle = strTitle;
	}
	
	public static Answer toThe(String strTitle) {
		return new Answer(strTitle);
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		boolean result;
		String strTitle = Text.of(RegisterPage.H1).viewedBy(actor).asString();
		if(strTitle.equals(strTitle)) {
			result = true;
		}else {
			result= false;
		}
		return result;
	}

	

}
