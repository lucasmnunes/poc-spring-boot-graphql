package poc.graphql.soccer.service;

import org.springframework.stereotype.Service;
import poc.graphql.soccer.repository.CountryRepository;

@Service
public abstract class CountryAbstractService {

    CountryRepository repository;

    CountryAbstractService(CountryRepository repository) {
        this.repository = repository;
    }

}
