package co.springfeign.client;

import co.springfeign.configuration.FeignClientConfig;
import co.springfeign.dto.rickandmorty.RickAndMortyResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "RICK-AND-MORTY", url = "${external.rickandmorty.api.base-url}", configuration = FeignClientConfig.class)
public interface ICharacterClient {

    @GetMapping(value = "/character", consumes = MediaType.APPLICATION_JSON_VALUE)
    RickAndMortyResponse getInfo();
}
