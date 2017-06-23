package narrowOrParallel.dependencyChange;

import java.util.List;
import java.util.stream.Collectors;

public class Finder {
    UserRepository repository;
    Parser parser;

    Finder(UserRepository repository) {
        this.repository = repository;
    }

    public Finder(UserRepository repository, Parser parser) {
        this.repository = repository;
        this.parser = parser;
    }

    public static Finder createFinder(UserRepository repository) {
        return new Finder(repository, new Parser());
    }

    public List<User> find(String query){
        return repository.findAll()
                .stream()
                .filter(u -> u.profile.isEmpty() ||
                             u.profile.contains(query))
                .collect(Collectors.toList());
    }
}
