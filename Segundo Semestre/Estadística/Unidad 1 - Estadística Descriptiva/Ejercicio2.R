# Datos
longitud <-
  c(rep(1, 2),
    rep(2, 10),
    rep(3, 10),
    rep(4, 5),
    rep(5, 10),
    rep(6, 3),
    rep(7, 2),
    rep(8, 2))

# Frecuencias
frecuencia <- table(longitud)
frecuencia_relativa <- longitud / length(longitud)
frecuencia_acumulada <- cumsum(frecuencia)
frecuencia_acumulada_relativa <- cumsum(frecuencia_relativa)

# Graficar la frecuencia
barplot(
  frecuencia,
  col = "skyblue",
  xlab = "Número de metros",
  ylab = "Número de niños",
  main = "Frecuencia"
)
