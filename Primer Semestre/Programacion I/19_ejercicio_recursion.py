# 1. Escribir una función que simule el siguiente experimento: Se tiene una rata
# en una jaula con 3 caminos, entre los cuales elige al azar (cada uno tiene la
# misma probabilidad), si elige el 1 luego de 3 minutos vuelve a la jaula, si
# elige el 2 luego de 5 minutos vuelve a la jaula, en el caso de elegir el 3
# luego de 7 minutos sale de la jaula. La rata no aprende, siempre elige entre
# los 3 caminos con la misma probabilidad, pero quiere su libertad, por lo que
# recorrerá los caminos hasta salir de la jaula. La función debe devolver el
# tiempo que tarda la rata en salir de la jaula.

import random


def simulate_rat_escape(time=0):
    choice = random.randint(1, 3)  # Elige un camino al azar

    if choice == 1:
        return simulate_rat_escape(time + 3)
    elif choice == 2:
        return simulate_rat_escape(time + 5)
    else:
        return time + 7  # La rata sale de la jaula


# Ejecuta la simulación y muestra el tiempo que tarda la rata en salir
escape_time = simulate_rat_escape()
print(f"La rata tardó {escape_time} minutos en salir de la jaula.")


# 2. Escribir una consigna apropiada para la siguiente función. Asumir que n es
# un número entero.


def f(n):
    s = str(n)
    if len(s) <= 1:
        return s
    return s[-1] + f(int(s[:-1]))


""" 
**Consigna:**

Escribe una función que tome un número entero 'n' y devuelva un nuevo número en 
el que los dígitos del número original se invierten. Por ejemplo, si se llama a 
la función con el argumento 12345, devolverá 54321. La función debe ser 
recursiva y no se permite el uso de bucles. La función debe considerar números 
positivos y negativos. """
