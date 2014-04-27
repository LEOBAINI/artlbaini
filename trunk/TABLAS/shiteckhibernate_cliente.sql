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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `idCliente` varchar(50) NOT NULL COMMENT 'es cuit empresa concat depto nro',
  `nombre` varchar(45) DEFAULT NULL,
  `departamento_nro` varchar(45) DEFAULT NULL COMMENT 'cuil emp/numeroxxx',
  `eMail` varchar(60) DEFAULT NULL,
  `domicilio` varchar(100) DEFAULT NULL,
  `superficie` double DEFAULT NULL,
  `provincia` varchar(100) DEFAULT NULL,
  `cp_cpa` int(11) DEFAULT NULL,
  `empresa_cuit` varchar(45) DEFAULT NULL,
  `telefono` varchar(100) DEFAULT NULL,
  `tipo_zona` varchar(50) DEFAULT NULL,
  `CertificadoMunicTipoZona` varchar(500) DEFAULT NULL,
  `localidad` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idCliente`),
  KEY `EMP_CLI` (`empresa_cuit`),
  CONSTRAINT `fk_cliente_empresa1` FOREIGN KEY (`empresa_cuit`) REFERENCES `empresa` (`cuit_cuip`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Referido al departamento de la empresa.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('20-28737766-61234','CASA CENTRAL','1234','LEOBAINI@HOTMAIL.COM','QUINTANA 3383',12546,'BS AS',1646,'20-28737766-6','11-5949-3113','Zona Residencial exclusiva','D:\\Desktop\\DocsSheteck\\2014-04-19LB SISTEMASDPnro20-28737766-61AU1111.pdf','VIRREYES');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-04-27  5:15:47
