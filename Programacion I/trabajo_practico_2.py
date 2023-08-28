"""cSpell:disable"""

# TRABAJO PRACTICO 2

# Ejercicio 1
# Crear un programa que reciba el número de años que tiene nuestra computadora
# y muestre en la consola que el computador es nuevo si es menor o igual a 2
# años y que el computador es viejo si es mayor a 2 años.
anios_computador1 = int(input("Número de años del computador: "))

ESTADO_COMPUTADOR = (
    "El computador es nuevo." if anios_computador1 <= 2 else "El computador es viejo."
)

print(ESTADO_COMPUTADOR)

# Ejercicio 2
# Hacer que el programa anterior muestre un mensaje de error si el usuario
# digita un número negativo.
anios_computador2 = int(input("Número de años del computador: "))

if anios_computador2 < 0:
    print("Error. Ingrese un número positivo.")
elif anios_computador2 <= 2:
    print("El computador es nuevo.")
else:
    print("El computador es viejo.")

# Ejercicio 3
# Solicitar al usuario que ingrese los nombres de dos personas, los cuales se
# almacenarán en dos variables. A continuación. Imprimir ‘coincidencia’ si
# ambos nombres comienzan con la misma letra. Si no es así, imprimir ‘no hay
# coincidencia’.
NOMBRE_1 = str(input("Nombre de la primer persona: ")).upper()
NOMBRE_2 = str(input("Nombre de la segunda persona: ")).upper()

ES_MISMA_LETRA = (
    "Coincidencia." if NOMBRE_1[0] == NOMBRE_2[0] else "No hay coincidencia."
)

print(ES_MISMA_LETRA)

# Ejercicio 4
# Crear un programa que permita al usuario elegir un candidato por el cual
# votar. Las posibilidades son: candidato A por el partido rojo, candidato B
# por el partido verde, candidato C por el partido azul.
# Según el candidato elegido (A, B o C) se debe imprimir el mensaje: ‘Usted ha
# votado por el partido [color del candidato elegido].
# Si el usuario ingresa una opción que no corresponde a ninguno de los
# candidatos disponibles, indicar ‘Opción errónea.’
CANDIDATO_A_VOTAR = str(input("Candidato a votar (A), (B) o (C): ")).upper()

if CANDIDATO_A_VOTAR == "A":
    print("Usted ha votado por el partido rojo")
elif CANDIDATO_A_VOTAR == "B":
    print("Usted ha votado por el partido verde")
elif CANDIDATO_A_VOTAR == "C":
    print("Usted ha votado por el partido azul")
else:
    print("Opción errónea")

# Ejercicio 5
# Escribir un programa que solicite al usuario una letra, si es una vocal,
# mostrar el mensaje ‘Es vocal’.
# Se debe validar que el usuario ingrese sólo un carácter. Si ingresa un
# string de más de un carácter, informarle que no se puede procesar el dato.
LETRA = str(input("Ingrese una letra: ")).lower()
VOCALES = "aeiou"

if len(LETRA) == 1:
    if LETRA in VOCALES:
        print("Es vocal.")
else:
    print("Error. No se puede procesar el dato.")

# Ejercicio 6
# Hacer un programa que permita saber si un año es bisiesto. Para que un año
# sea bisiesto debe ser divisible por 4 y no debe ser divisible por 100,
# excepto que también sea divisible por 400.
anio = int(input("Ingrese el año: "))

if (anio % 4 == 0 and anio % 100 != 0) or (anio % 400 == 0):
    print(f"El {anio} es bisiesto.")
else:
    print(f"El {anio} no es bisiesto.")


# Ejercicio 7
# Escribí un programa para solicitar al usuario tres números y mostrar en
# pantalla al menor de los tres.
num1 = int(input("Ingrese el primer número: "))
num2 = int(input("Ingrese el segundo número: "))
num3 = int(input("Ingrese el tercer número: "))

menor_num = min(num1, num2, num3)

print(f"El menor número ingresado es: {menor_num}")

# Ejercicio 8
# Escribí un programa que solicite ingresar un nombre de usuario y una
# contraseña. Si el nombre es “Gwenevere” y la contraseña es “excalibur”,
# mostrar en pantalla “Usuario y contraseña correctos. Puede ingresar a
# Camelot”. Si el nombre o la contraseña no coinciden, mostrar “Acceso
# denegado”.
NOMBRE_USUARIO = str(input("Ingrese el nombre de usuario: "))
CONTRASENIA = str(input("Ingrese la contraseña: "))

