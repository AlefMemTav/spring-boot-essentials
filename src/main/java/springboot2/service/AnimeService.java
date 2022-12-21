
package springboot2.service;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import springboot2.domain.Anime;
//import springboot2.repository.AnimeRepository;

@Service
public class AnimeService{
    private List<Anime> animes = List.of(new Anime(1L,"DB2"), new Anime(2L,"Berserk"));
   public List<Anime> listAll(){  
        return animes;
   } 
   
    public Anime findById(long id){  
        return animes.stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> 
                        new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id not found"));
   } 
}
