--RF10

-- Cliente
--Sentencia 1
SELECT cliente.id, cliente.direccion,cliente.tipoid, cliente.relacionuniandes, cliente.nombre
from CLIENTE, reservas 
WHERE reservas.idcliente=cliente.id 
AND reservas.fechainicial >= '5-MAY-2019' 
AND reservas.fechafinal <='31-JUL-2020'
;



-- oferta
SELECT  cliente.id, cliente.tipoid,cliente.direccion,cliente.relacionuniandes,cliente.nombre
from CLIENTE, oferta, reservas 
WHERE reservas.ofertaid=oferta.numoferta
AND reservas.idcliente=cliente.id
AND reservas.fechainicial >= '5-MAY-2019'  
AND reservas.fechafinal <='31-JUL-2020' 

;

--Tipo de alojamiento

SELECT cliente.id, cliente.tipoid,cliente.direccion,cliente.relacionuniandes,cliente.nombre
FROM OFERTA, CLIENTE, RESERVAS 
WHERE reservas.idcliente=cliente.id
AND oferta.numoferta=reservas.ofertaid
AND oferta.tipolugar='vivienda';

select *from reservas;



--RF11
SELECT *
from
CLIENTE, RESERVAS
WHERE 
reservas.idcliente = cliente.id
AND 
reservas.fechainicial >= '5-MAY-2019' 
AND
reservas.fechafinal <='31-JUL-2020'

;

--RF12

--RF 12
--DATOS OFERTA
SELECT * FROM OFERTA, RESERVAS 
WHERE RESERVAS.OFERTAID=OFERTA.NUMOFERTA 
ORDER BY RESERVAS.CANTIDAD

;

--DATOS OPERADORES 
SELECT operador.id, operador.nombre, operador.tipo 
FROM OPERADOR, GANANCIAOPERADOR 
WHERE OPERADOR.ID= gananciaoperador.idoperador
;




--RF13

--Mes
select * 
from Cliente, reservas, oferta 
WHERE oferta.numoferta=RESERVAS.OFERTAID 
AND RESERVAS.IDCLIENTE=CLIENTE.ID
AND reservas.fechainicial>='1-MAY-2020'
AND reservas.fechaFinal<='31-MAY-2020'
;

--Costoso
SELECT * FROM CLIENTE, OFERTA, RESERVAS 
WHERE oferta.numoferta=RESERVAS.OFERTAID 
AND RESERVAS.IDCLIENTE=CLIENTE.ID 
AND OFERTA.PRECIO>150
;

--Suite
SELECT * FROM CLIENTE, OFERTA, RESERVAS 
WHERE oferta.numoferta=RESERVAS.OFERTAID 
AND RESERVAS.IDCLIENTE=CLIENTE.ID 
AND OFERTA.TIPOLUGAR='suite hotel'
;

select * from oferta;

