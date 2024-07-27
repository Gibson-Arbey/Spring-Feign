package co.springfeign.dto.rickandmorty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoDto {
    private Integer count;
    private Integer pages;
    private String next;
    private String prev;
}
