package tech.art.dreamart.service;

import tech.art.dreamart.model.Artist;

import java.util.List;

public interface ArtistService {

    Artist addArtist(Artist artist);

    List<Artist> findAllArtistes();

    Artist upDateArtist(Artist artist);

    void deleteArtist(Long id);

    Artist findArtistById(Long id);
}
