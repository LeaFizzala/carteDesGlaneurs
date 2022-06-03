package vegetaux;

import java.time.LocalDate;

public class Arbuste extends Vegetal {
    private Feuille feuille;
    private Fruit fruit;
    public Arbuste(String description, String nom, LocalDate dateCueillette, Localisation lieu, Recette recette,
                   String habitat, String bienfaits, Photo photo, FauxAmi fauxAmi)
    {
        super(description, nom, dateCueillette, lieu, recette, habitat, bienfaits, photo, fauxAmi);
    }

    public Arbuste(String description, String nom, LocalDate dateCueillette, Localisation lieu, Recette recette,
                   String habitat, String bienfaits, Photo photo, FauxAmi fauxAmi, Feuille feuille, Fruit fruit) {
        super(description, nom, dateCueillette, lieu, recette, habitat, bienfaits, photo, fauxAmi);
        this.feuille = feuille;
        this.fruit = fruit;
    }
}
