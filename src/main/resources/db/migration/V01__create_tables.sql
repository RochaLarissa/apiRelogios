CREATE TABLE `relogios` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `detalhes` varchar(255) DEFAULT NULL,
  `img_url` varchar(10000) DEFAULT NULL,
  `preco` double NOT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
