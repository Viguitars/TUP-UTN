# Realizar un programa que cumpla con las siguientes condiciones:
#
# Pedir al usuario su nombre. Cada vez que el programa interactúe con él debe
# llamarlo por su nombre.
#
# Generar un menú de opciones, que serán:
# Juego de números.
# Juego de palabras.
#
# Si el usuario elige la primera opción, se debe pedir el ingreso de números
# enteros (condición de salida: cuando ingrese 0). Al finalizar mostrar por
# pantalla:
# El mayor número par.
# El promedio de los números impares.
#
# Si el usuario elige la segunda opción, se debe pedir el ingreso de una frase
# y mostrar por pantalla la cantidad de cada vocal que contiene dicha frase.
#
# No olvides realizar las debidas validaciones!

# Solicitar el nombre del usuario
username = input("Por favor, ingresa tu nombre: ")
print(f"¡Hola, {username}!")

while True:
    # Menú de opciones
    print("\nMenú de opciones:")
    print("1. Juego de números")
    print("2. Juego de palabras")
    print("0. Salir")

    option = input(f"\n{username} elige una opción (1 / 2 / 0): ")

    if option == "1":
        print(f"\n¡Bienvenido {username} al 'Juego de números'!")
        numbers = []
        # Solicitar números enteros hasta que el usuario ingrese 0
        while True:
            number = input(f"Ingresa un número entero (0 para terminar): ")
            if number == "0":
                break
            elif number.isdigit():
                number = int(number)
                numbers.append(number)
            else:
                print(f"Error: {username}, debes ingresar un número entero válido.")

        # Encontrar el mayor número par y calcular el promedio de los impares
        even_numbers = [num for num in numbers if num % 2 == 0]
        odd_numbers = [num for num in numbers if num % 2 != 0]

        if even_numbers:
            max_even_number = max(even_numbers)
            print(f"\nEl mayor número par es: {max_even_number}")
        else:
            print(f"{username}, no ingresaste números pares.")

        if odd_numbers:
            average_odd_numbers = sum(odd_numbers) / len(odd_numbers)
            print(f"El promedio de los números impares es: {average_odd_numbers}")
        else:
            print(f"\n{username}, no ingresaste números impares.")

    elif option == "2":
        print(f"\n¡Bienvenido {username} al 'Juego de palabras'!")
        phrase = input("Ingresa una frase: ")
        phrase = phrase.lower()
        vowels = "aeiou"
        vowels_counter = {vowel: phrase.count(vowel) for vowel in vowels}

        # Contar la cantidad de cada vocal en la frase
        print("\nCantidad de vocales en la frase:")
        for vowel, amount in vowels_counter.items():
            print(f"{vowel}: {amount}")

    elif option == "0":
        print(f"¡Hasta luego, {username}!")
        break

    else:
        print(f"\nOpción no válida {username}. Por favor, elige (1 / 2 / 0)).")
