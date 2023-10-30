# Función que devuelve la cantidad de dígitos del número ingresado
def number_of_digits(n):
    if n < 10:
        return 1
    else:
        return 1 + number_of_digits(n // 10)


# Función que devuelve si un número es potencia de otro
def is_exponent(n, b):
    if n == 1:
        return True
    if n % b != 0 or n < 1:
        return False
    return is_exponent(n // b, b)


# Función que devuelve las posiciones en que una cadena se encuentra dentro de
# otra
def positions_of(a, b, start=0):
    positions = []
    index = a.find(b, start)
    if index != -1:
        positions.append(index)
        positions += positions_of(a, b, index + 1)
    return positions


# Funciones que determinan si un número es par o impar usando recursivamente
# unas a otras
def pair(n):
    if n == 0:
        return True
    return odd(n - 1)


def odd(n):
    if n == 0:
        return False
    return pair(n - 1)


# Función que encuentra el mayor número en una lista
def find_greatest(list):
    if len(list) == 1:
        return list[0]
    else:
        sub_major = find_greatest(list[1:])
        return list[0] if list[0] > sub_major else sub_major


# Función que replica los elementos en una lista
def replicate(list, k):
    if k == 0:
        return []
    if not list:
        return []
    return [list[0]] * k + replicate(list[1:], k)


# Función que devuelve la sumatoria K
def sum_k(n, p):
    if n == 1:
        return p
    else:
        return n * p + sum_k(n - 1, p)


# Función que busca posibles combinaciones de caracteres
def combinations(list, k, prefix=""):
    if k == 0:
        print(prefix)
        return
    for i in range(len(list)):
        new_prefix = prefix + list[i]
        combinations(list, k - 1, new_prefix)


# Función que devuelve el ancho y el largo en mm de una hoja A a la N
def sheet_measurements_A_N(N, width=841, length=1189):
    if N == 0:
        return width, length
    else:
        new_width = length
        new_length = width // 2
        return sheet_measurements_A_N(N - 1, new_width, new_length)
