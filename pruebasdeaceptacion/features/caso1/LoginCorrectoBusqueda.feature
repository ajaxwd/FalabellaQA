Feature: Login correcto con busqueda de usuario

	Scenario: Login con busqueda
		Given Abrimos el navegador y vamos al sitio web del login
		When El usuario ingresa el email y el password
		And El usuario presiona el click en el boton entrar
		And El usuario ingresa el nombre del usuario a buscar
		And El usuario presiona el click de buscar
		And El usuario selecciona el usuario de la busqueda
		Then El usuario deberia ver el mensaje
