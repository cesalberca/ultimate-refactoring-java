package dependencyChange;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpecificFinder {

    private final Finder finder;

    public SpecificFinder(UserRepository repository) {
        finder = new Finder(repository);
    }

    public Set<User> findUnique(String query){
        return new HashSet<>(find(query));
    }

    public List<User> find(String query) {
        return finder.find(query);
    }
}
