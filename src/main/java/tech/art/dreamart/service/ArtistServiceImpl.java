package tech.art.dreamart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.art.dreamart.exception.UserNotFoundException;
import tech.art.dreamart.model.Artist;
import tech.art.dreamart.repo.ArtistRepo;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class ArtistServiceImpl implements ArtistService{
    private final ArtistRepo artistRepo;

    @Autowired
    public ArtistServiceImpl(ArtistRepo artistRepo){
        this.artistRepo = artistRepo;
    }


    public Artist addArtist(Artist artist) {
        artist.setArtistCode(UUID.randomUUID().toString());
        return artistRepo.save(artist);

    }

    public List<Artist> findAllArtistes() {
        return artistRepo.findAll();
    }

    public Artist upDateArtist(Artist artist) {
        return artistRepo.save(artist);
    }

    public void deleteArtist(Long id) {
        artistRepo.deleteArtistById(id);
    }

    public Artist findArtistById(Long id) {
        return artistRepo.findArtistById(id).orElseThrow(() -> new UserNotFoundException("User not found"));
    }


}
