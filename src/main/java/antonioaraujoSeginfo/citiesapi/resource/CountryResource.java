package antonioaraujoSeginfo.citiesapi.resource;

import antonioaraujoSeginfo.citiesapi.entity.Country;
import antonioaraujoSeginfo.citiesapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    public Page<Country> countries(Pageable page){
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Optional<Country> optionalCountry = repository.findById(id);
        if (optionalCountry.isPresent())
            return ResponseEntity.ok().body(optionalCountry.get());
        return ResponseEntity.notFound().build();
    }
}
