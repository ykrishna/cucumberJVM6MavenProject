package com.chaduvuko;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "default_summary",
                "html:target/cucumber-reports/cucumber-report.html",
                "json:target/cucumber-reports/cucumber-report.json"},
        features = {"src/main/resources/features"},
        glue = {"classpath:com/chaduvuko"},
        tags = "@UserJourney",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunCucumberTest {
}
