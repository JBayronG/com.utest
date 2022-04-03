package com.utest.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://utest.com/")
public class RegisterPage extends PageObject{
	
	public static Target JOIN_TODAY        = Target.the(" Click in button  of Join Today").located(By.xpath("//div/ul/li/a[contains(@class,'unauthenticated-nav-bar__sign-up')]"));
	public static Target INPUT_FIRTNAME    = Target.the("Enter name").located(By.name("firstName"));
	public static Target INPUT_LASTNAME    = Target.the("Enter your last name").located(By.name("lastName"));
	public static Target INPUT_EMAIL       = Target.the("Enter your email address").located(By.name("email"));
	public static Target DATA_OF_BIRTH     = Target.the("Select the month").located(By.xpath("//div/select/option[contains(text(),'August')]"));
	public static Target DATA_OF_BIRTH1    = Target.the("Select the day").located(By.xpath("//div/select/option[text()='7']"));
	public static Target DATA_OF_BIRTH2    = Target.the("Select the year").located(By.xpath("//div/select/option[text()='2000']"));
	public static Target NEXT_LOCATION     = Target.the("Click in the button Next Location").located(By.xpath("//div/a/span[contains(text(),'Next: Location')]"));
	public static Target INPUT_CITY        = Target.the("Enter your City").located(By.id("city"));
	public static Target INPUT_POSTAL_CODE = Target.the("Enter your postal code").located(By.id("zip"));
    public static Target SPAN_COUNTRY      = Target.the("Select the country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static Target SPAN_COUNTRY1     = Target.the("Select the country").located(By.xpath("//*[@id=\"ui-select-choices-row-4-51\"]/span/div"));
    public static Target NEXT_DEVICES      = Target.the("Click in the button Next Devices").located(By.xpath("//div/a/span[contains(text(),'Next: Devices')]"));
    public static Target YOUR_MOBILE       = Target.the("Ckick the select Brand").located(By.xpath("//span/span[text()='Select Brand']"));
    public static Target YOUR_MOBILE_DIVICE = Target.the("Select the mobile").located(By.xpath("//div/span/div[contains(text(),'Alcatel')]"));
    public static Target SPAN_MODEL        = Target.the("Click in model").located(By.xpath("//div/div/div/span/span[contains(text(),'Select a Model')]"));
    public static Target MODEL             = Target.the("Select the model").located(By.xpath("//div/span/div[contains(text(),'One Touch Pixi 3 (4 and 10)')]"));
    public static Target OPERATING_SYSTEM  = Target.the("Select the Operationg system").located(By.name("handsetOSId"));
    public static Target OPERATING_SYSTEM1  = Target.the("Select the Operationg system").located(By.xpath("//div[@class='ui-select-choices-row active']//span/div"));
    public static Target NEXT_LAST_STEP    = Target.the("Click in the button Next last step").located(By.xpath("//div/a[@class='btn btn-blue pull-right']"));
    public static Target PASWORD           = Target.the("Enter your password").located(By.id("password"));
    public static Target CONF_PASWORD     = Target.the("Enter your confirme password").located(By.id("confirmPassword"));
    public static Target ACCEPT1          = Target.the("Click in I have read and accept the ").located(By.xpath("//div/label[contains(text(),'I have read and accept the')]"));
    public static Target ACCEPT2          = Target.the("Click in I have read and accept the and Privacy & Security Policy ").located(By.name("privacySetting"));
    public static Target COMPLETE_SETUD   = Target.the("Click in complete setud").located(By.xpath("//*/div/a/span[contains(text(),'Complete Setup')]"));
    public static Target H1               = Target.the("Title comparison").located(By.xpath("//div[@class='image-box-header']//h1"));
}
