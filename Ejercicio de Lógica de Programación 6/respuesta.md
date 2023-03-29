    // Método para invertir la palabra ingresada por el usuario
    MÉTODO palabra
    	// Pedir la palabra al usuario
    	ESCRIBIR("Ingresa una frase");
    	LEER palabra DESDE teclado;

    	// Invertir la palabra
    	CREAR un nuevo StringBuilder con la palabra ingresada;
    	APLICAR el método reverse() al objeto StringBuilder creado;
    	CONVERTIR el objeto StringBuilder en una cadena de caracteres usando el método toString();
    	GUARDAR el resultado en una variable nueva;

    	// Mostrar el resultado
    	ESCRIBIR("La palabra al revés es: " + resultado);

    	// Cerrar la entrada del teclado
    	CERRAR teclado;


    // Método principal para llamar al método palabra
    MÉTODO PRINCIPAL(args: ARREGLO DE CADENAS)
    	LLAMAR AL MÉTODO palabra
