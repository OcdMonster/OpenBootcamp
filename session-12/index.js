//Crea un nuevo fichero JS que contenga las siguientes líneas


//Una función que admita un parámetro "num", y devuelva una lista con esa cantidad de números de la secuencia de Fibonacci (Por ejemplo: num = 6 => Resultado [1, 1, 2, 3, 5, 8])

const Fibonacci = [1,1,2,3,5,8,13,21,34,55,89,144]

const arrayFib = function(num) {
    let arrayFibonacci = [];

    if (num > 2) {
   while (num > 2){
    arrayFibonacci.push(num-2 + num-1);
    num--;
    }
    }while (num > 0){
        arrayFibonacci.push(num);
        num--;
    }if ( num == 0){
        arrayFibonacci.push(1);
    }
    return arrayFibonacci.reverse();

    }
    console.log(arrayFib(7))

//Ejecuta la depuración de VSCode para visualizar la ejecución de la función