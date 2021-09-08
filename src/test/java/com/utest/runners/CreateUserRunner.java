package com.utest.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/CreateUser.feature",
                 glue = "com/utest/stepdefinitions",
                 snippets = SnippetType.CAMELCASE,
                 monochrome = true,
                 tags = "@scenario1")
public class CreateUserRunner {

}
