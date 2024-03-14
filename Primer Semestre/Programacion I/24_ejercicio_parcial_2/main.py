""" cSpell:disable """

from mutant_detector import MutantDetector

# EXAMEN PARCIAL
# Magneto quiere reclutar la mayor cantidad de mutantes para poder luchar contra
# los X-Mens.
# Te ha contratado a ti para que desarrolles un programa que detecte si un humano
# es mutante basándose en su secuencia de ADN.

# Para eso te ha pedido crear un programa con un método o función booleana,
# llamada is_mutant(dna), que recibe como parámetro un arreglo de Strings que
# representan cada fila de una matriz 6x6 con la secuencia de ADN.
# Las letras de los Strings solo pueden ser: A,T,C,G; las cuales representan cada
# base nitrogenada del ADN.

# Sabrás si un humano es mutante, si encuentras más de una secuencia de cuatro
# letras iguales, estas pueden aparecer de forma oblicua, horizontal o vertical.
# Ejemplo de matrices válidas:

# No-Mutante:
# A T G C G A
# C A G T G C
# T T A T T T
# A G A C G G
# G C G T C A
# T C A C T G
# Mutante:
# A T G C G A
# C A G T G C
# T T A T G T
# A G A A G G
# C C C C T A
# T C A C T G

# En el caso de la segunda matriz ,
# adn = [‘ATGCGA’,’CAGTGC’,’TTATGT’,’AGAAGG’,’CCCCTA’,’TCACTG’]
# la función devolverá True.

# Desarrolla el algoritmo de forma más eficiente posible.
# El ingreso de los valores de la matriz debe ser pedido por teclado. Ten en
# cuenta casos para que sea mutante y casos en los que no lo sea.
# Una vez cargada correctamente la misma (esto debe verificarse), aplique la
# función que verifica si hay presencia de genes mutantes o no y mostrar el
# resultado por pantalla al usuario.

# Subir a Github el proyecto con los casos de prueba.


# Crea una instancia de la clase MutantDetector.
detector = MutantDetector()

# Solicita al usuario que ingrese las secuencias de ADN por teclado, una por una.
detector.get_dna_from_user()

# Imprime en la consola el resultado de evaluar si la matriz de ADN ingresada por el usuario
print("\nEs mutante:", detector.is_mutant(detector.dna_matrix))
