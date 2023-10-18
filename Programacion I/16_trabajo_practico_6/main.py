from functions import *

# Ejercicio 1
# Solicitar al usuario que ingrese números, estos deben guardarse en una lista.
# Para finalizar el usuario debe ingresar 0, el cual no debe guardarse.

# Se inicializa la lista de números
numbers = []
# Se solicita al usuario el ingreso de números
while True:
    number = input("Ingrese un número (0 para finalizar): ")
    # Si ingresa el número 0 se finaliza el programa
    if number == "0":
        break
    # Si el número ingresado se válida como entero se guarda en la lista
    if is_integer(number):
        numbers.append(int(number))
    else:
        print("Entrada no válida. Por favor, ingrese un número entero.")
# Se imprime la lista de números
print("\nNúmeros ingresados: ", numbers)

# Ejercicio 2
# A continuación, solicitar al usuario que ingrese un número y, si el número
# está en la lista, eliminar su primera ocurrencia. Mostrar un mensaje si no es
# posible eliminar.

# Se solicita al usuario un número a eliminar
while True:
    number_to_remove = input("Ingrese el número que desea eliminar: ")
    # Si el número ingresado se válida
    if is_integer(number_to_remove):
        number_to_remove = int(number_to_remove)
        # Y se encuentra en la lista, se elimina
        if number_to_remove in numbers:
            numbers.remove(number_to_remove)
            print(f"Se eliminó la primera ocurrencia del número {number_to_remove}.")
        else:
            print(f"No se encontró el número {number_to_remove} en la lista.")
        break

    else:
        print("Entrada no válida. Por favor, ingrese un número entero.")

# Ejercicio 3
# Imprimir la sumatoria de todos los números de la lista.

print(f"La sumatoria de los números de la lista {numbers} es: {sum(numbers)}")

# Ejercicio 4
# Solicitar al usuario otro número y crear una lista con los elementos de la
# lista original, que sean menores que el número dado. Imprimir esta nueva
# lista, iterando por ella.

# Se solicita al usuario otro número
threshold = input("Ingrese un número para filtrar la lista: ")

# Si el número ingresado se válida como entero se crea una nueva lista con
# elementos menores que el número dado
if is_integer(threshold):
    threshold = int(threshold)
    filtered_list = [number for number in numbers if number < threshold]

    # Se imprime la nueva lista iterando por ella
    print("Elementos menores que", threshold, "en la lista original:")
    for element in filtered_list:
        print(element)
else:
    print("Entrada no válida. Por favor, ingrese un número entero.")

# Ejercicio 5
# Generar e imprimir una nueva lista que contenga como elementos a tuplas, cada
# una compuesta por un número de la lista original y la cantidad de veces que
# aparece en ella. Por ejemplo, si la lista original es [5,16,2,5,57,5,2], la
# nueva lista contendrá: [(5,3),(16,1),(2,2),(57,1)]

# Ejercicio 6
# Solicitar al usuario que ingrese los nombres de pila de los alumnos de nivel
# primario de una escuela, finalizando al ingresar ‘x’. A continuación,
# solicitar que ingrese los nombres de los alumnos de nivel secundario,
# finalizando al ingresar ‘x’.
# a). Informar los nombres de todos los alumnos de nivel primario y de los de
# nivel secundario, sin repeticiones.
# b). Informar qué nombres se repiten entre los alumnos de nivel primario y
# secundario.
# c). Informar qué nombres de nivel primario no se repiten en los de nivel
# secundario.

# Ejercicio 7
# Escribir un programa que procese strings ingresados por el usuario. La lectura
# finaliza cuando se hayan procesado 50 strings. Al finalizar, informar la
# cantidad total de ocurrencias de cada carácter, en todos los strings
# ingresados. Ejemplo:
# ‘r’:5
# ‘%’:3
# ‘a’:8
# ‘9’:1

# Ejercicio 8
# Diez equipos de la liga inter-barrial identificados con los números 1, 2, 3,
# 4, …, 10, participaron en un campeonato de fútbol con modalidad todos contra
# todos.
# Los goles anotados en cada encuentro se registraron en el siguiente cuadro:

# Goles(F,C)      1   2   3   4   ...     10
# 1               0   4   2   1   ...
# 2               5   0   3   2   ...
# 3               0   2   0   1   ...
# 4               1   0   2   0   ...
# ...             ... ... ... ...
# 5

# Escriba un programa que:
# Lea el cuadro de goles en un arreglo de dos dimensiones.
# Muestre para cada equipo la cantidad de triunfos, empates y derrotas.
# Muestre la diferencia entre el total de goles marcados y el total de goles
# recibidos.
# Determine la cantidad de puntos obtenidos por cada equipo.

# Ejercicio 9
# Escribir un programa que simule el juego clásico de Memoria (Memotest)
# utilizando matrices. El juego consiste en un tablero de cartas boca abajo y el
# objetivo es encontrar todas las parejas de cartas iguales.

# Ejercicio 10
# Teniendo una matriz cuadrada de cualquier dimensión, obtener lo siguiente:
# a). la diagonal principal.
# b). la diagonal inversa.

# Ejercicio 11
# Escribir un programa que guarde en una variable el diccionario {'Euro':'€',
# 'Dollar':'$', 'Yen':'¥'}, pregunte al usuario por una divisa y muestre su
# símbolo o un mensaje de aviso si la divisa no está en el diccionario.

# Ejercicio 12
# Escribir un programa que pregunte al usuario su nombre, edad, dirección y
# teléfono y lo guarde en un diccionario. Después debe mostrar por pantalla el
# mensaje ‘<nombre> tiene <edad> años, vive en <dirección> y su número de
# teléfono es <teléfono>’.

# Ejercicio 13
# Escribir un programa que guarde en un diccionario los precios de las frutas de
# la tabla, pregunte al usuario por una fruta, un número de kilos y muestre por
# pantalla el precio de ese número de kilos de fruta. Si la fruta no está en el
# diccionario debe mostrar un mensaje informando de ello.
