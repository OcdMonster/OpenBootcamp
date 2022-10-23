//En el entrypoint index.js, importa el módulo controller.js
import {suma, multiplica } from './modulos/controller.js'

//El entrypoint index.js debe utilizar las funciones del módulo para devolver la multiplicación de suma(1, 2) y suma(4, 5)
const mult = multiplica(1, 2)
console.log(mult);

const sum = suma(4, 5)
//Modifica el último console.log del entrypoint index.js para devolver el resultado en color verde
console.log(chalk.green(sum));

//Instala e importa la librería chalk (https://www.npmjs.com/package/chalk)
import chalk from 'chalk';


