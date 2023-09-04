import math

# Escribir un programa que pida al usuario un número entero y muestre por
# pantalla un triángulo rectángulo como el de más abajo.
#                                   1
#                                   3 1
#                                   5 3 1
#                                   7 5 3 1
#                                   9 7 5 3 1
height = int(input("Ingrese un número entero para la altura del triángulo: "))
odd_numbers = "1"

if height <= 0:
    print("Error: Ingrese un número entero positivo.")
else:
    for i in range(1, height + 1):
        print(odd_numbers * i)