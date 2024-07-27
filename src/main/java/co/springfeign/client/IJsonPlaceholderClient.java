package co.springfeign.client;

import co.springfeign.configuration.FeignClientConfig;
import co.springfeign.dto.jsonplaceholder.UserDto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "JSON-PLACEHOLDER", url = "${external.jsonplaceholder.api.base-url}", configuration = FeignClientConfig.class)
public interface IJsonPlaceholderClient {

    @GetMapping(value = "/posts", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<UserDto> getUsers();
}
