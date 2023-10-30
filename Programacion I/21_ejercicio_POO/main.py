from Motocicleta import Motocicleta

""" Vamos a crear una clase llamada ‘motocicleta’ y haremos un par de instancias
de ella.

Crea una clase vacía llamada "motocicleta".

Todas las motocicletas del concesionario son nuevas. Por lo tanto, vamos a
añadir un atributo de clase para especificar ese valor siempre en todas las
motos.

Ahora, crea el método __init__ vacío, con el que le daremos unos valores a las
nuevas instancias.

Añade los siguientes parámetros al __init__:
o color.
o matricula.
o combustible_litros.
o numero_ruedas.
o marca.
o modelo.
o fecha_fabricacion.
o velocidad_punta.
o peso.

Añade otro atributo de clase. Este va a ser "motor". Lo utilizaremos con un
valor booleano para especificar si el motor está en marcha o detenido. True,
en marcha. False, detenido. Por defecto, quiero que todos los motores vengan
detenidos.

Crea dos métodos inteligentes, arrancar y detener que representarán estas dos
acciones con las motocicletas. Estos deben ser capaces de informar en la
consola de las siguientes cosas.

o Método arrancar():
 Si el motor está detenido, se indica que el motor ha arrancado.
 Si el motor está ya en marcha y se intenta arrancar de nuevo, se indica
que el motor ya estaba en marcha.

o Método detener():
 Si el motor está en marcha, se indica que el motor se ha detenido.
 Si el motor está ya detenido, y se intenta detener de nuevo, se indica
que el motor ya estaba detenido.

Instancia una motocicleta. La mayoría de argumentos son libres, pero quiero que
algunos, tengan los siguientes valores:
o combustible litros = 10
o numero_ruedas = 2

Prueba los dos métodos de arranque y detención con una o dos motocicletas. Haz
las pruebas que quieras.

El concesionario ya tiene precio para una de las motocicletas. Añade, desde
fuera de la clase, este nuevo atributo con un valor para uno de los dos
objetos.

Imprime el valor que acabas de añadir desde fuera de la clase con una frase como
esta:
"El precio de la motocicleta 'x (marca y modelo)' es de 'x_precio' $."

Ahora, quiero que añadas una forma de consultar el precio desde la clase con un
método (lo mismo, que en el ejercicio 11, pero con un método).

Llama al nuevo método con las dos motocicletas. ¿Qué ocurre con una de ellas? """

# Instancia una motocicleta con algunos valores
moto1 = Motocicleta("Rojo", "ABC123", 10, 2, "Yamaha", "YZF-R6", "2023-10-26", 250, 175)

# Prueba los métodos arrancar y detener
moto1.arrancar()
moto1.arrancar()
moto1.detener()
moto1.detener()

# Establece un precio para una de las motocicletas desde fuera de la clase
Motocicleta.precio_moto = 5000

# Imprime el precio de la motocicleta desde fuera de la clase
print(
    f"El precio de la motocicleta '{moto1.marca} {moto1.modelo}' es de USD {moto1.consultar_precio()}."
)
