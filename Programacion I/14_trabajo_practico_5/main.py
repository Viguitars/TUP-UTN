from functions import *

# Ejercicio 1
""" Escribir una función que, dado un número de DNI, retorna True si el número 
es válido y False si no lo es. Para que un número de DNI sea válido debe tener 
entre 7 y 8 dígitos. """

while True:
    dni_number = input("Ingrese número D.N.I.: ")
    if is_an_integer(dni_number):
        if is_a_valid_dni(dni_number):
            print("D.N.I válido.")
        else:
            print("D.N.I no válido.")
        break
    else:
        print("¡Error!")
        continue

# Ejercicio 2
""" Escribir una función que, dado un string, retorna la longitud de la última 
palabra. Se considera que las palabras están separadas por uno o más espacios. 
También podría haber espacios al principio o al final del string pasado por 
parámetro. """

input_str = input("Ingrese una cadena de texto: ")
print(f"La longitud de la ultima palabra es: {last_word_length(input_str)}")

# Ejercicio 3
""" Escribir un programa que permita al usuario obtener un identificador para 
cada uno de los socios de un club. Para eso ingresará nombre completo y número 
de DNI de cada socio, indicando que finalizará el procesamiento mediante el 
ingreso de un nombre vacío.
Precondición: el formato del nombre de los socios será: nombre apellido. Podría 
ingresar más de un nombre, en cuyo caso será: nombre1, nombre2, apellido. Si un 
socio tuviera más de un apellido, el usuario solo ingresará uno.
Se debe validar que el número de DNI tenga 7 u 8 dígitos. En caso contrario, el 
programa debe dejar al usuario en un bucle hasta que ingrese un DNI correcto.
Por cada socio se debe imprimir su identificador único, el cual estará formado 
por: el primer nombre, la cantidad de letras del apellido y los 3 primeros 
dígitos de su DNI. Ejemplo:
Nombre: María Ines Rosales
DNI: 25469648
ID -> Maria7254 """

while True:
    full_name = input(
        "\nIntroduzca el nombre completo (nombre apellido) o presione ENTER para finalizar: "
    )
    if full_name == "":
        break
    name_parts = full_name.split()
    if len(name_parts) < 2 or len(name_parts) > 3:
        print(
            "¡Error! El nombre completo debe constar de nombre y apellido (segundo nombre opcional)"
        )
        continue

    while True:
        dni_number = input("Ingrese número D.N.I.: ")
        if is_an_integer(dni_number):
            if is_a_valid_dni(dni_number):
                print("\n###########################")
                member_id = generate_member_id(full_name, dni_number)
                print(f"ID -> {member_id}")
                print("###########################")
            else:
                print("D.N.I no válido.")
            break
        else:
            print("¡Error!")
            continue

# Ejercicio 4
""" Crea un programa que pida dos números enteros al usuario y diga si alguno de 
ellos es múltiplo del otro. Crea una función que reciba los dos números, y 
devuelve si el primero es múltiplo del segundo. """

num1 = int(input("Ingrese el primer número: "))
num2 = int(input("Ingrese el segundo número: "))

if is_multiple(num1, num2):
    print(f"\nEl número {num1} es múltiplo de {num2}.")
else:
    print(f"\nEl número {num1} no es múltiplo de {num2}.")

# Ejercicio 5
""" Crear una función que calcule la temperatura media de un día a partir de la 
temperatura máxima y mínima. Crear un programa principal, que utilizando la 
función anterior, vaya pidiendo la temperatura máxima y mínima de cada día y 
vaya mostrando la media. El programa pedirá el número de días que se van a 
introducir. """

num_days = int(input("Ingrese el número de días: "))

for day in range(1, num_days + 1):
    max_temp = float(input(f"Ingrese la maxima temperatura para el día {day}: "))
    min_temp = float(input(f"Ingrese la minima temperatura para el día {day}: "))

    avg_temp = average_temperature(max_temp, min_temp)
    print(f"La temperatura media de día {day} es: {avg_temp}")

# Ejercicio 6
""" Crea una función que reciba como parámetro un texto y devuelve una cadena 
con un espacio adicional tras cada letra. Por ejemplo, “Hola, tú” devolverá “H o 
l a , t ú “. Crea un programa principal donde se use dicha función. """

user_text = input("Ingrese un texto: ")
modified_text = add_space_after_letter(user_text)
print(f"Texto modificado: {modified_text}")

# Ejercicio 7
""" Crea una función que recibe una lista con valores numéricos y devuelve el 
valor máximo y el mínimo. Crea un programa que pida números por teclado y 
muestre el máximo y el mínimo, utilizando la función anterior. """

numbers = []
while True:
    user_input = input("Ingresa un número (o presiona ENTER para finalizar): ")
    if not user_input:
        break
    if not is_an_integer(user_input):
        print("¡Error! Ingrese un valor válido.")
        continue
    num = float(user_input)
    numbers.append(num)

if numbers:
    maximum, minimum = find_max_min(numbers)
    print(f"Número Máximo: {maximum}, Número Mínimo: {minimum}")
else:
    print("No ingreso ningún número.")

# Ejercicio 8
""" Diseñar una función que calcule el área y el perímetro de una 
circunferencia. Utiliza dicha función en un programa principal que lea el radio 
de una circunferencia y muestre su área y perímetro. """

