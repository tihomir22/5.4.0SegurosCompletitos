-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-01-2019 a las 20:29:47
-- Versión del servidor: 10.1.29-MariaDB
-- Versión de PHP: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `seguros`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asistenciamedica`
--

CREATE TABLE `asistenciamedica` (
  `IdAsistenciaMedica` int(10) NOT NULL,
  `IdSeguro` int(10) DEFAULT NULL,
  `breveDescripcion` varchar(255) DEFAULT NULL,
  `lugar` varchar(255) DEFAULT NULL,
  `explicacion` text,
  `TipoAsistencia` varchar(50) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `importe` decimal(10,2) DEFAULT NULL,
  `idx` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `asistenciamedica`
--

INSERT INTO `asistenciamedica` (`IdAsistenciaMedica`, `IdSeguro`, `breveDescripcion`, `lugar`, `explicacion`, `TipoAsistencia`, `fecha`, `hora`, `importe`, `idx`) VALUES
(2323, 437, 'Suelta el torpedo loco', 'Mi casa', 'La palmas loco', 'Funeral', '2019-01-23', '18:39:27', '1000.00', 2),
(2324, 438, 'Suelta el torpedo loco', 'Mi casa', 'La palmas loco', 'Funeral', '2019-01-23', '18:49:56', '1000.00', 2),
(2326, 437, 'Suelta el torpedo loco', 'Mi casa', 'La palmas loco', 'Domiciliaria', '2019-01-23', '19:16:11', '1000.00', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seguro`
--

CREATE TABLE `seguro` (
  `idSeguro` int(11) NOT NULL,
  `nif` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `ape1` varchar(255) DEFAULT NULL,
  `ape2` varchar(255) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `sexo` int(11) DEFAULT NULL,
  `casado` tinyint(1) DEFAULT NULL,
  `numHijos` int(11) DEFAULT NULL,
  `embarazada` tinyint(1) DEFAULT NULL,
  `oftalmologia` tinyint(1) DEFAULT NULL,
  `dental` tinyint(1) DEFAULT NULL,
  `fecundacionInVitro` tinyint(1) DEFAULT NULL,
  `corazon` tinyint(1) DEFAULT NULL,
  `estomacal` tinyint(1) DEFAULT NULL,
  `rinyones` tinyint(1) DEFAULT NULL,
  `alergia` tinyint(1) DEFAULT NULL,
  `nombreAlergia` varchar(255) DEFAULT NULL,
  `fechaCreacion` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `seguro`
--

INSERT INTO `seguro` (`idSeguro`, `nif`, `nombre`, `ape1`, `ape2`, `edad`, `sexo`, `casado`, `numHijos`, `embarazada`, `oftalmologia`, `dental`, `fecundacionInVitro`, `corazon`, `estomacal`, `rinyones`, `alergia`, `nombreAlergia`, `fechaCreacion`) VALUES
(437, 'X34543643', 'TIHOMIR', 'STOYCHEV', 'STOYCHEV', 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 'Ninguna alergia', '2019-01-23 19:16:11'),
(438, 'X34543643', 'TIHOMIR', 'STOYCHEV', 'STOYCHEV', 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 'Ninguna alergia', '2019-01-23 18:49:56');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asistenciamedica`
--
ALTER TABLE `asistenciamedica`
  ADD PRIMARY KEY (`IdAsistenciaMedica`),
  ADD KEY `IdSeguro` (`IdSeguro`);

--
-- Indices de la tabla `seguro`
--
ALTER TABLE `seguro`
  ADD PRIMARY KEY (`idSeguro`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asistenciamedica`
--
ALTER TABLE `asistenciamedica`
  MODIFY `IdAsistenciaMedica` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2327;

--
-- AUTO_INCREMENT de la tabla `seguro`
--
ALTER TABLE `seguro`
  MODIFY `idSeguro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=439;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asistenciamedica`
--
ALTER TABLE `asistenciamedica`
  ADD CONSTRAINT `asistenciamedica_ibfk_1` FOREIGN KEY (`IdSeguro`) REFERENCES `seguro` (`idSeguro`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
