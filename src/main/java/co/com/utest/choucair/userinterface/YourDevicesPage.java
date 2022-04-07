package co.com.utest.choucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YourDevicesPage {

    public static Target YOUR_MOBILE       = Target.the("Ckick the select Brand").located(By.xpath("//span/span[text()='Select Brand']"));
    public static Target YOUR_MOBILE_DIVICE = Target.the("Select the mobile").located(By.xpath("//div/span/div[contains(text(),'Alcatel')]"));
    public static Target SPAN_MODEL        = Target.the("Click in model").located(By.xpath("//div/div/div/span/span[contains(text(),'Select a Model')]"));
    public static Target MODEL             = Target.the("Select the model").located(By.xpath("//div/span/div[contains(text(),'One Touch Pixi 3 (4 and 10)')]"));
    public static Target OPERATING_SYSTEM  = Target.the("Select the Operationg system").located(By.name("handsetOSId"));
    public static Target OPERATING_SYSTEM1  = Target.the("Select the Operationg system").located(By.xpath("//div[@class='ui-select-choices-row active']//span/div"));
    public static Target NEXT_LAST_STEP    = Target.the("Click in the button Next last step").located(By.xpath("//div/a[@class='btn btn-blue pull-right']"));


}
