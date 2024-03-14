print("\nEJERCICIO 1")
""" Vamos a crear una clase llamada Persona. Sus atributos son: nombre, edad y 
DNI. Construye los siguientes métodos para la clase:
Un constructor, donde los datos pueden estar vacíos.
Los setters y getters para cada uno de los atributos. Hay que validar las 
entradas de datos.
mostrar(): Muestra los datos de la persona.
esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad. """


# Definimos la clase Persona
class Persona:
    # Constructor: inicializa los atributos de la clase.
    def __init__(self, nombre="", edad=0, dni=""):
        self.nombre = nombre
        self.edad = edad
        self.dni = dni

    # Getter para el atributo 'nombre'
    def get_nombre(self):
        return self.nombre

    # Setter para el atributo 'nombre', con validación
    def set_nombre(self, nombre):
        if nombre:
            self.nombre = nombre
        else:
            print("Error: El nombre no puede estar vacío.")

    # Getter para el atributo 'edad'
    def get_edad(self):
        return self.edad

    # Setter para el atributo 'edad', con validación
    def set_edad(self, edad):
        if edad >= 0:
            self.edad = edad
        else:
            print("Error: La edad no puede ser negativa.")

    # Getter para el atributo 'dni'
    def get_dni(self):
        return self.dni

    # Setter para el atributo 'dni', con validación
    def set_dni(self, dni):
        if dni:
            self.dni = dni
        else:
            print("Error: El DNI no puede estar vacío.")

    # Método para mostrar los datos de la persona
    def mostrar(self):
        print(f"\nNombre: {self.nombre}")
        print(f"Edad: {self.edad}")
        print(f"DNI: {self.dni}")

    # Método para verificar si la persona es mayor de edad
    def esMayorDeEdad(self):
        return self.edad >= 18


# Creamos una instancia de la clase Persona con valores predeterminados y
# configuramos sus atributos utilizando los setters.
persona1 = Persona()
persona1.set_nombre("Juan")
persona1.set_edad(25)
persona1.set_dni("12345678")

# Creamos otra instancia de la clase Persona con valores proporcionados al
# constructor.
persona2 = Persona("Ana", 17, "87654321")

# Mostramos los datos de ambas personas y verificamos si son mayores de edad.
persona1.mostrar()
print(f"¿{persona1.get_nombre()} es mayor de edad?: {persona1.esMayorDeEdad()}")

persona2.mostrar()
print(f"¿{persona2.get_nombre()} es mayor de edad?: {persona2.esMayorDeEdad()}")

print("\nEJERCICIO 2")
""" Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular 
(que es una persona) y cantidad (puede tener decimales). El titular será 
obligatorio y la cantidad es opcional. Construye los siguientes métodos para la 
clase:
* Un constructor, donde los datos pueden estar vacíos.
* Los setters y getters para cada uno de los atributos. El atributo no se puede 
  modificar directamente, sólo ingresando o retirando dinero.
* mostrar(): Muestra los datos de la cuenta.
* ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad 
  introducida es negativa, no se hará nada.
* retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar 
  en números rojos. """


# Definimos la clase Persona para usarla como atributo en la clase Cuenta
class Persona:
    def __init__(self, nombre):
        self.nombre = nombre


