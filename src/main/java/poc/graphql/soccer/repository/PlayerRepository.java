package poc.graphql.soccer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poc.graphql.soccer.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

    //Player findByJerseyNumber(int jerseyNumber);

}
