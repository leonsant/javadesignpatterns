package pt.leo.decorator;

// This could be the first version of the service
public class UserService {
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