# Definimos la clase Cuenta
class Cuenta:
    def __init__(self, titular, cantidad=0.0):
        # El titular es una instancia de la clase Persona
        self.titular = titular
        self.cantidad = cantidad

    # Getter para el atributo 'titular'
    def get_titular(self):
        return self.titular.nombre

    # Getter para el atributo 'cantidad'
    def get_cantidad(self):
        return self.cantidad

    # Método para mostrar los datos de la cuenta
    def mostrar(self):
        print(f"\nTitular: {self.get_titular()}")
        print(f"Cantidad en la cuenta: {self.get_cantidad()}")

    # Método para ingresar dinero en la cuenta
    def ingresar(self, cantidad):
        if cantidad > 0:
            self.cantidad += cantidad
            print(f"\nSe han ingresado {cantidad} en la cuenta.")
        else:
            print("\nError: La cantidad a ingresar debe ser mayor que cero.")

    # Método para retirar dinero de la cuenta
    def retirar(self, cantidad):
        if cantidad > 0:
            if cantidad <= self.cantidad:
                self.cantidad -= cantidad
                print(f"Se han retirado {cantidad} de la cuenta.")
            else:
                print("Error: Fondos insuficientes para realizar el retiro.")
        else:
            print("Error: La cantidad a retirar debe ser mayor que cero.")


# Creamos una instancia de la clase Persona que será el titular de la cuenta.
titular = Persona("Juan Pérez")

# Creamos una instancia de la clase Cuenta con el titular y un saldo inicial.
cuenta = Cuenta(titular, 1000.0)

# Mostramos los datos de la cuenta.
cuenta.mostrar()

# Realizamos operaciones de ingreso y retiro de dinero.
cuenta.ingresar(500.0)
cuenta.retirar(200.0)

# Mostramos los datos de la cuenta después de las operaciones.
cuenta.mostrar()

print("\nEJERCICIO 3")
""" Desarrollar un programa que cargue los datos de un triángulo. Implementar 
una clase con los métodos para inicializar los atributos, imprimir el valor del 
lado con un tamaño mayor y  el tipo de triángulo que es (equilátero, isósceles o 
escaleno). """


# Definición de la clase Triangulo
class Triangulo:
    # Constructor de la clase que inicializa los lados del triángulo
    def __init__(self, lado1, lado2, lado3):
        self.lado1 = lado1
        self.lado2 = lado2
        self.lado3 = lado3

    # Método para determinar el lado más largo del triángulo
    def determinar_lado_mas_largo(self):
        # Comparamos los lados y devolvemos el valor del lado más largo
        if self.lado1 >= self.lado2 and self.lado1 >= self.lado3:
            return self.lado1
        elif self.lado2 >= self.lado1 and self.lado2 >= self.lado3:
            return self.lado2
        else:
            return self.lado3

    # Método para determinar el tipo de triángulo
    def determinar_tipo_triangulo(self):
        # Comparamos los lados y clasificamos el triángulo
        if self.lado1 == self.lado2 == self.lado3:
            return "equilátero"
        elif (
            self.lado1 == self.lado2
            or self.lado1 == self.lado3
            or self.lado2 == self.lado3
        ):
            return "isósceles"
        else:
            return "escaleno"

    # Método para imprimir información sobre el triángulo
    def imprimir_info(self):
        # Llamamos a los métodos previos y mostramos la información
        lado_mas_largo = self.determinar_lado_mas_largo()
        tipo_triangulo = self.determinar_tipo_triangulo()
        print(f"\nLado más largo: {lado_mas_largo}")
        print(f"\nTipo de triángulo: {tipo_triangulo}")


# Solicitar al usuario que ingrese los lados del triángulo
lado1 = float(input("\nIngrese la longitud del primer lado: "))
lado2 = float(input("Ingrese la longitud del segundo lado: "))
lado3 = float(input("Ingrese la longitud del tercer lado: "))

# Crear una instancia de la clase Triangulo con los lados ingresados
triangulo = Triangulo(lado1, lado2, lado3)

# Imprimir información sobre el triángulo
triangulo.imprimir_info()

print("\nEJERCICIO 4")
""" Realizar una clase que administre una agenda. Se debe almacenar para cada 
contacto el nombre, el teléfono y el email. Además deberá mostrar un menú con 
las siguientes opciones:
* Añadir contacto
* Lista de contactos
* Buscar contacto
* Editar contacto
* Cerrar agenda """


