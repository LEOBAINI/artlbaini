CREATE DATABASE  IF NOT EXISTS `shiteckhibernate` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `shiteckhibernate`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: shiteckhibernate
-- ------------------------------------------------------
-- Server version	5.5.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `como_mitigar`
--

DROP TABLE IF EXISTS `como_mitigar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `como_mitigar` (
  `idcomo_mitigar` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(2000) DEFAULT NULL,
  `descripcionFotoBien` varchar(2000) DEFAULT NULL,
  `foto` longblob COMMENT 'Es la foto de lo que hay que corregir',
  `fotoBien` longblob,
  `cliente_depto` varchar(45) DEFAULT NULL COMMENT 'Es el nro de depto, cada cliente tiene muchos deptos.',
  `id_item_no_conf` bigint(20) DEFAULT NULL COMMENT 'fk idmitigacion_item_no_conf de la tabla mitigacion_item_no_conf',
  `cumplido` varchar(45) DEFAULT 'NO',
  `fechaCumplido` date DEFAULT NULL,
  PRIMARY KEY (`idcomo_mitigar`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1 COMMENT='Son todos los sub items de un ítem asociados a un departamen';
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-04-11  4:24:54
