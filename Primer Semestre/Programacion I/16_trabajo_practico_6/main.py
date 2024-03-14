import random
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
    number_to_remove = input("\nIngrese el número que desea eliminar: ")
    # Si el número ingresado se válida
    if is_integer(number_to_remove):
        number_to_remove = int(number_to_remove)
        # Y se encuentra en la lista, se elimina
        if number_to_remove in numbers:
            numbers.remove(number_to_remove)
            print(f"\nSe eliminó la primera ocurrencia del número {number_to_remove}.")
        else:
            print(f"\nNo se encontró el número {number_to_remove} en la lista.")
        break

    else:
        print("\nEntrada no válida. Por favor, ingrese un número entero.")

# Ejercicio 3
# Imprimir la sumatoria de todos los números de la lista.

print(f"\nLa sumatoria de los números de la lista {numbers} es: {sum(numbers)}")

# Ejercicio 4
# Solicitar al usuario otro número y crear una lista con los elementos de la
# lista original, que sean menores que el número dado. Imprimir esta nueva
# lista, iterando por ella.

# Se solicita al usuario otro número
threshold = input("\nIngrese un número para filtrar la lista: ")

# Si el número ingresado se válida como entero se crea una nueva lista con
# elementos menores que el número dado
if is_integer(threshold):
    threshold = int(threshold)
    filtered_list = [number for number in numbers if number < threshold]

    # Se imprime la nueva lista iterando por ella
    print("\nElementos menores que", threshold, "en la lista original:")
    for element in filtered_list:
        print(element)
else:
    print("\nEntrada no válida. Por favor, ingrese un número entero.")

# Ejercicio 5
# Generar e imprimir una nueva lista que contenga como elementos a tuplas, cada
# una compuesta por un número de la lista original y la cantidad de veces que
# aparece en ella. Por ejemplo, si la lista original es [5,16,2,5,57,5,2], la
# nueva lista contendrá: [(5,3),(16,1),(2,2),(57,1)]

count_tuples = generate_count_tuples(numbers)
print(f"La nueva lista generada es: {count_tuples}")

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

# Inicializamos las listas para los alumnos de nivel primario y secundario
elementary_students = []
high_school_students = []
# Solicitamos al usuario ingresar nombres de alumnos de nivel primario
while True:
    print("\nAlumno de Primario")
    name = input("Ingrese el nombre (o presione 'x' para finalizar): ")
    if name == "x":
        break
    elif name.isalpha():
        elementary_students.append(name)
    else:
        print("\nIngrese un nombre válido.")
# Solicitamos al usuario ingresar nombres de alumnos de nivel secundario
while True:
    print("\nAlumno de Secundario")
    name = input("Ingrese el nombre (o presione 'x' para finalizar): ")
    if name == "x":
        break
    elif name.isalpha():
        high_school_students.append(name)
    else:
        print("\nIngrese un nombre válido.")
# Los nombres de todos los alumnos de nivel primario y secundario sin repeticiones
all_names = list(set(elementary_students + high_school_students))
print(f"\nLa lista de todos los alumnos es: {all_names}")
# Los nombres que se repiten entre los alumnos de nivel primario y secundario
duplicate_names = list(set(elementary_students) & set(high_school_students))
print(f"\nLa lista de nombres que se repiten es: {duplicate_names}")
# Los nombres de nivel primario que no se repiten en nivel secundario
only_elementary_school_names = list(
    set(elementary_students) - set(high_school_students)
)
print(
    f"\nLa lista de nombres que solo se encuentran en primaria es: {only_elementary_school_names}"
)

# Ejercicio 7
# Escribir un programa que procese strings ingresados por el usuario. La lectura
# finaliza cuando se hayan procesado 50 strings. Al finalizar, informar la
# cantidad total de ocurrencias de cada carácter, en todos los strings
# ingresados. Ejemplo:
# ‘r’:5
# ‘%’:3
# ‘a’:8
# ‘9’:1

