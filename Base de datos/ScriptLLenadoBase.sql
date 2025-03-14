
/*Insert especies*/
INSERT INTO ESPECIE (ID_ESPCIE, NOM_ESPECIE) VALUES
('CAN', 'Canino'),
('FEL', 'Felino'),
('AVE', 'Ave');

/*Insert razas*/

INSERT INTO RAZA (ID_RAZA, NOM_RAZA) VALUES
-- Razas de canino
('LAB', 'Labrador Retriever'),
('GSD', 'Pastor Alemán'),
('BUL', 'Bulldog'),
-- Razas de Felino
('SIA', 'Siamés'),
('PER', 'Persa'),
('MAI', 'Maine Coon'),
-- Razas de Ave
('LOR', 'Loro'),
('CAN', 'Canario'),
('PRQ', 'Periquito');


/*Insert sedes*/
INSERT INTO SEDE (ID_SEDE, NOMBRE_SEDE) VALUES
('S001', 'Venecia'),
('S002', 'Molinos'),
('S003', 'Estrada');

/*Insert tipo_vacunas*/
INSERT INTO TIPO_VACUNA (ID_TIPO_VACUNA, TIPO_VACUNA) VALUES
('V001', 'Anual'),
('V002', 'Obligatorio'),
('V003', 'Opcional');

/*Insert Vacunas*/
INSERT INTO VACUNA (ID_VACUNA, ID_TIPO_VACUNA, NOMBRE_VACUNA) VALUES
-- Vacunas para Caninos
('VAC01', 'V001', 'Rabia Canina'),
('VAC02', 'V002', 'Moquillo Canino'),
('VAC03', 'V003', 'Parvovirus'),
-- Vacunas para Felinos
('VAC04', 'V001', 'Rabia Felina'),
('VAC05', 'V002', 'Leucemia Felina'),
('VAC06', 'V003', 'Panleucopenia Felina'),
-- Vacunas para Aves
('VAC07', 'V001', 'Viruela Aviar'),
('VAC08', 'V002', 'Newcastle'),
('VAC09', 'V003', 'Enfermedad de Marek'),
('VAC10', 'V001', 'Bronquitis Infecciosa Aviar');

/*Insert Veterinarios*/
INSERT INTO VETERINARIO (CEDULA_VETERINARIO, NOMBRE_VETERINARIO) VALUES
('1000589723', 'Juan Pérez'),
('1012456789', 'María Gómez'),
('1023456789', 'Carlos Rodríguez'),
('1034567890', 'Ana Martínez'),
('1045678901', 'Luis Fernández');

/*Insert Encargados*/
INSERT INTO ENCARGADO (CEDULA_ENCARGADO, NOMBRE_ENCARGADO, TELEFONO_ENCARGADO) VALUES
('1001589723', 'Henry Ricaurte', '3105678923'),
('1000672789', 'Hanna Valentina', '3156789021'),
('1000456789', 'Sergio Vega', '3207891234'),
('1000567890', 'Andres Prieto', '3009876543'),
('1000678901', 'Lucas clavijo', '3123456789');

/*Insert Especie_raza*/
INSERT INTO ESPECIE_RAZA (ID_RAZA, ID_ESPCIE) VALUES
('LAB', 'CAN'),
('GSD', 'CAN'),
('BUL', 'CAN'),
('SIA', 'FEL'),
('PER', 'FEL'),
('MAI', 'FEL'),
('LOR', 'AVE'),
('CAN', 'AVE'),
('PER', 'AVE');

/*Insert Mascota*/
INSERT INTO MASCOTA (ID_MASCOTA, CEDULA_ENCARGADO, ID_RAZA, ID_ESPCIE, NOMBRE_MASCOTA, EDAD_MASCOTA) VALUES
('M001', '1001589723', 'GSD', 'CAN', 'Pelusa', 5),
('M002', '1000672789', 'LAB', 'CAN', 'Lupe', 3),
('M003', '1000456789', 'SIA', 'FEL', 'Tommy', 2),
('M004', '1000567890', 'LOR', 'AVE', 'Lola', 2);

/*Insert Consulta*/
INSERT INTO CONSULTA (ID_CONSULTA, ID_SEDE, CEDULA_VETERINARIO, ID_VACUNA, FECHA_CONSULTA) VALUES
('C0001', 'S001', '1000589723', 'VAC01', '2024-02-01'),
('C0002', 'S002', '1000589723', 'VAC02', '2025-01-02'),
('C0003', 'S003', '1012456789', 'VAC04', '2023-02-01'),
('C0004', 'S001', '1000589723', 'VAC01', '2024-02-02'),
('C0005', 'S002', '1012456789', 'VAC07', '2021-07-11');

/*Insert Consulta*/
insert into mascota_consulta (id_consulta,id_mascota) values
('C0001','M001'),
('C0002','M001'),
('C0003','M003'),
('C0004','M002'),
('C0005','M004');

