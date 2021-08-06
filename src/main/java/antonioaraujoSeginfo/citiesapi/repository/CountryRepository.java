package antonioaraujoSeginfo.citiesapi.repository;

import antonioaraujoSeginfo.citiesapi.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
