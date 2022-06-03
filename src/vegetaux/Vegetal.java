package vegetaux;

import java.time.LocalDate;

public class Vegetal {
    private String description;
    private String nom;
    private LocalDate dateCueillette;
    private Localisation lieu;
    private Recette recette;
    private String habitat;
    private String bienfaits;
    private Photo photo;
    private FauxAmi fauxAmi;

    public Vegetal(String description, String nom, LocalDate dateCueillette,
                   Localisation lieu, Recette recette, String habitat, String bienfaits, Photo photo, FauxAmi fauxAmi) {
        this.description = description;
        this.nom = nom;
        this.dateCueillette = dateCueillette;
        this.lieu = lieu;
        this.recette = recette;
        this.habitat = habitat;
        this.bienfaits = bienfaits;
        this.photo = photo;
        this.fauxAmi = fauxAmi;
    }
}
