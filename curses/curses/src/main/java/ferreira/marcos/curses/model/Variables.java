package ferreira.marcos.curses.model;


import lombok.*;
/**
 * @ Marcos Ferreira
 * @ 30/04/2020
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Variables {

    @Getter @Setter
    private String curse;
    @Getter @Setter
    private String length;
}
