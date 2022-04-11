-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-04-2022 a las 20:39:29
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tiendaed`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `nombre` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `cantidad` int(5) NOT NULL,
  `precio` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`nombre`, `cantidad`, `precio`) VALUES
('Ajo', 45, 8),
('Cebolla', 98, 7),
('Dionaea', 99, 5),
('Guantes de tela', 123, 13),
('Margarita', 56, 2),
('Nepenthes', 86, 15),
('Poto', 20, 5),
('Regadera 2L', 100, 5),
('Regadera 6L', 100, 10),
('Regadera 8L', 100, 20),
('Rosa', 10, 10),
('Semillas de Calabacin', 200, 10),
('Semillas de Fresa', 200, 10),
('Semillas de Pepino', 200, 10),
('Semillas de Tomate', 98, 10),
('Semillas de Zanahoria', 200, 10),
('Semillero natural', 100, 6),
('Sustrato comum 3,5L', 300, 10),
('Sustrato de coco 1,5L', 140, 2),
('Sustrato Dionaea 5,5L', 300, 25);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
