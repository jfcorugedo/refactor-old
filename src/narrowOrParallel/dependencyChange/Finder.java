package narrowOrParallel.dependencyChange;

import java.util.List;
import java.util.stream.Collectors;

public class Finder {
    UserRepository repository;
    Parser parser;

    public Finder(UserRepository repository, Parser parser) {
        this.repository = repository;
        this.parser = parser;
    }

    public List<User> find(String query){
        return repository.findAll()
                .stream()
                .filter(u -> u.profile.isEmpty() ||
                             u.profile.contains(query))
                .collect(Collectors.toList());
    }
}
