public class Livre extends Document implements Empruntable
{
    private String editeur;
    private boolean disponible;
    public Livre (String titre , String auteur ,String editeur , boolean disponible)
    {
        super (titre , auteur);
        this.editeur = editeur;
        this.disponible = disponible;
    }
    public boolean getDisponibilite ()
    {

        return this.disponible;
    }
    public void setDisponibilite (boolean disponible)
    {
        this.disponible = disponible;
    }


    public String getEditeur ()
    {
        return this.editeur;
    }

    public void setEditeur( String editeur)
    {
        this.editeur = editeur;
    }

    @Override
    public boolean estDisponible() {
    
        if (getDisponibilite()== true)
        {
            return true;
        }
        return false;
    }
    public void emprunter ()
    {
        setDisponibilite(false);
    }
    public void rendre ()
    {
        setDisponibilite(true);
    }
}