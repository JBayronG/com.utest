package co.com.utest.choucair.tasks;

import co.com.utest.choucair.models.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;
import static  co.com.utest.choucair.userinterface.AddyouraddressPage.*;


public class Addyouraddress implements Task {

    private List<UtestData> data;

    public Addyouraddress(List<UtestData> data) {
        this.data = data;
    }

    public static Addyouraddress thepage(List<UtestData> data) {
        return Tasks.instrumented(Addyouraddress.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getCity()).into(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CITY),
                Hit.the(Keys.ENTER).into(INPUT_CITY),
                Enter.theValue(data.get(0).getPostalCode()).into(INPUT_POSTAL_CODE),
                Click.on(SPAN_COUNTRY),
                Enter.theValue(data.get(0).getSrcPais()).into(SPAN_COUNTRY1),
                Click.on(NEXT_DEVICES)
        );
    }
}
