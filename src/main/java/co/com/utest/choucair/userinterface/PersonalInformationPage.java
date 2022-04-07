package co.com.utest.choucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInformationPage {
    public static Target INPUT_FIRTNAME    = Target.the("Enter name").located(By.name("firstName"));
    public static Target INPUT_LASTNAME    = Target.the("Enter your last name").located(By.name("lastName"));
    public static Target INPUT_EMAIL       = Target.the("Enter your email address").located(By.name("email"));
    public static Target DATA_OF_BIRTH     = Target.the("Select the month").located(By.id("birthMonth"));
    public static Target DATA_OF_BIRTH1    = Target.the("Select the day").located(By.id("birthDay"));
    public static Target DATA_OF_BIRTH2    = Target.the("Select the year").located(By.id("birthYear"));
    public static Target NEXT_LOCATION     = Target.the("Click in the button Next Location").located(By.xpath("//div/a/span[contains(text(),'Next: Location')]"));

}
