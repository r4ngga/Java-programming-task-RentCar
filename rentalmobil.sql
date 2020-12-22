-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 22 Des 2020 pada 13.17
-- Versi server: 10.1.30-MariaDB
-- Versi PHP: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rentalmobil`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id_admin` char(10) CHARACTER SET latin1 COLLATE latin1_bin NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id_admin`, `password`) VALUES
('admin1', 'admin1'),
('admin2', 'admin2'),
('admin3', 'admin3');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mobil`
--

CREATE TABLE `mobil` (
  `id_mobil` char(10) NOT NULL,
  `plat_no` varchar(10) NOT NULL,
  `nama_mobil` varchar(20) NOT NULL,
  `merk` varchar(20) NOT NULL,
  `jenis` enum('SUV','Van','Sedan','Sport','Hatchback','Bus','Truck','Jeep') NOT NULL,
  `cc` int(11) NOT NULL,
  `bahan_bakar` enum('Pertalite','Pertamax','Solar','Bio Solar','Dex Lite') NOT NULL,
  `harga_sewa` int(10) NOT NULL,
  `status` enum('Ready','Sudah Disewa','Maintenance') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `mobil`
--

INSERT INTO `mobil` (`id_mobil`, `plat_no`, `nama_mobil`, `merk`, `jenis`, `cc`, `bahan_bakar`, `harga_sewa`, `status`) VALUES
('mbl0', 'AB 902 HG', 'Isuzu ', 'Panther', 'Van', 4500, 'Bio Solar', 60000, 'Ready'),
('mbl1', 'AD 7721 TY', ' Mitsubitshi', ' Pajero', 'SUV', 5500, 'Dex Lite', 100000, 'Sudah Disewa'),
('mbl10', 'AE 3812', 'Toyota', 'Supra', 'Sedan', 6000, 'Pertamax', 1000000, 'Maintenance'),
('mbl2', 'AE 86 J', 'Toyota', 'Trueno 86', 'Sedan', 3000, 'Pertalite', 45000, 'Ready'),
('mbl3', 'AB 6417 TG', 'Inova', 'Honda', 'Van', 5000, 'Pertamax', 200000, 'Ready');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penyewa`
--

CREATE TABLE `penyewa` (
  `id_penyewa` char(10) NOT NULL,
  `nama_penyewa` varchar(30) NOT NULL,
  `alamat` varchar(20) NOT NULL,
  `jenis_kel` enum('Laki-Laki','Perempuan') NOT NULL,
  `ttl` varchar(30) NOT NULL,
  `pekerjaan` char(15) NOT NULL,
  `nohp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penyewa`
--

INSERT INTO `penyewa` (`id_penyewa`, `nama_penyewa`, `alamat`, `jenis_kel`, `ttl`, `pekerjaan`, `nohp`) VALUES
('user0', 'Rudi', 'Jl Mangga Manis 2', 'Laki-Laki', 'Solo 2 Maret 1997', 'Pengusaha', '087211231'),
('user1', 'Iwan', 'Jl Mangga Manis 2', 'Laki-Laki', 'Solo 2 Maret 1995', 'Pegawai', '08519034'),
('user10', 'Rangga', 'Jl Jalan', 'Laki-Laki', '23 Mei 1997', 'Programer', '0828133'),
('user2', 'Indah', 'Jl Mangga Manis 2', 'Perempuan', 'Jakarta 6 Mei 1993', 'Ibu Rt', '081637280'),
('user3', 'Hendro', 'Jl Manggis Pait 3', 'Laki-Laki', 'Jogja 4 Juni 1987', 'Montir', '089921222');

-- --------------------------------------------------------

--
-- Struktur dari tabel `sewa`
--

CREATE TABLE `sewa` (
  `no_sewa` char(10) NOT NULL,
  `tgl_sewa` varchar(20) NOT NULL,
  `tgl_kembali` varchar(20) NOT NULL,
  `id_mobil` char(10) NOT NULL,
  `id_penyewa` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `sewa`
--

INSERT INTO `sewa` (`no_sewa`, `tgl_sewa`, `tgl_kembali`, `id_mobil`, `id_penyewa`) VALUES
(' Sewa4', ' 20 Januari 2019', ' 25 Januari 2019', 'mbl1', 'user0'),
('Sewa0', '23 Desember 2018', '25 Desember 2018', 'mbl1', 'user1'),
('Sewa1', '24 Desember 2018', '26 Desember 2018', 'mbl2', 'user0'),
('sewa10', '24 Januari 2019', '25 Januari 2019', 'mbl2', 'user0'),
('Sewa3', '27 Desember 2018', '05 Januari 2019', 'mbl3', 'user2'),
('Sewa5', '1 Desember 2018', '5 Desember 2018', 'mbl2', 'user1');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indeks untuk tabel `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`id_mobil`);

--
-- Indeks untuk tabel `penyewa`
--
ALTER TABLE `penyewa`
  ADD PRIMARY KEY (`id_penyewa`);

--
-- Indeks untuk tabel `sewa`
--
ALTER TABLE `sewa`
  ADD PRIMARY KEY (`no_sewa`),
  ADD KEY `id_mobil` (`id_mobil`),
  ADD KEY `id_penyewa` (`id_penyewa`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `sewa`
--
ALTER TABLE `sewa`
  ADD CONSTRAINT `sewa_ibfk_1` FOREIGN KEY (`id_mobil`) REFERENCES `mobil` (`id_mobil`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `sewa_ibfk_2` FOREIGN KEY (`id_penyewa`) REFERENCES `penyewa` (`id_penyewa`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
