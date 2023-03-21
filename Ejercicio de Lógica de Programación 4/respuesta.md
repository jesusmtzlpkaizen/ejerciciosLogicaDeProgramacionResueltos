##// Se requiere pedirle al usuario un número para calcular la serie de Fibonacci
variables:
num: cadena
variable1: entero
variable2: entero
arreglo: lista de enteros

// Pedir al usuario un valor numérico hasta que se ingrese uno válido
mientras num no sea un número entero hacer:
num = solicitarEntrada("Por favor ingresa un valor numerico")

// Convertir num de cadena a entero
num = convertirAEntero(num)

// Inicializar las variables para la serie de Fibonacci
variable1 = 0
variable2 = 1

// Calcular la serie de Fibonacci hasta el número ingresado
para i desde 1 hasta num hacer:
agregar variable1 a arreglo
suma = variable1 + variable2
variable1 = variable2
variable2 = suma

// Imprimir la serie de Fibonacci
imprimir arreglo
