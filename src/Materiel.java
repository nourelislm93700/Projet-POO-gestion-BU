public abstract class Materiel 
{
    private boolean enPanne ;
    public Materiel (boolean enPanne)
    {
        this.enPanne = enPanne;
    }
    public boolean getEtat ()
    {
        return this.enPanne;
    }
    public void setEtat ( boolean enPanne)
    {
        this.enPanne = enPanne;
    }
}