# Elaborar una función que realice cada ordenamiento y búsqueda vistos en la
# presentación.


data = [12, 45, 1, 78, 5, 23, 56, 34]
target = 23


# Ordenamiento de burbuja (Bubble Sort)
def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]


bubble_sort(data)
print("Ordenado con Bubble Sort:", data)


# Orden de selección (Selection Sort)
def selection_sort(arr):
    n = len(arr)
    for i in range(n):
        min_idx = i
        for j in range(i + 1, n):
            if arr[j] < arr[min_idx]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]


selection_sort(data)
print("Ordenado con Selection Sort:", data)


# Tipo de inserción (Insert Sort)
def insertion_sort(arr):
    n = len(arr)
    for i in range(1, n):
        key = arr[i]
        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key


insertion_sort(data)
print("Ordenado con Insertion Sort:", data)


# Combinar ordenamiento (Merge Sort)
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


merge_sort(data)
print("Ordenado con Merge Sort:", data)


# Búsqueda lineal
def linear_search(arr, target):
    for i in range(len(arr)):
        if arr[i] == target:
            return i
    return -1


index = linear_search(data, target)
if index != -1:
    print(f"{target} encontrado en el índice {index} (búsqueda lineal)")
else:
    print(f"{target} no encontrado (búsqueda lineal)")


# Búsqueda binaria
def binary_search(arr, target):
    left, right = 0, len(arr) - 1
    while left <= right:
        mid = left + (right - left) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1


index = binary_search(data, target)
if index != -1:
    print(f"{target} encontrado en el índice {index} (búsqueda binaria)")
else:
    print(f"{target} no encontrado (búsqueda binaria)")
