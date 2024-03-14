# Función que valida si el número introducido por el usuario es entero
def is_integer(user_input):
    try:
        int(user_input)
        return True
    except ValueError:
        return False


# Ejercicio 5
# Función que cuenta la ocurrencia de cada item de una lista
def generate_count_tuples(list):
    # Se inicializa un diccionario en donde se contaran las ocurrencias
    count_dict = {}
    # Se itera sobre cada item de la lista
    for number in list:
        # Si el item ya esta en la lista se suma una ocurrencia al valor de la clave
        if number in count_dict:
            count_dict[number] += 1
        # Si no, se le da el valor de uno a la clave (item)
        else:
            count_dict[number] = 1
    # Se crea la lista que contiene las tuplas con el item y ocurrencia
    count_tuples = [(num, count) for num, count in count_dict.items()]
    return count_tuples


# Ejercicio 9
# Función para imprimir el tablero
def print_board(board):
    for row in board:
        print(" ".join(row))
