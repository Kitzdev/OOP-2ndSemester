-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 06, 2021 at 11:55 AM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `UASLibrary`
--

-- --------------------------------------------------------

--
-- Table structure for table `tabel_anggota`
--

CREATE TABLE `tabel_anggota` (
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `nama_anggota` varchar(40) DEFAULT NULL,
  `NIM_anggota` int(11) NOT NULL,
  `jenis_kelamin` varchar(1) DEFAULT NULL,
  `semester_anggota` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_anggota`
--

INSERT INTO `tabel_anggota` (`username`, `password`, `nama_anggota`, `NIM_anggota`, `jenis_kelamin`, `semester_anggota`) VALUES
('kitbert', 'kitbert', 'Kitbert', 32200038, 'F', 3);

-- --------------------------------------------------------

--
-- Table structure for table `tabel_buku`
--

CREATE TABLE `tabel_buku` (
  `kode_buku` int(11) NOT NULL,
  `judul_buku` varchar(40) DEFAULT NULL,
  `penulis_buku` varchar(40) DEFAULT NULL,
  `penerbit_buku` varchar(40) DEFAULT NULL,
  `halaman_buku` int(11) DEFAULT NULL,
  `jumlah_buku` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_buku`
--

INSERT INTO `tabel_buku` (`kode_buku`, `judul_buku`, `penulis_buku`, `penerbit_buku`, `halaman_buku`, `jumlah_buku`) VALUES
(1, 'The Inteligent Investor', 'Benjamin Graham', 'Gramedia', 300, 8);

-- --------------------------------------------------------

--
-- Table structure for table `tabel_master`
--

CREATE TABLE `tabel_master` (
  `id_master` int(11) NOT NULL,
  `NIM_anggota` int(11) DEFAULT NULL,
  `periode` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_master`
--

INSERT INTO `tabel_master` (`id_master`, `NIM_anggota`, `periode`) VALUES
(1, 32200038, '2021-06-06'),
(2, NULL, '2021-06-06');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_peminjaman`
--

CREATE TABLE `tabel_peminjaman` (
  `kode_peminjaman` int(11) NOT NULL,
  `kode_buku` int(11) DEFAULT NULL,
  `NIM_peminjam` int(11) DEFAULT NULL,
  `jumlah_peminjaman` int(11) DEFAULT NULL,
  `tanggal_peminjaman` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tabel_pengembalian`
--

CREATE TABLE `tabel_pengembalian` (
  `kode_pengembalian` int(11) NOT NULL,
  `kode_buku` int(11) DEFAULT NULL,
  `NIM_anggota` int(11) DEFAULT NULL,
  `tanggal_pengembalian` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_pengembalian`
--

INSERT INTO `tabel_pengembalian` (`kode_pengembalian`, `kode_buku`, `NIM_anggota`, `tanggal_pengembalian`) VALUES
(0, 1, 32200038, '2021-06-06');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tabel_anggota`
--
ALTER TABLE `tabel_anggota`
  ADD PRIMARY KEY (`NIM_anggota`);

--
-- Indexes for table `tabel_buku`
--
ALTER TABLE `tabel_buku`
  ADD PRIMARY KEY (`kode_buku`);

--
-- Indexes for table `tabel_master`
--
ALTER TABLE `tabel_master`
  ADD PRIMARY KEY (`id_master`),
  ADD KEY `NIM_anggota` (`NIM_anggota`);

--
-- Indexes for table `tabel_peminjaman`
--
ALTER TABLE `tabel_peminjaman`
  ADD PRIMARY KEY (`kode_peminjaman`),
  ADD KEY `kode_buku` (`kode_buku`),
  ADD KEY `NIM_peminjam` (`NIM_peminjam`);

--
-- Indexes for table `tabel_pengembalian`
--
ALTER TABLE `tabel_pengembalian`
  ADD PRIMARY KEY (`kode_pengembalian`),
  ADD KEY `kode_buku` (`kode_buku`),
  ADD KEY `NIM_anggota` (`NIM_anggota`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tabel_master`
--
ALTER TABLE `tabel_master`
  ADD CONSTRAINT `tabel_master_ibfk_1` FOREIGN KEY (`NIM_anggota`) REFERENCES `tabel_anggota` (`NIM_anggota`) ON DELETE SET NULL;

--
-- Constraints for table `tabel_peminjaman`
--
ALTER TABLE `tabel_peminjaman`
  ADD CONSTRAINT `tabel_peminjaman_ibfk_1` FOREIGN KEY (`kode_buku`) REFERENCES `tabel_buku` (`kode_buku`) ON DELETE SET NULL,
  ADD CONSTRAINT `tabel_peminjaman_ibfk_2` FOREIGN KEY (`NIM_peminjam`) REFERENCES `tabel_anggota` (`NIM_anggota`) ON DELETE SET NULL;

--
-- Constraints for table `tabel_pengembalian`
--
ALTER TABLE `tabel_pengembalian`
  ADD CONSTRAINT `tabel_pengembalian_ibfk_1` FOREIGN KEY (`kode_buku`) REFERENCES `tabel_buku` (`kode_buku`) ON DELETE SET NULL,
  ADD CONSTRAINT `tabel_pengembalian_ibfk_2` FOREIGN KEY (`NIM_anggota`) REFERENCES `tabel_anggota` (`NIM_anggota`) ON DELETE SET NULL;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
