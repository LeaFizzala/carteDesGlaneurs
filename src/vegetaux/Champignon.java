package vegetaux;

import java.time.LocalDate;

public class Champignon extends Vegetal {
    public Champignon(String description, String nom, LocalDate dateCueillette, Localisation lieu, Recette recette,
                      String habitat, String bienfaits, Photo photo, FauxAmi fauxAmi) {
        super(description, nom, dateCueillette, lieu, recette, habitat, bienfaits, photo, fauxAmi);
    }
}
