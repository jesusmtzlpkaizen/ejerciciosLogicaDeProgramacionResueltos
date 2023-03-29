Función primos():
//Declaramos el arreglo
arreglo = nuevo arreglo de cadenas de longitud 10

    //declaramos la variable de un contador
    cuenta = 0
    dis = 9

    //iniciamos un scanner
    numero = nuevo Scanner para leer desde la entrada estándar

    //Calculos
    Para i desde 0 hasta 9:
        Imprimir "Dame el valor " + (i+1)
        valor = leer entero desde numero

        //declaramos un contador auxiliar ascendente
        contador = 0

        Para j desde 1 hasta valor:
            Si valor modulo j es igual a 0:
                contador = contador + 1
            Fin Si
        Fin Para

        Si contador es igual a 2:
            arreglo[cuenta] = convertir valor a cadena
            cuenta = cuenta + 1
        Si no:
            arreglo[dis] = convertir valor a cadena
            dis = dis - 1
        Fin Si

    Fin Para

    //Imprimimos el arreglo
    Para i desde 0 hasta 9:
        Imprimir "pos[" + i + "] " + arreglo[i]
    Fin Para

    //Cerramos la escucha
    numero.cerrar()

Fin Función

primos() //llamamos a la función
