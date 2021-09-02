/* Populate tabla clientes */
SET IDENTITY_INSERT regiones ON;
INSERT INTO regiones (id, nombre)VALUES (1, 'Sudamerica');
SET IDENTITY_INSERT regiones OFF;
SET IDENTITY_INSERT regiones ON;
INSERT INTO regiones (id, nombre)VALUES (2, 'Centroamerica');
SET IDENTITY_INSERT regiones OFF;
SET IDENTITY_INSERT regiones ON;
INSERT INTO regiones (id, nombre)VALUES (3, 'Norteamerica');
SET IDENTITY_INSERT regiones OFF;
SET IDENTITY_INSERT regiones ON;
SET IDENTITY_INSERT regiones ON;
INSERT INTO regiones (id, nombre)VALUES (4, 'Europa');
SET IDENTITY_INSERT regiones OFF;
SET IDENTITY_INSERT regiones OFF;
SET IDENTITY_INSERT regiones ON;
INSERT INTO regiones (id, nombre)VALUES (5, 'Asia');
SET IDENTITY_INSERT regiones OFF;
SET IDENTITY_INSERT regiones ON;
INSERT INTO regiones (id, nombre)VALUES (6, 'Africa');
SET IDENTITY_INSERT regiones OFF;
SET IDENTITY_INSERT regiones ON;
INSERT INTO regiones (id, nombre)VALUES (7, 'Oceania');
SET IDENTITY_INSERT regiones OFF;
SET IDENTITY_INSERT regiones ON;
INSERT INTO regiones (id, nombre)VALUES (8, 'Antartida');
SET IDENTITY_INSERT regiones OFF;

INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(1, 'Andrés', 'Guzmán', 'profesor@bolsadeideas.com', '2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2, 'Mr. John', 'Doe', 'john.doe@gmail.com', '2018-01-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2018-01-03');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '2018-01-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Erich', 'Gamma', 'erich.gamma@gmail.com', '2018-02-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Richard', 'Helm', 'richard.helm@gmail.com', '2018-02-10');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Ralph', 'Johnson', 'ralph.johnson@gmail.com', '2018-02-18');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'John', 'Vlissides', 'john.vlissides@gmail.com', '2018-02-28');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Dr. James', 'Gosling', 'james.gosling@gmail.com', '2018-03-03');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(5, 'Magma', 'Lee', 'magma.lee@gmail.com', '2018-03-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(6, 'Tornado', 'Roe', 'tornado.roe@gmail.com', '2018-03-05');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(7, 'Jade', 'Doe', 'jane.doe@gmail.com', '2018-03-06');

INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('andres', '$2a$10$NwCzPhP3yhofFUu3iOuU1ulmPhOjEyKao0daDd9kywAwPgG2odUX6', 1, 'Andres', 'Guzman', 'profesor@bolsadeideas.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$goGgRFAr0XuOdXXZ/rOdWOPVTSuryy7KORmK3yXG8SXAIVnoPpaiy', 1, 'John', 'Doe', 'jhon.doe@bolsadeideas.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_Admin');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);