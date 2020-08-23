package poc.graphql.soccer.service;

import org.springframework.stereotype.Service;
import poc.graphql.soccer.repository.PlayerRepository;

@Service
public abstract class PlayerAbstractService {

    PlayerRepository repository;

    PlayerAbstractService(PlayerRepository repository) {
        this.repository = repository;
    }

}
