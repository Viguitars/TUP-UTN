"""cSpell:disable"""
import math

# TRABAJO PRACTICO 3

# Ejercicio 1
# Escribir un programa que pida al usuario una palabra y la muestre por
# pantalla 10 veces.
word = str(input("Ingrese una palabra: "))

for i in range(10):
    print(word)

# Ejercicio 2
# Escribir un programa que pregunte al usuario su edad y muestre por pantalla
# todos los años que ha cumplido (desde 1 hasta su edad).
age = int(input("Ingrese su edad: "))

print("Años cumplidos: ")

for i in range(1, age + 1):
    print(i)

# Ejercicio 3
# Escribir un programa que pida al usuario un número entero positivo y muestre
# por pantalla todos los números impares desde 1 hasta ese número separados
# por comas.
number = int(input("Ingrese un número entero positivo: "))
odd_numbers = ""

if number <= 0:
    print("Error: Ingrese un número entero positivo.")
else:
    for i in range(1, number + 1):
        if i % 2 != 0:
            odd_numbers += str(i) + ", "

print(f"Los números impares del 1 al {str(number)} son: {odd_numbers[:-2]}.")

# Ejercicio 4
# Escribir un programa que pida al usuario un número entero positivo y muestre
# por pantalla la cuenta atrás desde ese número hasta cero separados por comas.
number = int(input("Ingrese un número entero positivo: "))
countdown = ""

if number <= 0:
    print("Error: Ingrese un número entero positivo.")
else:
    for i in range(number, -1, -1):
        countdown += str(i) + ", "

print(f"Cuenta atrás desde {str(number)} hasta 0: {countdown [:-2]}.")

# Ejercicio 5
# Escribir un programa que pregunte al usuario una cantidad a invertir, el
# interés anual y el número de años, y muestre por pantalla el capital
# obtenido en la inversión cada año que dura la inversión.
amount_to_invest = float(input("Cantidad a invertir: "))
annual_interest = float(input("Interés anual: "))
number_of_years = int(input("Cantidad de años: "))

for year in range(1, number_of_years + 1):
    capital_obtained = amount_to_invest * (1 + annual_interest / 100) ** year
    print(f"Capital obtenido en {year} año: ${capital_obtained:.2f}")

# Ejercicio 6
# Escribir un programa que pida al usuario un número entero y muestre por
# pantalla un triángulo rectángulo como el de más abajo, de altura el número
# introducido.
#                                   *
#                                   **
#                                   ***
#                                   ****
#                                   *****
height = int(input("Ingrese un número entero para la altura del triángulo: "))
asterisk = "*"

if height <= 0:
    print("Error: Ingrese un número entero positivo.")
else:
    for i in range(1, height + 1):
        print(asterisk * i)

# Ejercicio 7
# Escribir un programa que muestre por pantalla las tablas de multiplicar del
# 1 al 10.
for multiplicand in range(1, 11):
    print("**************************************")
    print(f"Tabla de multiplicación del número {multiplicand}: ")
    print("**************************************")
    for multiplier in range(1, 11):
        print(f"{multiplicand} x {multiplier} = {multiplicand * multiplier}")

# Ejercicio 8
# Escribir un programa que pida al usuario un número entero y muestre por
# pantalla un triángulo rectángulo como el de más abajo.
#                                   1
#                                   3 1
#                                   5 3 1
#                                   7 5 3 1
#                                   9 7 5 3 1
height = int(input("Ingrese un número entero para la altura del triángulo: "))

for i in range(1, height + 1):
    for j in range(2 * i - 1, 0, -2):
        print(j, end=" ")
    print()

# Ejercicio 9
# Escribir un programa que almacene la cadena de caracteres contraseña en una
# variable, pregunte al usuario por la contraseña hasta que introduzca la
# contraseña correcta.
correct_password = "contraseña"

while True:
    user_password = input("Ingrese la contraseña: ")

    if user_password == correct_password:
        print("¡Contraseña correcta! Acceso concedido.")
        break
    else:
        print("Contraseña incorrecta. Inténtelo nuevamente.")

