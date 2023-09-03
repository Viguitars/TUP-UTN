"""cSpell:disable"""
import math

# TRABAJO PRACTICO 3

# Escribir un programa que pida al usuario una palabra y la muestre por
# pantalla 10 veces.
word = str(input("Ingrese una palabra: "))

for i in range(10):
    print(word)

# Escribir un programa que pregunte al usuario su edad y muestre por pantalla
# todos los años que ha cumplido (desde 1 hasta su edad).
age = int(input("Ingrese su edad: "))

print("Años cumplidos: ")

for i in range(1, age + 1):
    print(i)

# Escribir un programa que pida al usuario un número entero positivo y muestre
# por pantalla todos los números impares desde 1 hasta ese número separados
# por comas.
number = int(input("Ingrese un número estero positivo: "))
resultado = ""

if number <= 0:
    print("Ingrese un número entero positivo.")
else:
    for i in range(1, number + 1):
        if i % 2 != 0:
            resultado += str(i) + ", "

print(f"Los números impares del 1 al {str(number)} son: {resultado[:-2]}.")

# Escribir un programa que pida al usuario un número entero positivo y muestre
# por pantalla la cuenta atrás desde ese número hasta cero separados por comas.

# Escribir un programa que pregunte al usuario una cantidad a invertir, el
# interés anual y el número de años, y muestre por pantalla el capital
# obtenido en la inversión cada año que dura la inversión.

# Escribir un programa que pida al usuario un número entero y muestre por
# pantalla un triángulo rectángulo como el de más abajo, de altura el número
# introducido.
#                                   *
#                                   **
#                                   ***
#                                   ****
#                                   *****

# Escribir un programa que muestre por pantalla las tablas de multiplicar del
# 1 al 10.

# Escribir un programa que pida al usuario un número entero y muestre por
# pantalla un triángulo rectángulo como el de más abajo.
#                                   1
#                                   3 1
#                                   5 3 1
#                                   7 5 3 1
#                                   9 7 5 3 1

# Escribir un programa que almacene la cadena de caracteres contraseña en una
# variable, pregunte al usuario por la contraseña hasta que introduzca la
# contraseña correcta.

# Escribir un programa que pida al usuario un número entero y muestre por
# pantalla si es un número primo o no.

# Escribir un programa que pida al usuario una palabra y luego muestre por
# pantalla una a una las letras de la palabra introducida empezando por la
# última.

# Escribir un programa en el que se pregunte al usuario por una frase y una
# letra, y muestre por pantalla el número de veces que aparece la letra en la
# frase.

# Escribir un programa que muestre el eco de todo lo que el usuario introduzca
# hasta que el usuario escriba “salir” que terminará.

# Escriba un programa que pida dos números enteros y escriba qué números son
# pares y cuáles impares desde el primero hasta el segundo.

# Escriba un programa que pida un número entero mayor que cero y que escriba
# sus divisores.

# Escriba un programa que pregunte cuántos números se van a introducir, pida
# esos números y escriba cuántos negativos ha introducido.

# Solicitar al usuario que ingrese una frase y luego imprimir un listado de
# las vocales que aparecen en esa frase (sin repetirlas).

# Crear un algoritmo que muestre los primeros 10 números de la sucesión de
# Fibonacci. La sucesión comienza con los números 0 y 1 y, a partir de éstos,
# cada elemento es la suma de los dos números anteriores en la secuencia: 0,
# 1, 1, 2, 3, 5, 8, 13, 21, 34, 55…

# Escriba un programa que simule una alcancía. El programa solicitará primero
# una cantidad, que será la cantidad de dinero que queremos ahorrar. A
# continuación, el programa solicitará una y otra vez las cantidades que se
# irán ahorrando, hasta que el total ahorrado iguale o supere al objetivo. El
# programa deberá comprobar que las cantidades ingresadas sean positivas.

# Leer números enteros de teclado, hasta que el usuario ingrese el 0.
# Finalmente, mostrar la sumatoria de todos los números ingresados.

# Leer números enteros positivos de teclado, hasta que el usuario ingrese el
# 0. Informar cuál fue el mayor número ingresado.

# Solicitar al usuario que ingrese números enteros positivos y, por cada uno,
# imprimir la suma de los dígitos que lo componen. La condición de corte es
# que se ingrese el número -1. Al finalizar, mostrar cuántos de los números
# ingresados por el usuario fueron números pares.

# Crear un programa que permita al usuario ingresar los montos de las compras
# de un cliente (se desconoce la cantidad de datos que cargará, la cual puede
# cambiar en cada ejecución), cortando el ingreso de datos cuando el usuario
# ingrese el monto 0.

# Si ingresa un monto negativo, no se debe procesar y se debe pedir que
# ingrese un nuevo monto. Al finalizar, informar el total a pagar teniendo que
# cuenta que, si las ventas superan el total de $1000, se le debe aplicar un
# 10% de descuento.

# Dado un número entero positivo, mostrar su factorial. El factorial de un
# número se obtiene multiplicando todos los números enteros positivos que hay
# entre el 1 y ese número. El factorial de 0 es 1.
