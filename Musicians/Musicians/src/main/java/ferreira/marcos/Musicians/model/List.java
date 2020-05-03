package ferreira.marcos.Musicians.model;

import lombok.*;

/**
 * @ Marcos Ferreira
 * @ 30/04/2020
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class List {
    @Setter
    @Getter
    private String name;

    @Setter @Getter
    private String music;

    @Setter @Getter
    private String city;


}
