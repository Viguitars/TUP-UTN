class MutantDetector:
    def __init__(self):
        # Inicializa una lista vacía para almacenar la matriz de ADN.
        self.dna_matrix = []
        # Contador para secuencias de cuatro letras iguales encontradas.
        self.sequences_found = 0

    def get_dna_from_user(self):
        # Solicita al usuario que ingrese las secuencias de ADN.
        print(
            "\nIngrese las secuencias de ADN (6 secuencias de 6 letras cada una de A, T, C, G):"
        )
        # Reinicia la matriz de ADN para recibir nuevas entradas.
        self.dna_matrix = []
        # Itera seis veces, una por cada secuencia de ADN necesaria.
        for i in range(6):
            # Un bucle que sigue solicitando la secuencia hasta que sea válida.
            while True:
                # Pide al usuario una secuencia y la convierte a mayúsculas.
                sequence = input(f"Secuencia {i+1}: ").upper()
                # Verifica que la secuencia tenga 6 caracteres y sean todos válidos (A, T, C, G).
                if len(sequence) == 6 and all(char in "ATCG" for char in sequence):
                    # Agrega la secuencia válida a la matriz de ADN.
                    self.dna_matrix.append(sequence)
                    # Rompe el bucle para pasar a la siguiente secuencia.
                    break
                # Imprime un mensaje de error si la secuencia es inválida.
                print(
                    "Secuencia inválida. Asegúrese de que sean 6 caracteres de A, T, C, G."
                )
        # Confirma que la matriz se ha cargado.
        print("\nMatriz de ADN cargada correctamente.")

    def is_mutant(self, dna):
        # Verifica si la matriz de ADN es válida.
        if not self._is_valid_dna_matrix(dna):
            # Retorna False si la matriz no es válida.
            return False
        # Almacena la matriz de ADN proporcionada en la variable de instancia.
        self.dna_matrix = dna
        # Reinicia el contador de secuencias encontradas.
        self.sequences_found = 0
        # Obtiene el tamaño de la matriz.
        n = len(dna)

        # Recorre cada elemento de la matriz.
        for i in range(n):
            for j in range(n):
                # Verifica si ya se encontraron más de una secuencia.
                if self.sequences_found > 1:
                    # Retorna True si es así, ya que se confirma que es mutante.
                    return True

                # Inicia la búsqueda en profundidad desde la celda actual.
                if self._dfs(i, j, -1, self.dna_matrix[i][j], 0):
                    # Incrementa el contador si se encuentra una secuencia.
                    self.sequences_found += 1

        # Retorna True si se encontraron más de una secuencia, False en caso contrario.
        return self.sequences_found > 1

    def _is_valid_dna_matrix(self, dna):
        # Verifica que la matriz tenga 6 filas y cada fila tenga 6 caracteres.
        if len(dna) != 6 or any(len(row) != 6 for row in dna):
            return False
        # Verifica que todos los caracteres sean válidos (A, T, C, G).
        if any(char not in "ATCG" for row in dna for char in row):
            return False
        # Retorna True si todas las validaciones son correctas.
        return True

    def _dfs(self, i, j, direction, current_char, depth):
        # Caso base para cuando estamos comenzando la búsqueda en todas las direcciones.
        if direction == -1 and depth == 0:
            # Llama a _dfs en todas las direcciones desde la celda actual.
            return any(self._dfs(i, j, d, current_char, 1) for d in range(8))

        # Verifica los límites y si el carácter actual coincide con el buscado.
        if (
            i < 0
            or i >= len(self.dna_matrix)
            or j < 0
            or j >= len(self.dna_matrix)
            or self.dna_matrix[i][j] != current_char
        ):
            return False

        # Si hemos alcanzado la profundidad de 4, hemos encontrado una secuencia completa.
        if depth == 4:
            return True

        # Define las 8 posibles direcciones de movimiento (i, j).
        directions = [
            (-1, 0),  # Arriba
            (1, 0),  # Abajo
            (0, -1),  # Izquierda
            (0, 1),  # Derecha
            (-1, -1),  # Diagonal arriba izquierda
            (-1, 1),  # Diagonal arriba derecha
            (1, -1),  # Diagonal abajo izquierda
            (1, 1),  # Diagonal abajo derecha
        ]

        # Asegura que la dirección es válida antes de hacer la llamada recursiva.
        if 0 <= direction < len(directions):
            next_i, next_j = i + directions[direction][0], j + directions[direction][1]
            # Realiza la llamada recursiva para el siguiente nodo en la dirección dada.
            return self._dfs(next_i, next_j, direction, current_char, depth + 1)

        # Retorna False si la dirección no es válida (fuera de los límites de la matriz).
        return False
