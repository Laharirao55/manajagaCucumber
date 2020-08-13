package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(//dryRun = true,
		            features="features",
                    glue="manajagaCucumber.stepdef",
                  //  tags = {"@chrome","@smoke"}, 
                    monochrome = true,
                    strict = true,
                    plugin = {"html:target/cucumber-html-report", 
                              "pretty:target/cucumber-pretty.text",
                              "pretty", "html:target/site/cucuber-pretty",
                              "json:target/site/cucumber.json",
                              }
                ) 
public class TestRunner {

}