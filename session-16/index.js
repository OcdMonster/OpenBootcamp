const parrafos = document.querySelectorAll(".parrafo")
const secciones = document.querySelectorAll(".seccion")
const contenedor = document.querySelector("#caja")

parrafos.forEach(parrafo => {
    parrafo.addEventListener("dragstart", event => {
        console.log("Estoy arrastrando el parrafo: " + parrafo.innerText)
        parrafo.classList.add("dragging")
        event.dataTransfer.setData("id", parrafo.id)
        const elemento_fantasma = document.querySelector(".imagen-fantasma")
        event.dataTransfer.setDragImage(elemento_fantasma, 0, 0)
    })

    parrafo.addEventListener("dragend", () => {
        console.log("He terminado de arrastrar")
        parrafo.classList.remove("dragging")
    })
});

secciones.forEach(seccion => {
    seccion.addEventListener("dragover", event => {
        event.preventDefault()
        event.dataTransfer.dropEffect = "copy"
        console.log("Drag over")
    })

    seccion.addEventListener("drop", event => {
        console.log("Drop")
        const id_parrafo = event.dataTransfer.getData("id")
        console.log("parrafo id: ", id_parrafo)
        const parrafo = document.getElementById(id_parrafo)
        seccion.appendChild(parrafo)
    })
})

contenedor.addEventListener("dragenter", event => {
    console.log("Drag Enter")
})

contenedor.addEventListener("drageleave", event => {
    console.log("Drag Leave")
})

contenedor.addEventListener("dragover", event => {
    console.log("Dragover")
    event.preventDefault()
})
/* Añade el código necesario para que al arrastrar un fragmento del puzzle a la
papelera, éste se elimine */
contenedor.addEventListener("drop", event => {
    console.log("Drop")
    const id_parrafo = event.dataTransfer.getData("id")
        console.log("parrafo id: ", id_parrafo)
        const caja = document.getElementById(id_parrafo)
        caja.remove()
})
