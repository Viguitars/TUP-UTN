# Datos
horasextras <- c(rep(0, 43), rep(10, 26), rep(20, 16), rep(30, 9), rep(40, 6))

# Crear la tabla de frecuencias
tabla_frec_absoluta <- table(horasextras)

# Graficar la frecuencia absoluta
barplot(tabla_frec_absoluta, xlab = "Horas Extras Mensuales", ylab = "Frecuencia Absoluta", main = "Frecuencia Absoluta de Horas Extras Mensuales")

# Calcular la frecuencia acumulada
frec_acumulada <- cumsum(tabla_frec_absoluta)

# Graficar la frecuencia acumulada
plot(frec_acumulada, type = "b", xlab = "Horas Extras Mensuales", ylab = "Frecuencia Acumulada", main = "Frecuencia Acumulada de Horas Extras Mensuales")

# Calcular la frecuencia relativa
frec_relativa <- prop.table(tabla_frec_absoluta)

# Graficar la frecuencia relativa
barplot(frec_relativa, xlab = "Horas Extras Mensuales", ylab = "Frecuencia Relativa", main = "Frecuencia Relativa de Horas Extras Mensuales")

# Calcular la frecuencia relativa acumulada
frec_acumulada_relativa <- cumsum(frec_relativa)

# Graficar la frecuencia relativa acumulada
plot(frec_acumulada_relativa, type = "b", xlab = "Horas Extras Mensuales", ylab = "Frecuencia Relativa Acumulada", main = "Frecuencia Relativa Acumulada de Horas Extras Mensuales")

# Media muestral
media <- mean(horasextras)

# Mediana
mediana <- median(horasextras)

# Moda
moda <- names(sort(-table(horasextras)))[1]

# Mostrar los resultados
print(paste("Media muestral:", media))
print(paste("Mediana:", mediana))
print(paste("Moda:", moda))

# Varianza
varianza <- var(horasextras)

# Desviación estándar
desviacion_estandar <- sd(horasextras)

# Coeficiente de variación
coeficiente_variacion <- desviacion_estandar / media * 100  # En porcentaje

# Mostrar los resultados
print(paste("Varianza:", varianza))
print(paste("Desviación Estándar:", desviacion_estandar))
print(paste("Coeficiente de Variación (%):", coeficiente_variacion))

# Calcular el porcentaje de empleados que realizan menos de 30 horas extras mensuales
porcentaje_menos_30 <- sum(horasextras < 30) / length(horasextras) * 100
print(paste("Porcentaje de empleados que realizan menos de 30 horas extras mensuales:", porcentaje_menos_30, "%"))

# Calcular el porcentaje de empleados que realizan menos o igual a 30 horas extras mensuales
porcentaje_menos_igual_30 <- sum(horasextras <= 30) / length(horasextras) * 100
print(paste("Porcentaje de empleados que realizan menos o igual a 30 horas extras mensuales:", porcentaje_menos_igual_30, "%"))

# Calcular el porcentaje de empleados que realizan más de 30 horas extras mensuales
porcentaje_mas_30 <- sum(horasextras > 30) / length(horasextras) * 100
print(paste("Porcentaje de empleados que realizan más de 30 horas extras mensuales:", porcentaje_mas_30, "%"))




