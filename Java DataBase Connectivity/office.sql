-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 28, 2021 at 10:32 AM
-- Server version: 10.4.16-MariaDB
-- PHP Version: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `office`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `regId` varchar(30) NOT NULL,
  `fName` text NOT NULL,
  `lName` text NOT NULL,
  `Password` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`regId`, `fName`, `lName`, `Password`) VALUES
('', '', '', ''),
('Adil009', 'Adil', 'Tahir', 'fghd5'),
('BSMIT-F21-196', 'Saqib', 'Javed', '123456saqib'),
('F12-6789', 'Muhammad', 'Shabbeer', '31102021'),
('FA19-BSE-011', 'Ali', 'Tahir', '123456'),
('FA19-BSE-099', 'Ali', 'Raza', '990ali'),
('FA20-BEE-137', 'Nauman', 'Ali', 'nauman'),
('SP20-BSE-002', 'Ali', 'Zain', '123456'),
('SP20-BSE-012', 'Mati ul', 'Rehman', 'Mati123'),
('SP20-BSE-040', 'Hammad', 'Ahmad', '12345'),
('SP20-BSE-042', 'Mati ul', 'Rehman', '12345'),
('SP20-BSE-089', 'Mati ul', 'Rehman', 'fhg');

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `employee_id` varchar(30) NOT NULL,
  `fName` text NOT NULL,
  `lName` text NOT NULL,
  `designation` text NOT NULL,
  `salary` mediumint(50) NOT NULL,
  `doj` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`employee_id`, `fName`, `lName`, `designation`, `salary`, `doj`) VALUES
('asd123', 'Ahmad', 'Ali', 'Manager', 1234567, '2021-11-10'),
('f12em', 'Saqib', 'Javed', 'Associate', 12000, '2021-01-13'),
('gh234', 'Ali', 'Tahir', 'Associate', 12345, '2021-11-12'),
('mo2345', 'Muhammad', 'Ali', 'Manager', 12345, '2021-11-10');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`regId`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`employee_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
