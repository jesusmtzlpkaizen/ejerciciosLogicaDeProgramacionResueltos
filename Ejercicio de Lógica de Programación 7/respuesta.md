Módulo horas()
//Pedimos los valores
Leer día
Leer hora
Leer minutos
//Variable para cálculo de minutos
calculo = 5
//Realizamos las operaciones
Si día es "Lunes" entonces
calculo = calculo - 0
Si no, si día es "Martes" entonces
calculo = calculo - 1
Si no, si día es "Miercoles" entonces
calculo = calculo - 2
Si no, si día es "Jueves" entonces
calculo = calculo - 3
Si no, si día es "Viernes" entonces
calculo = calculo - 4
Si no,
Mostrar "Valor día inválido"
calculo = calculo _ 24
calculo = calculo - hora
calculo = calculo _ 60
calculo = calculo - minutos
Mostrar "Faltan " + calculo + " minutos para el fin de semana"
Fin del módulo horas

Módulo principal()
Llamar al módulo horas()
Fin del módulo principal
