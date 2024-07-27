package co.springfeign.dto.rickandmorty;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class RickAndMortyResponse {
    private InfoDto info;

    @JsonProperty("results")
    private List<CharacterDto> characters;
}
