import random

# Lista de palabras para el juego
words = [
    "babelico",
    "bahorrina",
    "depauperar",
    "ful",
    "gaznapiro",
    "lobanillo",
    "ochavo",
    "sacamantecas",
    "uebos",
    "zonzo",
]


# Función para seleccionar una palabra al azar
def select_word():
    return random.choice(words)


# Función para inicializar el tablero con guiones bajos
def initialize_board(word):
    return ["_" for _ in word]


# Función para mostrar el estado actual del tablero
def display_board(board):
    print(" ".join(board))


# Función para adivinar una letra
def guess_letter(word, board, letter):
    correct_guess = False
    for i in range(len(word)):
        if word[i] == letter:
            board[i] = letter
            correct_guess = True
    return correct_guess
