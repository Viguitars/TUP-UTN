""" cSpell: disable """

# TRABAJO PRACTICO 1.2

# Ejercicio 1
# Calcular el perímetro y área de un rectángulo dada su base y su altura.
base = float(input("Ingrese el valor de la base del rectángulo: "))
altura = int(input("Ingrese el valor de la altura: "))

perimetro_rectangulo = (base * 2) + (altura * 2)
area_rectangulo = base * altura

print(
    "El area del rectángulo es: "
    + str(area_rectangulo)
    + ".\nEl perímetro del rectángulo es: "
    + str(perimetro_rectangulo)
    + "."
)

# Ejercicio 2
# Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
cateto1 = float(input("Ingrese el valor del primer cateto: "))
cateto2 = float(input("Ingrese el valor del segundo cateto: "))

hipotenusa = (cateto1**2) + (cateto2**2) ** (1 / 2)

print(f"La hipotenusa del triangulo es: {hipotenusa}")

# Ejercicio 3
# Dados dos números, mostrar la suma, resta, división y multiplicación de
# ambos.
num1 = int(input("Ingrese el valor del primer número: "))
num2 = int(input("Ingrese el valor del segundo número: "))

suma_numeros = num1 + num2
resta_numeros = num1 - num2
multiplicacion_numeros = num1 * num2
division_numeros = num1 / num2

print(f"La suma de {num1} y {num2} es igual a: {suma_numeros}")
print(f"La resta de {num1} y {num2} es igual a: {resta_numeros}")
print(
    "La multiplicación de "
    + str(int(num1))
    + " y "
    + str(int(num2))
    + " es igual a: "
    + str(int(multiplicacion_numeros))
)
print(f"La división de {num1} y {num2} es igual a: {division_numeros}")

# Ejercicio 4
# Escribir un programa que convierta un valor dado en grados Fahrenheit a
# grados Celsius. Recordar que la fórmula para la conversión es:
# C = (F - 32) * 5/9
grados_celcius = float(input("Ingrese el valor de los grados Celsius: "))

convert_to_fahrenheit = (grados_celcius * 9 / 5) + 32

print(
    "La conversión de "
    + str(int(grados_celcius))
    + "ºC a Fahrenheit es: "
    + str(int(convert_to_fahrenheit))
)

# Ejercicio 5
# ¿Qué problemas tienen las siguientes instrucciones?¿Cómo las solucionarías?
# A = input(nombre, “¿Cuál es tu canción favorita?”)
nombre = input("Nombre: ")
A = input(f"{nombre}, ¿Cuál es tu canción favorita?")
# precio = input(“Precio: “)
# total = precio + (precio * 0.1)
precio = float(input("Precio: "))
total = precio + (precio * 0.1)
# edad = int(input(“Edad: “))
# print(tu edad es, edad)
edad = int(input("Edad: "))
print(f"tu edad es, {edad}")
# edad = int(input(“Edad: “))
# print(“Veamos si tu edad es 18…”, edad=18)
edad = int(input("Edad: "))
print(f"Veamos si tu edad es 18…, {edad==18}")

# Ejercicio 6
# Calcular la media de tres números pedidos por teclado.
num1 = float(input("Ingrese el primer número: "))
num2 = float(input("Ingrese el segundo número: "))
num3 = float(input("Ingrese el tercer número: "))

promedio = (num1 + num2 + num3) / 3

print(f"La media de los número {num1}, {num2} y {num3} es : {promedio}")

# Ejercicio 7
# Realiza un programa que reciba una cantidad de minutos y muestre por
# pantalla a cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos
# son 16 horas y 40 minutos.
minutos_totales = int(input("Ingrese la cantidad de minutos: "))

horas = minutos_totales // 60
minutos = minutos_totales % 60

print(f"{minutos_totales} minutos son: {horas} horas y {minutos} minutos.")

# Ejercicio 8
# Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus
# ventas, el vendedor desea saber cuanto dinero obtendrá por concepto de
# comisiones por las tres ventas que realiza en el mes y el total que recibirá
# en el mes tomando en cuenta su sueldo base y comisiones.
sueldo_base = float(input("Ingrese sueldo base: "))
VENTAS = 3
COMISION_VENTAS = 0.1

