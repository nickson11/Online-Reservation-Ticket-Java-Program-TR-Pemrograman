-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 02, 2019 at 07:20 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pesawatkita`
--

-- --------------------------------------------------------

--
-- Table structure for table `info_admin`
--

CREATE TABLE `info_admin` (
  `id_admin` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(50) NOT NULL,
  `tanggal_lahir` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `kota` varchar(50) NOT NULL,
  `no_hp` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `info_admin`
--

INSERT INTO `info_admin` (`id_admin`, `nama`, `username`, `password`, `alamat`, `jenis_kelamin`, `tanggal_lahir`, `email`, `kota`, `no_hp`) VALUES
('A96684', 'Holbed', 'admin1', 'uksw', 'Asrama', 'Laki-laki', '2019-05-01', 'holbed@gmail.com ', '000000008', 'salatiga');

-- --------------------------------------------------------

--
-- Table structure for table `info_asal`
--

CREATE TABLE `info_asal` (
  `asal` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `info_asal`
--

INSERT INTO `info_asal` (`asal`) VALUES
('Jakarta'),
('Semarang'),
('Solo'),
('Surabaya'),
('Yogyakarta');

-- --------------------------------------------------------

--
-- Table structure for table `info_cs`
--

CREATE TABLE `info_cs` (
  `id_cs` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(50) NOT NULL,
  `tanggal_lahir` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `kota` varchar(50) NOT NULL,
  `no_hp` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `info_cs`
--

INSERT INTO `info_cs` (`id_cs`, `nama`, `username`, `password`, `alamat`, `jenis_kelamin`, `tanggal_lahir`, `email`, `kota`, `no_hp`) VALUES
('0001', 'Holbed', 'cs1', 'uksw', 'Asrama', 'Laki Laki', '16', 'holbed@gmail.com', 'salatiga', '12345678');

-- --------------------------------------------------------

--
-- Table structure for table `info_pelanggan`
--

CREATE TABLE `info_pelanggan` (
  `id_pelanggan` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(50) NOT NULL,
  `tanggal_lahir` varchar(50) NOT NULL,
  `kota` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `no_hp` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `info_pelanggan`
--

INSERT INTO `info_pelanggan` (`id_pelanggan`, `nama`, `alamat`, `jenis_kelamin`, `tanggal_lahir`, `kota`, `email`, `no_hp`) VALUES
('C45195', 'Holbed', 'Asrama', 'Laki-laki', '2000-05-03', 'Salatiga', 'holbed@gmail.com', '08565171');

-- --------------------------------------------------------

--
-- Table structure for table `info_penerbangan`
--

CREATE TABLE `info_penerbangan` (
  `id_penerbangan` varchar(50) NOT NULL,
  `id_pesawat` varchar(50) NOT NULL,
  `asal` varchar(50) NOT NULL,
  `tujuan` varchar(50) NOT NULL,
  `waktu_keberangkatan` varchar(50) NOT NULL,
  `harga` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `info_penerbangan`
--

INSERT INTO `info_penerbangan` (`id_penerbangan`, `id_pesawat`, `asal`, `tujuan`, `waktu_keberangkatan`, `harga`) VALUES
('T33298', 'P72950', 'Semarang', 'Ambon', '2019-05-02+07:00', '500000'),
('T87865', 'P72950', 'Jayapura', 'Semarang', '2019-05-01+07:00', '5000000');

-- --------------------------------------------------------

--
-- Table structure for table `info_pesawat`
--

CREATE TABLE `info_pesawat` (
  `id_pesawat` varchar(50) NOT NULL,
  `model_pesawat` varchar(50) NOT NULL,
  `perusahaan` varchar(50) NOT NULL,
  `kursi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `info_pesawat`
--

INSERT INTO `info_pesawat` (`id_pesawat`, `model_pesawat`, `perusahaan`, `kursi`) VALUES
('P53489', 'Boeng', 'Citilink', '400'),
('P72950', 'Boeing 900', 'Lion Air', '200'),
('P93474', 'Boeing 777', 'Batik Air', '150'),
('T09889', 'Boeing 789', 'Garuda Indonesia', '400');

-- --------------------------------------------------------

--
-- Table structure for table `info_tiket`
--

CREATE TABLE `info_tiket` (
  `id_tiket` varchar(50) NOT NULL,
  `id_pelanggan` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `asal` varchar(50) NOT NULL,
  `tujuan` varchar(50) NOT NULL,
  `model_pesawat` varchar(50) NOT NULL,
  `perusahaan` varchar(50) NOT NULL,
  `harga` varchar(50) NOT NULL,
  `tanggal_pemesanan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `info_tujuan`
--

CREATE TABLE `info_tujuan` (
  `tujuan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `info_tujuan`
--

INSERT INTO `info_tujuan` (`tujuan`) VALUES
('Ambon'),
('Bali'),
('Jayapura'),
('Pontianak');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `info_admin`
--
ALTER TABLE `info_admin`
  ADD PRIMARY KEY (`id_admin`,`username`);

--
-- Indexes for table `info_asal`
--
ALTER TABLE `info_asal`
  ADD UNIQUE KEY `asal` (`asal`);

--
-- Indexes for table `info_cs`
--
ALTER TABLE `info_cs`
  ADD PRIMARY KEY (`id_cs`,`username`);

--
-- Indexes for table `info_pelanggan`
--
ALTER TABLE `info_pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indexes for table `info_penerbangan`
--
ALTER TABLE `info_penerbangan`
  ADD PRIMARY KEY (`id_penerbangan`),
  ADD KEY `id_pesawat` (`id_pesawat`),
  ADD KEY `asal` (`asal`),
  ADD KEY `tujuan` (`tujuan`);

--
-- Indexes for table `info_pesawat`
--
ALTER TABLE `info_pesawat`
  ADD PRIMARY KEY (`id_pesawat`);

--
-- Indexes for table `info_tiket`
--
ALTER TABLE `info_tiket`
  ADD PRIMARY KEY (`id_tiket`),
  ADD KEY `id_pelanggan` (`id_pelanggan`),
  ADD KEY `asal` (`asal`),
  ADD KEY `tujuan` (`tujuan`);

--
-- Indexes for table `info_tujuan`
--
ALTER TABLE `info_tujuan`
  ADD UNIQUE KEY `tujuan` (`tujuan`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `info_penerbangan`
--
ALTER TABLE `info_penerbangan`
  ADD CONSTRAINT `info_penerbangan_ibfk_1` FOREIGN KEY (`id_pesawat`) REFERENCES `info_pesawat` (`id_pesawat`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `info_tiket`
--
ALTER TABLE `info_tiket`
  ADD CONSTRAINT `info_tiket_ibfk_1` FOREIGN KEY (`id_pelanggan`) REFERENCES `info_pelanggan` (`id_pelanggan`),
  ADD CONSTRAINT `info_tiket_ibfk_2` FOREIGN KEY (`asal`) REFERENCES `info_penerbangan` (`asal`),
  ADD CONSTRAINT `info_tiket_ibfk_3` FOREIGN KEY (`tujuan`) REFERENCES `info_penerbangan` (`tujuan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
