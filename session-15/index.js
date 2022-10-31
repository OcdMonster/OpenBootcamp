//En el fichero index.js:

//Crea una variable con tu nombre
let nombre = "Max";
//Crea una variable con tu apellido
let apellido = "Curiel";
//Crea un objeto con tu nombre y tu apellido
let nombreCompleto = {};
nombreCompleto.nombre = nombre;
nombreCompleto.apellido = apellido;
//Almacena el objeto anterior en la SessionStorage
sessionStorage.setItem(nombre, apellido)
//Almacena el objeto anterior en la LocalStorage
localStorage.setItem(nombre, apellido)
localStorage.removeItem(nombre, apellido)
//Crea una cookie que caduque en 2 minutos con los datos del objeto anterior
document.cookie = "Max-Cookie;expires=" + new Date(2022, 10, 31, 21, 2, 04).toUTCString()