# Inicializamos un diccionario para almacenar las ocurrencias de cada carácter
occurrences = {}
# Inicializamos una variable para contar los strings procesados
str_entered = 0
# Procesamos strings hasta que se hayan procesado 50
while str_entered < 50:
    str = input("Ingrese un string: ")
    if str == "":
        print("¡String vació!")
        continue
    # Contamos las ocurrencias de cada carácter en el string actual
    for char in str:
        if char in occurrences:
            occurrences[char] += 1
        else:
            occurrences[char] = 1

    str_entered += 1
# Mostramos las ocurrencias de cada carácter
print("La cantidad total de ocurrencias de cada carácter es: ")
for char, count in occurrences.items():
    print(f"'{char}': {count}")

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
# 10                                       0

# Escriba un programa que:
# a). Lea el cuadro de goles en un arreglo de dos dimensiones.
# b). Muestre para cada equipo la cantidad de triunfos, empates y derrotas.
# c). Muestre la diferencia entre el total de goles marcados y el total de goles
# recibidos.
# d). Determine la cantidad de puntos obtenidos por cada equipo.

# Inicializamos matriz con equipos y goles
goals = [
    [0, 2, 3, 1, 0, 4, 2, 1, 0, 3],
    [1, 0, 2, 0, 1, 3, 2, 0, 1, 1],
    [0, 1, 0, 3, 0, 2, 0, 4, 0, 2],
    [3, 0, 4, 0, 2, 0, 0, 1, 0, 2],
    [0, 2, 1, 2, 0, 1, 3, 0, 0, 1],
    [1, 1, 0, 0, 1, 0, 2, 3, 0, 2],
    [0, 1, 0, 0, 0, 1, 0, 4, 0, 1],
    [1, 0, 3, 1, 0, 2, 0, 0, 0, 3],
    [0, 2, 0, 2, 0, 1, 2, 0, 0, 0],
    [0, 1, 1, 1, 1, 0, 1, 2, 0, 0],
]

# Inicializamos listas para contar triunfos, empates y derrotas
wins = [0] * 10
ties = [0] * 10
losses = [0] * 10

# Recorremos la matriz de goles y calculamos los resultados
for i in range(10):
    for j in range(10):
        if i != j:
            if goals[i][j] > goals[j][i]:
                wins[i] += 1
            elif goals[i][j] == goals[j][i]:
                ties[i] += 1
            else:
                losses[i] += 1

# Calculamos la diferencia entre goles marcados y recibidos
goal_difference = [
    sum(goals[i]) - sum([goals[j][i] for j in range(10)]) for i in range(10)
]

# Calculamos la cantidad de puntos para cada equipo (3 puntos por triunfo, 1 punto por empate)
points = [wins[i] * 3 + ties[i] for i in range(10)]

# Mostramos los resultados para cada equipo.
for team in range(10):
    print(f"\nEquipo {team + 1}: ")
    print(f"Triunfos: {wins[team]}, Empates: {ties[team]}, Derrotas: {losses[team]}")
    print(f"Diferencia de Goles: {goal_difference[team]}")
    print(f"Puntos: {points[team]}")

# Ejercicio 9
# Escribir un programa que simule el juego clásico de Memoria (Memotest)
# utilizando matrices.
# El juego consiste en un tablero de cartas boca abajo y el objetivo es
# encontrar todas las parejas de cartas iguales.

# Define el tamaño del tablero
rows = 4
columns = 4

# Crea una matriz para el tablero con cartas boca abajo
board = [["X" for _ in range(columns)] for _ in range(rows)]