radius = float(input("Ingresa el radio de la circunferencia: "))
area = calculate_area(radius)
perimeter = calculate_perimeter(radius)
print(f"Área: {area:.2f}, Perímetro: {perimeter:.2f}")

# Ejercicio 9
""" Crear una subrutina llamada “login”, que recibe un nombre de usuario y una 
contraseña y te devuelve Verdadero si el nombre de usuario es “usuario1” y la 
contraseña es “asdasd”. Además recibe el número de intentos que se ha intentado 
hacer login y si no se ha podido hacer login incremente este valor.
Crear un programa principal donde se pida un nombre de usuario y una contraseña 
y se intente hacer login, solamente tenemos tres oportunidades para intentarlo. 
"""

attempts = 0
while attempts < 3:
    username = input("Ingrese su nombre de usuario: ")
    password = input("Ingrese su contraseña: ")
    result, attempts = login(username, password, attempts)
    if result:
        print("Inicio de sesión exitoso.")
        break
    else:
        print("Nombre de usuario o contraseña incorrectos. Intento número", attempts)

if attempts >= 3:
    print("Has excedido el número máximo de intentos.")

# Ejercicio 10
""" Escribir una función que aplique un descuento a un precio. Esta función 
tiene que recibir un diccionario con los precios y porcentajes del carrito de 
compra, aplicar los descuentos a los productos del carrito  y devolver el precio 
final de la compra. """

shopping_cart = {
    "producto 1": 20.0,
    "producto 2": 30.0,
    "producto 3": 25.0,
}
discounts = {
    "producto 1": 10,
    "producto 3": 5,
}

final_price = apply_discount(shopping_cart, discounts)
print("Precio Final:", final_price)

# Ejercicio 11
""" Escribir una función que reciba otra función y una lista, y devuelva otra 
lista con el resultado de aplicar la función dada a cada uno de los elementos de 
la lista. """

numbers = [1, 2, 3, 4, 5]
result = apply_function_to_list(double_number, numbers)
print(result)

# Ejercicio 12
""" Escribir una función que reciba una frase y devuelva un diccionario con las 
palabras que contiene y su longitud. """

phrase = "This is a test phrase"
result = count_word_lengths(phrase)
print(result)

# Ejercicio 13
""" Escribir una función que calcule el módulo de un vector. """

vector = [1, 1, 1, 1]
magnitude = calculate_magnitude(vector)
print("El modulo del vector ", vector, "es:", magnitude)

# Ejercicio 14
""" Requerir al usuario que ingrese un número entero e informar si es primo o 
no, utilizando una función booleana que lo decida. """

number = int(input("Por favor, ingrese un número entero: "))

if is_prime(number):
    print(f"El número {number} es primo.")
else:
    print(f"El número {number} no es primo.")

# Ejercicio 15
""" Escribir un programa que pida números al usuario, mostrar el factorial de 
cada uno y, al finalizar, la cantidad total de números leídos en total. Utilizar 
una o más funciones, según sea necesario. """

quantity_numbers = 0

while True:
    number = int(input("Por favor, ingrese un número (o 0 para finalizar): "))
    if number == 0:
        break
    quantity_numbers += 1
    factorial = calculate_factorial(number)
    print(f"El factorial de {number} es {factorial}")


print(f"Total de números leídos: {quantity_numbers}")

# Ejercicio 16
""" Solicitar al usuario un número entero y luego un dígito. Informar la 
cantidad de ocurrencias del dígito en el número, utilizando para ello una 
función que calcule la frecuencia. """

user_input_number = input("Ingrese un número entero: ")

if is_an_integer(user_input_number):
    int_number = int(user_input_number)
    user_input_digit = input("Ingrese un dígito: ")
    if is_an_integer(user_input_digit):
        int_digit = int(user_input_digit)
        if 0 <= int_digit <= 9:
            frequency = calculate_frequency(int_number, int_digit)
            print(
                f"El dígito {int_digit} aparece {frequency} veces en el número {int_number}."
            )
        else:
            print("Entrada inválida. El dígito debe estar en el rango de 0 a 9.")
    else:
        print("Valor Invalido.")

else:
    print("Valor Invalido.")

# Ejercicio 17
""" Solicitar al usuario el ingreso de números primos. La lectura finalizará 
cuando ingrese un número que no sea primo. Por cada número, mostrar la suma de 
sus dígitos. También solicitar al usuario un dígito e informar la cantidad de 
veces que aparece en el número (frecuencia). Al finalizar el programa, mostrar 
el factorial del mayor número ingresado. """

largest_prime = 0
finished = False

while not finished:
    number = int(
        input("Por favor, ingrese un número primo (o uno no primo para finalizar): ")
    )
    if is_prime(number):
        digit_sum = calculate_digit_sum(number)
        print(f"La suma de los dígitos de {number} es {digit_sum}")
        digit = int(input("Por favor, ingrese un dígito para contar su frecuencia: "))
        frequency = calculate_frequency(number, digit)
        print(f"El dígito {digit} aparece {frequency} veces en {number}")
        if number > largest_prime:
            largest_prime = number
    else:
        print("El número ingresado no es primo.")
        break

if largest_prime > 0:
    factorial_largest_prime = calculate_factorial(largest_prime)
    print(
        f"El factorial del mayor número primo ingresado ({largest_prime}) es {factorial_largest_prime}"
    )
else:
    print("No se ingresaron números primos.")
