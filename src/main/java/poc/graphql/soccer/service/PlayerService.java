package poc.graphql.soccer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poc.graphql.soccer.model.Player;
import poc.graphql.soccer.repository.PlayerRepository;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Service
public class PlayerService implements GraphQLQueryResolver {

    private PlayerRepository repository;

    @Autowired
    PlayerService(PlayerRepository repository) {
        this.repository = repository;
    }

    public List<Player> retrieveAllPlayers() {
        return repository.findAll();
    }

    public Player retrievePlayerById(int playerId){
        return repository.findById(playerId).orElse(null);
    }

    public Player retrievePlayerByJerseyNumber(int jerseyNumber){
        return repository.findByJerseyNumber(jerseyNumber).orElse(null);
    }

}
