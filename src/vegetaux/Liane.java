package vegetaux;

import java.time.LocalDate;

public class Liane extends Vegetal {
    public Liane(String description, String nom, LocalDate dateCueillette, Localisation lieu, Recette recette,
                 String habitat, String bienfaits, Photo photo, FauxAmi fauxAmi)
    {
        super(description, nom, dateCueillette, lieu, recette, habitat, bienfaits, photo, fauxAmi);
    }
}
