import math, random

# Ejercitación de repaso

# Ejercitación 1
# Realizar un programa que pida una frase o palabra y si la frase o palabra
# es de 4 caracteres de largo, el programa le sumará un signo de exclamación
# al final, y si no es de 4 caracteres el programa le sumará un signo de
# interrogación al final. El programa mostrará después la frase final.
asks = str(input("Ingrese una palabra o frase: "))

if len(asks) == 4:
    print(f"{asks}!")
else:
    print(f"{asks}?")

# Ejercitación 2
# Crea un juego donde el programa elija una palabra al azar de una lista y
# el usuario tenga que adivinarla letra por letra. Proporciona un número
# limitado de intentos y utiliza un bucle while para controlar el juego.
# Lista con palabras
words_list = [
    "babelico",
    "bahorrina",
    "depauperar",
    "ful",
    "gaznapiro",
    "lobanillo",
    "ochavo",
    "sacamantecas",
    "uebos",
    "zonzo",
]
# Palabra random de la lista
secret_word = random.choice(words_list)

# Inicializar variables
word_length = len(secret_word)
max_attempts = word_length + 3
attempts = 0
guessed_letters = []

# Mostrar la longitud de la palabra con ❌
guess = "❌" * word_length

print("¡Bienvenido!")
print(f"La palabra que debe adivinar tiene {word_length} letras: {guess}.")

# Loop principal
while attempts < max_attempts:
    letter = input("Ingrese una letra: ").lower()
    # Verifica que sea una letra
    if len(letter) != 1 or not letter.isalpha():
        print("Ingrese una letra válida.")
        continue

    # Verifica que la letra no se haya introducido antes
    if letter in guessed_letters:
        print(f"Ya ingresaste la letra '{letter}'.")
        continue

    # Agrega la letra a las introducidas
    guessed_letters.append(letter)

    # Si la letra esta en la palabra elegida
    if letter in secret_word:
        # Se recorre letra por letra
        for index in range(word_length):
            # Y se reemplazan los ❌ por la letra
            if secret_word[index] == letter:
                guess = guess[:index] + letter + guess[index + 1 :]
        print(f"!Bien hecho¡ {guess}")

        # Si las palabras son iguales, se finaliza el programa
        if guess == secret_word:
            print(
                f"¡Felicidades! Has adivinado la palabra '{secret_word}' correctamente."
            )
            break

    # Si la letra no esta en la palabra se modifica la cantidad de intentos
    else:
        attempts += 1
        remaining_attempts = max_attempts - attempts
        print(f"¡Incorrecto! Te quedan {remaining_attempts} intentos.")

# Si se superan los intentos permitidos, se muestra la solución
if attempts == max_attempts:
    print(f"Has agotado todos tus intentos. La palabra correcta era: {secret_word}")

# Ejercitación 3
# Escribe un programa que cuente cuántas palabras hay en una cadena de
# texto ingresada por el usuario.
text = str(input("Ingrese una cadena de texto: "))

count = len(text.split())

print(f"La cantidad de palabras que tiene la cadena de texto es: {count}.")

# Ejercitación 4
# Una empresa quiere pagar a sus empleados por la asistencia de lunes a
# viernes y un adicional por las horas trabajadas los domingos en tareas
# especiales.
# ✔ El empleado asistió todo el mes, además entre 3 y 5 horas los domingos,
# adiciona el 3 % del sueldo.
# ✔ Si asistió todo el mes y entre 6 y 10 horas los domingos, adiciona el 10 %.
# ✔ No asistió todo el mes y entre 3 y 10 horas los domingos, adiciona el 2 %.
monthly_attendance = str(input("¿El empleado trabajo todo el mes? (Si/No): ")).lower()
sunday_hours = int(input("¿Cuantas horas trabajo los domingos?: "))

base_salary = 250000

if monthly_attendance == "si":
    if sunday_hours >= 3 and sunday_hours <= 5:
        additional = 0.03
    elif sunday_hours >= 6 and sunday_hours <= 10:
        additional = 0.1
else:
    if sunday_hours >= 3 and sunday_hours <= 10:
        additional = 0.02

total_salary = base_salary + (base_salary * additional)

print(f"El sueldo total es de: ${total_salary:.2f}")

# Ejercitación 5
# Leer 2 números; si son iguales que los multiplique, si el primero es
# mayor que el segundo que los reste y si no que los sume.
number1 = int(input("Ingrese el primer número: "))
number2 = int(input("Ingrese el segundo número: "))

if number1 > number2:
    result = number1 - number2
    operation = "restar"
elif number1 < number2:
    result = number1 + number2
    operation = "sumar"
else:
    result = number1 * number2
    operation = "multiplicar"

print(f"El resultado de {operation} {number1} y {number2} es: {result}.")

# Ejercitación 6
# El ANSES requiere clasificar a las personas que se jubilaran en el año de
# 2010. Existen tres tipos de jubilaciones: por edad, por antigüedad joven y
# por antigüedad adulta.
# - Las personas adscritas a la jubilación por edad deben tener 60 años o más
# y una antigüedad en su empleo de menos de 25 años.
# - Las personas adscritas a la jubilación por antigüedad joven deben tener
# menos de 60 años y una antigüedad en su empleo de 25 años o más.
# - Las personas adscritas a la jubilación por antigüedad adulta deben tener
# 60 años o más y una antigüedad en su empleo de 25 años o más.
# Determinar en qué tipo de jubilación, quedara adscrita una persona.
year_of_birth = int(input("Ingrese el año de nacimiento: "))
years_of_work = int(input("Ingrese el año inicio laboral: "))
retirement_year = 2010
age = retirement_year - year_of_birth
antiquity = retirement_year - years_of_work

if age >= 60:
    if antiquity < 25:
        retirement_types = "edad"
    else:
        retirement_types = "antigüedad adulta"
elif age < 60 and antiquity >= 25:
    retirement_types = "antigüedad joven"
else:
    retirement_types = "no corresponde"

print(
    f"Tipo de jubilación a la que puede adscribir en el año 2010: {retirement_types.upper()}."
)

# Ejercitación 7
# Calcular la utilidad que un trabajador recibe en el reparto anual de
# utilidades si este se le asigna como un porcentaje de su salario mensual que
# depende de su antigüedad en la empresa de acuerdo con la siguiente tabla:
# Tiempo Utilidad
# Menos de 1 año 5 % del salario
# 1 año o más y menos de 2 años 7% del salario
# 2 años o más y menos de 5 años 10% del salario
# 5 años o más y menos de 10 años 15% del salario
# 10 años o más 20% del salario
salary = float(input("Ingrese el salario mensual: "))
years_of_service = float(input("Ingrese la antigüedad en la empresa: "))

if years_of_service < 1:
    utility_percentage = 0.05
elif years_of_service < 2:
    utility_percentage = 0.07
elif years_of_service < 5:
    utility_percentage = 0.1
elif years_of_service < 10:
    utility_percentage = 0.15
else:
    utility_percentage = 0.2

utility = salary * utility_percentage

print(f"La utilidad anual es ${utility:.2f}")
