# Datos
automoviles_vendidos <- c(2, 4, 7, 10, 12, 10, 14, 10, 15, 12)

# Crear la tabla de frecuencias
tabla_frecuencias <- table(automoviles_vendidos)

# Convertir la tabla de frecuencias en un dataframe para facilitar su manipulación
df_frecuencias <- as.data.frame(tabla_frecuencias)

# Renombrar las columnas del dataframe
names(df_frecuencias) <- c("Automoviles_Vendidos", "Frecuencia")

# Mostrar la tabla de frecuencias
print(df_frecuencias)

# Graficar la frecuencia absoluta en un gráfico de barras
barplot(tabla_frecuencias, xlab = "Número de Automóviles Vendidos", ylab = "Frecuencia", main = "Frecuencia Absoluta de Automóviles Vendidos")

# Calcular la frecuencia acumulada
frecuencia_acumulada <- cumsum(tabla_frecuencias)

# Graficar la frecuencia acumulada
plot(frecuencia_acumulada, type = "b", xlab = "Número de Automóviles Vendidos", ylab = "Frecuencia Acumulada", main = "Frecuencia Acumulada de Automóviles Vendidos")

# Media muestral
media <- mean(automoviles_vendidos)

# Mediana
mediana <- median(automoviles_vendidos)

# Moda
moda <- names(sort(-table(automoviles_vendidos)))[1]

# Mostrar los resultados
print(paste("Media muestral:", media))
print(paste("Mediana:", mediana))
print(paste("Moda:", moda))

# Varianza
varianza <- var(automoviles_vendidos)

# Desviación estándar
desviacion_estandar <- sd(automoviles_vendidos)

# Coeficiente de variación
coeficiente_variacion <- desviacion_estandar / media * 100  # En porcentaje

# Mostrar los resultados
print(paste("Varianza:", varianza))
print(paste("Desviación Estándar:", desviacion_estandar))
print(paste("Coeficiente de Variación (%):", coeficiente_variacion))

