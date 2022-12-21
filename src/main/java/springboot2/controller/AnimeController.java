
package springboot2.controller;

import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot2.domain.Anime;
import springboot2.service.AnimeService;
import springboot2.util.DateUtil;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {
    private final AnimeService animeService;
    private final DateUtil dateUtil;

    @GetMapping
    public ResponseEntity<List<Anime>> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return  ResponseEntity.ok(animeService.listAll());
    }
    
    @GetMapping(path = "/{id}")
    public ResponseEntity<Anime>findById(@PathVariable long id){
        return  ResponseEntity.ok(animeService.findById(id));
    }
}
