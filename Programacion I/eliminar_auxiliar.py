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

# Solicitar nombre al usuario
username = input("Ingrese su nombre: ")
print(f"\n¡Bienvenido {username}!")

# Loop principal
while True:
    # Menu de opciones
    print("\nMenu de Opciones: ")
    print("1. Juego de Número")
    print("2. Juego de Palabras")
    option = input(f"\n{username}: Seleccione una opción (0 para finalizar): ")
    # Opción 1 - Números
    if option == "1":
        print(f"\n{username}: Bienvenido al Juego de Números")
        number = int(input("Ingrese"))
        # Loop Números
        
    # Opción 2 - Palabra
    elif option == "2":
        print(f"\n{username}: Bienvenido al Juego de Palabras")
        break
    # Opción 0 - Salir
    elif option == "0":
        print(f"\n¡Hasta luego, {username}!")
        break
    # Opción X - Ingresar opción valida y repetir Menu
    else:
        print(f"\n{username}: Ingrese una opción válida")
        continue
        
