package test_autowired;

public class UserController {

    @Autowired
    private UserServer userServer;

    public UserServer getUserServer() {
        return userServer;
    }
}
