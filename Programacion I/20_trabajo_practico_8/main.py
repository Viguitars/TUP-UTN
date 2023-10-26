""" Escribir una función que reciba un número positivo y devuelva la cantidad de 
dígitos que tiene. """

""" Escribir una función que reciba 2 enteros n y b y devuelva True si n es 
potencia de b. """

""" Escribir una función recursiva que reciba como parámetros dos strings a y b, 
y devuelva una lista con las posiciones en donde se encuentra b dentro de a. 
Ejemplo:

>>> posiciones_de("Un tete a tete de Tete", "te")
[3,5,10,12,21] """


""" Escribir dos funciones mutuamente recursivas par(n) e impar(n) que 
determinen la paridad del número natural dado, conociendo solo que:
    ● 1 es impar.
    ● Si un número es impar, su antecesor es par; y viceversa. """

""" Escribir una función recursiva que encuentre el mayor elemento de una lista. 
"""

""" Escribir una función recursiva para replicar los elementos de una lista una 
cantidad de veces. 
Por ejemplo, replicar ([1, 3, 3, 7], 2) = ([1, 1, 3, 3, 3, 3, 7, 7]) """

""" Implemente un algoritmo, usando una función recursiva, que resuelva la 
siguiente sumatoria:

K(n, p) = p + 2 ∗ p + 3 ∗ p + 4 ∗ p + … + n ∗ p
    ● El programa debe pedir al usuario que ingrese un número n, y un número d,
    ● Luego debe calcular el valor de K(n, p) usando una función recursiva,
    ● Debe imprimir el resultado de K(n, p) """

""" El triángulo de Pascal es un arreglo triangular de números que se define de 
la siguiente manera: Las filas se enumeran desde n = 0, de arriba hacia abajo. 
Los valores de cada fila se enumeran desde k = 0 (de izquierda a derecha). Los 
valores que se encuentran en los bordes del triángulo son todos unos. Cualquier 
otro valor se calcula sumando los dos valores contiguos de la fila de arriba. 
Escribí la función recursiva pascal(n, k) que calcula el valor que se encuentra 
en la fila n y la columna k. """

""" Escribí una función recursiva combinaciones(lista, k) que reciba una lista 
de caracteres únicos, y un número k, e imprima todas las posibles cadenas de 
longitud k formadas con los caracteres dados (permitiendo caracteres repetidos). 
"""

""" La norma ISO 216 específica tamaños de papel. Es el estándar que define el 
popular tamaño de papel A4 (210 mm de ancho y 297 mm de largo). Las hojas A0 
miden 841 mm de ancho y 1189 mm de largo. A partir de la A0 las siguientes 
medidas, digamos la A(N+1), se definen doblando al medio la hoja A(N). Siempre 
se miden en milímetros con números enteros: entonces la hoja A1 mide 594 mm de 
ancho (y no 594.5) por 841 mm de largo.


Escribí una función recursiva medidas hoja A(N) que para una entrada N mayor que 
cero, devuelve el ancho y el largo de la hoja A(N) calculada recursivamente a 
partir de las medidas de la hoja A(N−1), usando la hoja A0 como caso base. La 
función debe devolver el ancho y el largo -en ese orden- en una tupla. """
