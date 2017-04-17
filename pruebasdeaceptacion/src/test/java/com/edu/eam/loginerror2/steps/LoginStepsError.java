package com.edu.eam.loginerror2.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepsError {

	WebDriver controlador;

	@Given("^Abrimos el navegador y vamos al sitio web del login$")
	public void abrimos_el_navegador_y_vamos_al_sitio_web_del_login() throws Throwable {
		System.setProperty("webdriver.edge.driver", "\\Users\\yese\\Downloads\\PruebasDeAceptacion-master\\PruebasDeAceptacion-master\\pruebasdeaceptacion\\drivers\\MicrosoftWebDriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.edge();
		capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		controlador= new EdgeDriver(capabilities);
		controlador.manage().window().maximize();
		controlador.get("https://www.linkedin.com");
	}

	@When("^El usuario ingrese el username y el password$")
	public void el_usuario_ingrese_el_username_y_el_password() throws Throwable {
		controlador.findElement(By.id("login-email")).sendKeys("ajaxwd@gmail.com");
		controlador.findElement(By.id("login-password")).sendKeys("10101010");
	}

	@When("^El usuario presione el click en el boton entrar$")
	public void el_usuario_presione_el_click_en_el_boton_entrar() throws Throwable {
		controlador.findElement(By.id("login-submit")).click();
		Thread.sleep(2000);
	}

	@Then("^El ususario deberia ver el mensaje$")
	public void el_ususario_deberia_ver_el_mensaje() throws Throwable {
		String mensaje = controlador.findElement(By.cssSelector("strong")).getText();
		controlador.close();
		Assert.assertEquals("Ha habido uno o más errores en el envío. Corrige los campos marcados a continuación.", mensaje);
	}

}
