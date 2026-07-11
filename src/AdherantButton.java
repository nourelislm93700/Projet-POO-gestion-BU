private void ButtonAdherantActionPerformed(java.awt.event.ActionEvent evt) {                                               
    // TODO add your handling code here:
    boolean estEtudiant = etudiantBox.isSelected();

// Vérifier si la case à cocher "Enseignant" est cochée
    boolean estEnseignant = enseignantBox.isSelected();

// Utiliser les valeurs boolean pour déterminer le statut
Statut statut;
if (estEtudiant) {
    statut = Statut.ETUDIANT;
} else if (estEnseignant) {
    statut = Statut.ENSEIGNANT;
} else {
    // Cas où aucune case n'est cochée (statut non défini)
    statut = null;
}

String nom = inputNom.getText();
String prenom = inputPrenom.getText();

// Créer un nouvel adhérent
Adherant Adherante = new Adherant(nom, prenom, statut);

// Ajouter l'adhérent à la bibliothèque

ParisNanterre.ajouterAdherant(Adherante);

// Afficher un message pour indiquer que l'adhérent a été ajouté
LabelResultat.setText( Adherante.getprenom() + " " + Adherante.getnom() + " a été bien ajouté à la bibliothèque.");
    