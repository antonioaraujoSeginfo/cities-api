package antonioaraujoSeginfo.citiesapi.states.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("states")
public class StateResource<StateRepository> {

    private static final Logger log = LoggerFactory.getLogger(StateResource.class);
    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public boolean states(final Pageable page) {
        log.info("states, {}", page);
        return repository.equals(page);
    }
}
