# Datos
carreras <- c("Medicina", "Derecho", "Ciencias", "Letras", "Inef", "Otras")
alumnos <- c(250, 176, 127, 314, 103, 30)

# Crear un dataframe con los datos
datos <- data.frame(Carrera = carreras, Alumnos = alumnos)

# Mostrar el dataframe
print(datos)

# Crear un gráfico de barras
barplot(alumnos, names.arg = carreras, xlab = "Carrera", ylab = "Número de Alumnos", col = "skyblue", main = "Carreras Elegidas por los Alumnos")

