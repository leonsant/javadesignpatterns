public class Main {
    private static void showUser(UserService userService) {
        System.out.println(userService.getUserData());
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        showUser(userService);

        UserServiceV2 userServiceNoEmail = new UserServiceV2(userService);
        showUser(userServiceNoEmail);
    }
}
