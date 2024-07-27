package co.springfeign.dto.rickandmorty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class CharacterDto {
    private Integer id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private Origin origin;
    private Location location;
    private String image;
    private List<String> episode;
    private String url;
    private String created;
}

// Clase que representa el origen de un personaje
@Getter
@Setter
class Origin {
    private String name;
    private String url;
}

// Clase que representa la ubicación de un personaje
@Getter
@Setter
class Location {
    private String name;
    private String url;
}
