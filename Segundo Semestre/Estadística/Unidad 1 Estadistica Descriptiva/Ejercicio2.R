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

# Crear el lienzo del gráfico
par(mfrow = c(1, 2))  # Dividir la ventana gráfica en 1 fila y 2 columnas

# Graficar barras de la cantidad de niños
barplot(
  num_niños,
  names.arg = longitudes,
  col = "skyblue",
  xlab = "Número de metros",
  ylab = "Número de niños",
  main = "Cantidad de niños por longitud"
)

# Graficar las frecuencias y sus acumuladas
plot(
  1:length(longitudes),
  frecuencia,
  type = "h",
  lwd = 2,
  col = "blue",
  ylim = c(0, max(frecuencia_acumulada) * 1.2),
  xlab = "Número de metros",
  ylab = "Frecuencia",
  main = "Gráfico de frecuencia y frecuencias acumuladas",
  xaxt = "n"
)
axis(side = 1,
     at = 1:length(longitudes),
     labels = longitudes)

# Agregar la línea para la frecuencia acumulada
lines(
  1:length(longitudes),
  frecuencia_acumulada,
  type = "b",
  pch = 16,
  col = "red"
)

# Agregar los puntos para la frecuencia acumulada relativa
points(
  1:length(longitudes),
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

