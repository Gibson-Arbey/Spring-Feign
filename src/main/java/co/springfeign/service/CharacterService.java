package co.springfeign.service;

import co.springfeign.client.ICharacterClient;
import co.springfeign.dto.rickandmorty.CharacterDto;
import co.springfeign.dto.rickandmorty.RickAndMortyResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private  final ICharacterClient characterClient;

    public List<CharacterDto> getCharacters() {
        RickAndMortyResponse response = characterClient.getInfo();
        return response.getCharacters();
    }
}
