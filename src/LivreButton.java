private void ButtonLivreActionPerformed(java.awt.event.ActionEvent evt) {                                            
    // TODO add your handling code here:
String titre = inputTitre.getText();
String auteur = inputAuteur.getText();
String editeur = inputEditeur.getText();

// Créer un nouvel Livre
Livre MonLivre = new Livre(titre, auteur, editeur , true);

// Ajouter le Livre à la bibliothèque

ParisNanterre.ajouterDocument(MonLivre);

// Afficher un message pour indiquer que le Livre a été ajouté
LabelResultat.setText( " Le Livre " + MonLivre.getTitre() + " écrit par  " + MonLivre.getAuteur() + " a été bien ajouté à la bibliothèque.");
    
    
}                                        