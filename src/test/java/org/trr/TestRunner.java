package org.trr;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", glue="org.tesdef", monochrome=true, dryRun=false, plugin= {"html:C:\\Users\\sam\\eclipse-workspace\\Cucumber\\target\\reports.json"})
public class TestRunner {

}
