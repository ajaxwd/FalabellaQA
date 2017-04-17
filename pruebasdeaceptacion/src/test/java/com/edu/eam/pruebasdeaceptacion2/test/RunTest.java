package com.edu.eam.pruebasdeaceptacion2.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/caso2",
				 name= {""},
				 glue = { "com.edu.eam.loginerror.steps" }, 
				 plugin = { "html:reportes/cucumber-html-report" })
public class RunTest {

	

}
