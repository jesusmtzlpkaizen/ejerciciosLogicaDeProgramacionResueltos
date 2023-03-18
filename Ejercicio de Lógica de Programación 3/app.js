/* -Se requiere pedirle al ususario un numero para poder calcular su factorial*/

let num = "a"; // Declaracion global de variables

while (num != Number(num)) {
  num = prompt(`Por favor ingresa un valor numerico`); //...Asignacion de valores por el usuario
}
num = Number(num); //tranformar el valor a number

function calcularFactorial(num) {
  //creamos una funcion que nos permitira calcular el resultado
  let resultado = 1;

  for (let i = 2; i <= num; i++) {
    //este ciclo nos permitira iterar las multiplicaciones
    resultado *= i;
  }

  return resultado;
}

console.log(calcularFactorial(num)); //mandamos a llamar a la funcion
