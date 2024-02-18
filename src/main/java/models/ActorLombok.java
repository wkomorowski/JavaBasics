package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActorLombok {
    private String firstName;
    private String lastName;
    private int rating;
    private boolean isOscarPrized;

}
