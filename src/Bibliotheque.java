import java.util.ArrayList;
public class Bibliotheque 
{
    ArrayList<Document> ListeDocument;
    ArrayList<Materiel> ListeMateriel;
    ArrayList<Adherant> ListeAdherant;
    public Bibliotheque()
    {
        ListeDocument = new ArrayList<Document>();
        ListeMateriel = new ArrayList<Materiel>();
        ListeAdherant = new ArrayList<Adherant>();

    }
    public void ajouterDocument (Document doc)
    {
        ListeDocument.add(doc);
        System.out.println("le document :  " + doc.getTitre() + " a été bien enregistré dans la Bibliothèque " );
    }
    public void ajouterMateriel (Materiel materiel)
    {
        ListeMateriel.add(materiel);
        System.out.println("le matériel  a été bien enregistré dans la Bibliothèque " );
    }
    public void ajouterAdherant (Adherant adherant)
    {
        ListeAdherant.add(adherant);
        System.out.println("l'Adérant :  " + adherant.getprenom() + " " + adherant.getnom() + " a été bien enregistré dans la Bibliothèque " );
    }
}