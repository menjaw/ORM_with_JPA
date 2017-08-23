/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Menja
 * Created: 21-08-2017
 */
USE jpabasic_firstday;

TRUNCATE TABLE book;
INSERT INTO book (ID, PRICE, TITLE) VALUES (0, 456.55 , "FoodStuff");
INSERT INTO book (ID, PRICE, TITLE) VALUES (0, 722.55 , "Coding");
INSERT INTO book (ID, PRICE, TITLE) VALUES (0, 96.55 , "Training");
INSERT INTO book (ID, PRICE, TITLE) VALUES (0, 712.55 , "Animals");
INSERT INTO book (ID, PRICE, TITLE) VALUES (0, 24.55 , "Nature");
INSERT INTO book (ID, PRICE, TITLE) VALUES (0, 34.55 , "Nike");
INSERT INTO book (ID, PRICE, TITLE) VALUES (0, 52.55 , "Casall");
INSERT INTO book (ID, PRICE, TITLE) VALUES (0, 71.55 , "Biger Mikkelsen");
INSERT INTO book (ID, PRICE, TITLE) VALUES (0, 29.55 , "Lenovo computers");
INSERT INTO book (ID, PRICE, TITLE) VALUES (0, 139.55 , "HP computers");
INSERT INTO book (ID, PRICE, TITLE) VALUES (0, 820.55 , "Audi TT");


TRUNCATE TABLE customer;
INSERT INTO customer (ID, FIRSTNAME, LASTNAME) VALUES (0, "Frida", "FoodStuff");
INSERT INTO customer (ID, FIRSTNAME, LASTNAME) VALUES (0, "Cecilie", "Citronmåne");
INSERT INTO customer (ID, FIRSTNAME, LASTNAME) VALUES (0, "Viggo", "Fidusen");
INSERT INTO customer (ID, FIRSTNAME, LASTNAME) VALUES (0, "Lærke", "Lykketå");
INSERT INTO customer (ID, FIRSTNAME, LASTNAME) VALUES (0, "Sigurd", "Suppesteg");
INSERT INTO customer (ID, FIRSTNAME, LASTNAME) VALUES (0, "Mynte", "Mønt");