package co.springfeign.dto.jsonplaceholder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private Integer id;
    private Integer userId;
    private String title;
    private String body;
}
