INSERT INTO menu_group (id, name) VALUES (1, '두마리메뉴');
INSERT INTO menu_group (id, name) VALUES (2, '한마리메뉴');
INSERT INTO menu_group (id, name) VALUES (3, '순살파닭두마리메뉴');
INSERT INTO menu_group (id, name) VALUES (4, '신메뉴');

INSERT INTO product (id, name, price) VALUES (1, '후라이드', 16000);
INSERT INTO product (id, name, price) VALUES (2, '양념치킨', 16000);
INSERT INTO product (id, name, price) VALUES (3, '반반치킨', 16000);
INSERT INTO product (id, name, price) VALUES (4, '통구이', 16000);
INSERT INTO product (id, name, price) VALUES (5, '간장치킨', 17000);
INSERT INTO product (id, name, price) VALUES (6, '순살치킨', 17000);

INSERT INTO menu (id, name, price, menu_group_id) VALUES (1, '후라이드치킨', 16000, 2);
INSERT INTO menu (id, name, price, menu_group_id) VALUES (2, '양념치킨', 16000, 2);
INSERT INTO menu (id, name, price, menu_group_id) VALUES (3, '반반치킨', 16000, 2);
INSERT INTO menu (id, name, price, menu_group_id) VALUES (4, '통구이', 16000, 2);
INSERT INTO menu (id, name, price, menu_group_id) VALUES (5, '간장치킨', 17000, 2);
INSERT INTO menu (id, name, price, menu_group_id) VALUES (6, '순살치킨', 17000, 2);

INSERT INTO menu_product (menu_id, product_id, quantity) VALUES (1, 1, 1);
INSERT INTO menu_product (menu_id, product_id, quantity) VALUES (2, 2, 1);
INSERT INTO menu_product (menu_id, product_id, quantity) VALUES (3, 3, 1);
INSERT INTO menu_product (menu_id, product_id, quantity) VALUES (4, 4, 1);
INSERT INTO menu_product (menu_id, product_id, quantity) VALUES (5, 5, 1);
INSERT INTO menu_product (menu_id, product_id, quantity) VALUES (6, 6, 1);

INSERT INTO table_group (id, created_date) VALUES (1, now());
INSERT INTO table_group (id, created_date) VALUES (2, now());

INSERT INTO order_table (id, table_group_id, number_of_guests, empty) VALUES (1, 1, 0, false);
INSERT INTO order_table (id, table_group_id, number_of_guests, empty) VALUES (2, 1, 0, false);
INSERT INTO order_table (id, number_of_guests, empty) VALUES (3, 0, true);
INSERT INTO order_table (id, number_of_guests, empty) VALUES (4, 0, true);
INSERT INTO order_table (id, number_of_guests, empty) VALUES (5, 0, true);
INSERT INTO order_table (id, number_of_guests, empty) VALUES (6, 0, true);
INSERT INTO order_table (id, number_of_guests, empty) VALUES (7, 0, true);
INSERT INTO order_table (id, number_of_guests, empty) VALUES (8, 0, true);

INSERT INTO order_table (id, table_group_id, number_of_guests, empty) VALUES (9, 2, 4, false);
INSERT INTO order_table (id, table_group_id, number_of_guests, empty) VALUES (10, 2, 8, false);
INSERT INTO order_table (id, number_of_guests, empty) VALUES (11, 2, false);
INSERT INTO order_table (id, number_of_guests, empty) VALUES (12, 2, false);

INSERT INTO orders (id, order_table_id, order_status, ordered_time) VALUES (1, 9, 'COOKING', now());
INSERT INTO orders (id, order_table_id, order_status, ordered_time) VALUES (2, 10, 'MEAL', now());
INSERT INTO orders (id, order_table_id, order_status, ordered_time) VALUES (3, 11, 'COMPLETION', now());

INSERT INTO order_line_item (seq, order_id, menu_id, quantity) VALUES (1, 1, 3, 1);
INSERT INTO order_line_item (seq, order_id, menu_id, quantity) VALUES (2, 2, 1, 1);
INSERT INTO order_line_item (seq, order_id, menu_id, quantity) VALUES (3, 2, 2, 1);
INSERT INTO order_line_item (seq, order_id, menu_id, quantity) VALUES (4, 3, 6, 1);
