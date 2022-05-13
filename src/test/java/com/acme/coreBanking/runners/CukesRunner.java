package com.acme.coreBanking.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       features = "src/test/resources/features",
        glue = "com/acme/coreBanking/stepDefinitions",
        dryRun = false,
        tags = "@herhangibisey"
)
public class CukesRunner {


}
