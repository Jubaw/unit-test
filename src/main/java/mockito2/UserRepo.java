package mockito2;

public class UserRepo {


    public String getUserName(int userId){

        if (userId==1){
            return "Gökhan";
        } else if (userId==2) {
            return "Ayşe";
        } else if (userId==3) {
            return "Fatma";
        }else {
            return null;
        }
    }
}
