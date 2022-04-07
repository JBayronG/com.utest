package co.com.utest.choucair.tasks;

import co.com.utest.choucair.models.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static co.com.utest.choucair.userinterface.YourDevicesPage.*;

public class YourDevices implements Task {

    private List<UtestData> data;

    public YourDevices(List<UtestData> data) {
        this.data = data;
    }

    public static YourDevices thepage(List<UtestData> data) {
        return Tasks.instrumented(YourDevices.class,data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(YOUR_MOBILE),
                Click.on(YOUR_MOBILE_DIVICE),
                Click.on(SPAN_MODEL),
                Click.on(MODEL),
                Click.on(OPERATING_SYSTEM),
                Click.on(OPERATING_SYSTEM1),
                Click.on(NEXT_LAST_STEP)
        );
    }
}
