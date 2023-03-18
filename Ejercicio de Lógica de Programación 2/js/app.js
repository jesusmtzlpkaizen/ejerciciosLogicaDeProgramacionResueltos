/* -Se requiere pedirle al ususario un numero para poderlo convertir a otro valor*/

let num = "a"; // Declaracion global de variables

while (num != Number(num)) {
  num = prompt(`Por favor ingresa la temperatura celsius con valor numerico`); //...Asignacion de valores por el usuario
}
num = Number(num); //tranformar el valor a num

console.log(`Grados Farenheit:  ${num * (9 / 5) + 32}`); //imprimir equivalencias en temperaturas
console.log(`Grados Kelvin:  ${num + 273.15}`);
