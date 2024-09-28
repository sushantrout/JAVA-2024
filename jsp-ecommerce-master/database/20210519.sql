-- PostgreSQL dump for ecommerce_cart database

-- Table structure for table `orders`

DROP TABLE IF EXISTS orders;
CREATE TABLE orders (
  o_id serial PRIMARY KEY,
  p_id int NOT NULL,
  u_id int NOT NULL,
  o_quantity int NOT NULL,
  o_date varchar(450) NOT NULL
);

-- Dumping data for table `orders`

INSERT INTO orders (o_id, p_id, u_id, o_quantity, o_date) 
VALUES (25, 3, 1, 3, '2021-05-15'), 
       (26, 2, 1, 1, '2021-05-15');

-- Table structure for table `products`

DROP TABLE IF EXISTS products;
CREATE TABLE products (
  id serial PRIMARY KEY,
  name varchar(450) NOT NULL,
  category varchar(450) NOT NULL,
  price double precision NOT NULL,
  image varchar(450) NOT NULL
);

-- Dumping data for table `products`

INSERT INTO products (id, name, category, price, image) 
VALUES (1, 'New Arrival Femal Shoes', 'Female Shoes', 120, 'female-shoes.jpg'), 
       (2, 'Ladies Pure PU Shoulder Bag', 'Ladis Bag', 69.99, 'ladis-bag.jpg'), 
       (3, 'Stylish Men Office Suits', 'Men Clothes', 169, 'men-suits.jpg'), 
       (4, 'Jaeger-LeCoultre Men Watch', 'Men Watch', 2500.99, 'men-watch.jpg'), 
       (5, 'FreeMax e-cigarettes VB-456', 'E-Cigarattes', 310, 'smoking-e-cigarette.jpg'), 
       (6, 'GeekVapee e-cigarattes MM-632', 'E-Cigarattes', 555.5, 'smoking-e-cigarette-2.jpg');

-- Table structure for table `users`

DROP TABLE IF EXISTS users;
CREATE TABLE users (
  id serial PRIMARY KEY,
  name varchar(250) NOT NULL,
  email varchar(250) NOT NULL UNIQUE,
  password varchar(250) NOT NULL
);

-- Dumping data for table `users`

INSERT INTO users (id, name, email, password) 
VALUES (1, 'Almamun', 'almamun@mail.com', '123456');
