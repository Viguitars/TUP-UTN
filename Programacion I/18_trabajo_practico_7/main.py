from functions import *
import random


""" Escribe un programa que tome una lista de números como entrada y la ordene 
en orden ascendente utilizando el método de ordenamiento de burbuja. """

# Se inicializa la lista de números random
random_numbers = random.sample(range(100), 5)

# Se imprime la lista de números ordenados
bubble_sort(random_numbers)
print("\nLista ordenada en orden ascendente:", random_numbers)

""" Crea un programa que tome una lista de palabras como entrada y las ordene 
alfabéticamente en orden ascendente utilizando el método de ordenamiento de 
selección. """

# Se inicializa la lista de palabras
words = ["rojo", "amarillo", "verde", "azul", "marrón", "negro"]

# Imprimir la lista de palabras ordenada alfabéticamente
selection_sort(words)
print("\nLista de palabras ordenada en orden alfabético:", words)

""" Crea una lista de diccionarios, donde cada diccionario contiene información 
sobre un libro (título, autor, año de publicación, etc.). Luego, escribe un 
programa que ordene la lista de libros en función de un campo específico, como 
el año de publicación o el autor. """

# Se inicializa lista de diccionarios
books = [
    {
        "titulo": "El Gran Gatsby",
        "autor": "F. Scott Fitzgerald",
        "año": 1925,
    },
    {
        "titulo": "Cien años de soledad",
        "autor": "Gabriel García Márquez",
        "año": 1967,
    },
    {
        "titulo": "1984",
        "autor": "George Orwell",
        "año": 1949,
    },
    {
        "titulo": "Matar un ruiseñor",
        "autor": "Harper Lee",
        "año": 1960,
    },
    {
        "titulo": "Don Quijote de la Mancha",
        "autor": "Miguel de Cervantes",
        "año": 1605,
    },
]

# Solicitar al usuario que elija un campo para ordenar la lista de libros
print("\nCampos disponibles para ordenar: 'titulo', 'autor', 'año'")
field = input("Ingrese el campo por el que desea ordenar los libros: ")

sort_books(books, field)

# Imprimir la lista de libros ordenada por año de publicación
print(f"\nLista de libros ordenada por {field}:")
for book in books:
    print("\nTítulo:", book["titulo"])
    print("Autor:", book["autor"])
    print("Año de publicación:", book["año"])

""" 
Escribe un programa que tome una lista de cadenas como entrada y las ordene en 
orden ascendente según su longitud. Puedes utilizar el método de ordenamiento de 
inserción. """

# Llama a la función de ordenamiento de inserción
insertion_sort_by_length(words)

# Imprime la lista ordenada por longitud
print("\nLista ordenada por longitud ascendente:", words)

""" Modifica uno de los ejercicios anteriores para ordenar la lista de números 
en orden descendente en lugar de ascendente. """

# Se imprime la lista de números ordenados descendente
bubble_sort_descending(random_numbers)
print("\nLista ordenada en orden ascendente:", random_numbers)

""" Escribe un programa que tome una lista de números enteros y ordene la lista 
utilizando el algoritmo de ordenamiento por conteo. """

# Se imprime la lista de números ordenados por conteo
counting_sort(random_numbers)
print("\nLista ordenada utilizando el ordenamiento por conteo:", random_numbers)

""" Crea una lista que contenga tanto números como cadenas de caracteres. 
Escribe un programa que ordene esta lista de manera que primero estén los 
números ordenados de menor a mayor y luego las cadenas de caracteres ordenadas 
alfabéticamente. """

# Lista que contiene números y cadenas de caracteres
mixed_list = [5, "apple", 2, "banana", 8, "cherry", "3", 1]

# Listas para almacenar números y cadenas de caracteres
numbers = []
strings = []

# Separar números y cadenas en las listas correspondientes
for item in mixed_list:
    if isinstance(item, int):
        numbers.append(item)
    elif isinstance(item, str):
        strings.append(item)

# Ordenar la lista de números de menor a mayor
numbers.sort()

# Ordenar la lista de cadenas de caracteres alfabéticamente
strings.sort()

# Combinar las dos listas ordenadas
sorted_mixed_list = numbers + strings

# Imprimir la lista resultante
print("\nLista de números y caracteres ordenadas:", sorted_mixed_list)


""" Implementa el algoritmo de ordenamiento Merge Sort y úsalo para ordenar una 
lista de números. """

merge_sort(random_numbers)
print("\nLista ordenada utilizando el ordenamiento por Merge Sort:", random_numbers)
