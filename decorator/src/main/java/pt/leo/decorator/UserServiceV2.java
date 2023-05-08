package pt.leo.decorator;

// This could be the second version of the service
// There is a breaking change, the removal of the email field from the user's data
public class UserServiceV2 extends UserService implements DataFetcher {
    DataFetcher dataFetcher;

    public UserServiceV2(DataFetcher userService) {
        this.dataFetcher = userService;
    }

    public String getUserData() {
        String userData = dataFetcher.getUserData();
        userData = userData.replaceAll("[ ]*email.*\n", "");
        return userData;
    }
}
