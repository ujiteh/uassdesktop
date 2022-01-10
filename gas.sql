-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 10, 2022 at 09:22 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gas`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `idb` int(18) NOT NULL,
  `type` varchar(255) NOT NULL,
  `stock` int(255) NOT NULL,
  `hargasatuan` int(255) NOT NULL,
  `hargatotal` int(255) NOT NULL,
  `tanggal` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`idb`, `type`, `stock`, `hargasatuan`, `hargatotal`, `tanggal`) VALUES
(1, '3 kg', 5, 5, 5, '2022-01-10'),
(2, '5,5 kg', 5, 5, 5, '2022-01-10'),
(3, '5,5 kg', 4, 5, 6, '2022-01-10'),
(4, '5,5 kg', 10, 5, 5, '2022-01-10'),
(5, '5,5 kg', 20, 5, 5, '2022-01-10'),
(6, '12 kg', 1, 3, 3, '2022-01-10'),
(7, '12 kg', 5, 56, 6, '2022-01-10'),
(8, '3 kg', 4, 19, 3, '2022-01-10'),
(9, '5,5 kg', 25, 3423, 5325, '2022-01-10'),
(10, '12 kg', 2, 15, 23, '2022-01-10'),
(11, '3 kg', 23, 151, 515, '2022-01-10'),
(12, '12 kg', 2, 43, 434, '2022-01-10'),
(13, '12 kg', 23, 43, 434, '2022-01-10'),
(14, '5,5 kg', 5, 10, 10, '2022-01-10'),
(15, '5,5 kg', 3, 3, 3, '2022-01-10'),
(16, '5,5 kg', 4, 3, 3, '2022-01-10'),
(17, '5,5 kg', 2, 3, 3, '2022-01-10'),
(18, '5,5 kg', 5, 23, 34, '2022-01-10'),
(19, '5,5 kg', 5, 33, 33, '2022-01-10'),
(20, '5,5 kg', 3, 4, 4, '2022-01-10'),
(21, '3 kg', 3, 2, 2, '2022-01-10'),
(22, '12 kg', 2, 3, 3, '2022-01-10'),
(23, '3 kg', 4, 55, 55, '2022-01-10'),
(24, '3 kg', 5, 55, 55, '2022-01-10'),
(25, '3 kg', 5, 4, 4, '2022-01-10'),
(26, '3 kg', 5, 4, 4, '2022-01-10'),
(27, '3 kg', 4, 4, 4, '2022-01-10'),
(28, '3 kg', 45, 4, 4, '2022-01-10'),
(29, '3 kg', 43, 4, 4, '2022-01-10'),
(30, '5,5 kg', 3, 4, 4, '2022-01-10'),
(31, '3 kg', 5, 777, 778, '2022-01-10'),
(32, '3 kg', 3, 3, 3, '2022-01-10'),
(33, '3 kg', 3, 3, 3, '2022-01-10'),
(34, '3 kg', 4, 444, 444, '2022-01-10'),
(35, '12 kg', 5, 3000, 4444, '2022-01-10'),
(36, '5,5 kg', 6, 4000, 4000, '2022-01-10'),
(37, '5,5 kg', 12, 66666, 66666, '2022-01-10'),
(38, '3 kg', 10, 5000, 6000, '2022-01-10'),
(39, '5,5 kg', 3, 44, 44, '2022-01-10'),
(40, '12 kg', 5, 5000, 6000, '2022-01-10'),
(41, '12 kg', 15, 5000, 500, '2022-01-10'),
(42, '5,5 kg', 5, 5555, 555, '2022-01-10'),
(43, '5,5 kg', 7, 55, 66, '2022-01-10');

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `ids` int(11) NOT NULL,
  `type` varchar(255) NOT NULL,
  `stock` varchar(255) NOT NULL,
  `harga` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`ids`, `type`, `stock`, `harga`) VALUES
(3, '3 kg', '20', '20000'),
(4, '5,5 kg', '10', '76000'),
(5, '12 kg', '30', '163000');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `ID` int(18) NOT NULL,
  `namauser` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `hakakses` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`idb`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`ids`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `idb` int(18) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT for table `stock`
--
ALTER TABLE `stock`
  MODIFY `ids` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `ID` int(18) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
