# Gestion de Bibliothèque - Paris Nanterre

Projet de Programmation Orientée Objet (POO) réalisé en Java, simulant la gestion d'une bibliothèque universitaire : documents (livres, bandes dessinées), matériel (ordinateurs portables) et adhérents (étudiants, enseignants).

Réalisé dans le cadre du module **L02 MIASHS (MIAGE) - TD08** par **Nour El Islam EL-HADJ MIMOUNE**.

## Fonctionnalités

- Gestion des **documents** : livres (avec éditeur et disponibilité) et bandes dessinées (avec dessinateur), via une hiérarchie commune `Document`.
- Gestion du **matériel** : ordinateurs portables (marque, système d'exploitation, état de panne, disponibilité).
- Gestion des **adhérents** : étudiants ou enseignants, avec emprunt et retour de livres (max 5) et d'ordinateurs (max 1).
- Interface graphique (Swing) pour ajouter des adhérents, livres et ordinateurs, et gérer les emprunts/retours.
- Classe de test en console (`TestBiblo`) illustrant le fonctionnement du système sans interface graphique.

## Architecture

```
src/
├── Document.java              # Classe abstraite (titre, auteur)
├── Livre.java                 # Document empruntable (éditeur, disponibilité)
├── BandeDessinee.java         # Document (dessinateur)
├── Empruntable.java           # Interface (estDisponible, emprunter, rendre)
├── Materiel.java               # Classe abstraite (état de panne)
├── OrdinateurPortable.java     # Matériel empruntable (marque, OS, disponibilité)
├── Os.java                     # Enum (LINUX, WINDOWS)
├── Statut.java                 # Enum (ETUDIANT, ENSEIGNANT)
├── Adherant.java                # Adhérent : emprunts/retours de livres et ordinateurs
├── Bibliotheque.java            # Registre central (documents, matériel, adhérents)
├── FenetrePrincipale.java       # Interface graphique Swing (fenêtre principale)
├── LivreButton.java              # Logique du bouton "Ajouter un livre"
├── AdherantButton.java           # Logique du bouton "Ajouter un adhérent"
├── OrdinateurButton.java         # Logique du bouton "Ajouter un ordinateur"
└── TestBiblo.java                # Programme de test en mode console
```

### Diagramme des relations

- `Livre` et `BandeDessinee` héritent de `Document`.
- `Livre` et `OrdinateurPortable` implémentent l'interface `Empruntable`.
- `Adherant` référence des listes de `Livre` et `OrdinateurPortable` empruntés.
- `Bibliotheque` centralise les listes de `Document`, `Materiel` et `Adherant`.

## Prérequis

- JDK 8 ou supérieur (le projet utilise Swing, inclus dans le JDK standard).

## Compilation et exécution

### Version console (sans interface graphique)

```bash
cd src
javac *.java
java TestBiblo
```

### Version graphique (interface Swing)

```bash
cd src
javac *.java
java FenetrePrincipale
```

> Le projet a été développé sous NetBeans (Form Editor), il peut donc aussi être ouvert directement en tant que projet NetBeans.

## Documentation

Le dossier `documentation/` contient les énoncés du projet :

- `1 - Pojet de POO.pdf` : partie héritage et polymorphisme.
- `2 - Projet POO Partie 03.pdf` : partie interface graphique et interfaces Java.

## Auteur

Nour El Islam EL-HADJ MIMOUNE
