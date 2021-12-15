package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@test1 or @test2 or @test3 or @test4", plugin =  { "pretty", "html:target/cucumber/report.html" } )


public class RunCuke {

}
