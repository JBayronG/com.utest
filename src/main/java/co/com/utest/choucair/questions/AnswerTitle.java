package co.com.utest.choucair.questions;

import co.com.utest.choucair.models.UtestData;
import co.com.utest.choucair.userinterface.FinalStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class AnswerTitle implements Question<Boolean> {
    private List<UtestData> data;

    public AnswerTitle(List<UtestData> data) {
        this.data = data;
    }
    public static AnswerTitle toThe(List<UtestData> data) {
       return new AnswerTitle(data);

    }


    @Override
    public Boolean answeredBy(Actor actor) {

        String Title = Text.of(FinalStepPage.H1).viewedBy(actor).asString();
        return data.get(0).getStrTitle().equals(Title);
    }
}
