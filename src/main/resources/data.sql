-- Inserción de datos en la tabla CLIENTS
INSERT INTO CLIENT (name, lastname, docnumber) VALUES
('Juan', 'Pérez', '12345678901'),
('Ana', 'Gómez', '10987654321'),
('Carlos', 'Sánchez', '11223344556'),
('María', 'Rodríguez', '98765432100');

-- Inserción de datos en la tabla PRODUCTS
INSERT INTO PRODUCT (description, code, stock, price) VALUES
('Celular Iphone 15 XR PRO', 'IP15XR', 100, 1750.00),
('Celular XIAOMI XTS', 'XIAOMI-XTS', 150, 1150.50),
('Auricular inalámbrico Xiaomi 3t5', 'AURICULAR-XIAOMI', 90, 800.75),
('Carcasa Transparente Iphone 15x', 'CARCA-15X', 200, 70.00);

-- Inserción de datos en la tabla INVOICES
INSERT INTO INVOICE (client_id, created_at, total) VALUES
(1, CURRENT_TIMESTAMP, 1820.50),
(2, CURRENT_TIMESTAMP, 1150.50),
(3, CURRENT_TIMESTAMP, 800.75);

-- Inserción de datos en la tabla INVOICE_DETAILS
INSERT INTO INVOICE_DETAIL (invoice_id, amount, product_id, price, description) VALUES
(1, 1, 1, 1750.00, 'Celular Iphone 15 XR PRO'),
(1, 1, 2, 70.00, 'Carcasa Transparente Iphone 15x'),
(2, 1, 2, 1150.50, 'Celular XIAOMI XTS'),
(3, 1, 3, 800.75, 'Auricular inalámbrico Xiaomi 3t5');