# Ejercicio 10
# Escribir un programa que pida al usuario un número entero y muestre por
# pantalla si es un número primo o no.
number = int(input("Ingrese un número entero para verificar si es primo: "))

if number < 2:
    is_prime = False
else:
    is_prime = True
    for i in range(2, int(number**0.5) + 1):
        if number % i == 0:
            is_prime = False
            break

if is_prime:
    print(f"{number} es un número primo.")
else:
    print(f"{number} no es un número primo.")

# Ejercicio 11
# Escribir un programa que pida al usuario una palabra y luego muestre por
# pantalla una a una las letras de la palabra introducida empezando por la
# última.
word = input("Ingrese una palabra: ")

for letter in reversed(word):
    print(letter)

# Ejercicio 12
# Escribir un programa en el que se pregunte al usuario por una frase y una
# letra, y muestre por pantalla el número de veces que aparece la letra en la
# frase.
phrase = input("Ingrese una frase: ")
letter = input("Ingrese una letra para contar su aparición: ")

count = phrase.count(letter)
print(f"La letra '{letter}' aparece {count} veces en la frase.")

# Ejercicio 13
# Escribir un programa que muestre el eco de todo lo que el usuario introduzca
# hasta que el usuario escriba “salir” que terminará.
while True:
    text = input("Ingrese un texto (escriba 'salir' para terminar): ")
    if text.lower() == "salir":
        break
    else:
        print(text)

# Ejercicio 14
# Escriba un programa que pida dos números enteros y escriba qué números son
# pares y cuáles impares desde el primero hasta el segundo.
start = int(input("Ingrese el primer número entero: "))
end = int(input("Ingrese el segundo número entero: "))

print("Números pares:")
for number in range(start, end + 1):
    if number % 2 == 0:
        print(number, end=" ")

print("\nNúmeros impares:")
for number in range(start, end + 1):
    if number % 2 != 0:
        print(number, end=" ")

# Ejercicio 15
# Escriba un programa que pida un número entero mayor que cero y que escriba
# sus divisores.
number = int(input("Ingrese un número entero mayor que cero: "))

if number <= 0:
    print("El número debe ser mayor que cero.")
else:
    print(f"Divisores de {number}:")
    for i in range(1, number + 1):
        if number % i == 0:
            print(i, end=" ")

# Ejercicio 16
# Escriba un programa que pregunte cuántos números se van a introducir, pida
# esos números y escriba cuántos negativos ha introducido.
count = 0
n = int(input("Ingrese cuántos números va a introducir: "))

for _ in range(n):
    number = int(input("Ingrese un número entero: "))
    if number < 0:
        count += 1

print(f"Ha introducido {count} números negativos.")

# Ejercicio 17
# Solicitar al usuario que ingrese una frase y luego imprimir un listado de
# las vocales que aparecen en esa frase (sin repetirlas).
phrase = input("Ingrese una frase: ")
vowels = "aeiouAEIOU"
unique_vowels = []

for char in phrase:
    if char in vowels and char not in unique_vowels:
        unique_vowels.append(char)

print("Vocales en la frase (sin repetirlas):", ", ".join(unique_vowels))

# Ejercicio 18
# Crear un algoritmo que muestre los primeros 10 números de la sucesión de
# Fibonacci. La sucesión comienza con los números 0 y 1 y, a partir de éstos,
# cada elemento es la suma de los dos números anteriores en la secuencia: 0,
# 1, 1, 2, 3, 5, 8, 13, 21, 34, 55…
n = 10
fibonacci = [0, 1]

while len(fibonacci) < n:
    next_term = fibonacci[-1] + fibonacci[-2]
    fibonacci.append(next_term)

print("Los primeros 10 números de la sucesión de Fibonacci son:", fibonacci)

# Ejercicio 19
# Escriba un programa que simule una alcancía. El programa solicitará primero
# una cantidad, que será la cantidad de dinero que queremos ahorrar. A
# continuación, el programa solicitará una y otra vez las cantidades que se
# irán ahorrando, hasta que el total ahorrado iguale o supere al objetivo. El
# programa deberá comprobar que las cantidades ingresadas sean positivas.
goal = float(input("Ingrese la cantidad de dinero que desea ahorrar: "))
total = 0.0

