package mockito2;

public class UserService {

    private UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }

    public String getUser(int id){

        String name=repo.getUserName(id);

        if (name==null){

            throw new RuntimeException("User not found!");

        }
        return "Dear "+name;

    }


}
