TABLA empleados 
/*------------------------------------------*/
SELECT 
  legajo, 
  CASE WHEN legajo = 200 THEN "Coordinador" WHEN legajo in (501, 502) THEN "QA" WHEN legajo >= 103 THEN "Desarrolladores" ELSE "No catalogado" END 
FROM 
  empleados 
ORDER by 
  1;
/*------------------------------------------*/
SELECT 
  apellido, 
  cp, 
  domicilio, 
  sección 
FROM 
  empleados 
ORDER BY 
  (
    CASE WHEN sección IS NULL THEN apellido ELSE cp END
  );
/*------------------------------------------*/
SELECT 
  legajo, 
  apellido, 
  IF(
    legajo > 104, "Desarrollador", "Líder"
  ) 
FROM 
  empleados;
/*------------------------------------------*/
SELECT 
  legajo, 
  CONCAT(apellido, ', ', nombre) AS "apellido, nombre" 
FROM 
  empleados;

SELECT 
  CONCAT_WS(', ', legajo, apellido, nombre) AS "legajo, apellido, nombre" 
FROM 
  empleados;
/*------------------------------------------*/
SELECT 
  SUBSTRING('Quadratically', 5, 6) 
  /* ratica */
  
/*------------------------------------------*/
/* Ejemplos uso de funciones fechas y horas */ 
SELECT 
  CURDATE(), 
  CURTIME(), 
  date(
    CURDATE()
  );
/*------------------------------------------*/
/* Adicionar un intervalo de tiempo  */
SELECT 
  DATE_ADD('2018-05-01', INTERVAL 1 DAY);

SELECT 
  DATE_ADD(
    CURDATE(), 
    INTERVAL 1 DAY
  );

SELECT 
  DATE_SUB('2018-05-01', INTERVAL 1 YEAR);

SELECT 
  DATE_ADD(
    '2020-12-31 23:59:59', INTERVAL 1 SECOND
  );

SELECT 
  DATE_ADD(
    '2100-12-31 23:59:59', INTERVAL '1:1' MINUTE_SECOND
  );

SELECT 
  DATE_SUB(
    '2025-01-01 00:00:00', INTERVAL '1 1:1:1' DAY_SECOND
  );

SELECT 
  DATE_ADD(
    '1900-01-01 00:00:00', INTERVAL '-1 10' DAY_HOUR
  );

SELECT 
  DATE_SUB('1998-01-02', INTERVAL 31 DAY);

SELECT 
  DATE_ADD(
    '1992-12-31 23:59:59.000002', INTERVAL '1.999999' SECOND_MICROSECOND
  );

/* Mostrar los legajos y hora de entrada y salida en formato de HH:MM */
SELECT 
  legajo, 
  TIME_FORMAT(horaentrada, '%H:%i'), 
  TIME_FORMAT(horasalida, '%H:%i') 
FROM 
  `hs_trabajadas` 

/* Obtener la cantidad total de horas trabajadas por cada empleado */
SELECT 
  legajo, 
  SUM(
    TIME_FORMAT(horasalida - horaentrada, '%H:%i')
  ) 
FROM 
  `hs_trabajadas` 
GROUP by 
  legajo;
