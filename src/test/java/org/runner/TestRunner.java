package org.runner;

import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
                 glue="org.stepdefinition",
                 tags= {"@smoke or @sanity"},
                 monochrome=true,
                 plugin= {"pretty",
                		 "html:src\\test\\resources\\Features\\Reports",
                		 "json:src\\test\\resources\\Reports\\jsonReport.json",
                		 "junit:src\\test\\resources\\Reports\\junitReport.xml",
                		 "rerun:src\\test\\resources\\FailedScenarios\\failedScenarios.txt"}
                		
                )

public class TestRunner {
@AfterClass
public static void report() {
	JVMReport.generateJVMReport("src\\test\\resources\\Reports\\jsonReport.json");
    System.out.println("Done.......................");
}
}


