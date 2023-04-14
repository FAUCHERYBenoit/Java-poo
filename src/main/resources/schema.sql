DROP TABLE IF EXISTS compte_banquaire;
DROP TABLE IF EXISTS banque;
DROP TABLE IF EXISTS client;

CREATE TABLE banque(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL
);

CREATE TABLE client(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    prenom VARCHAR(255) NOT NULL
);

CREATE TABLE compte_banquaire(
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_client INT,
    id_banque INT,
    FOREIGN KEY (id_client) REFERENCES client(id),
    FOREIGN KEY (id_banque) REFERENCES banque(id)
);
