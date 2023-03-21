/* -Se requiere pedirle al ususario un numero para poder calcular la serie de fibonacci*/

let num = "a"; // Declaracion global de variables
let variable1 = 0;
let variable2 = 1;
let arreglo = []; //creamos un arreglo donde almacenaremos los valores para el final solo imprimirlo

while (num != Number(num)) {
  num = prompt(`Por favor ingresa un valor numerico`); //...Asignacion de valores por el usuario
}
num = Number(num); //tranformar el valor a number

for (let i = 1; i <= num; i++) {
  //iteramos los valores

  arreglo.push(variable1); //agregamos el valor al arreglo

  let suma = variable1 + variable2; //reasignamos valores
  variable1 = variable2;
  variable2 = suma;
}

console.log(arreglo.join(", ")); //mandamos a imprimir el arreglo
