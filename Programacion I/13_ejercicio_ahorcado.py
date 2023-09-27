import funciones_ahorcado as fa

""" Crea un juego interactivo del ahorcado en Python. El juego debe seleccionar 
una palabra al azar de una lista de palabras predefinidas y permitir que el 
jugador adivine la palabra letra por letra. El jugador tiene un número limitado 
de intentos antes de perder el juego.

Requisitos:

* Define una lista de palabras que el programa pueda elegir al azar para que el 
jugador adivine. Puedes usar palabras relacionadas con la programación, 
tecnología o cualquier tema que te guste.
* El programa debe seleccionar una palabra al azar de la lista para cada partida.
* El juego debe mostrar el estado actual de la palabra oculta con guiones bajos 
(_) que representan las letras no adivinadas y las letras adivinadas deben 
mostrarse en su lugar correspondiente.
* El jugador debe poder ingresar una letra adivinada en cada turno.
* El programa debe verificar si la letra adivinada está en la palabra secreta y 
actualizar el tablero en consecuencia.
* El jugador tiene un número limitado de intentos (por ejemplo, 6) antes de 
perder el juego.
* Muestra mensajes informativos al jugador, como "Adivinaste una letra 
correctamente" o "Letra incorrecta, te quedan X intentos".
* El juego debe terminar cuando el jugador adivina todas las letras o se quedan 
sin intentos.
* Proporciona un mensaje de victoria si el jugador adivina la palabra y un 
mensaje de derrota si se quedan sin intentos.

Consideraciones adicionales:
* Puedes utilizar funciones para organizar tu código de manera efectiva.
* Agrega comentarios para explicar el funcionamiento de tu código. """


# Este código implementa un juego del ahorcado interactivo en Python

# Inicializar variables
secret_word = fa.select_word()
remaining_attempts = 6
board = fa.initialize_board(secret_word)

print("¡Bienvenido al Juego del Ahorcado!")

# Mostrar la longitud de la palabra con "_"
fa.display_board(board)

# Loop principal
while remaining_attempts > 0:
    letter = input("Adivina una letra: ").lower()
    # Verifica que sea una letra
    if len(letter) != 1 or not letter.isalpha():
        print("Ingresa una letra válida.")
        continue
    # Verifica que la letra no se haya introducido antes
    if letter in board:
        print("Ya has adivinado esa letra.")
        continue
    # Si la letra esta en la palabra elegida
    if fa.guess_letter(secret_word, board, letter):
        print("¡Adivinaste una letra correctamente!")
    else:
        remaining_attempts -= 1
        print(f"Letra incorrecta. Te quedan {remaining_attempts} intentos.")

    fa.display_board(board)
    # Si en la palabra no hay "_", se finaliza el programa
    if "_" not in board:
        print("¡Felicidades! Has adivinado la palabra correctamente.")
        break
# Si se superan los intentos permitidos, se muestra la solución
if "_" in board:
    print(f"¡Agotaste tus intentos! La palabra correcta era '{secret_word}'.")
