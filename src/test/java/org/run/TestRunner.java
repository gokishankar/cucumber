package org.run;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\eclipse-workspace\\cucumber\\src\\test\\resources\\Features"
                 ,glue="org.Stepdefinition",monochrome=true,dryRun=false,strict=true,snippets=SnippetType.UNDERSCORE)
//tags used to include or exclude particular scenario or feature file 
//dryrun = false ..it lead a normal execution and generate snippets for undefined steps
//dryrun=true...it skip normal execution and generate snipptes for undefined steps
//strict =false....build is marked as passed for undefined steps
//strict =true....build is marked as failed for undefined steps




public class TestRunner {
	
	private void syso() {
		System.out.println("test runner");

	}

	
}
