# Datos
longitud <- c(rep(1, 2), rep(2, 10), rep(3, 10), rep(4, 5), rep(5, 10), rep(6, 3), rep(7, 2), rep(8, 2))

# Crear la tabla de frecuencias
tabla_frecuencias <- table(longitud)

# Convertir la tabla de frecuencias en un dataframe para facilitar su manipulación
df_frecuencias <- as.data.frame(tabla_frecuencias)

# Renombrar las columnas del dataframe
names(df_frecuencias) <- c("Longitud", "Frecuencia")

# Mostrar la tabla de frecuencias
print(df_frecuencias)

# Crear un histograma
hist(longitud, breaks = 8, xlab = "Longitud en metros", ylab = "Frecuencia", main = "Distribución de Longitudes de Caminar")
