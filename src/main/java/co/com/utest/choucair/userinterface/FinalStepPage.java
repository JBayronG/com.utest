package co.com.utest.choucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalStepPage {
    public static Target PASWORD           = Target.the("Enter your password").located(By.id("password"));
    public static Target CONF_PASWORD     = Target.the("Enter your confirme password").located(By.id("confirmPassword"));
    public static Target ACCEPT          = Target.the("Click in I have read and accept the Email ").located(By.xpath("//span[@class=\"checkmark signup-consent__checkbox signup-consent__checkbox--highlight\"]"));
    public static Target ACCEPT1          = Target.the("Click in I have read and accept the poly ").located(By.xpath("//div/label[contains(text(),'I have read and accept the')]"));
    public static Target ACCEPT2          = Target.the("Click in I have read and accept the and Privacy & Security Policy ").located(By.name("privacySetting"));
    public static Target COMPLETE_SETUD   = Target.the("Click in complete setud").located(By.id("laddaBtn"));
    public static Target H1               = Target.the("Title comparison").located(By.xpath("//div[@class='image-box-header']//h1"));
}
