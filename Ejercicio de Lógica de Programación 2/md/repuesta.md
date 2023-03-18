## // Se requiere pedirle al usuario un número para poder convertirlo a otro valor

num = "a" // Declarar variable num y asignarle un valor de "a"

// Iniciar un ciclo while que se repetirá mientras num no sea un número
mientras (num no sea un número) {
// Pedir al usuario que ingrese la temperatura en grados Celsius y asignar el valor a la variable num
num = solicitarValorAlUsuario("Por favor ingresa la temperatura Celsius con valor numérico")
}

// Convertir el valor de num a un número
num = convertirANumero(num)

// Imprimir la equivalencia de la temperatura en grados Fahrenheit
imprimir("Grados Fahrenheit: " + num \* (9 / 5) + 32)

// Imprimir la equivalencia de la temperatura en grados Kelvin
imprimir("Grados Kelvin: " + num + 273.15)
