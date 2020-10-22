# snowboard-community

## Présentation 📜

> Application web & mobile communautaire rassemblant des amateurs de sport de glisse: ski ou snowboard. L'application propoe de nombreux outil permettant aux utilisateurs se rencontrer et de se challenger.

## Fonctionnalités ⚙️

- **Page d'accueil**: Texte d'explication & vidéo de presentation.
- **Mode Invité**: Fonctionnalités basiques jusqu'à ce que l'authentification soit nécessaire).
- **Inscription/login**
- **Profil**: Informations personnelles & caractéristiques permettant de mettre les utilisateurs en lien.

- **Dashboard** par utilisateur, accès aux fonctionnalités:

  - **Socials**
    - **Match**: Les utilisateurs match avec des **houses** en fonction de critères (géolocation, centres d'intérets)
    - **Houses**: Groupe de d'échanges rassemblant des utilisateurs selon des critères définies
    - **Challenges**: concours de vitesses, répertorié par hub.
    - **Lancer un meeting**: Invitation ouverte, en précisant la géolocalisation (extra hub).
  
  - **Outils**
    - Compteur de vitesse: mesurer la vitesse sur une période donnée => avg retourné. Classification (selon catégorries)
    - Cartes Météo + pistes (si référencé en ligne)
    - Liste de tutos (diy +riding)
    - Ajouter sa propre vidéo / tuto

## Stack Technique 🏗

### Overview: 🌍

> Application 3 tiers pour suporter la charge et isoler les responsabilités de chaques couches:

Couche | Framework | Version
:------|:---------:|------:|
INTERFACE WEB | Angular | v9
API | Springboot | 2
BDD|  MySQL | -

### Construis avec ⚙️

- Angular CLI
- ...

## Lancement de l'application 🔥

> Pour lancer l'application, il suffit d'éxecuter les 2 commandes ci dessous pour lancer les différentes couches de l'application:

### Interface Web 🎨

```shell
cd ~/application/web-ui;
npm install;
ng serve;
```

### API 🔐

```shell
cd ~/application/api;
mvn spring-boot:run
```

## Contributing 🙌

Before contributing to project, please check the following:

* [HowToGit.md](https://gist.github.com/louiiuol/2697f8217853689fef9173e4eaad5386#versioning-how-to-git) (git commands)
* [CONTRIBUTING.md](https://gist.github.com/louiiuol/f1ca9436c877c85f39f20e683ed64156) (code of conduct,  pull requests process)

## License 💼

This project is licensed under the GNU General Public License v3.0 License (cf. [License](LICENSE.md))

***

## Contact ✉️

Feel free to [Submit new issue](https://github.com/louiiuol/ride-community/issues) if you have any suggestions or wish to learn more about certain aspects of this project.
