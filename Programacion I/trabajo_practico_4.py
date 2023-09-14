"""cSpell:disable"""
import math

# TRABAJO PRACTICO 4

# Ejercicio 1
# Create a while loop with the following characteristics:
#       • The initial value of the variable x will be 0.
#       • The increment value will be 1.
#       • The exit condition of the loop will be greater than or equal to 30.
#       • The execution must be broken when x is equal to 15.
#       • You must print the following sentence each time the loop executes:
#         'The value of the loop is: ' + x.
#       • You must skip the executions with the value of x in 4, 6 and 10.
#       • At each execution jump, you must display the jumped values with this
#         message: 'The value ' + x ' of x was skipped'.
#       • When the execution of the loop is broken, you must show a message
#         indicating it: 'The execution of the loop was broken when x was ' +
#         x.
x = 0

while x <= 30:
    print(f"The value of the loop is: {x}")
    x += 1
    if x == 4 or x == 6 or x == 10:
        print(f"The value {x} of x was skipped")
        x += 1
        continue
    if x == 15:
        print(f"The execution of the loop was broken when x was {x}")
        break

# Ejercicio 2
# Escriba un programa que acepte una secuencia de líneas e imprima todas las
# líneas convertidas en mayúsculas. Deje una línea en blanco para indicar que
# ha finalizado la entrada de líneas.
lines = []

while True:
    line = str(input("Ingrese una linea o presione enter para salir:  "))

    lines.append(line)

    if len(line) > 0:
        continue
    elif line == "":
        print("")
        break

for line in lines:
    print(line.upper())

# Ejercicio 3
# Escriba un programa que administre una cuenta bancaria, usando una bitácora
# de operaciones.
# La bitácora de operaciones tiene la siguiente forma:

# D 100 (significa que depositó 100 pesos)
# R 50 (significa que retiró 50 pesos)

# Ejemplo de una entrada:
#                           D 200
#                           D 200
#                           R 100
#                           D 50
# Introducir una línea vacía indica que ha finalizado la bitácora.
# La salida de éste programa sería: 350
balance = 0

print("Ingrese las operaciones en el formato 'D monto' o 'R monto', y presione Enter.")
print("Presione Enter en una línea vacía para finalizar la bitácora.")

while True:
    entry = input("Operación: ")

    if entry == "":
        break

    separate_entry = entry.split()

    if len(separate_entry) != 2:
        print("Entrada no válida. Debe tener el formato 'D monto' o 'R monto'.")
        continue

    operation_type = separate_entry[0]
    amount = int(separate_entry[1])

    if operation_type == "D":
        balance += amount
    elif operation_type == "R":
        balance -= amount
    else:
        print("Entrada no válida. El tipo de operación debe ser 'D' o 'R'.")

print("Saldo final:", balance)

# Ejercicio 4
# Escribir un programa que solicite el ingreso de una cantidad indeterminada
# de números mayores que 1, finalizando cuando se reciba un cero.
# Imprimir la cantidad total de números primos ingresados.
# Nota: Un número primo es un número natural mayor que 1 que tiene únicamente
# dos divisores distintos: él mismo y el 1.
prime_count = 0

while True:
    num = int(input("Ingrese un número mayor que 1 (0 para finalizar): "))

    if num == 0:
        break

    if num <= 1:
        print("Número no válido. Debe ser mayor que 1.")
        continue

    is_prime = True
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            is_prime = False
            break

    if is_prime:
        prime_count += 1

print("Cantidad de números primos ingresados:", prime_count)

# Ejercicio 5
# Escribir un programa que permita al usuario ingresar dos años y luego
# imprima todos los años en ese rango, que sean bisiestos y múltiplos de 10.
# Nota: Para que un año sea bisiesto debe ser divisible por 4 y no debe ser
# divisible por 100, excepto que también sea divisible por 400.
year1 = int(input("Ingrese el primer año: "))
year2 = int(input("Ingrese el segundo año: "))

print(f"Años bisiestos y múltiplos de 10 entre {year1} y {year2}:")
for year in range(year1, year2 + 1):
    if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        if year % 10 == 0:
            print(year)

# Ejercicio 6
# Escribe un programa que imprima todos los números pares del 1 al 20 usando
# un bucle for. Utiliza la declaración continue para omitir los números
# impares.
for num in range(1, 21):
    if num % 2 != 0:
        continue
    print(num)

# Ejercicio 7
# Crea una lista de números y utiliza un bucle for para encontrar un número
# específico. Cuando encuentres el número, usa break para salir del bucle.
numbers = [10, 20, 30, 40, 50]

target = 30
for num in numbers:
    if num == target:
        print(f"El número {target} fue encontrado.")
        break

# Ejercicio 8
# Crea un programa que muestre un menú de opciones (por ejemplo, opciones 1,
# 2, 3). Utiliza un bucle while para permitir al usuario seleccionar una
# opción. Si el usuario ingresa "0", utiliza break para salir del bucle
# (Mostrar un mensaje por cada opción elegida).
print("Menú de opciones:")
print("1. Opción 1")
print("2. Opción 2")
print("3. Opción 3")
print("0. Salir")

while True:
    opcion = input("Seleccione una opción: ")

    if opcion == "0":
        print("Saliendo del programa.")
        break
    elif opcion == "1":
        print("Ha seleccionado la Opción 1.")
    elif opcion == "2":
        print("Ha seleccionado la Opción 2.")
    elif opcion == "3":
        print("Ha seleccionado la Opción 3.")
    else:
        print("Opción no válida. Intente de nuevo.")