while total < goal:
    deposit = float(input("Ingrese la cantidad que desea ahorrar (o 0 para salir): "))
    if deposit < 0:
        print("El monto ingresado no es válido.")
    elif deposit == 0:
        break
    else:
        total += deposit

if total >= goal:
    if total > 1000:
        total *= 0.9  # Aplicar un 10% de descuento si se supera $1000
    print(
        f"¡Felicidades! Ha alcanzado o superado su objetivo de ahorro. Total ahorrado: {total:.2f}"
    )
else:
    print(
        f"Ha decidido salir sin alcanzar su objetivo de ahorro. Total ahorrado: {total:.2f}"
    )

# Ejercicio 20
# Leer números enteros de teclado, hasta que el usuario ingrese el 0.
# Finalmente, mostrar la sumatoria de todos los números ingresados.
sum_total = 0

while True:
    number = int(input("Ingrese un número entero (0 para terminar): "))
    if number == 0:
        break
    sum_total += number

print(f"La sumatoria de los números ingresados es: {sum_total}")

# Ejercicio 21
# Leer números enteros positivos de teclado, hasta que el usuario ingrese el
# 0. Informar cuál fue el mayor número ingresado.
max_number = None

while True:
    number = int(input("Ingrese un número entero positivo (0 para terminar): "))
    if number == 0:
        break
    if max_number is None or number > max_number:
        max_number = number

if max_number is not None:
    print(f"El mayor número ingresado es: {max_number}")
else:
    print("No se ingresaron números positivos.")

# Ejercicio 22
# Solicitar al usuario que ingrese números enteros positivos y, por cada uno,
# imprimir la suma de los dígitos que lo componen. La condición de corte es
# que se ingrese el número -1. Al finalizar, mostrar cuántos de los números
# ingresados por el usuario fueron números pares.
count_even_numbers = 0

while True:
    number = int(input("Ingrese un número entero positivo (-1 para terminar): "))
    if number == -1:
        break
    if number < 0:
        print("El número debe ser positivo.")
        continue

    digit_sum = sum(int(digit) for digit in str(number))

    print(f"Suma de dígitos de {number}: {digit_sum}")

    if number % 2 == 0:
        count_even_numbers += 1

print(f"Total de números pares ingresados: {count_even_numbers}")

# Ejercicio 23
# Crear un programa que permita al usuario ingresar los montos de las compras
# de un cliente (se desconoce la cantidad de datos que cargará, la cual puede
# cambiar en cada ejecución), cortando el ingreso de datos cuando el usuario
# ingrese el monto 0.
total_purchase = 0.0

while True:
    purchase = float(input("Ingrese el monto de la compra (0 para terminar): "))
    if purchase == 0:
        break
    elif purchase < 0:
        print("El monto ingresado no es válido.")
        continue
    total_purchase += purchase

# Ejercicio 24
# Si ingresa un monto negativo, no se debe procesar y se debe pedir que
# ingrese un nuevo monto. Al finalizar, informar el total a pagar teniendo que
# cuenta que, si las ventas superan el total de $1000, se le debe aplicar un
# 10% de descuento.
total_purchase = 0.0

while True:
    purchase = float(input("Ingrese el monto de la compra (0 para terminar): "))
    if purchase == 0:
        break
    elif purchase < 0:
        print("El monto ingresado no es válido.")
        continue
    total_purchase += purchase

if total_purchase > 1000:
    discount = total_purchase * 0.10
    total_purchase -= discount
    print(f"Se aplicó un descuento del 10%. Total a pagar: ${total_purchase:.2f}")
else:
    print(f"Total a pagar: ${total_purchase:.2f}")


# Ejercicio 25
# Dado un número entero positivo, mostrar su factorial. El factorial de un
# número se obtiene multiplicando todos los números enteros positivos que hay
# entre el 1 y ese número. El factorial de 0 es 1.
def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)


number = int(input("Ingrese un número entero positivo para calcular su factorial: "))
if number >= 0:
    result = factorial(number)
    print(f"El factorial de {number} es: {result}")
else:
    print("El número debe ser positivo.")
