# Datos
carrera <-
  c(
    rep("Medicina", 250),
    rep("Derecho", 176),
    rep("Ciencias", 127),
    rep("Letras", 314),
    rep("Inef", 103),
    rep("Otras", 30)
  )

# Frecuencias
frecuencia <- table(carrera)
frecuencia_relativa <- frecuencia / length(carrera)

# Graficar la frecuencia
barplot(
  frecuencia,
  col = "skyblue",
  xlab = "Carreras",
  ylab = "Número de alumnos",
  main = "Cantidad de alumnos por carrera"
)

