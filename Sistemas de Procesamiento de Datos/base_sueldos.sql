-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-10-2023 a las 04:00:45
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4
SET 
  SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET 
  time_zone = "+00:00";
--
-- Base de datos: `sueldos`
--
CREATE database sueldos;
USE sueldos;
-- Funciones
--
DELIMITER $$ CREATE DEFINER = `root` @`localhost` FUNCTION `EquipoMayorPresupuesto` () RETURNS DECIMAL(10, 2) BEGIN DECLARE max_presupuesto DECIMAL(10, 2);
SELECT 
  MAX(presproyecto) INTO max_presupuesto 
FROM 
  proyectos;
RETURN max_presupuesto;
END$$ DELIMITER;
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `adelantos`
--
CREATE TABLE `adelantos` (
  `legajo` int(4) NOT NULL, 
  `monto` decimal(10, 2) DEFAULT NULL, 
  `fecha` date DEFAULT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
--
-- Volcado de datos para la tabla `adelantos`
--
INSERT INTO `adelantos` (`legajo`, `monto`, `fecha`) 
VALUES 
  (100, 2000.00, '2020-02-03'), 
  (107, 1500.00, '2020-03-18'), 
  (103, 900.00, '2020-02-10'), 
  (105, 500.00, '2020-05-18'), 
  (106, 900.00, '2020-02-15');
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `equipolegajo`
--
CREATE TABLE `equipolegajo` (
  `idequipo` int(11) NOT NULL, 
  `idlegajo` int(11) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'vincula los componentes d e los equipos';
--
-- Volcado de datos para la tabla `equipolegajo`
--
INSERT INTO `equipolegajo` (`idequipo`, `idlegajo`) 
VALUES 
  (1000, 100), 
  (1000, 102), 
  (1000, 103), 
  (1000, 104), 
  (2000, 100), 
  (2000, 105), 
  (2000, 106), 
  (2000, 107), 
  (3000, 100), 
  (3000, 102), 
  (4000, 100), 
  (4000, 102), 
  (4000, 106);
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `equipos`
--
CREATE TABLE `equipos` (
  `idequipo` int(4) NOT NULL, 
  `nombreequipo` varchar(60) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = ascii COLLATE = ascii_bin;
--
-- Volcado de datos para la tabla `equipos`
--
INSERT INTO `equipos` (`idequipo`, `nombreequipo`) 
VALUES 
  (1000, 'Análisis'), 
  (2000, 'Desarrollo'), 
  (3000, 'Calidad'), 
  (4000, 'Seguridad');
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `hs_trabajadas`
--
CREATE TABLE `hs_trabajadas` (
  `legajo` int(4) NOT NULL, 
  `dia` date NOT NULL, 
  `horaentrada` time NOT NULL, 
  `horasalida` time NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = ascii COLLATE = ascii_bin;
--
-- Volcado de datos para la tabla `hs_trabajadas`
--
INSERT INTO `hs_trabajadas` (
  `legajo`, `dia`, `horaentrada`, `horasalida`
) 
VALUES 
  (
    100, '2018-06-02', '07:00:00', '15:00:00'
  ), 
  (
    100, '2018-06-03', '07:00:00', '15:00:00'
  ), 
  (
    101, '2018-06-02', '07:00:00', '15:00:00'
  ), 
  (
    101, '2018-06-03', '07:00:00', '15:00:00'
  ), 
  (
    102, '2018-06-02', '07:00:00', '15:00:00'
  ), 
  (
    102, '2018-06-03', '07:00:00', '15:00:00'
  ), 
  (
    100, '2018-06-02', '07:00:00', '18:00:00'
  ), 
  (
    100, '2018-06-03', '07:00:00', '18:00:00'
  ), 
  (
    101, '2018-06-04', '07:00:00', '18:00:00'
  ), 
  (
    102, '2018-06-04', '07:00:00', '18:00:00'
  ), 
  (
    103, '2018-06-04', '07:00:00', '15:00:00'
  ), 
  (
    101, '2018-05-24', '07:00:00', '15:00:00'
  ), 
  (
    102, '2018-05-20', '08:00:00', '19:00:00'
  ), 
  (
    103, '2018-06-17', '07:30:00', '18:35:00'
  ), 
  (
    104, '2018-06-17', '08:00:00', '17:45:00'
  ), 
  (
    105, '2018-06-17', '08:15:00', '18:00:00'
  ), 
  (
    106, '2018-06-17', '08:20:00', '18:20:00'
  ), 
  (
    107, '2018-06-17', '08:10:00', '18:00:00'
  ), 
  (
    100, '2018-06-18', '07:20:00', '17:00:00'
  ), 
  (
    101, '2018-06-18', '08:00:00', '16:00:00'
  ), 
  (
    102, '2018-06-18', '08:10:00', '17:00:00'
  ), 
  (
    103, '2018-06-18', '08:20:00', '17:00:00'
  ), 
  (
    104, '2018-06-18', '08:00:00', '16:00:00'
  ), 
  (
    105, '2018-06-18', '08:00:00', '17:10:00'
  ), 
  (
    106, '2018-06-18', '09:00:00', '18:00:00'
  ), 
  (
    107, '2018-06-18', '08:10:00', '16:00:00'
  );
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `legajos`
--
CREATE TABLE `legajos` (
  `legajo` int(11) NOT NULL, 
  `apellido` varchar(40) NOT NULL, 
  `nombre` varchar(40) NOT NULL, 
  `domicilio` varchar(60) NOT NULL, 
  `cp` int(4) NOT NULL, 
  `telefono` varchar(12) DEFAULT NULL, 
  `celular` varchar(14) DEFAULT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
--
-- Volcado de datos para la tabla `legajos`
--
INSERT INTO `legajos` (
  `legajo`, `apellido`, `nombre`, `domicilio`, 
  `cp`, `telefono`, `celular`
) 
VALUES 
  (
    100, 'Caballero', 'Juan', 'San Martín 600', 
    5500, '4499090', '2615040504'
  ), 
  (
    101, 'Caballero', 'Ignacio', 'San Martín 600', 
    5500, '4499090', '2615040504'
  ), 
  (
    102, 'Martinez', 'Alberto', 'San Martín 605', 
    5500, '4249099', '2615040504'
  ), 
  (
    103, 'Cantero', 'Andrea', 'Bolivar 3300', 
    5501, '4215866', '2615040504'
  ), 
  (
    104, 'Muñoz', 'Andreina', 'Cerro San Juan', 
    5515, NULL, '2616887799'
  ), 
  (
    105, 'Gabrielli', 'Carolina', 'Sarmiento 52', 
    5505, NULL, '115897744'
  ), 
  (
    106, 'Cabaña', 'Juan', 'Catamarca 124', 
    5501, '4312287', '2648877211'
  ), 
  (
    107, 'Llorens', 'Juan', 'Lavalle 304', 
    5500, NULL, NULL
  );
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `proyectoequipo`
--
CREATE TABLE `proyectoequipo` (
  `idproyecto` int(11) NOT NULL, 
  `idequipo` int(11) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = ascii COLLATE = ascii_bin;
--
-- Volcado de datos para la tabla `proyectoequipo`
--
INSERT INTO `proyectoequipo` (`idproyecto`, `idequipo`) 
VALUES 
  (1000, 1000), 
  (1001, 2000), 
  (1002, 3000), 
  (1003, 2000);
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `proyectos`
--
CREATE TABLE `proyectos` (
  `nroproyecto` int(4) NOT NULL, 
  `nombrepoyecto` varchar(60) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL, 
  `porcproyecto` float NOT NULL, 
  `fechaproyecto` date NOT NULL, 
  `presproyecto` float(15, 2) NOT NULL, 
  `idequipo` int(4) NOT NULL, 
  `duracion` int(11) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = ascii COLLATE = ascii_bin;
--
-- Volcado de datos para la tabla `proyectos`
--
INSERT INTO `proyectos` (
  `nroproyecto`, `nombrepoyecto`, `porcproyecto`, 
  `fechaproyecto`, `presproyecto`, 
  `idequipo`, `duracion`
) 
VALUES 
  (
    1000, 'Facturación', 75, '2021-02-16', 
    15000.00, 1000, 450
  ), 
  (
    1001, 'Gestión de Venas', 40, '2022-06-01', 
    25000.00, 3000, 1200
  ), 
  (
    1002, 'Gestión Veterinaria', 70, 
    '2020-03-20', 25000.00, 2000, 1800
  ), 
  (
    1003, 'Facturación Hiper', 100, '2020-02-25', 
    75000.00, 1000, 2500
  ), 
  (
    1004, 'Ventas on line', 50, '2022-04-13', 
    250000.00, 3000, 2800
  );
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `proy_equipo_hs`
--
CREATE TABLE `proy_equipo_hs` (
  `idproyecto` int(11) NOT NULL DEFAULT 0, 
  `idequipo` int(11) NOT NULL DEFAULT 0, 
  `hstrabajadas` int(4) DEFAULT NULL
) ENGINE = InnoDB DEFAULT CHARSET = ascii COLLATE = ascii_bin;
--
-- Volcado de datos para la tabla `proy_equipo_hs`
--
INSERT INTO `proy_equipo_hs` (
  `idproyecto`, `idequipo`, `hstrabajadas`
) 
VALUES 
  (1000, 1000, 890), 
  (1000, 3000, 150), 
  (1000, 4000, 300), 
  (1001, 1000, 280), 
  (1001, 2000, 1250), 
  (1001, 3000, 150), 
  (1001, 4000, 250), 
  (1002, 1000, 200), 
  (1002, 2000, 100), 
  (1002, 3000, 210), 
  (1002, 4000, 100), 
  (1003, 3000, 120), 
  (1004, 2000, 920);
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `sueldos`
--
CREATE TABLE `sueldos` (
  `legajo` int(11) NOT NULL, 
  `basico` float DEFAULT NULL, 
  `conyugue` tinyint(1) NOT NULL DEFAULT 0, 
  `hijos` int(10) UNSIGNED DEFAULT NULL, 
  `departamento` int(4) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = ascii COLLATE = ascii_bin;
--
-- Volcado de datos para la tabla `sueldos`
--
INSERT INTO `sueldos` (
  `legajo`, `basico`, `conyugue`, `hijos`, 
  `departamento`
) 
VALUES 
  (100, 15000, 1, 2, 100), 
  (101, 13000, 0, NULL, 100), 
  (102, 18000, 1, 3, 200), 
  (103, 17500, 0, NULL, 100), 
  (104, 13000, 1, 1, 200), 
  (105, 15000, 0, 1, 100), 
  (106, 18500, 0, NULL, 200), 
  (107, 17000, 1, NULL, 200);
-- --------------------------------------------------------
--
-- Estructura Stand-in para la vista `vista_e`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vista_e` (
  `idequipo` int(4), 
  `nombreequipo` varchar(60), 
  `nombrepoyecto` varchar(60)
);
-- --------------------------------------------------------
--
-- Estructura para la vista `vista_e`
--
DROP 
  TABLE IF EXISTS `vista_e`;
CREATE ALGORITHM = UNDEFINED DEFINER = `root` @`localhost` SQL SECURITY DEFINER VIEW `vista_e` AS 
SELECT 
  `t1`.`idequipo` AS `idequipo`, 
  `t1`.`nombreequipo` AS `nombreequipo`, 
  `t2`.`nombrepoyecto` AS `nombrepoyecto` 
FROM 
  (
    `equipos` `t1` 
    join `proyectos` `t2`
  ) 
WHERE 
  `t1`.`idequipo` = `t2`.`idequipo`;
--
-- Índices para tablas volcadas
--
--
-- Indices de la tabla `adelantos`
--
ALTER TABLE 
  `adelantos` 
ADD 
  KEY `indice_adelanto_legajo` (`legajo`);
--
-- Indices de la tabla `equipolegajo`
--
ALTER TABLE 
  `equipolegajo` 
ADD 
  PRIMARY KEY (`idequipo`, `idlegajo`);
--
-- Indices de la tabla `equipos`
--
ALTER TABLE 
  `equipos` 
ADD 
  PRIMARY KEY (`idequipo`);
--
-- Indices de la tabla `hs_trabajadas`
--
ALTER TABLE 
  `hs_trabajadas` 
ADD 
  KEY `legajo` (`legajo`);
--
-- Indices de la tabla `legajos`
--
ALTER TABLE 
  `legajos` 
ADD 
  PRIMARY KEY (`legajo`), 
ADD 
  KEY `cp` (`cp`), 
ADD 
  KEY `telefono` (`telefono`), 
ADD 
  KEY `celular` (`celular`);
--
-- Indices de la tabla `proyectoequipo`
--
ALTER TABLE 
  `proyectoequipo` 
ADD 
  KEY `index-proyecto` (`idproyecto`), 
ADD 
  KEY `index-equipo` (`idequipo`);
--
-- Indices de la tabla `proyectos`
--
ALTER TABLE 
  `proyectos` 
ADD 
  PRIMARY KEY (`nroproyecto`);
--
-- Indices de la tabla `proy_equipo_hs`
--
ALTER TABLE 
  `proy_equipo_hs` 
ADD 
  PRIMARY KEY (`idproyecto`, `idequipo`);
--
-- Indices de la tabla `sueldos`
--
ALTER TABLE 
  `sueldos` 
ADD 
  PRIMARY KEY (`legajo`);
--
-- AUTO_INCREMENT de las tablas volcadas
--
--
-- AUTO_INCREMENT de la tabla `equipos`
--
ALTER TABLE 
  `equipos` MODIFY `idequipo` int(4) NOT NULL AUTO_INCREMENT, 
  AUTO_INCREMENT = 4001;
--
-- AUTO_INCREMENT de la tabla `sueldos`
--
ALTER TABLE 
  `sueldos` MODIFY `legajo` int(11) NOT NULL AUTO_INCREMENT, 
  AUTO_INCREMENT = 108;
COMMIT;
