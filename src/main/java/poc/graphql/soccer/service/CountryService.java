package poc.graphql.soccer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poc.graphql.soccer.model.Country;
import poc.graphql.soccer.repository.CountryRepository;
import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Service
public class CountryService extends CountryAbstractService implements GraphQLQueryResolver {

    @Autowired
    CountryService(CountryRepository repository) {
        super(repository);
    }

    public List<Country> retrieveAllCountries() {
        return repository.findAll();
    }

}
