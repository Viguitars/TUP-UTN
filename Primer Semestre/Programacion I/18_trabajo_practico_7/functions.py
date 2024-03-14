# Función que valida si el número introducido por el usuario es entero
def is_integer(user_input):
    try:
        int(user_input)
        return True
    except ValueError:
        return False


# Función ordenamiento de burbuja
def bubble_sort(numbers):
    n = len(numbers)
    for i in range(n):
        for j in range(0, n - i - 1):
            if numbers[j] > numbers[j + 1]:
                numbers[j], numbers[j + 1] = numbers[j + 1], numbers[j]


# Función ordenamiento de selección
def selection_sort(words):
    n = len(words)
    for i in range(n):
        min_index = i
        for j in range(i + 1, n):
            if words[j] < words[min_index]:
                min_index = j
        words[i], words[min_index] = words[min_index], words[i]


# Función para ordenar una lista de libros según el campo que elijamos
def sort_books(books, field):
    books.sort(key=lambda x: x[field])


# Función ordenamiento de inserción
def insertion_sort_by_length(input_list):
    for i in range(1, len(input_list)):
        current_element = input_list[i]
        j = i - 1
        while j >= 0 and len(current_element) < len(input_list[j]):
            input_list[j + 1] = input_list[j]
            j -= 1
        input_list[j + 1] = current_element


# Función ordenamiento de burbuja descendente
def bubble_sort_descending(numbers):
    n = len(numbers)
    for i in range(n):
        for j in range(0, n - i - 1):
            if numbers[j] < numbers[j + 1]:
                numbers[j], numbers[j + 1] = numbers[j + 1], numbers[j]


# Función ordenamiento por conteo
def counting_sort(numbers):
    max_number = max(numbers)
    min_number = min(numbers)
    range_of_elements = max_number - min_number + 1
    count = [0] * range_of_elements
    output = [0] * len(numbers)

    for number in numbers:
        count[number - min_number] += 1

    for i in range(1, len(count)):
        count[i] += count[i - 1]

    for number in reversed(numbers):
        output[count[number - min_number] - 1] = number
        count[number - min_number] -= 1

    for i in range(len(numbers)):
        numbers[i] = output[i]


# Función ordenamiento por Merge Sort
def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2
        L = arr[:mid]
        R = arr[mid:]

        merge_sort(L)
        merge_sort(R)

        i = j = k = 0

        while i < len(L) and j < len(R):
            if L[i] < R[j]:
                arr[k] = L[i]
                i += 1
            else:
                arr[k] = R[j]
                j += 1
            k += 1

        while i < len(L):
            arr[k] = L[i]
            i += 1
            k += 1

        while j < len(R):
            arr[k] = R[j]
            j += 1
            k += 1
