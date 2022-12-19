
package springboot2.repository;

import java.util.List;
import springboot2.domain.Anime;


public interface AnimeRepository {
    List<Anime> listAll();
    
}
