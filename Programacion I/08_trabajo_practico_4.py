"""cSpell:disable"""

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

    if x == 15:
        print(f"The execution of the loop was broken when x was {x}")
        break
    if x == 4 or x == 6 or x == 10:
        print(f"The value {x} of x was skipped")
        x += 1
        continue

    x += 1

# Ejercicio 2
# Escriba un programa que acepte una secuencia de líneas e imprima todas las
# líneas convertidas en mayúsculas. Deje una línea en blanco para indicar que
# ha finalizado la entrada de líneas.
lines = []

while True:
    line = str(
        input("Ingrese una linea o presione enter en una línea vacía para finalizar: ")
    )

    if line == "":
        print("")
        break

    lines.append(line)


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
total_transactions = 0

print(
    "Ingrese las operaciones con formato 'D monto' para depositos o 'R monto' para retiros."
)
print("Presione enter en una línea vacía para finalizar.")

while True:
    transaction = str(input("Operacion: "))

    if transaction == "":
        break

    transaction_split = transaction.split()

    if len(transaction_split) != 2:
        print("Operación no válida. El formato es 'D monto' y 'R monto'.")
        continue

    transaction_type = transaction_split[0]
    transaction_amount = int(transaction_split[1])

    if transaction_type == "D":
        total_transactions += transaction_amount
    elif transaction_type == "R":
        total_transactions -= transaction_amount
    else:
        print("Operación no válida. El formato es 'D monto' y 'R monto'.")

print(f"El monto total de las operacines realizadas es: {total_transactions}")

# Ejercicio 4
# Escribir un programa que solicite el ingreso de una cantidad indeterminada
# de números mayores que 1, finalizando cuando se reciba un cero.
# Imprimir la cantidad total de números primos ingresados.
# Nota: Un número primo es un número natural mayor que 1 que tiene únicamente
# dos divisores distintos: él mismo y el 1.
""" Aqui quise probar el uso de errores y excepciones """
total_primes = 0

print("Ingrese números mayores a 1 o 0 para finalizar.")

while True:
    try:
        number = int(input("Número: "))

        if number == 0:
            break
        elif number < 1:
            print("Operación invalida. Ingrese números mayores a 1.")
            continue

        if number % 2 != 0:
            total_primes += 1

    except ValueError:
        print("Error: Debe ingresar un número entero válido. Inténtelo nuevamente.")

print(f"El total de números primos ingresados es {total_primes}.")

# Ejercicio 5
# Escribir un programa que permita al usuario ingresar dos años y luego
# imprima todos los años en ese rango, que sean bisiestos y múltiplos de 10.
# Nota: Para que un año sea bisiesto debe ser divisible por 4 y no debe ser
# divisible por 100, excepto que también sea divisible por 400.
year1 = int(input("Ingrese el primer año: "))
year2 = int(input("Ingrese el segundo año: "))

start_year = max(year1, year2)
end_year = min(year1, year2)

print(f"Años bisiestos entre {end_year} y {start_year}:")

for year in range(end_year, start_year + 1):
    if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        print(year)

# Ejercicio 6
# Escribe un programa que imprima todos los números pares del 1 al 20 usando
# un bucle for. Utiliza la declaración continue para omitir los números
# impares.
for number in range(1, 21):
    if number % 2 != 0:
        continue
    print(number)

# Ejercicio 7
# Crea una lista de números y utiliza un bucle for para encontrar un número
# específico. Cuando encuentres el número, usa break para salir del bucle.
numbers_list = [10, 20, 30, 40, 50]
specific_number = 30

for number in numbers_list:
    if number == specific_number:
        print(f"Se encontró el número {specific_number} en {numbers_list}.")
        break

# Ejercicio 8
# Crea un programa que muestre un menú de opciones (por ejemplo, opciones 1,
# 2, 3). Utiliza un bucle while para permitir al usuario seleccionar una
# opción. Si el usuario ingresa "0", utiliza break para salir del bucle
# (Mostrar un mensaje por cada opción elegida).
print("---OPCIONES---")
print("1. Opción 1.")
print("2. Opción 2.")
print("3. Opción 3.")
print("0. Salir.")
print("--------------")


while True:
    option = int(input("Elija una opción: "))

    if option == 0:
        break
    elif option < 1 or option > 3:
        print("Ingrese una opción válida.")
    else:
        print(f"Usted eligió la Opción {option}.")
