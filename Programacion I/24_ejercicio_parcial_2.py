""" EXAMEN PARCIAL
Magneto quiere reclutar la mayor cantidad de mutantes para poder luchar contra 
los X-Mens.
Te ha contratado a ti para que desarrolles un programa que detecte si un humano 
es mutante basándose en su secuencia de ADN.

Para eso te ha pedido crear un programa con un método o función booleana, 
llamada is_mutant(dna), que recibe como parámetro un arreglo de Strings que 
representan cada fila de una matriz 6x6 con la secuencia de ADN.
Las letras de los Strings solo pueden ser: A,T,C,G; las cuales representan cada 
base nitrogenada del ADN.

Sabrás si un humano es mutante, si encuentras más de una secuencia de cuatro 
letras iguales, estas pueden aparecer de forma oblicua, horizontal o vertical.
Ejemplo de matrices válidas:

No-Mutante:
A T G C G A
C A G T G C
T T A T T T
A G A C G G
G C G T C A
T C A C T G
Mutante:
A T G C G A
C A G T G C
T T A T G T
A G A A G G
C C C C T A
T C A C T G

En el caso de la segunda matriz ,
adn = [‘ATGCGA’,’CAGTGC’,’TTATGT’,’AGAAGG’,’CCCCTA’,’TCACTG’]
la función devolverá True.

Desarrolla el algoritmo de forma más eficiente posible.
El ingreso de los valores de la matriz debe ser pedido por teclado. Ten en 
cuenta casos para que sea mutante y casos en los que no lo sea.
Una vez cargada correctamente la misma (esto debe verificarse), aplique la 
función que verifica si hay presencia de genes mutantes o no y mostrar el 
resultado por pantalla al usuario.

Subir a Github el proyecto con los casos de prueba. """

class MutantDetector:
    def __init__(self, dna):
        self.dna = dna

    def is_valid(self):
        if len(self.dna) != 6:
            return False
        for row in self.dna:
            if len(row) != 6 or not all(base in "ATCG" for base in row):
                return False
        return True

    def check_sequence(self, sequence):
        return any(char * 4 in sequence for char in "ATCG")

    def is_mutant(self):
        if not self.is_valid():
            return False

        def check_matrix(matrix):
            for row in matrix:
                if self.check_sequence(row):
                    return True

        # Verificar filas y columnas
        if check_matrix(self.dna) or check_matrix(list(map(list, zip(*self.dna)))):
            return True

        # Verificar diagonales
        diagonals = ["".join(self.dna[i + k][k] for k in range(4)) for i in range(3)] + \
                    ["".join(self.dna[i + k][3 - k] for k in range(4)) for i in range(3)]
        if any(self.check_sequence(diagonal) for diagonal in diagonals):
            return True

        return False

# Solicitar la matriz de ADN al usuario
dna = []
for i in range(6):
    row = input(f"Ingrese la fila {i + 1} de ADN (6 letras A, T, C o G): ").strip().upper()
    dna.append(row)

# Crear un objeto MutantDetector y verificar si es mutante
detector = MutantDetector(dna)
if detector.is_mutant():
    print("¡Es un mutante!")
else:
    print("No es un mutante.")
