package co.springfeign.service;

import co.springfeign.client.IJsonPlaceholderClient;
import co.springfeign.dto.jsonplaceholder.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final IJsonPlaceholderClient jsonPlaceholderClient;

    public List<UserDto> getUsers() {
        return jsonPlaceholderClient.getUsers();
    }
}
