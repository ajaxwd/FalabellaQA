package com.edu.eam.pruebasdeaceptacion.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/caso1",
				 name= {""},
				 glue = { "com.edu.eam.loginbusqueda.steps" }, 
				 plugin = { "html:reportes/cucumber-html-report" })
public class RunTest {

	

}
