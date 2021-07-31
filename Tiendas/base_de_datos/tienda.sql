CREATE TABLE Clientes (
    identificacion varchar(15) PRIMARY KEY,
    nombres varchar(20),
    apellidos varchar(20)   
);

CREATE TABLE Marcas (
	codigoMarca INTEGER,
	nombre TEXT(10),
	CONSTRAINT Marcas_PK PRIMARY KEY (codigoMarca)
);

INSERT INTO Clientes VALUES("378976540", "Diana Carolina", "Reyes Mantilla" );
SELECT nombres FROM Clientes;
SELECT nombres, apellidos FROM Clientes;
SELECT * FROM Clientes; // todo 
INSERT INTO Clientes VALUES ("18521196", "Cesar Fredy", "Gil Mejia");

CREATE TABLE Productos (
	codigoBarrasColumn1 INTEGER,
	nombre varchar(20),
	precio float,
	talla varchar(3),
	color varchar(10),
	idMarca INTEGER,
	CONSTRAINT Productos_PK PRIMARY KEY (codigoBarrasColumn1,idMarca),
	CONSTRAINT Productos_FK FOREIGN KEY (idMarca) REFERENCES Marcas(codigoMarca)
);

CREATE TABLE VentasProductos (
	idVentasProductos INTEGER,
	cantidad INTEGER,
	idProducto INTEGER,
	idVentas TEXT(5),
	CONSTRAINT VentasProductos_PK PRIMARY KEY (idVentasProductos),
	CONSTRAINT VentasProductos_FK FOREIGN KEY (idProducto) REFERENCES Productos(codigoBarras),
	CONSTRAINT VentasProductos_FK_1 FOREIGN KEY (idVentas) REFERENCES Ventas(codigoVent)
);

ALTER TABLE Clientes ADD edad INTEGER; // añadir
ALTER TABLE Clientes DROP COLUMN edad; // borrar el contenido de las columnas de la tablas.
DROP TABLE Productos; // Borra toda la tabla


 
CREATE TABLE Productos (
	codigoBarras INTEGER,
	nombre TEXT(20),
	precio REAL,
	talla TEXT(3),
	color TEXT(10),
	idMarca INTEGER,
	CONSTRAINT Productos_PK PRIMARY KEY (codigoBarras),
	CONSTRAINT Productos_FK FOREIGN KEY (idMarca) REFERENCES Marcas(codigoMarca)
);
CREATE TABLE Ventas (
	codigoVent TEXT(5),
	total REAL,
	idCliente TEXT(15),
	CONSTRAINT Ventas_PK PRIMARY KEY (codigoVent),
	CONSTRAINT Ventas_FK FOREIGN KEY (idCliente) REFERENCES Clientes(identificacion)
);

ALTER TABLE Productos_FK ADD CONSTRAIN FOREIGN KEY (idMarca) REFERENCES Marcas (codigoMarca) // para agregar o construir una KEY FOREIGN
ALTER TABLE VentasProductos RENAME COLUMN idVentas TO idVenta; // para renombrar
SELECT identificacion, nombres AS "nombre de la pesona" FROM Clientes; // modificar nombre de las columnas 
SELECT identificacion, nombres || " " || apellidos AS "Nombre completo" FROM Clientes; // para concatenar
SELECT DISTINCT nombres FROM Clientes; // trae o lsita los cmapos repetidos
SELECT * FROM Clientes WHERE identificacion = "18521196"; // para seleccionar un dato específico Where..... y lo que necesito
SELECT * FROM Clientes WHERE nombres = "Diana"; // trae todos los nombres == a Diana
SELECT * FROM Clientes WHERE nombres = "%Diana%"; // trae todos los nombres que contengan a Diana
SELECT codigoBarras, nombre, talla, color, idMarca, precio FROM Productos WHERE nombre = "Falda"; // para buscar productos dentro de una tabla con click derecho generar SQL y SELECT