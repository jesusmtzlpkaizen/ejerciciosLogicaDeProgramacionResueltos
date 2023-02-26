/* -Se necesitara declarar 4 variables, tres para pedir al usuario numeros, una para realizar movimientos de numeros.
-Se requiere usar el metodo prompt para poder solicitar al usuario los numeros
-Se requiere condicionar el acceso al algoritmo si los valores suministrados no coinciden con datos numericos
-Se requeriran condicionales para comparar los valores y ordenarlos
-Se requiere imprimir los numeros y tambien revisar si son iguales*/

let num1, num2, num3, num4; // Declaracion global de variables

num1 = prompt(`Por favor ingresa el numero 1`); //...
num2 = prompt(`Por favor ingresa el numero 2`); //...
num3 = prompt(`Por favor ingresa el numero 3`); //...Asignacion de valores por el usuario

if (num1 == Number(num1) && num2 == Number(num2) && num3 == Number(num3)) {
  //Condicional de acceso para valores permitidos
  num1 = Number(num1); //...
  num2 = Number(num2); //...
  num3 = Number(num3); //...Transformacion de variables
  num4 = num1; //asignacion de un valor a la cuarta variable para poder hacer las comparaciones

  if (num1 < num2) {
    //Primer condicional para revisar el valor de los primeros dos numeros
    num1 = num2;
    num2 = num4;
    num4 = num2;
  }
  if (num1 < num3) {
    //Segundo condicinal para revisar el valor del tercer numero
    num2 = num1;
    num1 = num3;
    num3 = num4;
  }

  console.log(`${num1},${num2},${num3}`); //Mandar a consola reultados mayor a menor
  console.log(`${num3},${num2},${num1}`); //Mandar a consola resultados menor a mayor

  if (num1 == num2 && num1 == num3) {
    //Condicional para revisar si son iguales
    console.log("los numeros son iguales"); //Mandar a consola si lo son
  }
} else {
  //Si no se cumple la condicion de valores adecuados suministrados
  console.log("los datos ingresados son invalidos"); //Mandar a consola mensaje
}
