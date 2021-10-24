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

INSERT INTO pessoa (id, codigo_nacional, email, nome) VALUES (1, '123.456.789-10', 'josepaulo@email.com', 'Jose Paulo');
INSERT INTO cliente (id, tipo) VALUES (1, 'Física');

INSERT INTO pessoa (id, codigo_nacional, email, nome) VALUES (2, '123.456.789-10', 'paulandrade@email.com', 'Paula Andrade');
INSERT INTO cliente (id, tipo) VALUES (2, 'Jurídica');

INSERT INTO pessoa (id, codigo_nacional, email, nome) VALUES (3, '123.456.789-10', 'sandro@email.com', 'Sandro Nogueira');
INSERT INTO funcionario (id, funcao) VALUES (3, 'Gerente');

INSERT INTO pessoa (id, codigo_nacional, email, nome) VALUES (4, '123.456.789-10', 'Andre@email.com', 'Andre Saulo');
INSERT INTO funcionario (id, funcao) VALUES (4, 'Balconista');

INSERT INTO telefones (id_pessoa, telefones) VALUES (1, '96385-8963');
INSERT INTO telefones (id_pessoa, telefones) VALUES (2, '98547-9657');
INSERT INTO telefones (id_pessoa, telefones) VALUES (3, '98725-8489');
INSERT INTO telefones (id_pessoa, telefones) VALUES (4, '98747-5934');

INSERT INTO endereco (id, bairro, cep, complemento, logradouro, numero, id_cidade, id_pessoa) VALUES (1, 'Pindorama', '258963478', 'Apto 1589', 'Rua Tupis', '366', 1, 1);
INSERT INTO endereco (id, bairro, cep, complemento, logradouro, numero, id_cidade, id_pessoa) VALUES (2, 'Moca', '258963478', 'Apto 963', 'Rua Moca', '789', 3, 2);
INSERT INTO endereco (id, bairro, cep, complemento, logradouro, numero, id_cidade, id_pessoa) VALUES (3, 'Jardins', '258963478', 'Apto 987', 'Rua Jardins', '369', 3, 3);
INSERT INTO endereco (id, bairro, cep, complemento, logradouro, numero, id_cidade, id_pessoa) VALUES (4, 'Olaria', '897456358', 'Apto 1001', 'Rua Olaria', '500', 3, 4);

INSERT INTO servico (id, data_entrada, data_saida, descricao, id_cliente, id_funcionario, id_pet) VALUES (1, '2021-08-10', '2021-08-10', 'Tosa', 1,4,1);
INSERT INTO servico (id, data_entrada, data_saida, descricao, id_cliente, id_funcionario, id_pet) VALUES (2, '2021-08-10', '2021-08-12', 'Hotel', 2,4,2);
INSERT INTO servico (id, data_entrada, data_saida, descricao, id_cliente, id_funcionario, id_pet) VALUES (3, '2021-08-10', '2021-08-10', 'Vermifugação', 2,4,3);

INSERT INTO pagamento (situacao, valor, id_servico) VALUES (1, 60.0,1);
INSERT INTO pagamento (situacao, valor, id_servico) VALUES (3, 120.0,2);
INSERT INTO pagamento (situacao, valor, id_servico) VALUES (3, 70.0,3);

INSERT INTO pagamento_cartao (parcelas, id_servico) VALUES (2,2);
INSERT INTO pagamento_dinheiro (data_pagamento, desconto, id_servico) VALUES ('2021-08-10', 15.0, 1);
INSERT INTO pagamento_dinheiro (data_pagamento, desconto, id_servico) VALUES ('2021-08-10', 15.0, 3);

INSERT INTO servico_produto (id_servico, id_produto) VALUES (3,4);
INSERT INTO servico_produto (id_servico, id_produto) VALUES (2,2);
INSERT INTO servico_produto (id_servico, id_produto) VALUES (2,3);
INSERT INTO servico_produto (id_servico, id_produto) VALUES (1,2);