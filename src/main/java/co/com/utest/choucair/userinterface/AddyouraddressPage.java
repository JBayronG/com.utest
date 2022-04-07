package co.com.utest.choucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddyouraddressPage {
    public static Target INPUT_CITY        = Target.the("Enter your City").located(By.name("city"));
    public static Target INPUT_POSTAL_CODE = Target.the("Enter your postal code").located(By.id("zip"));
    public static Target SPAN_COUNTRY      = Target.the("Select the country").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static Target SPAN_COUNTRY1     = Target.the("Select the country").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static Target NEXT_DEVICES      = Target.the("Click in the button Next Devices").located(By.xpath("//div/a/span[contains(text(),'Next: Devices')]"));

}
