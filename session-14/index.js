//- Crea un fichero index.js

//- Vincula un evento de tipo "click" al botón anterior, que muestre una alerta en el navegador "click en el botón"
$(() => {
    $(".show-btn").click(() => {
        alert("click en el botón")
        console.warn("Hola, estoy utilizando jQuery")
    })

//- En el fichero index.js crea un evento click en el botón a través de jQuery, que muestre por consola "Hola, estoy utilizando jQuery"
    $(".print-btn").click(() => {
        console.warn("Hola, estoy utilizando jQuery")
    })
})


