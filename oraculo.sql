-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 18/09/2023 às 04:41
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `oraculo`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `empresa`
--

CREATE TABLE `empresa` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `nomeFantasia` varchar(100) NOT NULL,
  `cpfCnpj` int(30) NOT NULL,
  `rg` varchar(30) NOT NULL,
  `inscricaoEstadual` varchar(20) NOT NULL,
  `inscricaoMunicipal` varchar(20) NOT NULL,
  `sexo` varchar(15) NOT NULL,
  `dataNascimento` varchar(15) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `celular` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `numeroCasa` varchar(10) NOT NULL,
  `cep` varchar(10) NOT NULL,
  `bairro` varchar(30) NOT NULL,
  `cidade` varchar(40) NOT NULL,
  `estado` varchar(5) NOT NULL,
  `complemento` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `produto`
--

CREATE TABLE `produto` (
  `codigo` int(11) NOT NULL,
  `descricaoProduto` varchar(100) NOT NULL,
  `codEan` varchar(10) NOT NULL,
  `codGtin` varchar(40) NOT NULL,
  `unidadeProduto` varchar(10) NOT NULL,
  `marca` varchar(40) NOT NULL,
  `codBarras` varchar(50) NOT NULL,
  `ncm` varchar(10) NOT NULL,
  `cst` varchar(100) NOT NULL,
  `cest` varchar(20) NOT NULL,
  `csosn` varchar(100) NOT NULL,
  `peso` double NOT NULL,
  `ipi` double NOT NULL,
  `custo` double NOT NULL,
  `frete` double NOT NULL,
  `margemLucro` double NOT NULL,
  `outrasDespesas` double NOT NULL,
  `precoVenda` double NOT NULL,
  `desconto` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `produto`
--

INSERT INTO `produto` (`codigo`, `descricaoProduto`, `codEan`, `codGtin`, `unidadeProduto`, `marca`, `codBarras`, `ncm`, `cst`, `cest`, `csosn`, `peso`, `ipi`, `custo`, `frete`, `margemLucro`, `outrasDespesas`, `precoVenda`, `desconto`) VALUES
(1, 'BATERIA 12V', '9145872', '3612578', 'UN', 'PANASONIC', '10025478325', '8957146', '000 - Tributada Integralmente', '25674120', '102 - Tributada pelo Simples Nacional sem permissão de crédito', 0.1, 4, 5, 10, 100, 0, 30, 0);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices de tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `empresa`
--
ALTER TABLE `empresa`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
