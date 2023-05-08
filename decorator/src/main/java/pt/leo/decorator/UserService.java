package pt.leo.decorator;

// This could be the first version of the service
public class UserService implements DataFetcher {
    public String getUserData() {
        return """
                {
                   name: "John"
                   surname: "Rambo"
                   email: "johnrambo@mail.com"
                }
                """;
    }
}
