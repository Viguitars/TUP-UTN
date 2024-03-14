/* tratamiento de VISTAS */
SELECT * FROM sueldos.vista_e;  /* Muestra el contenido de la vista vista_e */
show create view vista_e;       /* Muestra cómo está creada la vista vista_e */

DROP VIEW NUEVA_VISTA;         /* Elimina la vista NUEVA_VISTA */

Create VIEW NUEVA_VISTA AS     /* Crea la vista NUEVA_VISTA */
SELECT A.legajo,concat_ws(', ',apellido,nombre) as 'Apellido y Nombre',
       fecha, 
       format(monto,2,'de_DE') as 'Monto'
from  legajos L, adelantos A
where  A.legajo = L.legajo;