# Definición de la clase Contacto para representar los datos de un contacto
class Contacto:
    def __init__(self, nombre, telefono, email):
        # Inicializa los atributos del contacto con los valores proporcionados
        self.nombre = nombre
        self.telefono = telefono
        self.email = email


# Definición de la clase Agenda para administrar la lista de contactos
class Agenda:
    def __init__(self):
        # Inicializa una lista de contactos vacía al crear una instancia de la Agenda
        self.contactos = []

    def agregar_contacto(self, nombre, telefono, email):
        # Método para agregar un nuevo contacto a la lista
        nuevo_contacto = Contacto(
            nombre, telefono, email
        )  # Crea una instancia de la clase Contacto
        self.contactos.append(nuevo_contacto)  # Agrega el nuevo contacto a la lista
        print("\nContacto añadido.")  # Muestra un mensaje de confirmación

    def listar_contactos(self):
        # Método para mostrar la lista de contactos en la consola
        print("\nLista de Contactos:")
        for contacto in self.contactos:
            # Itera sobre la lista de contactos y muestra los detalles de cada contacto
            print(f"Nombre: {contacto.nombre}")
            print(f"Teléfono: {contacto.telefono}")
            print(f"Email: {contacto.email}")
            print("--------------------")

    def buscar_contacto(self, nombre):
        # Método para buscar un contacto por nombre
        for contacto in self.contactos:
            if contacto.nombre == nombre:
                # Compara el nombre proporcionado con los nombres de la lista de contactos
                print("\nInformación del contacto:")
                print(f"Nombre: {contacto.nombre}")
                print(f"Teléfono: {contacto.telefono}")
                print(f"Email: {contacto.email}")
                return
            else:
                print(
                    "\nContacto no encontrado."
                )  # Muestra un mensaje si el contacto no se encuentra

    def editar_contacto(self, nombre, nuevo_telefono, nuevo_email):
        # Método para editar la información de un contacto existente
        for contacto in self.contactos:
            if contacto.nombre == nombre:
                # Compara el nombre proporcionado con los nombres de la lista de contactos
                contacto.telefono = nuevo_telefono  # Actualiza el teléfono
                contacto.email = nuevo_email  # Actualiza el email
                print("Contacto editado.")  # Muestra un mensaje de confirmación
                return
        print(
            "Contacto no encontrado."
        )  # Muestra un mensaje si el contacto no se encuentra


# Inicio del programa
if __name__ == "__main__":
    mi_agenda = Agenda()  # Crea una instancia de la clase Agenda

    while True:
        print("\nMenú de la Agenda:")
        print("1. Añadir contacto")
        print("2. Lista de contactos")
        print("3. Buscar contacto")
        print("4. Editar contacto")
        print("5. Cerrar agenda")

        opcion = input(
            "Seleccione una opción: "
        )  # Solicita al usuario que seleccione una opción

        if opcion == "1":
            nombre = input("\nNombre del contacto: ")
            telefono = input("Teléfono del contacto: ")
            email = input("Email del contacto: ")
            mi_agenda.agregar_contacto(
                nombre, telefono, email
            )  # Llama al método para agregar un contacto

        elif opcion == "2":
            mi_agenda.listar_contactos()  # Llama al método para mostrar la lista de contactos

        elif opcion == "3":
            nombre = input("\nIngrese el nombre del contacto a buscar: ")
            mi_agenda.buscar_contacto(nombre)  # Llama al método para buscar un contacto

        elif opcion == "4":
            nombre = input("\nIngrese el nombre del contacto a editar: ")
            nuevo_telefono = input("Nuevo teléfono: ")
            nuevo_email = input("Nuevo email: ")
            mi_agenda.editar_contacto(
                nombre, nuevo_telefono, nuevo_email
            )  # Llama al método para editar un contacto

        elif opcion == "5":
            print("\nAgenda cerrada. ¡Hasta luego!")  # Muestra un mensaje de despedida
            break  # Sale del bucle y cierra la agenda
