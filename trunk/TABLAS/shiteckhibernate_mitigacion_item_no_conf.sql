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
-- Table structure for table `mitigacion_item_no_conf`
--

DROP TABLE IF EXISTS `mitigacion_item_no_conf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mitigacion_item_no_conf` (
  `idmitigacion_item_no_conf` bigint(20) NOT NULL,
  `fecha_prometida_mitigacion` date DEFAULT NULL,
  `fecha_cumplida_mitigacion` date DEFAULT NULL,
  `nro_item_no_conf` int(11) DEFAULT NULL,
  `nro_categoria_item_no_conf` int(11) DEFAULT NULL,
  `esta_cumplido` varchar(45) DEFAULT 'NO',
  `cliente_depto_nro` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idmitigacion_item_no_conf`),
  KEY `MITIGACIONITEMNOCONF_ITEMNOCONF` (`nro_item_no_conf`),
  KEY `MITIGACIONITEMNOCONF` (`nro_categoria_item_no_conf`),
  KEY `MITIG_CATEGORIAITEM` (`nro_categoria_item_no_conf`),
  KEY `fk_mitigacion_item_no_conf_cliente1` (`cliente_depto_nro`),
  CONSTRAINT `fk_mitigacion_item_no_conf_cliente1` FOREIGN KEY (`cliente_depto_nro`) REFERENCES `cliente` (`idCliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `MITIGACIONITEMNOCONF_ITEMNOCONF` FOREIGN KEY (`nro_item_no_conf`) REFERENCES `itemnoconf` (`nroItem`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `MITIG_CATEGORIAITEM` FOREIGN KEY (`nro_categoria_item_no_conf`) REFERENCES `categoriaplanilla351` (`idcategoria`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mitigacion_item_no_conf`
--

LOCK TABLES `mitigacion_item_no_conf` WRITE;
/*!40000 ALTER TABLE `mitigacion_item_no_conf` DISABLE KEYS */;
INSERT INTO `mitigacion_item_no_conf` VALUES (1,'2014-04-27',NULL,1,1,'NO','20-28737766-61234'),(2,'2014-09-24',NULL,1,1,'NO','20-28737766-61234');
/*!40000 ALTER TABLE `mitigacion_item_no_conf` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-04-27  5:15:44
