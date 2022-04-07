package co.com.utest.choucair.questions;

import co.com.utest.choucair.models.UtestData;
import co.com.utest.choucair.userinterface.FinalStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {
    private List<UtestData> data;

    public Answer(List<UtestData> data) {
        this.data = data;
    }

    public static Answer toThe(List<UtestData> data) {
        return new Answer(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String Button_Final = Text.of(FinalStepPage.COMPLETE_SETUD).viewedBy(actor).asString();

        return data.get(0).getStrButton_Final().equals(Button_Final);

    }
}
