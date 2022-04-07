package co.com.utest.choucair.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feautures/CreateUser.feature",
        glue = "co/com/utest/choucair/stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        tags = "@scenario1")
public class RunnerTags {
}
