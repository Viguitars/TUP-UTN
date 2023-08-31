# Escribir un programa que pida al usuario un número entero y muestre por
# pantalla un triángulo rectángulo como el de más abajo.
#               1
#               3 1
#               5 3 1
#               7 5 3 1
#               9 7 5 3 1
integer = int(input("Ingrese un número entero: "))

for i in range(1, integer + 1, 2):
    for j in range(i, 0, -2):
        print(j, end=" ")
    print()

# Escribir un programa que almacene la cadena de caracteres contraseña en una
# variable, pregunte al usuario por la contraseña hasta que introduzca la
# contraseña correcta.
password = "contraseña"

while True:
    prompt = input("Ingrese la contraseña: ")
    if prompt == password:
        print("¡Contraseña correcta!")
        break
    else:
        print("Contraseña incorrecta. Inténtelo nuevamente.")

# Escribir un programa que pida al usuario un número entero y muestre por
# pantalla si es un número primo o no. Solicitar al usuario un número entero
integer = int(input("Ingrese un número entero: "))

is_a_prime_number = True
if integer <= 1:
    is_a_prime_number = False
else:
    for i in range(2, int(integer**0.5) + 1):
        if integer % i == 0:
            is_a_prime_number = False
            break

if is_a_prime_number:
    print(f"{integer} es un número primo.")
else:
    print(f"{integer} no es un número primo.")
