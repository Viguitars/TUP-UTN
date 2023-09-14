# Lista para almacenar las películas
movies_to_watch = []

while True:
    print("Lista de películas por ver:")

    # Mostrar lista de películas enumeradas
    for index, movie in enumerate(movies_to_watch, start=1):
        print(f"{index}). {movie}")

    print("\nOpciones:")
    print("1. Agregar una película")
    print("2. Eliminar una película")
    print("3. Salir")

    option = input("Seleccione una opción (1, 2, 3): ")

    if option == "1":  # Agregar una película a la lista
        add_movie = str(input("Ingrese el nombre de la película a agregar: ")).title()
        # Verificar si la película a agregar ya se encuentra en la lista
        if add_movie in movies_to_watch:
            print(f"'{add_movie}' ya está en la lista.")
        # Verificar que no se haya ingresado una cadena vacía
        elif len(add_movie) == 0:
            print("El nombre de la película no puede estar vacío.")
        else:
            movies_to_watch.append(add_movie)
            print(f"'{add_movie}' ha sido agregada a la lista.")
    elif option == "2":  # Eliminar una película
        # Verificar que la lista no se encuentre vacía
        if not movies_to_watch:
            print("La lista de películas esta vacía.")
        else:
            remove_movie = str(
                input("Ingrese el nombre de la película a eliminar: ")
            ).title()
            # Verificar si la película a eliminar se encuentra en la lista
            if remove_movie in movies_to_watch:
                movies_to_watch.remove(remove_movie)
                print(f"'{remove_movie}' ha sido eliminada de la lista.")
            else:
                print(f"'{remove_movie}' no se encuentra en la lista.")
    elif option == "3":  # Salir del programa
        print("¡Hasta luego!")
        break
    else:
        print("Opción no válida. \nPor favor, seleccione la opción 1, 2 o 3.")
