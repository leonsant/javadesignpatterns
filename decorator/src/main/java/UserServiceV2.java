// This could be the second version of the service
// There is a breaking change, the removal of the email field from the user's data
public class UserServiceV2 extends UserService {
    UserService userService;

    public UserServiceV2(UserService userService) {
        this.userService = userService;
    }

    public String getUserData() {
        String userData = userService.getUserData();
        userData = userData.replaceAll("[ ]*email.*\n", "");
        return userData;
    }
}
