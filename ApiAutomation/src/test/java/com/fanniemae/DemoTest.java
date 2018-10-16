package com.fanniemae;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
  @CucumberOptions(features={"src/test/resources/Demo.feature"},glue = {
	"com.fanniemae.steps"})
public class DemoTest {}
