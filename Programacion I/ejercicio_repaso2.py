""" cSpell:disable  """
import math, random
# Ejercitación de repaso

# 1. Realizar un programa que pida una frase o palabra y si la frase o palabra
# es de 4 caracteres de largo, el programa le sumará un signo de exclamación
# al final, y si no es de 4 caracteres el programa le sumará un signo de
# interrogación al final. El programa mostrará después la frase final.
asks = str(input("Ingrese una palabra o frase: "))

if len(asks) == 4:
    print(f"{asks}!")
else:
    print(f"{asks}?")

# 2. Crea un juego donde el programa elija una palabra al azar de una lista y
# el usuario tenga que adivinarla letra por letra. Proporciona un número
# limitado de intentos y utiliza un bucle while para controlar el juego.
list_of_words = ["hola", "adios", "mañana", "tarde"]
random_word = random.choice(list_of_words)
number_of_tries = len(random_word)*2
attempt_counter = 0
word = ""

while attempt_counter < len(random_word)*2:
    attempts = str(input(f"Tienes {number_of_tries} intentos para adivinar la palabra: "))
    attempt_counter += 1
    if attempts in random_word:
        print(f"La letra '{attempts}' pertenece a la palabra.")
        attempt_counter += 1
    else:
        print(f"La letra '{attempts}' no pertenece a la palabra.")
        
        attempt_counter += 1    
    number_of_tries -= 1
    print(f"attempt_counter: {attempt_counter}")
    print(f"numeros de intentos: {len(random_word)*2}")


if word in random_word and len(word)== len(random_word):
    print(f"¡Felicidades! Has adivinado la palabra {random_word}.")
else:
    print(f"¡Intentalo Nuevamente! La palabra ha adivinar es: {random_word}.")
# 3. Escribe un programa que cuente cuántas palabras hay en una cadena de
# texto ingresada por el usuario.

# 4. Una empresa quiere pagar a sus empleados por la asistencia de lunes a
# viernes y un adicional por las horas trabajadas los domingos en tareas
# especiales.
# ✔ El empleado asistió todo el mes, además entre 3 y 5 horas los domingos,
# adiciona el 3 % del sueldo.
# ✔ Si asistió todo el mes y entre 6 y 10 horas los domingos, adiciona el 10 %.
# ✔ No asistió todo el mes y entre 3 y 10 horas los domingos, adiciona el 2 %.

# 5. Leer 2 números; si son iguales que los multiplique, si el primero es
# mayor que el segundo que los reste y si no que los sume.

# 6. El ANSES requiere clasificar a las personas que se jubilaran en el año de
# 2010. Existen tres tipos de jubilaciones: por edad, por antigüedad joven y
# por antigüedad adulta.
# - Las personas adscritas a la jubilación por edad deben tener 60 años o más
# y una antigüedad en su empleo de menos de 25 años.
# - Las personas adscritas a la jubilación por antigüedad joven deben tener
# menos de 60 años y una antigüedad en su empleo de 25 años o más.
# - Las personas adscritas a la jubilación por antigüedad adulta deben tener
# 60 años o más y una antigüedad en su empleo de 25 años o más.
# Determinar en qué tipo de jubilación, quedara adscrita una persona.

# 7. Calcular la utilidad que un trabajador recibe en el reparto anual de
# utilidades si este se le asigna como un porcentaje de su salario mensual que
# depende de su antigüedad en la empresa de acuerdo con la siguiente tabla:
# Tiempo Utilidad
# Menos de 1 año 5 % del salario
# 1 año o más y menos de 2 años 7% del salario
# 2 años o más y menos de 5 años 10% del salario
# 5 años o más y menos de 10 años 15% del salario
# 10 años o más 20% del salario