# Crea un tablero con cartas y sus respectivas parejas
cards = [chr(65 + i) for i in range(rows * columns // 2)] * 2
random.shuffle(cards)
cards_board = [cards[i : i + columns] for i in range(0, len(cards), columns)]

found_pairs = 0
attempts = 0

while found_pairs < len(cards) // 2:
    print_board(board)
    card1 = input("Ingrese las coordenadas de la primera carta (fila columna): ")
    row1, column1 = map(int, card1.split())
    card2 = input("Ingrese las coordenadas de la segunda carta (fila columna): ")
    row2, column2 = map(int, card2.split())

    if (
        0 <= row1 < rows
        and 0 <= column1 < columns
        and 0 <= row2 < rows
        and 0 <= column2 < columns
    ):
        if cards_board[row1][column1] == cards_board[row2][column2]:
            if board[row1][column1] == "X" and board[row2][column2] == "X":
                board[row1][column1] = cards_board[row1][column1]
                board[row2][column2] = cards_board[row2][column2]
                found_pairs += 1
            else:
                print("Cartas ya encontradas. Intente de nuevo.")
        else:
            print("Las cartas no coinciden. Intente de nuevo.")
    else:
        print("Coordenadas fuera de rango. Intente de nuevo.")

    attempts += 1

print_board(board)
print(f"Ganaste en {attempts} intentos!")

# Ejercicio 10
# Teniendo una matriz cuadrada de cualquier dimensión, obtener lo siguiente:
# a). la diagonal principal.
# b). la diagonal inversa.

# Copiar la matriz utilizada anteriormente en Ejercicio 8
matriz = list(goals)

# Obtener la cantidad de filas y columnas de la matriz
rows = len(matriz)
columns = len(matriz[0])

# Inicializar listas para las diagonales principal e inversa
main_diagonal = []
reverse_diagonal = []

# Obtener la diagonal principal (elementos en fila i, columna i)
for i in range(min(rows, columns)):
    main_diagonal.append(matriz[i][i])

# Obtener la diagonal inversa (elementos en fila i, columna n-i-1)
for i in range(min(rows, columns)):
    reverse_diagonal.append(matriz[i][columns - i - 1])

# Mostrar por consola las diagonales
print(f"Diagonal Principal: {main_diagonal}")
print(f"Diagonal Inversa: {reverse_diagonal}")

# Ejercicio 11
# Escribir un programa que guarde en una variable el diccionario {'Euro':'€',
# 'Dollar':'$', 'Yen':'¥'}, pregunte al usuario por una divisa y muestre su
# símbolo o un mensaje de aviso si la divisa no está en el diccionario.

# Crear un diccionario con conversiones de divisas
currencies = {"Euro": "€", "Dollar": "$", "Yen": "¥"}

# Solicitar al usuario que ingrese una divisa
currency = input("Ingrese una divisa: ")

# Verificar si la divisa está en el diccionario y mostrar su símbolo o un mensaje de aviso
if currency in currencies:
    print(f"El símbolo de {currency} es {currencies[currency]}")
else:
    print("La divisa no está en el diccionario.")

# Ejercicio 12
# Escribir un programa que pregunte al usuario su nombre, edad, dirección y
# teléfono y lo guarde en un diccionario. Después debe mostrar por pantalla el
# mensaje ‘<nombre> tiene <edad> años, vive en <dirección> y su número de
# teléfono es <teléfono>’.

# Solicitar al usuario su información personal
name = input("Ingrese su nombre: ")
age = input("Ingrese su edad: ")
address = input("Ingrese su dirección: ")
phone = input("Ingrese su número de teléfono: ")

# Crear un diccionario para almacenar la información del usuario
user_info = {"Nombre": name, "Edad": age, "Dirección": address, "Teléfono": phone}

# Mostrar la información del usuario en la pantalla
print(
    f"\n{user_info['Nombre']} tiene {user_info['Edad']} años, vive en {user_info['Dirección']}, y su número de teléfono es {user_info['Teléfono']}."
)

# Ejercicio 13
# Escribir un programa que guarde en un diccionario los precios de las frutas de
# la tabla, pregunte al usuario por una fruta, un número de kilos y muestre por
# pantalla el precio de ese número de kilos de fruta. Si la fruta no está en el
# diccionario debe mostrar un mensaje informando de ello.

# Crear un diccionario para almacenar los precios de las frutas
fruit_prices = {
    "Manzana": 0.5,
    "Banana": 0.25,
    "Naranja": 0.75,
    "Uvas": 1.0,
}

# Solicitar al usuario el nombre de una fruta y la cantidad en kilogramos
fruit_name = input("\nIngrese el nombre de una fruta: ")
kilos = float(input("\nIngrese la cantidad en kilogramos: "))

# Comprobar si la fruta está en el diccionario y calcular el precio
if fruit_name in fruit_prices:
    total_price = fruit_prices[fruit_name] * kilos
    print(f"\nEl precio de {kilos} kilogramos de {fruit_name} es de ${total_price:.2f}")
else:
    print("\nLa fruta no está en el diccionario.")
