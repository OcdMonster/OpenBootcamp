//Una clase llamada "Estudiante" que tenga:
class Estudiante {
    contructor(nombre, asignaturas) {
        this.nombre = nombre
        this.asignaturas = asignaturas
    }
    //Un método "obtenDatos" que devuelva un objeto con las propiedades nombre y asignaturas
    obtenDatos (){
        return (`"nombre: "${this.nombre}, "asignaturas: "${this.asignaturas}`);
    }

}
//Crea una nueva instancia de "Estudiante"
const estudiante = new Estudiante("Max", ["Javascript", "HTML", "CSS"]);

//Haz la llamada al método obtenDatos
console.log(estudiante.obtenDatos());
console.log(estudiante);