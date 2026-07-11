private void ButtonOrdinateurActionPerformed(java.awt.event.ActionEvent evt) {                                                 
    // TODO add your handling code here:
    boolean estWindows = WindowsBox.isSelected();

// VÃ©rifier si la case Ã  cocher "Linux" est cochÃ©e
    boolean estLinux = LinuxBox.isSelected();

// Utiliser les valeurs boolean pour dÃ©terminer le System Os
Os system;
if (estWindows) {
    system = Os.WINDOWS;
} else if (estLinux) {
    system = Os.LINUX;
} else {
    // Cas oÃ¹ aucune case n'est cochÃ©e (Os non dÃ©fini)
    system = null;
}
///////////////////////////////////////// En Panne/Normal :
    boolean estNormal = NormalBox.isSelected();

// VÃ©rifier si la case Ã  cocher "en panne" est cochÃ©e
    boolean estEnPanne = EnPanneBox.isSelected();

// Utiliser les valeurs boolean pour dÃ©terminer l'Ã©tat de l'ordinateur
boolean etat = false;
if (estNormal) {
    etat = true;
} else if (estEnPanne) {
     etat = false;


String marque = inputMarque.getText();


// CrÃ©er un nouveau ordinateur
OrdinateurPortable ordinateur = new OrdinateurPortable(true ,marque,system,etat);

// Ajouter l'adhÃ©rent Ã  la bibliothÃ¨que

ParisNanterre.ajouterMateriel(ordinateur);

// Afficher un message pour indiquer que l'adhÃ©rent a Ã©tÃ© ajoutÃ©
LabelResultat.setText( "L'ordinateur " + ordinateur.getMarque() + " du Os " + ordinateur.getSystem() + " a Ã©tÃ© bien ajoutÃ© Ã  la bibliothÃ¨que.");
    
}   
/////////////////////////////////////////////////           