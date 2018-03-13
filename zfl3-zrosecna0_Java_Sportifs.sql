-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Mar 13 Mars 2018 à 08:27
-- Version du serveur :  10.0.23-MariaDB
-- Version de PHP :  5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `zfl3-zrosecna0`
--

-- --------------------------------------------------------

--
-- Structure de la table `T_QUESTIONNAIRE_QNR`
--

CREATE TABLE `T_QUESTIONNAIRE_QNR` (
  `qnr_id` int(11) NOT NULL,
  `qnr_nom` varchar(60) NOT NULL,
  `qnr_dateDebut` date NOT NULL,
  `qnr_dateFin` date NOT NULL,
  `qnr_etat` enum('Cree','EnCours','Arret','Fini') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `T_QUESTIONNAIRE_QNR`
--

INSERT INTO `T_QUESTIONNAIRE_QNR` (`qnr_id`, `qnr_nom`, `qnr_dateDebut`, `qnr_dateFin`, `qnr_etat`) VALUES
(1, 'Questionnaire Numéro 1', '2018-02-11', '2018-02-18', 'Fini'),
(2, 'Questionnaire Numéro 2', '2018-02-25', '2018-03-04', 'EnCours');

-- --------------------------------------------------------

--
-- Structure de la table `T_QUESTION_QST`
--

CREATE TABLE `T_QUESTION_QST` (
  `qst_id` int(11) NOT NULL,
  `qst_intitule` varchar(60) NOT NULL,
  `qst_defaut` char(1) NOT NULL,
  `qnr_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `T_QUESTION_QST`
--

INSERT INTO `T_QUESTION_QST` (`qst_id`, `qst_intitule`, `qst_defaut`, `qnr_id`) VALUES
(1, 'Question 1', '1', 1),
(2, 'Question 2', '0', 2),
(3, 'Question 3', '0', 2),
(4, 'Question 4', '0', 2);

-- --------------------------------------------------------

--
-- Structure de la table `T_REPONSE_REP`
--

CREATE TABLE `T_REPONSE_REP` (
  `rep_id` int(11) NOT NULL,
  `rep_date` date NOT NULL,
  `rep_valeur` char(1) NOT NULL,
  `spo_id` int(11) NOT NULL,
  `qst_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `T_REPONSE_REP`
--

INSERT INTO `T_REPONSE_REP` (`rep_id`, `rep_date`, `rep_valeur`, `spo_id`, `qst_id`) VALUES
(1, '2018-02-16', '1', 1, 1),
(2, '2018-02-16', '1', 1, 2),
(3, '2018-02-14', '0', 2, 1),
(4, '2018-02-14', '1', 2, 2),
(5, '2018-02-13', '1', 3, 1),
(6, '2018-02-13', '0', 3, 2),
(7, '2018-02-17', '1', 4, 1),
(8, '2018-02-17', '1', 4, 2);

-- --------------------------------------------------------

--
-- Structure de la table `T_SPORTIF_SPO`
--

CREATE TABLE `T_SPORTIF_SPO` (
  `spo_id` int(11) NOT NULL,
  `spo_nom` varchar(60) NOT NULL,
  `spo_prenom` varchar(60) NOT NULL,
  `spo_pseudo` varchar(60) NOT NULL,
  `spo_dateNaissance` date NOT NULL,
  `spo_sport` enum('Foot','Tennis','Natation','Boxe','Cyclisme','Equitation','Judo','Karaté','Curling','Ski','Musculation','Basket') NOT NULL,
  `spo_actif` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `T_SPORTIF_SPO`
--

INSERT INTO `T_SPORTIF_SPO` (`spo_id`, `spo_nom`, `spo_prenom`, `spo_pseudo`, `spo_dateNaissance`, `spo_sport`, `spo_actif`) VALUES
(1, 'Perot', 'Kévin', 'KevBZH', '2000-12-25', 'Musculation', '1'),
(2, 'Rosec', 'Nathan', 'Jiiinox', '1997-01-05', 'Musculation', '1'),
(3, 'Quimerch', 'Gwenole', 'Jo La Frip', '1997-09-18', 'Basket', '1'),
(4, 'Scordia', 'Clément', 'Rayhawk', '1992-11-30', 'Curling', '1');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `T_QUESTIONNAIRE_QNR`
--
ALTER TABLE `T_QUESTIONNAIRE_QNR`
  ADD PRIMARY KEY (`qnr_id`);

--
-- Index pour la table `T_QUESTION_QST`
--
ALTER TABLE `T_QUESTION_QST`
  ADD PRIMARY KEY (`qst_id`),
  ADD KEY `qst_qnr_fk1` (`qnr_id`);

--
-- Index pour la table `T_REPONSE_REP`
--
ALTER TABLE `T_REPONSE_REP`
  ADD PRIMARY KEY (`rep_id`),
  ADD KEY `rep_qst_fk1` (`qst_id`),
  ADD KEY `rep_spo_fk2` (`spo_id`);

--
-- Index pour la table `T_SPORTIF_SPO`
--
ALTER TABLE `T_SPORTIF_SPO`
  ADD PRIMARY KEY (`spo_id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `T_QUESTIONNAIRE_QNR`
--
ALTER TABLE `T_QUESTIONNAIRE_QNR`
  MODIFY `qnr_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `T_QUESTION_QST`
--
ALTER TABLE `T_QUESTION_QST`
  MODIFY `qst_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `T_REPONSE_REP`
--
ALTER TABLE `T_REPONSE_REP`
  MODIFY `rep_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT pour la table `T_SPORTIF_SPO`
--
ALTER TABLE `T_SPORTIF_SPO`
  MODIFY `spo_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `T_QUESTION_QST`
--
ALTER TABLE `T_QUESTION_QST`
  ADD CONSTRAINT `qst_qnr_fk1` FOREIGN KEY (`qnr_id`) REFERENCES `T_QUESTIONNAIRE_QNR` (`qnr_id`);

--
-- Contraintes pour la table `T_REPONSE_REP`
--
ALTER TABLE `T_REPONSE_REP`
  ADD CONSTRAINT `rep_qst_fk1` FOREIGN KEY (`qst_id`) REFERENCES `T_QUESTION_QST` (`qst_id`),
  ADD CONSTRAINT `rep_spo_fk2` FOREIGN KEY (`spo_id`) REFERENCES `T_SPORTIF_SPO` (`spo_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
