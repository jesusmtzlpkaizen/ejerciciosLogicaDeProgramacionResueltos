/* -Se requiere pedirle al ususario adivinar un numero del 1 al 100*/

let num = "a"; // Declaracion global de variables
let variable = Math.floor(Math.random() * 100);

while (variable != num) {
  num = prompt(`Por favor ingresa un numero del 1 al 100`); //...Asignacion de valores por el usuario

  num = Number(num); //tranformar el valor a number
  if (num < variable) {
    //con estos controles podemos ayudar al usuario a responder mas rapido
    alert("el numero es mas grande");
  } else if (num > variable) {
    alert("el numero es mas pequeño");
  } else if (num == variable) {
    alert("Felicidades, adivinaste el numero secreto");
  }
}
