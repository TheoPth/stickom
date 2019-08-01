-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le :  jeu. 01 août 2019 à 09:08
-- Version du serveur :  5.7.27-0ubuntu0.18.04.1
-- Version de PHP :  7.2.19-0ubuntu0.18.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `tourismManagement`
--

-- --------------------------------------------------------

--
-- Structure de la table `activitie`
--

CREATE TABLE `activitie` (
  `id` int(11) NOT NULL,
  `name` varchar(40) NOT NULL,
  `takesPlace` int(11) NOT NULL,
  `idGuide` int(11) NOT NULL,
  `idHotel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `address`
--

CREATE TABLE `address` (
  `id` int(11) NOT NULL,
  `numStreet` int(11) NOT NULL,
  `nameStreet` varchar(50) NOT NULL,
  `postalCode` int(11) NOT NULL,
  `city` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `address`
--

INSERT INTO `address` (`id`, `numStreet`, `nameStreet`, `postalCode`, `city`) VALUES
(1, 15, 'lol', 98, 'Denpasar'),
(2, 1, '1', 1, '1'),
(3, 1, '1', 1, '1'),
(4, 1, 'bv', 38520, 'Denpasar');

-- --------------------------------------------------------

--
-- Structure de la table `airport`
--

CREATE TABLE `airport` (
  `id` int(11) NOT NULL,
  `name` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `airport`
--

INSERT INTO `airport` (`id`, `name`) VALUES
(1, 'Bali airport'),
(3, 'Roissy');

-- --------------------------------------------------------

--
-- Structure de la table `bookPlane`
--

CREATE TABLE `bookPlane` (
  `id` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `idTrip` int(11) NOT NULL,
  `idFlight` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `commentaries`
--

CREATE TABLE `commentaries` (
  `id` int(11) NOT NULL,
  `body` varchar(500) NOT NULL,
  `rate` int(11) NOT NULL,
  `idHotel` int(11) NOT NULL,
  `idRoom` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `compagnie`
--

CREATE TABLE `compagnie` (
  `id` int(11) NOT NULL,
  `name` varchar(150) NOT NULL,
  `phone` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `compagnie`
--

INSERT INTO `compagnie` (`id`, `name`, `phone`) VALUES
(1, 'AirFrance', '3634');

-- --------------------------------------------------------

--
-- Structure de la table `departureAt`
--

CREATE TABLE `departureAt` (
  `idFlight` int(11) NOT NULL,
  `idAirport` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `doA`
--

CREATE TABLE `doA` (
  `idActivities` int(11) NOT NULL,
  `idTrip` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `equipedBy`
--

CREATE TABLE `equipedBy` (
  `idRoom` int(11) NOT NULL,
  `idEquipement` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `equipment`
--

CREATE TABLE `equipment` (
  `id` int(11) NOT NULL,
  `name` varchar(40) NOT NULL,
  `reference` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `flight`
--

CREATE TABLE `flight` (
  `id` int(11) NOT NULL,
  `number` int(11) NOT NULL,
  `departureDate` date NOT NULL,
  `arrivalDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `flight`
--

INSERT INTO `flight` (`id`, `number`, `departureDate`, `arrivalDate`) VALUES
(1, 123, '2019-10-10', '2019-11-11');

-- --------------------------------------------------------

--
-- Structure de la table `guide`
--

CREATE TABLE `guide` (
  `id` int(11) NOT NULL,
  `name` int(11) NOT NULL,
  `phone` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `hotel`
--

CREATE TABLE `hotel` (
  `id` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `arrivalDate` int(11) NOT NULL,
  `departureDate` int(11) NOT NULL,
  `rate` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `interestPoint`
--

CREATE TABLE `interestPoint` (
  `id` int(11) NOT NULL,
  `name` varchar(40) NOT NULL,
  `longitude` int(11) NOT NULL,
  `latitude` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `makeA`
--

CREATE TABLE `makeA` (
  `idTraveler` int(11) NOT NULL,
  `idTrip` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `makeA`
--

INSERT INTO `makeA` (`idTraveler`, `idTrip`) VALUES
(6, 2);

-- --------------------------------------------------------

--
-- Structure de la table `propose`
--

CREATE TABLE `propose` (
  `idFlight` int(11) NOT NULL,
  `idCompagnie` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `provide`
--

CREATE TABLE `provide` (
  `idVehicule` int(11) NOT NULL,
  `idHotel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `rentA`
--

CREATE TABLE `rentA` (
  `id` int(11) NOT NULL,
  `dateBegining` int(11) NOT NULL,
  `dateEnd` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `idTrip` int(11) NOT NULL,
  `idVehicule` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `renter`
--

CREATE TABLE `renter` (
  `id` int(11) NOT NULL,
  `name` varchar(40) NOT NULL,
  `mobile` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `rentWith`
--

CREATE TABLE `rentWith` (
  `idVehicule` int(11) NOT NULL,
  `idRenter` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `room`
--

CREATE TABLE `room` (
  `id` int(11) NOT NULL,
  `number` int(11) NOT NULL,
  `floor` int(11) NOT NULL,
  `capacity` int(11) NOT NULL,
  `idHotel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `traveler`
--

CREATE TABLE `traveler` (
  `id` int(11) NOT NULL,
  `firstname` varchar(30) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `birthdate` date NOT NULL,
  `phone` varchar(15) NOT NULL,
  `street` varchar(100) NOT NULL,
  `city` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `traveler`
--

INSERT INTO `traveler` (`id`, `firstname`, `lastname`, `birthdate`, `phone`, `street`, `city`) VALUES
(6, 'theo', 'potnhieu', '1997-08-25', '9', 'bv', 'den');

-- --------------------------------------------------------

--
-- Structure de la table `trip`
--

CREATE TABLE `trip` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `departureDate` date NOT NULL,
  `arrivalDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `trip`
--

INSERT INTO `trip` (`id`, `name`, `departureDate`, `arrivalDate`) VALUES
(2, 'Bali Trip', '2019-06-30', '2019-08-05'),
(3, 'trip', '2019-10-10', '2019-11-11');

-- --------------------------------------------------------

--
-- Structure de la table `vehicule`
--

CREATE TABLE `vehicule` (
  `id` int(11) NOT NULL,
  `registration` varchar(30) NOT NULL,
  `model` varchar(30) NOT NULL,
  `mark` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `activitie`
--
ALTER TABLE `activitie`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Index pour la table `airport`
--
ALTER TABLE `airport`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Index pour la table `bookPlane`
--
ALTER TABLE `bookPlane`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Index pour la table `commentaries`
--
ALTER TABLE `commentaries`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `compagnie`
--
ALTER TABLE `compagnie`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Index pour la table `departureAt`
--
ALTER TABLE `departureAt`
  ADD UNIQUE KEY `idFlight` (`idFlight`,`idAirport`);

--
-- Index pour la table `equipment`
--
ALTER TABLE `equipment`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `flight`
--
ALTER TABLE `flight`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Index pour la table `guide`
--
ALTER TABLE `guide`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `interestPoint`
--
ALTER TABLE `interestPoint`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Index pour la table `propose`
--
ALTER TABLE `propose`
  ADD UNIQUE KEY `idFlight` (`idFlight`);

--
-- Index pour la table `rentA`
--
ALTER TABLE `rentA`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `renter`
--
ALTER TABLE `renter`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Index pour la table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `traveler`
--
ALTER TABLE `traveler`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Index pour la table `trip`
--
ALTER TABLE `trip`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Index pour la table `vehicule`
--
ALTER TABLE `vehicule`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `activitie`
--
ALTER TABLE `activitie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `address`
--
ALTER TABLE `address`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `airport`
--
ALTER TABLE `airport`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `bookPlane`
--
ALTER TABLE `bookPlane`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `commentaries`
--
ALTER TABLE `commentaries`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `compagnie`
--
ALTER TABLE `compagnie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `equipment`
--
ALTER TABLE `equipment`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `flight`
--
ALTER TABLE `flight`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `guide`
--
ALTER TABLE `guide`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `hotel`
--
ALTER TABLE `hotel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `interestPoint`
--
ALTER TABLE `interestPoint`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `rentA`
--
ALTER TABLE `rentA`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `renter`
--
ALTER TABLE `renter`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `room`
--
ALTER TABLE `room`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `traveler`
--
ALTER TABLE `traveler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `trip`
--
ALTER TABLE `trip`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `vehicule`
--
ALTER TABLE `vehicule`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
