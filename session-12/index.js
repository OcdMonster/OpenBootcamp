//Crea un nuevo fichero JS que contenga las siguientes líneas


//Una función que admita un parámetro "num", y devuelva una lista con esa cantidad de números de la secuencia de Fibonacci (Por ejemplo: num = 6 => Resultado [1, 1, 2, 3, 5, 8])

const Fibonacci = [1,1,2,3,5,8,13,21,34,55,89,144]

const arrayFib = function(num) {
    let arrayFibonacci = [];

   while (num > 2){
    arrayFibonacci.push(num-2 + num-1);
    num--;
    }
    return arrayFibonacci.reverse();

}
console.log(arrayFib(12))

//Ejecuta la depuración de VSCode para visualizar la ejecución de la función