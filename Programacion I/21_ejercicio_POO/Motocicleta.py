class Motocicleta:
    # Atributo de clase para todas las motos nuevas
    nuevas = True
    # Atributo de clase para precio de una motocicleta en el concesionario
    precio_moto = 0

    def __init__(
        self,
        color,
        matricula,
        combustible_litros,
        numero_ruedas,
        marca,
        modelo,
        fecha_fabricacion,
        velocidad_punta,
        peso,
    ):
        self.color = color
        self.matricula = matricula
        self.combustible_litros = combustible_litros
        self.numero_ruedas = numero_ruedas
        self.marca = marca
        self.modelo = modelo
        self.fecha_fabricacion = fecha_fabricacion
        self.velocidad_punta = velocidad_punta
        self.peso = peso
        self.motor = False  # Por defecto, el motor está detenido

    def arrancar(self):
        if self.motor:
            print("El motor ya estaba en marcha.")
        else:
            self.motor = True
            print("El motor ha arrancado.")

    def detener(self):
        if self.motor:
            self.motor = False
            print("El motor se ha detenido.")
        else:
            print("El motor ya estaba detenido.")

    def consultar_precio(self):
        return Motocicleta.precio_moto
