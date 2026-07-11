public abstract class Document 
{
    private String titre;
    private String auteur;
    public Document (String titre , String auteur )
    {
        this.titre = titre;
        this.auteur = auteur;
    }
    public String getTitre ()
    {
        return this.titre;
    }

    public void setTitre(String titre)
    {
        this.titre = titre;
    }
    public String getAuteur ()
    {
        return this.auteur;
    }

    public void setAuteur( String auteur)
    {
        this.auteur = auteur;
    }
}