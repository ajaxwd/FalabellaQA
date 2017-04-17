package com.edu.eam.loginerror.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepsError {
	
	WebDriver controlador;

	@Given("^Abrimos el navegador y vamos al sitio web del login$")
	public void abrimos_el_navegador_y_vamos_al_sitio_web_del_login() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "\\Users\\yese\\Downloads\\PruebasDeAceptacion-master\\PruebasDeAceptacion-master\\pruebasdeaceptacion\\drivers\\Driver_Win10\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--js-flags=--expose-gc");  
		options.addArguments("--enable-precise-memory-info"); 
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-default-apps");
		options.addArguments("test-type=browser");
		options.addArguments("disable-infobars");
		controlador= new ChromeDriver(options);
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
		Assert.assertEquals("Ha habido uno o más errores en el envío. Corrige los campos marcados a continuación.", mensaje);
		controlador.close();
	}

}
