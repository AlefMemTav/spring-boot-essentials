
package springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data 
@AllArgsConstructor
public class Anime {
    public Long id;
    private String name;
}
