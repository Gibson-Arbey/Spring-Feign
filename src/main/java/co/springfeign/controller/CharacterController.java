package co.springfeign.controller;

import co.springfeign.dto.rickandmorty.CharacterDto;
import co.springfeign.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/character")
@RequiredArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping
    public ResponseEntity<List<CharacterDto>> getCharacters() {
        return ResponseEntity.status(HttpStatus.OK).body(characterService.getCharacters());
    }
}
