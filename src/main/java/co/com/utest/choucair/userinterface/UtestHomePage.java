package co.com.utest.choucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class UtestHomePage extends PageObject {
    public static Target JOIN_TODAY        = Target.the(" Click in button  of Join Today").located(By.xpath("//div/ul/li/a[contains(@class,'unauthenticated-nav-bar__sign-up')]"));
}
