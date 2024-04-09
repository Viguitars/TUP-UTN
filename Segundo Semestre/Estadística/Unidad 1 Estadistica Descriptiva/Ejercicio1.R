# Datos
carreras <-
  c("Medicina", "Derecho", "Ciencias", "Letras", "Inef", "Otras")
alumnos <- c(250, 176, 127, 314, 103, 30)

# Frecuencia
frecuencia <- alumnos

# Frecuencia relativa
frecuencia_relativa <- alumnos / sum(alumnos)

# Frecuencia acumulada
frecuencia_acumulada <- cumsum(frecuencia)

# Frecuencia acumulada relativa
frecuencia_acumulada_relativa <- cumsum(frecuencia_relativa)

# Crear un dataframe con los datos
datos <-
  data.frame(
    Carrera = carreras,
    Alumnos = alumnos,
    f = frecuencia,
    fr = frecuencia_relativa,
    F = frecuencia_acumulada,
    Fr = frecuencia_acumulada_relativa
  )

# Imprimir datos
print(datos)

# Crear un gráfico de barras
barplot(
  alumnos,
  names.arg = carreras,
  xlab = "Carreras",
  ylab = "Número de alumnos",
  main = "Carreras elegidas por los alumnos",
)
