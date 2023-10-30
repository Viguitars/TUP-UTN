Cspell:disable


-- Creación de la base de datos
CREATE DATABASE alquilerPeliculas;
USE alquilerPeliculas;
-- Creación de las tablas
CREATE TABLE Tipo(
  codigo_tipo INT(5) AUTO_INCREMENT PRIMARY KEY, 
  categoria VARCHAR(50) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8 COLLATE = utf8_bin;
CREATE TABLE Actor (
  codigo_actor INT(5) AUTO_INCREMENT PRIMARY KEY, 
  nombre_actor VARCHAR(255), 
  fechanac_actor DATE
) ENGINE = InnoDB DEFAULT CHARSET = utf8 COLLATE = utf8_bin;
CREATE TABLE Pelicula (
  codigo_pelicula INT(5) AUTO_INCREMENT PRIMARY KEY, 
  codigo_tipo INT(5), 
  titulo_pelicula VARCHAR(255) NOT NULL, 
  codigo_actor INT(5), 
  FOREIGN KEY (codigo_actor) REFERENCES Actor(codigo_actor), 
  FOREIGN KEY (codigo_tipo) REFERENCES Tipo(codigo_tipo)
) ENGINE = InnoDB DEFAULT CHARSET = utf8 COLLATE = utf8_bin;
CREATE TABLE Cliente (
  codigo_cliente INT(5) AUTO_INCREMENT PRIMARY KEY, 
  nombre_cliente VARCHAR(255) NOT NULL, 
  direccion_cliente VARCHAR(255) DEFAULT NULL, 
  telefono_cliente VARCHAR(20) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8 COLLATE = utf8_bin;
CREATE TABLE Alquiler (
  codigo_alquiler INT(5) AUTO_INCREMENT PRIMARY KEY, 
  codigo_pelicula INT(5), 
  fecha_alquiler DATE, 
  hora_alquiler TIME, 
  fecha_devolucion DATE, 
  hora_devolucion TIME, 
  valor_alquiler DECIMAL(10, 2), 
  FOREIGN KEY (codigo_pelicula) REFERENCES Pelicula(codigo_pelicula)
) ENGINE = InnoDB DEFAULT CHARSET = utf8 COLLATE = utf8_bin;
CREATE TABLE Cliente_alquiler(
  codigo_cliente INT(5) NOT NULL, 
  codigo_alquiler INT(5) NOT NULL, 
  FOREIGN KEY (codigo_cliente) REFERENCES Cliente(codigo_cliente), 
  FOREIGN KEY (codigo_alquiler) REFERENCES Alquiler(codigo_alquiler)
) ENGINE = InnoDB DEFAULT CHARSET = utf8 COLLATE = utf8_bin;
CREATE TABLE pelicula_tipo(
  codigo_pelicula INT(5), 
  codigo_tipo INT(5), 
  FOREIGN KEY (codigo_pelicula) REFERENCES Pelicula(codigo_pelicula), 
  FOREIGN KEY (codigo_tipo) REFERENCES Tipo(codigo_tipo)
) ENGINE = InnoDB DEFAULT CHARSET = utf8 COLLATE = utf8_bin;
-- Inserción de datos
-- Inserta datos en las tablas Actor, Tipo y Pelicula
INSERT INTO Tipo (categoria) 
VALUES 
  ('Aventura'), 
  ('Romance'), 
  ('Comedia'), 
  ('Terror'), 
  ('Drama');
INSERT INTO Actor (nombre_actor, fechanac_actor) 
VALUES 
  ('Javier Bardem', '1969-03-01'), 
  ('Penélope Cruz', '1974-04-28'), 
  ('Luis Tosar', '1971-10-13'), 
  ('Ricardo Darín', '1957-01-16'), 
  (
    'Antonio Banderas', '1960-08-10'
  ), 
  (
    'Mariana Espósito', '1991-10-10'
  ), 
  (
    'Gael García Bernal', '1978-11-30'
  ), 
  ('Natalia Oreiro', '1977-05-19'), 
  ('Diego Luna', '1979-12-29'), 
  ('Meryl Streep', '1949-06-22');
INSERT INTO Pelicula (
  codigo_tipo, titulo_pelicula, codigo_actor
) 
VALUES 
  (1, 'Aventuras en la Selva', 1), 
  (2, 'Romance en París', 2), 
  (3, 'Comedia en la Playa', 3), 
  (4, 'Terror en la Mansión', 4), 
  (1, 'Aventuras en el Desierto', 5), 
  (2, 'Romance en la Montaña', 6), 
  (3, 'Comedia en la Ciudad', 7), 
  (4, 'Terror en el Bosque', 8), 
  (1, 'Aventuras en el Océano', 9), 
  (2, 'Romance en el Lago', 10);
-- Inserta datos en la tabla Cliente
INSERT INTO Cliente (
  nombre_cliente, direccion_cliente, 
  telefono_cliente
) 
VALUES 
  (
    'Juan Pérez', 'Calle 123, Ciudad A, Buenos Aires', 
    '11-2345-6789'
  ), 
  (
    'María González', 'Avenida XYZ, Ciudad B, Córdoba', 
    '35-9876-1234'
  ), 
  (
    'Pedro Rodríguez', 'Calle 456, Ciudad C, Santa Fe', 
    '34-5555-7890'
  ), 
  (
    'Laura Martínez', 'Avenida ABC, Ciudad D, Mendoza', 
    '26-1111-2222'
  ), 
  (
    'Luis Sánchez', 'Calle 789, Ciudad E, Tucumán', 
    '38-9999-8888'
  ), 
  (
    'Ana López', 'Calle 567, Ciudad F, Salta', 
    '37-2222-3333'
  ), 
  (
    'Carlos Fernández', 'Avenida DEF, Ciudad G, San Juan', 
    '38-7777-6666'
  ), 
  (
    'Sofía Ramírez', 'Calle 890, Ciudad H, Jujuy', 
    '37-8888-9999'
  ), 
  (
    'Javier Torres', 'Avenida GHI, Ciudad I, La Rioja', 
    '38-4444-5555'
  ), 
  (
    'Marta Silva', 'Calle 901, Ciudad J, San Luis', 
    '26-6666-7777'
  );
-- Inserta datos en la tabla Alquiler y Cliente_alquiler
INSERT INTO Alquiler (
  codigo_pelicula, fecha_alquiler, 
  hora_alquiler, fecha_devolucion, 
  hora_devolucion, valor_alquiler
) 
VALUES 
  (
    1, '2023-10-25', '14:30:00', '2023-10-26', 
    '14:30:00', 9.99
  ), 
  (
    2, '2023-10-25', '16:45:00', '2023-10-26', 
    '16:45:00', 7.50
  ), 
  (
    3, '2023-10-26', '09:15:00', '2023-10-27', 
    '09:15:00', 12.75
  ), 
  (
    4, '2023-10-26', '12:00:00', '2023-10-27', 
    '12:00:00', 8.25
  ), 
  (
    5, '2023-10-27', '17:30:00', '2023-10-28', 
    '17:30:00', 10.00
  ), 
  (
    6, '2023-10-28', '10:30:00', '2023-10-29', 
    '10:30:00', 11.50
  ), 
  (
    7, '2023-10-28', '14:15:00', '2023-10-29', 
    '14:15:00', 9.75
  ), 
  (
    8, '2023-10-29', '11:45:00', '2023-10-30', 
    '11:45:00', 7.99
  ), 
  (
    9, '2023-10-30', '13:20:00', '2023-10-31', 
    '13:20:00', 8.75
  ), 
  (
    10, '2023-10-31', '15:00:00', '2023-11-01', 
    '15:00:00', 12.00
  );
INSERT INTO Cliente_alquiler (codigo_cliente, codigo_alquiler) 
VALUES 
  (1, 1), 
  (2, 2), 
  (3, 3), 
  (4, 4), 
  (5, 5), 
  (6, 6), 
  (7, 7), 
  (8, 8), 
  (9, 9), 
  (10, 10);
