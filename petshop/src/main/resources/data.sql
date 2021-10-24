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

INSERT INTO especie (id, descricao) VALUES (1, 'Cachorro');
INSERT INTO especie (id, descricao) VALUES (2, 'Gato');

INSERT INTO raca (id, descricao) VALUES (1,'Shitzu');
INSERT INTO raca (id, descricao) VALUES (2,'Akita');
INSERT INTO raca (id, descricao) VALUES (3,'Persa');

INSERT INTO pet (id, nome, idade, id_especie, id_raca) VALUES (1, 'Jhon', 6, 1, 1);
INSERT INTO pet (id, nome, idade, id_especie, id_raca) VALUES (2, 'Hana', 5, 1, 2);
INSERT INTO pet (id, nome, idade, id_especie, id_raca) VALUES (3, 'Mel', 8, 2, 3);

INSERT INTO estado (id, nome) VALUES (1, 'Minas Gerais');
INSERT INTO estado (id, nome) VALUES (2, 'São Paulo');

INSERT INTO cidade (id, nome, id_estado) VALUES (1, 'Belo Horizonte', 1);
INSERT INTO cidade (id, nome, id_estado) VALUES (2, 'Capelinha', 1);
INSERT INTO cidade (id, nome, id_estado) VALUES (3, 'São Paulo', 2);
