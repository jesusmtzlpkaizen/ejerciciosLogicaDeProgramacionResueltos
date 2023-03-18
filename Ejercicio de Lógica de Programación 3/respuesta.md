##// Se requiere pedirle al usuario un número para poder calcular su factorial

num = "a" // Declarar variable num y asignarle un valor de "a"

// Iniciar un ciclo while que se repetirá mientras num no sea un número
mientras (num no sea un número)
// Pedir al usuario que ingrese un número y asignar el valor a la variable num
num = solicitarValorAlUsuario("Por favor ingresa un valor numérico")

// Convertir el valor de num a un número
num = convertirANumero(num)

// Crear una función para calcular el factorial del número
funcion calcularFactorial(num)
// Declarar variable resultado y asignarle un valor de 1
resultado = 1

// Iniciar un ciclo for que se repetirá desde i = 2 hasta i <= num
para (i = 2; i <= num; i++)
// Multiplicar resultado por i en cada iteración del ciclo
resultado \*= i

// Devolver el valor de resultado

// Imprimir el resultado del cálculo del factorial del número ingresado por el usuario
imprimir(calcularFactorial(num))
