# EJERCICIO 1
# Inicializar las listas de pasajeros y ciudades
travelers = [
    ("Manuel Juarez", "12345678", "San Juan"),
    ("Silvana Paredes", "62258472", "Mendoza"),
]
cities = [
    ("Buenos Aires", "Argentina"),
    ("Lisboa", "Portugal"),
    ("Mendoza", "Argentina"),
]


# Función para agregar pasajeros a la lista de viajeros
def add_traveler():
    name = input("\nIngrese el nombre del pasajero: ")
    dni_number = input("Ingrese el D.N.I. del pasajero: ")
    destination = input("Ingrese el destino del pasajero: ")
    travelers.append((name, dni_number, destination))
    print("\nPasajero agregado correctamente.")


# Función para agregar ciudades a la lista de ciudades
def add_city():
    city = input("\nIngrese ciudad de destino: ")
    country = input("Ingrese país de destino: ")
    cities.append((city, country))
    print("\nCiudad agregada correctamente.")


# Función para encontrar el destino de un pasajero por DNI
def find_destination_by_dni():
    dni_searched = input("\nIngrese el DNI del pasajero: ")
    for name, dni_number, destination in travelers:
        if dni_searched == dni_number:
            return print(f"\nEl pasajero {name} viaja a {destination}.")
    print("\nPasajero no encontrado.")


# Función para contar la cantidad de pasajeros que viajan a una ciudad
def count_travelers_by_city():
    city_searched = input("\nIngrese el nombre de la ciudad: ")
    count = sum(1 for _, _, destination in travelers if destination == city_searched)
    print(f"\n{count} pasajeros viajan a {city_searched}")


# Función para encontrar el país de un pasajero por DNI
def find_country_by_dni():
    dni_searched = input("\nIngrese el DNI del pasajero: ")
    for name, dni_number, destination in travelers:
        if dni_searched == dni_number:
            for city, country in cities:
                if destination == city:
                    return print(f"\nEl pasajero {name} viaja a {country}.")
    print("\nPasajero no encontrado.")


# Función para contar la cantidad de pasajeros que viajan a un país
def count_travelers_by_country():
    country_searched = input("Ingrese el nombre del país: ")
    count = sum(
        1
        for _, _, destination in travelers
        for city, country in cities
        if destination == city and country == country_searched
    )
    print(f"{count} pasajeros viajan a {country_searched}")


# EJERCICIO 2
# Función que toma una lista de compras y devuelve un conjunto de direcciones
# únicas de clientes a las que deben enviarse las facturas


def get_invoice_addresses(purchases):
    invoice_addresses = set()
    for purchase in purchases:
        _, _, _, address = purchase
        invoice_addresses.add(address)
    return invoice_addresses


# EJERCICIO 3
# Se inicializa lista de miembros
members = {
    1: {"nombre": "Amanda Núñez", "fecha de ingreso": "17/03/2009", "cuota": "al día"},
    2: {
        "nombre": "Bárbara Molina",
        "fecha de ingreso": "17/03/2009",
        "cuota": "al día",
    },
    3: {
        "nombre": "Lautaro Campos",
        "fecha de ingreso": "17/03/2009",
        "cuota": "al día",
    },
}


# Función para agregar nuevos socios
def add_member():
    last_member_number = max(members.keys())
    number = last_member_number + 1
    name = input("\nIngrese el nombre del socio: ")
    join_date = input("Fecha de ingreso (ddmmaaaa): ")
    join_date = f"{join_date[:2]}/{join_date[2:4]}/{join_date[4:]}"
    dues = state_dues()
    members[number] = {
        "nombre": name,
        "fecha de ingreso": join_date,
        "cuota": dues,
    }
    print(f"\nSocio N°{number} agregado correctamente.")


# Función para agregar si la cuota esta al día o no
def state_dues():
    user_input = input("¿Cuota al día? (s/n): ").lower()
    if user_input == "s":
        return "al día"
    else:
        return "atrasada"


# Función para contar cantidad de miembros que tiene el club
def get_number_of_members():
    number_of_members = len(members)
    print(f"\nEl club tiene {number_of_members} miembros.")


# Función para registrar pago de cuotas adeudadas por número de socio
def update_member_dues():
    member_number = int(input("\nIngrese el número del socio: "))
    if member_number in members:
        members[member_number]["cuota"] = "al día"
    else:
        print(f"\nSocio N°{member_number} no encontrado.")


# Función para actualizar la fecha de ingreso de todos los socios que se unieron el 13/03/2018
def update_member_date():
    update = False
    for member_number, member_info in members.items():
        if member_info["fecha de ingreso"] == "13/03/2018":
            member_info["fecha de ingreso"] = "14/03/2018"
            print(
                f"\nSe actualizo correctamente la fecha de ingreso del socio N°{member_number}"
            )
            update = True
    if not update:
        print("\nNo es necesario actualizar la fecha de ingreso de ningún socio.")


# Función para eliminar socio
def delete_member():
    member = False
    member_to_delete = input("\nIngrese el nombre y apellido del socio: ")
    members_copy = members.copy()
    for member_number, member_info in members_copy.items():
        if member_info["nombre"] == member_to_delete:
            del members[member_number]
            print(f"\nEl socio N°{member_number} ha sido eliminado correctamente.")
            member = True
    if not member:
        print("\nSocio no encontrado.")


# Función para mostrar la lista completa de socios del club
def list_of_members():
    for member_number, member_info in members.items():
        print(
            f'\nSocio N°{member_number}, {member_info["nombre"]}, ingresó: {member_info["fecha de ingreso"]}, cuota {member_info["cuota"]}.'
        )
