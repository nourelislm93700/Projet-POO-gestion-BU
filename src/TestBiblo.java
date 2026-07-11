public class TestBiblo 
{
    public static void main (String [] args)
    {
        Bibliotheque ParisNanterre = new Bibliotheque();
       

        Livre livre1 = new Livre("L'appel de l'ange", "Guillaume Musso", "XO éditions", true);
        Livre livre2 = new Livre("Demain", "Guillaume Musso", "Calmann-Lévy", true);
        Livre livre3 = new Livre("Harry Potter à l'école des sorciers", "J.K. Rowling", "Gallimard", true);
        Livre livre4 = new Livre("Le Seigneur des anneaux : La Communauté de l'Anneau", "J.R.R. Tolkien", "Christian Bourgois Éditeur", true);
        Livre livre5 = new Livre("1984", "George Orwell", "Secker and Warburg", true);
        Livre livre6 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", "Gallimard", true);
        Livre livre7 = new Livre("Le Parrain", "Mario Puzo", "G.P. Putnam's Sons", true);
        Livre livre8 = new Livre("Orgueil et Préjugés", "Jane Austen", "T. Egerton, Whitehall", true);
        Livre livre9 = new Livre("Le Meilleur des mondes", "Aldous Huxley", "Chatto & Windus", true);
        Livre livre10 = new Livre("Les Misérables", "Victor Hugo", "A. Lacroix, Verboeckhoven & Cie", true);
        Livre livre11 = new Livre("Quelqu'un d'autre" , "Guillaume Musso" ,"XO éditions", true);

        ParisNanterre.ajouterDocument(livre1);
        System.out.println("____________________________________________________________________________________________");
        ParisNanterre.ajouterDocument(livre2);
        System.out.println("____________________________________________________________________________________________");

        ParisNanterre.ajouterDocument(livre3);
        System.out.println("____________________________________________________________________________________________");

        ParisNanterre.ajouterDocument(livre4);
        System.out.println("____________________________________________________________________________________________");

        ParisNanterre.ajouterDocument(livre5);
        System.out.println("____________________________________________________________________________________________");

        ParisNanterre.ajouterDocument(livre6);
        System.out.println("____________________________________________________________________________________________");

        ParisNanterre.ajouterDocument(livre7);
        System.out.println("____________________________________________________________________________________________");

        ParisNanterre.ajouterDocument(livre8);
        System.out.println("____________________________________________________________________________________________");

        ParisNanterre.ajouterDocument(livre9);
        System.out.println("____________________________________________________________________________________________");

        ParisNanterre.ajouterDocument(livre10);
        System.out.println("____________________________________________________________________________________________");

        ParisNanterre.ajouterDocument(livre11);
        System.out.println("____________________________________________________________________________________________");

      

        BandeDessinee Bande1 = new BandeDessinee ("Astérix" , "René Goscinny" , "Albert Uderzo");
        
        ParisNanterre.ajouterDocument(Bande1);
        System.out.println("____________________________________________________________________________________________");


        OrdinateurPortable ordi1 = new OrdinateurPortable(false, "HP", Os.WINDOWS, true);
        OrdinateurPortable ordi2 = new OrdinateurPortable(false, "MacBook", Os.LINUX, true);
        OrdinateurPortable ordi3 = new OrdinateurPortable(false, "MacBook Pro", Os.LINUX, true);
        OrdinateurPortable ordi4 = new OrdinateurPortable(false, "Dell XPS", Os.WINDOWS, true);
        OrdinateurPortable ordi5 = new OrdinateurPortable(false, "Lenovo ThinkPad", Os.WINDOWS, true);
        OrdinateurPortable ordi6 = new OrdinateurPortable(false, "Microsoft Surface", Os.WINDOWS, true);
        OrdinateurPortable ordi7 = new OrdinateurPortable(false, "Asus ZenBook", Os.WINDOWS, true);
        OrdinateurPortable ordi8 = new OrdinateurPortable(false, "Acer Swift", Os.WINDOWS, true);

        ParisNanterre.ajouterMateriel(ordi1);
        System.out.println("____________________________________________________________________________________________");

        ParisNanterre.ajouterMateriel(ordi2);
        System.out.println("____________________________________________________________________________________________");

        ParisNanterre.ajouterMateriel(ordi3);
        System.out.println("____________________________________________________________________________________________");

        ParisNanterre.ajouterMateriel(ordi4);
        System.out.println("____________________________________________________________________________________________");

        ParisNanterre.ajouterMateriel(ordi5);
        System.out.println("____________________________________________________________________________________________");

        ParisNanterre.ajouterMateriel(ordi6);
        System.out.println("____________________________________________________________________________________________");

        ParisNanterre.ajouterMateriel(ordi7);
        System.out.println("____________________________________________________________________________________________");

        ParisNanterre.ajouterMateriel(ordi8);
        System.out.println("____________________________________________________________________________________________");

   
    

        Adherant florian = new Adherant("Bury", "Florian ", Statut.ETUDIANT);
        Adherant nathan = new Adherant("Berthezenz", "Nathan", Statut.ETUDIANT);

        Adherant Doua = new Adherant("Djemai", "Doua", Statut.ETUDIANT);
        Adherant Nacera = new Adherant("El hassani", "Nacera", Statut.ETUDIANT);
        Adherant walid = new Adherant("Adnan", "walid", Statut.ETUDIANT);
        Adherant ammaria = new Adherant("Benmoussa", "Ammaria", Statut.ETUDIANT);
        Adherant Nassima = new Adherant("Benmoussa", "Nassima", Statut.ETUDIANT);







       ParisNanterre.ajouterAdherant(florian);
       System.out.println("____________________________________________________________________________________________");
       ParisNanterre.ajouterAdherant(nathan);
       System.out.println("____________________________________________________________________________________________");
       ParisNanterre.ajouterAdherant(Doua);
       System.out.println("____________________________________________________________________________________________");
       ParisNanterre.ajouterAdherant(Nacera);
       System.out.println("____________________________________________________________________________________________");
       ParisNanterre.ajouterAdherant(walid);
       System.out.println("____________________________________________________________________________________________");
       ParisNanterre.ajouterAdherant(ammaria);
       System.out.println("____________________________________________________________________________________________");
       ParisNanterre.ajouterAdherant(Nassima);
       System.out.println("____________________________________________________________________________________________");

       System.out.println ( " les Opération de Florian Bury " );
       florian.emprunterLivre(livre1);
       florian.emprunterLivre(livre2);
       florian.emprunterLivre(livre3);
       florian.emprunterLivre(livre4);
       florian.emprunterLivre(livre5);
       florian.emprunterLivre(livre6);
       florian.emprunterOrdi(ordi1);
       florian.emprunterOrdi(ordi8);
       florian.rendreOrdi(ordi1);
       florian.emprunterOrdi(ordi8);

       System.out.println ( " __________________________________ " );

       System.out.println ( " les Opération de Nassima Benmoussa " );

       Nassima.rendreOrdi(ordi4);
       Nassima.emprunterLivre(livre2);
       Nassima.emprunterLivre(livre11);
       Nassima.emprunterLivre(livre9);


     
    






       

       

        

    

    }
}