package tech.art.dreamart.repo;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.art.dreamart.model.Artist;


public interface ArtistRepo extends JpaRepository<Artist, Long> {
    void deleteArtistById(Long id);

    Optional<Artist> findArtistById(Long id);
}