comisiones = sueldo_base * COMISION_VENTAS * VENTAS
total_mes = sueldo_base + comisiones

print(f"El vendedor recibe en concepto de comisiones: ${comisiones}")
print(f"El vendedor recibe un sueldo total de: ${total_mes}")

# Ejercicio 9
# Una tienda ofrece un descuento del 15% sobre el total de la compra y un
# cliente desea saber cuanto deberá pagar finalmente por su compra.
total_compra = float(input("Ingrese el valor de la compra: "))
PORCENTAJE_DESCUENTO = 0.15
descuento = total_compra * PORCENTAJE_DESCUENTO
total_a_pagar = total_compra - descuento

print(f"El valor total de la compra es de: ${total_a_pagar}")

# Ejercicio 10
# Un alumno desea saber cual será su calificación final en la materia de
# Algoritmos. Dicha calificación se compone de los siguientes porcentajes:
#     55% del promedio de sus tres calificaciones parciales.
#     30% de la calificación del examen final.
#     15% de la calificación de un trabajo final.
parcial1 = float(input("Ingrese la calificación del primer parcial: "))
parcial2 = float(input("Ingrese la calificación del segundo parcial: "))
parcial3 = float(input("Ingrese la calificación del tercer parcial: "))
examen_final = float(input("Ingrese la calificación del examen final: "))
trabajo_final = float(input("Ingrese la calificación del trabajo final: "))

promedio_parciales = (parcial1 + parcial2 + parcial3) / 3
calificacion_total = (
    (promedio_parciales * 0.55) + (examen_final * 0.3) + (trabajo_final * 0.15)
)

print(f"La calificación final del alumno es: {calificacion_total}")

# Ejercicio 11
# Pide al usuario dos números y muestra la “distancia” entre ellos (el valor
# absoluto de su diferencia, de modo que el resultado sea siempre positivo).

# Ejercicio 12
# Realizar un algoritmo que lea un número y que muestre su raíz cuadrada y su
# raíz cúbica.

# Ejercicio 13
# Dado un número de dos cifras, diseñe un algoritmo que permita obtener el
# número invertido. Ejemplo, si se introduce 23 que muestre 32.

# Ejercicio 14
# Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide
# realizar un algoritmo que intercambie los valores de ambas variables y
# muestre cuanto valen al final las dos variables.

# Ejercicio 15
# Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos.
# El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. Escribir
# un algoritmo que determine la hora de llegada a la ciudad B.

# Ejercicio 16
# Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.

# Ejercicio 17
# Solicitar al usuario que ingrese su nombre. El nombre se debe almacenar en
# una variable llamada usuario. A continuación mostrar por pantalla: “Ahora
# estás en la matrix, [nombre del usuario]”.

# Ejercicio 18
# Hacer un programa que solicite al usuario cuánto costó una cena en un
# restaurante. A ese valor, sumarle un 6.2% en concepto de servicio y un 10%
# de propina. Imprimir en pantalla el monto final a pagar.

# Ejercicio 19
# Solicitar al usuario que ingrese el día, mes y año de su nacimiento y
# almacenar cada uno de ellos en una variable numérica (en total, tres
# variables diferentes). Finalmente, mostrar la fecha en formato dd/mm/aaaa.

# Ejercicio 20
# Hacer otra versión del programa, pero esta vez almacenado todo en una única
# variable con formato DDMMAAA.

# Ejercicio 21
# Una pareja de motociclistas necesita hacer ciertos cálculos antes de
# emprender un viaje en moto, para saber cuántos tanques de combustible
# consumirá el viaje entero.
# Para eso deben ingresar: cuántos kilómetros puede recorrer su moto con 1
# litro de combustible, qué capacidad (en litros) tiene el tanque y cuántos
# kilómetros en total recorrerán.
# Hacer un programa que solicite los datos necesarios y luego informe la
# cantidad de tanques de combustible necesarios.
