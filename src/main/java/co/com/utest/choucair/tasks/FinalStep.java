package co.com.utest.choucair.tasks;

import co.com.utest.choucair.models.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.utest.choucair.userinterface.FinalStepPage.*;

public class FinalStep implements Task {

    private List<UtestData> data;

    public FinalStep(List<UtestData> data) {
        this.data = data;
    }

    public static FinalStep thepage(List<UtestData> data) {
        return Tasks.instrumented(FinalStep.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getPassword()).into(PASWORD),
                Enter.theValue(data.get(0).getPassword()).into(CONF_PASWORD),
                Click.on(ACCEPT),
                Click.on(ACCEPT1),
                Click.on(ACCEPT2),
                Click.on(COMPLETE_SETUD)
        );
    }
}
