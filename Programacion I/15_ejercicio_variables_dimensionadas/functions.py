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
