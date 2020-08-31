package poc.graphql.soccer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poc.graphql.soccer.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
