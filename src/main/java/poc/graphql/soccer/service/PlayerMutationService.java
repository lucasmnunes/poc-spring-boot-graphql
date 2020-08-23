package poc.graphql.soccer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poc.graphql.soccer.model.Player;
import poc.graphql.soccer.model.input.PlayerInput;
import poc.graphql.soccer.repository.PlayerRepository;

import javax.transaction.Transactional;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLSubscriptionResolver;

@Service
public class PlayerMutationService extends PlayerAbstractService
        implements GraphQLMutationResolver, GraphQLSubscriptionResolver {

    @Autowired
    PlayerMutationService(PlayerRepository repository) {
        super(repository);
    }

    @Transactional
    public Player updatePlayerJerseyById(PlayerInput playerInput){
        Player player = repository.findById(playerInput.getId()).orElse(null);
        player.setJerseyNumber(playerInput.getJerseyNumber());
        repository.save(player);
        return repository.save(player);
    }

}