MENSAJE_INGRESO = (
    "Usuario y contraseña correctos. Puede ingresar a Camelot"
    if NOMBRE_USUARIO == "Gwenevere" and CONTRASENIA == "excalibur"
    else "Acceso denegado"
)

print(MENSAJE_INGRESO)

# Ejercicio 9
# Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al
# sexo y el nombre. El grupo A está formado por las mujeres con un nombre
# anterior a la M y los hombres con un nombre posterior a la N y el grupo B
# por el resto. Escribir un programa que pregunte al usuario su nombre y sexo,
# y muestre por pantalla el grupo que le corresponde.

# Ejercicio 10
# Escribir un programa para una empresa que tiene salas de juegos para todas
# las edades y quiere calcular de forma automática el precio que debe cobrar a
# sus clientes por entrar. El programa debe preguntar al usuario la edad del
# cliente y mostrar el precio de la entrada. Si el cliente es menor de 4 años
# puede entrar gratis, si tiene entre 4 y 18 años debe pagar $500 y si es
# mayor de 18 años, $1000.

# Ejercicio 11
# La pizzería Bella Napoli ofrece pizzas vegetarianas y no vegetarianas a sus
# clientes. Los ingredientes para cada tipo de pizza aparecen a continuación.
#           Ingredientes vegetarianos: Pimiento y tofu.
#           Ingredientes no vegetarianos: Peperoni, Jamón y Salmón.
# Escribir un programa que pregunte al usuario si quiere una pizza vegetariana
# o no, y en función de su respuesta le muestre un menú con los ingredientes
# disponibles para que elija. Solo se puede elegir un ingrediente además de la
# mozzarella y el tomate que están en todas la pizzas. Al final se debe
# mostrar por pantalla si la pizza elegida es vegetariana o no y todos los
# ingredientes que lleva.

# Ejercicio 12
# Escriba un programa que pida el año actual y un año cualquiera y que escriba
# cuántos años han pasado desde ese año o cuántos años faltan para llegar a
# ese año.

# Ejercicio 13
# Escriba un programa que pida dos números enteros y que escriba si el mayor
# es múltiplo del menor. Haciendo que el programa avise cuando se escriben
# valores negativos o nulos.

# Ejercicio 14
# Escriba un programa que pida los coeficientes de una ecuación de primer
# grado (a x + b = 0) y escriba la solución.
# Se recuerda que una ecuación de primer grado puede no tener solución, tener
# una solución única, o que todos los números sean solución. Se recuerda que
# la fórmula de las soluciones es x = -b / a

# Ejercicio 15
# Escriba un programa que pregunte primero si se quiere calcular el área de un
# triángulo o la de un círculo. Si se contesta que se quiere calcular el área
# de un triángulo (escribiendo T o t), el programa tiene que pedir entonces la
# base y la altura y escribir el área. Si se contesta que se quiere calcular
# el área de un círculo (escribiendo C o c), el programa tiene que pedir
# entonces el radio y escribir el área.

# Ejercicio 16
# Haz una calculadora básica pida al usuario dos valores, a y b.
# Según la opción que desean, realizar la operación:
#   |   Si operación es 1 entonces debemos ver el resultado de a + b
#       Si operación es 2 entonces debemos ver el resultado de a * b
#       Si operación es 3 entonces debemos ver el resultado de a - b
#       Si operación es 4 entonces debemos ver el resultado de a / b

# Ejercicio 17
# Requerir al usuario que ingrese un día de la semana e imprimir un mensaje si
# es lunes, otro mensaje diferente si es viernes, otro mensaje diferente si es
# sábado o domingo. Si el día ingresado no es ninguno de esos, imprimir otro
# mensaje.

# Ejercicio 18
# Preguntar al usuario el total de horas trabajadas en el mes y el salario por
# hora. La jornada de trabajo mínima es de 48 horas. Calcular, dadas las horas
# trabajadas, si trabajó horas extras y mostrar esta cantidad.
# Mostrar su salario total, tomando en cuenta que las horas extras serán
# pagadas un 10% más que las horas laborales comunes.

# Ejercicio 19
# Determinar cuánto se debe pagar por una cantidad de lápices considerando que
# si son 1000 o más, existe un descuento de 7% y teniendo en cuenta que el
# costo por lápiz es de $60; de lo contrario no hay descuento.

# Ejercicio 20
# Determinar si un alumno aprueba o reprueba un curso, sabiendo que aprobara
# si su promedio de cuatro (4) notas, es mayor o igual a 6; caso contrario
# saldrá desaprobado.
