Feature: Login con error 

Scenario: Login con error 
	Given Abrimos el navegador y vamos al sitio web del login 
	When El usuario ingrese el username y el password 
	And El usuario presione el click en el boton entrar 
	Then El ususario deberia ver el mensaje 
		