package tech.art.dreamart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.art.dreamart.model.Artist;
import tech.art.dreamart.service.ArtistService;

import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtistResource {
    private final ArtistService artistService;

    @Autowired
    public ArtistResource(ArtistService artistService){
        this.artistService = artistService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Artist>> getAllArtistes(){
        List<Artist> artists = artistService.findAllArtistes();
        return new ResponseEntity<>(artists, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Artist> getArtistById(@PathVariable("id") Long id){
        Artist artist = artistService.findArtistById(id);
        return new ResponseEntity<>(artist, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Artist> addArtist(@RequestBody Artist artist){
       Artist artist1 = artistService.addArtist(artist);
        return new ResponseEntity<>(artist1, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Artist> updateArtist(@RequestBody Artist artist){
        Artist updateArtist = artistService.upDateArtist(artist);
        return new ResponseEntity<>(updateArtist, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteArtist(@PathVariable("id") Long id){
        artistService.deleteArtist(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }


}
