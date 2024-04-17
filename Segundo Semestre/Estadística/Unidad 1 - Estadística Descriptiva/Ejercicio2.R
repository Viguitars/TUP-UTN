# Datos
longitudes <- c(1, 2, 3, 4, 5, 6, 7, 8)
num_niños <- c(2, 10, 10, 5, 10, 3, 2, 2)

# Frecuencia
frecuencia <- num_niños

# Frecuencia relativa
frecuencia_relativa <- num_niños / sum(num_niños)

# Frecuencia acumulada
frecuencia_acumulada <- cumsum(frecuencia)

# Frecuencia acumulada relativa
frecuencia_acumulada_relativa <- cumsum(frecuencia_relativa)

# Crear un dataframe con los datos
datos <- data.frame(
  Longitud = longitudes,
  Niños = num_niños,
  f = frecuencia,
  fr = round(frecuencia_relativa, 3),
  F = frecuencia_acumulada,
  Fr = round(frecuencia_acumulada_relativa, 3)
)

# Imprimir datos
print(datos)

# Graficar la frecuencia
barplot(
  frecuencia,
  names.arg = longitudes,
  col = "skyblue",
  xlab = "Número de metros",
  ylab = "Número de niños",
  main = "Frecuencia"
)
