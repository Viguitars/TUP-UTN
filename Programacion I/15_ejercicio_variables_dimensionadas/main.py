from functions import *

""" 1. Escribir un programa que permita procesar datos de pasajeros de viaje en 
una lista de tuplas con la siguiente forma: (nombre, dni, destino). Por ejemplo:
    [
    (‘Manuel Juarez’, 12345678, ‘San Juan’), 
    (‘Silvana Paredes’, 62258472, ‘Mendoza’)
    ]
Además en otra lista de tuplas se almacenan los datos de cada ciudad y el país 
al que pertenecen. Ejemplo:
    [
    (‘Buenos Aires’, ‘Argentina’), 
    (‘Lisboa’, ‘Portugal’), 
    (‘Mendoza’, ‘Argentina’)
    ]
Hacer un menú iterativo que permita al usuario realizar las siguientes 
operaciones:
- Agregar pasajeros a la lista de viajeros.
- Agregar ciudades a la lista de ciudades.
- Dado el DNI de un pasajero, ver a qué ciudad viaja.
- Dada una ciudad, mostrar la cantidad de pasajeros que viajan a esa ciudad.
- Dado el DNI de un pasajero, ver a qué país viaja.
- Dado un país, mostrar cuántos pasajeros viajan a ese país.
- Salir del programa. """

# Menú iterativo
while True:
    print("\nMenu:")
    print("1. Agregar pasajero")
    print("2. Agregar ciudad")
    print("3. Buscar ciudad destino de pasajero por D.N.I.")
    print("4. Cantidad de pasajeros por ciudad de destino")
    print("5. Buscar país de destino de pasajero por D.N.I.")
    print("6. Cantidad de pasajeros por país de destino")
    print("0. Salir del Programa")
    # Se solicita a usuario una opción
    user_input = input("\nSeleccione una opción: ")

    if user_input == "1":
        add_traveler()
    elif user_input == "2":
        add_city()
    elif user_input == "3":
        find_destination_by_dni()
    elif user_input == "4":
        count_travelers_by_city()
    elif user_input == "5":
        find_country_by_dni()
    elif user_input == "6":
        count_travelers_by_country()
    elif user_input == "0":
        print("\n¡Hasta luego! Programa finalizado.")
        break
    else:
        print("\nOpción no válida. Por favor, seleccione una opción válida.")


""" 2. Suponer una lista con datos de las compras hechas por clientes de una 
empresa a lo largo de un mes, la cual contiene tuplas con información de cada 
venta: (cliente, día del mes, monto, domicilio del cliente). Ejemplo:
    [
    (‘Nuria Costa’, 5, 1234.5,’Calle 1 – 456’), 
    (‘Jorge Russo’, 7, 3999, ‘Calle 2 – 741’)
    ]
Escribir una función que reciba como parámetro una lista con el formato 
mencionado anteriormente y retorne los domicilios de cada cliente al cual se le 
debe enviar una factura de compra. Notar que cada cliente puede haber hecho más 
de una compra en el mes, por lo que la función debe retornar una estructura que
contenga cada domicilio una sola vez. """


""" 3. Crear un programa para gestionar datos de los socios de un club, 
permitiendo:

- Cargar información de los socios en un diccionario para acceder por número de 
socio. Los datos a almacenar son: número, nombre y apellido, fecha de ingreso 
(ddmmaaaa), cuota al día (s/n). El programa debe iniciar con los datos de los 
socios fundadores ya cargados:
        - Socio n°1, Amanda Núñez, ingresó: 17/03/2009, cuota al día.
        - Socio n°2, Bárbara Molina, ingresó: 17/03/2009, cuota al día.
        - Socio n°3, Lautaro Campos, ingresó: 17/03/2009, cuota al día.
- Informar cantidad de socios del club.
- Solicitar al usuario el número de un socio y registrar que ha pagado todas las 
cuotas adeudadas.
- Modificar la fecha de ingreso de todos los socios ingresados el 13/03/2018, 
para indicar que en realidad ingresaron el 14/03/2018.
- Solicitar el nombre y apellido de un socio y darle de baja (eliminarlo del 
listado)
- Imprimir el listado de socios completo. """
