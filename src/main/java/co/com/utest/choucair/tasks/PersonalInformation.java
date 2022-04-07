package co.com.utest.choucair.tasks;

import co.com.utest.choucair.models.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;
import static  co.com.utest.choucair.userinterface.PersonalInformationPage.*;
public class PersonalInformation  implements Task {

    private List<UtestData> data;

    public PersonalInformation(List<UtestData> data) {
        this.data = data;
    }

    public static PersonalInformation thepage(List<UtestData> data) {
        return Tasks.instrumented(PersonalInformation.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getFirtsName()).into(INPUT_FIRTNAME),
                Enter.theValue(data.get(0).getLastName()).into(INPUT_LASTNAME),
                Enter.theValue(data.get(0).getEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrMonth()).from(DATA_OF_BIRTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrDay()).from(DATA_OF_BIRTH1),
                SelectFromOptions.byVisibleText(data.get(0).getStrYear()).from(DATA_OF_BIRTH2),
                Click.on(NEXT_LOCATION)
        );
    }
}
