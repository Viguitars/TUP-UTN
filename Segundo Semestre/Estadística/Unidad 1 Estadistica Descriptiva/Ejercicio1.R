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
datos <- data.frame(
  Carrera = carreras,
  Alumnos = alumnos,
  f = frecuencia,
  fr = frecuencia_relativa,
  F = frecuencia_acumulada,
  Fr = frecuencia_acumulada_relativa
)

# Imprimir datos
print(datos)

# Crear el lienzo del gráfico
par(mfrow = c(1, 2))  # Dividir la ventana gráfica en 1 fila y 2 columnas

# Graficar barras de la cantidad de alumnos por materia
barplot(
  alumnos,
  names.arg = carreras,
  col = "skyblue",
  xlab = "Carreras",
  ylab = "Número de alumnos",
  main = "Cantidad de alumnos por carrera"
)

# Graficar las frecuencias y sus acumuladas
plot(
  1:length(carreras),
  frecuencia,
  type = "h",
  lwd = 2,
  col = "blue",
  ylim = c(0, max(frecuencia_acumulada) * 1.2),
  xlab = "Carreras",
  ylab = "Frecuencia",
  main = "Gráfico de frecuencia y frecuencias acumuladas",
  xaxt = "n"
)
axis(side = 1,
     at = 1:length(carreras),
     labels = carreras)

# Agregar la línea para la frecuencia acumulada
lines(
  1:length(carreras),
  frecuencia_acumulada,
  type = "b",
  pch = 16,
  col = "red"
)

# Agregar los puntos para la frecuencia acumulada relativa
points(
  1:length(carreras),
  frecuencia_acumulada_relativa * max(frecuencia),
  pch = 19,
  col = "green"
)

# Agregar leyenda
legend(
  "topright",
  legend = c(
    "Frecuencia",
    "Frecuencia acumulada",
    "Frecuencia acumulada relativa"
  ),
  col = c("blue", "red", "green"),
  pch = c(15, 16, 19),
  lty = c(0, 1, 0)
)
