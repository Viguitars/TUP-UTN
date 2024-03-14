""" El siguiente programa debería imprimir el número 2 si se le ingresan como 
valores x=5, y=1 pero en su lugar imprime 5. ¿Qué hay que corregir? """


# Definición de Funciones
def most(a, b):
    if a > b:
        return a
    else:
        return b


def least(a, b):
    if a < b:
        return a
    else:
        return b


# Programa Principal

x = int(input("Un número: "))
y = int(input("Otro número: "))

print(most(x - 3, y), least(x + 2, y - 5))
