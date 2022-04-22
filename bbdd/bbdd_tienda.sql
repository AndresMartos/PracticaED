-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-04-2022 a las 11:00:22
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `trab_final_tienda`
--
CREATE DATABASE IF NOT EXISTS `trab_final_tienda` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `trab_final_tienda`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE IF NOT EXISTS `productos` (
  `nombre` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `cantidad` int(5) NOT NULL,
  `precio` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`nombre`, `cantidad`, `precio`) VALUES
('Ajo', 9999, 8),
('Cebolla', 9999, 7),
('Dionaea', 9999, 5),
('Guantes de tela', 9999, 13),
('Margarita', 9999, 2),
('Nepenthes', 9999, 15),
('Poto', 9999, 5),
('Regadera 2L', 9999, 5),
('Regadera 6L', 9999, 10),
('Regadera 8L', 9999, 20),
('Rosa', 9999, 10),
('Semillas de Calabacin', 9999, 10),
('Semillas de Fresa', 9999, 10),
('Semillas de Pepino', 9999, 10),
('Semillas de Tomate', 9999, 10),
('Semillas de Zanahoria', 9999, 10),
('Semillero natural', 9999, 6),
('Sustrato comum 3,5L', 9999, 10),
('Sustrato de coco 1,5L', 9999, 2),
('Sustrato Dionaea 5,5L', 9999, 25);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `nameuser` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `password` varchar(200) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`nameuser`, `password`) VALUES
('lolaindigo', 'latienesdura@#'),
('pepe_quintana99', 'rutadelbakalaonadamas@');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
