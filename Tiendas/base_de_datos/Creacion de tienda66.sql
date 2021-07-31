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

CREATE TABLE VentasProductos (
	idVentasProductos INTEGER,
	cantidad INTEGER,
	idProducto INTEGER,
	idVentas TEXT(5),
	CONSTRAINT VentasProductos_PK PRIMARY KEY (idVentasProductos),
	CONSTRAINT VentasProductos_FK FOREIGN KEY (idProducto) REFERENCES Productos(codigoBarras),
	CONSTRAINT VentasProductos_FK_1 FOREIGN KEY (idVentas) REFERENCES Ventas(codigoVent)
);
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