public class OrdinateurPortable extends Materiel implements Empruntable

{
    private String marque;
    private Os system;
    private boolean disponible;
    public OrdinateurPortable(boolean enPanne , String marque , Os system , boolean disponible )
    {
        super(enPanne);
        this.marque = marque;
        this.system = system;
        this.disponible = disponible;
    }
    public String getMarque ()
    {

        return this.marque;
    }
    public Os getSystem ()
    {
        return this.system;
    }
    public void setMarque (String marque)
    {

        this.marque = marque;
    }
    public void setSystem (Os system)
    {
        this.system = system;
    }
    public boolean getDisponibilite ()
    {

        return this.disponible;
    }
    public void setDisponibilite (boolean disponible)
    {
        this.disponible = disponible;
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