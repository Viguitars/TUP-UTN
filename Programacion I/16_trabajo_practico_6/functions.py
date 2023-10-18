# Función que valida si el número introducido por el usuario es entero


def is_integer(user_input):
    try:
        int(user_input)
        return True
    except ValueError:
        return False
