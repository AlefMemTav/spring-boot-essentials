
package springboot2.service;

import java.util.List;
import org.springframework.stereotype.Service;
import springboot2.domain.Anime;
//import springboot2.repository.AnimeRepository;

@Service
public class AnimeService{
//  private final animeRepository AnimeRepository;
   public List<Anime> listAll(){  
        return List.of(new Anime(1L,"DB2"), new Anime(2L,"Berserk"));
   } 
}
