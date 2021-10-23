INSERT INTO categorias (id, nome) VALUES (1, 'Alimento');
INSERT INTO categorias (id, nome) VALUES (2, 'Cosméticos');
INSERT INTO categorias (id, nome) VALUES (3, 'Remédios');

INSERT INTO produtos (id, nome, preco) VALUES (1, 'Ração', 100.0);
INSERT INTO produtos (id, nome, preco) VALUES (2, 'Sache', 80.0);
INSERT INTO produtos (id, nome, preco) VALUES (3, 'Shampoo', 50.0);
INSERT INTO produtos (id, nome, preco) VALUES (4, 'Vermifugo', 20.0);

INSERT INTO produto_categoria (id_produto, id_categoria) VALUES (1,1);
INSERT INTO produto_categoria (id_produto, id_categoria) VALUES (2,1);
INSERT INTO produto_categoria (id_produto, id_categoria) VALUES (3,2);
INSERT INTO produto_categoria (id_produto, id_categoria) VALUES (4,3);