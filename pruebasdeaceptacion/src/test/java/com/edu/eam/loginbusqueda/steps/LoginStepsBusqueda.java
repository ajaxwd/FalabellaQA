package com.edu.eam.loginbusqueda.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepsBusqueda {
	
	WebDriver controlador;

	@Given("^Abrimos el navegador y vamos al sitio web del login$")
	public void abrimos_el_navegador_y_vamos_al_sitio_web_del_login() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yese\\Downloads\\PruebasDeAceptacion-master\\PruebasDeAceptacion-master\\pruebasdeaceptacion\\drivers\\Driver_Win10\\chromedriver.exe");
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

	@When("^El usuario ingresa el email y el password$")
	public void el_usuario_ingresa_el_email_y_el_password() throws Throwable {
		controlador.findElement(By.id("login-email")).sendKeys("ajaxwd@gmail.com");
		controlador.findElement(By.id("login-password")).sendKeys("01010101");
	}

	@When("^El usuario presiona el click en el boton entrar$")
	public void el_usuario_presiona_el_click_en_el_boton_entrar() throws Throwable {
		controlador.findElement(By.id("login-submit")).click();
		Thread.sleep(2000);
	}

	@When("^El usuario ingresa el nombre del usuario a buscar$")
	public void el_usuario_ingresa_el_nombre_del_usuario_a_buscar() throws Throwable {
		controlador.findElement(By.xpath("//input[@placeholder='Búsqueda']")).sendKeys("yesenia cisterna puchi");	
	}

	@When("^El usuario presiona el click de buscar$")
	public void el_usuario_presiona_el_click_de_buscar() throws Throwable {
		controlador.findElement(By.xpath("//button[@class='nav-search-button']")).click();
		Thread.sleep(2000); 	
	}

	@When("^El usuario selecciona el usuario de la busqueda$")
	public void el_usuario_selecciona_el_usuario_de_la_busqueda() throws Throwable {
		controlador.findElement(By.xpath("//a[@class='search-result__result-link ember-view']")).click();
		Thread.sleep(2000); 	
	}

	@Then("^El usuario deberia ver el mensaje$")
	public void el_usuario_deberia_ver_el_mensaje() throws Throwable {
		Assert.assertEquals("yesenia cisterna puchi | LinkedIn", controlador.getTitle());
		controlador.close();
	}

}

