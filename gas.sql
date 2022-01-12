-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 11, 2022 at 04:44 PM
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
-- Table structure for table `pembelian`
--

CREATE TABLE `pembelian` (
  `idb` int(18) NOT NULL,
  `type` varchar(255) NOT NULL,
  `jumlah` int(255) NOT NULL,
  `hargasatuan` int(255) NOT NULL,
  `hargatotal` int(255) NOT NULL,
  `tanggal` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembelian`
--

INSERT INTO `pembelian` (`idb`, `type`, `jumlah`, `hargasatuan`, `hargatotal`, `tanggal`) VALUES
(1, '5,5 kg', 2, 4443, 4442333, '2022-01-11'),
(6, '3 kg', 33333, 444445, 54444, '2022-01-11'),
(9, '3 kg', 412421, 12441241, 421421421, '2022-01-11'),
(10, '12 kg', 421421, 421421, 421421, '2022-01-11'),
(11, '5,5 kg', 2313, 421421, 3213, '2022-01-11');

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `ids` int(11) NOT NULL,
  `type` varchar(255) NOT NULL,
  `stockgas` int(255) NOT NULL,
  `harga` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`ids`, `type`, `stockgas`, `harga`) VALUES
(3, '3 kg', 66, 20000),
(4, '5,5 kg', 200, 76000),
(5, '12 kg', 345, 163000);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `idt` int(11) NOT NULL,
  `namapembeli` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `banyak` int(255) NOT NULL,
  `hargatotal` int(255) NOT NULL,
  `bayar` int(255) NOT NULL,
  `tanggaltransaksi` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`idt`, `namapembeli`, `type`, `banyak`, `hargatotal`, `bayar`, `tanggaltransaksi`) VALUES
(2, 'tawang', 'tawang', 1, 20000, 20000, '2022-01-11'),
(3, 'tetas', '33', 2, 40000, 40000, '2022-01-11'),
(4, 'tasdas', '33', 3, 60000, 60000, '2022-01-11'),
(6, 'tsd', '3 kg', 3, 60000, 60000, '2022-01-11'),
(11, 'dsadas', '12 kg', 333, 54279000, 2222222, '2022-01-11'),
(12, 'sads', '12 kg', 33, 5395500, 3323, '2022-01-11'),
(13, 'dsads', '5,5 kg', 3, 228000, 32323232, '2022-01-11'),
(14, 'tawang', '12 kg', 1500, 24450, 5000, '2022-01-11'),
(15, 'sakon', '12 kg', 10, 1630000, 10000, '2022-01-11'),
(16, 'tasa', '12 kg', 50, 8150000, 50000000, '2022-01-11'),
(17, 'ssadsa', '5,5 kg', 2, 152000, 5000000, '2022-01-11'),
(18, 'asd', '3', 2, 1110, 213, '2022-01-11');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `idu` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `hakakses` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`idu`, `username`, `password`, `hakakses`) VALUES
(2, 'aaa', 'aa', 'admin'),
(8, 'tawang', 'tawang', 'pemilik'),
(9, 'a', 'a', 'pemilik');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`idb`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`ids`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`idt`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`idu`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pembelian`
--
ALTER TABLE `pembelian`
  MODIFY `idb` int(18) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `stock`
--
ALTER TABLE `stock`
  MODIFY `ids` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `idt` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `idu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
