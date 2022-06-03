package vegetaux;

import java.time.LocalDate;

public class Plante extends Vegetal{
    private Feuille feuille;
    private Racine racine;
    private Fleur fleur;
    public Plante(String description, String nom, LocalDate dateCueillette, Localisation lieu, Recette recette,
                  String habitat, String bienfaits, Photo photo, FauxAmi fauxAmi) {
        super(description, nom, dateCueillette, lieu, recette, habitat, bienfaits, photo, fauxAmi);
    }

    public Plante(String description, String nom, LocalDate dateCueillette, Localisation lieu, Recette recette,
                  String habitat, String bienfaits, Photo photo, FauxAmi fauxAmi, Feuille feuille, Racine racine, Fleur fleur) {
        super(description, nom, dateCueillette, lieu, recette, habitat, bienfaits, photo, fauxAmi);
        this.feuille = feuille;
        this.racine = racine;
        this.fleur = fleur;
    }
}
