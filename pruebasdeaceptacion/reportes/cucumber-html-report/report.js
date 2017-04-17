$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginCorrectoBusqueda.feature");
formatter.feature({
  "line": 1,
  "name": "Login correcto con busqueda de usuario",
  "description": "",
  "id": "login-correcto-con-busqueda-de-usuario",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login con busqueda",
  "description": "",
  "id": "login-correcto-con-busqueda-de-usuario;login-con-busqueda",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Abrimos el navegador y vamos al sitio web del login",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "El usuario ingresa el email y el password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "El usuario presiona el click en el boton entrar",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "El usuario ingresa el nombre del usuario a buscar",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "El usuario presiona el click de buscar",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "El usuario selecciona el usuario de la busqueda",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "El usuario deberia ver el mensaje",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsBusqueda.abrimos_el_navegador_y_vamos_al_sitio_web_del_login()"
});
formatter.result({
  "duration": 4095059242,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsBusqueda.el_usuario_ingresa_el_email_y_el_password()"
});
formatter.result({
  "duration": 237667125,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsBusqueda.el_usuario_presiona_el_click_en_el_boton_entrar()"
});
formatter.result({
  "duration": 2048351621,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsBusqueda.el_usuario_ingresa_el_nombre_del_usuario_a_buscar()"
});
formatter.result({
  "duration": 158972424,
  "error_message": "org.openqa.selenium.NoSuchElementException: No such element (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 152 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u0027unknown\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:43:45 -0700\u0027\nSystem info: host: \u0027yesita\u0027, ip: \u0027192.168.0.11\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.edge.EdgeDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, acceptSslCerts\u003dtrue, browserVersion\u003d38.14393.1066.0, platformVersion\u003d10, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dMicrosoftEdge, takesScreenshot\u003dtrue, pageLoadStrategy\u003dnormal, takesElementScreenshot\u003dtrue, platformName\u003dwindows, platform\u003dANY}]\nSession ID: 7B7F5D3D-2AF5-48F1-AA7C-F38FFE935B2A\n*** Element info: {Using\u003dcss selector, value\u003dinput.ember-text-field ember-view}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:465)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:430)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat com.edu.eam.loginbusqueda2.steps.LoginStepsBusqueda.el_usuario_ingresa_el_nombre_del_usuario_a_buscar(LoginStepsBusqueda.java:42)\r\n\tat ✽.And El usuario ingresa el nombre del usuario a buscar(LoginCorrectoBusqueda.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepsBusqueda.el_usuario_presiona_el_click_de_buscar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepsBusqueda.el_usuario_selecciona_el_usuario_de_la_busqueda()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepsBusqueda.el_usuario_deberia_ver_el_mensaje()"
});
formatter.result({
  "status": "skipped"
});
});