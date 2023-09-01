# cSpell: disable

# EJERCICIOS EN CLASE FOR - WHILE


# 1- Un grupo de amigos decide organizar un juego de estrategia, para lo cual
# forman dos equipos de 6 integrantes cada uno, donde un integrante de cada
# equipo es el “jefe” y los otros 5 son sus “oficiales”.
# La regla más importante del juego es que sólo se comunicarán mediante un
# canal común, por lo que deben buscar la forma de ocultar el contenido de sus
# mensajes. Uno de los equipos decide utilizar un método antiguo de
# encriptación llamado “la cifra del césar”, que consiste en correr cada letra
# del mensaje –considerando la posición de cada una en el alfabeto– una
# determinada cantidad de lugares.
# Ejemplo: si el corrimiento es de 2 lugares, la palabra “ATAQUE” se
# transforma en “CVCSWG”.
# Cada día, el “jefe” del equipo debe enviar un mensaje a cada uno de sus
# oficiales.
# Escribir un programa que permita encriptar los 5 mensajes. El corrimiento
# (cantidad de lugares que se correrán las letras) será dado por el usuario
# antes de comenzar a encriptar. Los 5 mensajes usarán el mismo corrimiento.
# Nota: si el alfabeto termina antes de poder correr la cantidad de lugares
# necesarios, se vuelve a comenzar desde la letra “a”.
# Ejemplo: la palabra “EXTRA” corrida 3 lugares se convierte en “HAWUD”.
# Utilizando el alfabeto español, de 27 letras, el siguiente cálculo
# matemático permite volver a comenzar por el principio una vez que se llegó a
# la “z”: (índice de la letra a correr+corrimiento)%27
# Sólo se encriptarán las letras de los mensajes, dejando al resto de
# caracteres sin modificación.
def encrypt_message(message, shift):
    alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    encrypted_message = ""

    for char in message:
        if char.isalpha():
            is_uppercase = char.isupper()
            index = alphabet.index(char.upper())
            encrypted_index = (index + shift) % len(alphabet)
            encrypted_char = alphabet[encrypted_index]

            if not is_uppercase:
                encrypted_char = encrypted_char.lower()

            encrypted_message += encrypted_char
        else:
            encrypted_message += char

    return encrypted_message


shift = int(input("Ingrese el corrimiento para la encriptación: "))
boss_message = input("Ingrese el mensaje del jefe: ")
officers_messages = []

for i in range(5):
    message = input(f"Ingrese el mensaje del oficial {i + 1}: ")
    officers_messages.append(message)

boss_encrypted = encrypt_message(boss_message, shift)
officers_encrypted = [encrypt_message(message, shift) for message in officers_messages]

print("\nMensaje encriptado del jefe:", boss_encrypted)
for i, encrypted_message in enumerate(officers_encrypted, start=1):
    print(f"Mensaje encriptado del oficial {i}:", encrypted_message)


# 2- Crear un programa que solicite el ingreso de números enteros positivos,
# hasta que el usuario ingrese el 0. Por cada número, informar cuántos dígitos
# pares y cuántos impares tiene. Al finalizar, informar la cantidad de dígitos
# pares y de dígitos impares leídos en total.
def count_even_odd_digits(number):
    even_digits = 0
    odd_digits = 0

    while number > 0:
        digit = number % 10
        if digit % 2 == 0:
            even_digits += 1
        else:
            odd_digits += 1
        number //= 10

    return even_digits, odd_digits


total_even_digits = 0
total_odd_digits = 0

number = int(input("Ingrese un número (0 para salir): "))

while number != 0:
    even_digits, odd_digits = count_even_odd_digits(number)
    total_even_digits += even_digits
    total_odd_digits += odd_digits
    print(f"Dígitos pares: {even_digits}, Dígitos impares: {odd_digits}")
    number = int(input("Ingrese otro número (0 para salir): "))

print(
    f"Total dígitos pares: {total_even_digits}, Total dígitos impares: {total_odd_digits}"
)
