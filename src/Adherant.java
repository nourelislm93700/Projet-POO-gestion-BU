import java.util.ArrayList;
public class Adherant 
{
    private String nom;
    private String prenom;
    private Statut statut;
    ArrayList<Livre> livres;
    ArrayList<OrdinateurPortable> ordinateurs;
    

    public Adherant (String nom , String prenom , Statut statut) 
    {
    this.nom = nom;
    this.prenom = prenom;
    this.statut = statut;
    livres = new ArrayList<Livre>();
    ordinateurs = new ArrayList<OrdinateurPortable>();


    }
    public String getnom ()
    {
        return this.nom;
    }
    public void setnom( String nom)
    {
        this.nom = nom;
    }
    public String getprenom ()
    {
        return this.prenom;
    }
    public void setprenom( String prenom)
    {
        this.prenom = prenom;
    }
    public Statut gestatut ()
    {
        return this.statut;
    }
    public void setstatut( Statut statut)
    {
        this.statut = statut;
    }

    public void emprunterLivre (Livre objet)
    {
        if (objet.estDisponible()==true && livres.size()<5 )
        {
            livres.add(objet);
            objet.emprunter();
            System.out.println("Le Livre a été bien emprunté par Ms " + this.getprenom() + " " + this.getnom());
        }
        else if (objet.estDisponible()==true && livres.size()== 5 )

        
        {
            System.out.println("Impossible d'emprunté le livre , l'Adhérant a dépassé le nombre Maximum autorisée des livres empruntés ! ");
        }
        else if (objet.estDisponible()== false)

        
        {
            System.out.println("Impossible d'emprunter , le livre n'est pas disponible pour le moment ! ");
        }
        
    }
    public void emprunterOrdi (OrdinateurPortable objet)
    {
        if (objet.estDisponible()==true && ordinateurs.size()<1 )
        {
            ordinateurs.add(objet);
            objet.emprunter();
            System.out.println("L'ordinateur a été bien emprunté par Ms " + this.getprenom() + " " + this.getnom());
        }
        else if (objet.estDisponible()==true && ordinateurs.size()== 1 )

        
        {
            System.out.println("Impossible d'emprunté l'ordinateur , l'Adhérant a dépassé le nombre Maximum autorisée des ordinateurs empruntés ! ");
        }
        else if (objet.estDisponible()== false)

        
        {
            System.out.println("Impossible d'emprunter , l'ordinateur n'est pas disponible pour le moment ! ");
        }
    }

        public void rendreLivre (Livre objet)
        {
            if (livres.contains(objet))
            {
            objet.rendre();
            livres.remove(objet);
            System.out.println("Le livre a été rendu avec succés par Ms " + this.getprenom() + " " + this.getnom() );
            }
            else 
            {
                System.out.println( " Vous n'avez pas emprunté ce livre Ms  " + this.getprenom() + " " + this.getnom() + " ! ");
            }
        }
        public void rendreOrdi (OrdinateurPortable objet)
        {
            if (ordinateurs.contains(objet))
            {
            objet.rendre();
            ordinateurs.remove(objet);
            System.out.println("L'ordinateur a été rendu avec succés par Ms " + this.getprenom() + " " + this.getnom() );
            }
            else 
            {
                System.out.println( " Vous n'avez pas emprunté ce ordinateur ! ");
            }
        }
}





