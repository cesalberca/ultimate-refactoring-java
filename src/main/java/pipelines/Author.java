package pipelines;

/*
Refactoring to pipelines by Martin Fowler:

https://martinfowler.com/articles/refactoring-pipelines.html
 */

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Author {
    public String company;
    public String twitterHandle;

    static public List<String> twitterHandles(List<Author> authors, String company) {
        return authors.stream()
                .filter(a -> a.company.equals(company))
                .map(a -> a.twitterHandle)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
