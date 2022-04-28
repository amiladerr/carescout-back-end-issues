package signUpService;

import Models.SignUpCredentials;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
@Component
public class SignUpService {

    private ArrayList<SignUpCredentials> Users = new ArrayList<>();
    public SignUpService() {
        Users.add(new SignUpCredentials("slayer", "12345", "salih@gmail.com", "Salih","Music", "062 123 123","27","Male"));
        Users.add(new SignUpCredentials("beksh", "250500","bekir@gmail.com","Bekir","Hadziomerovic","062 987 654", "Male"));
        Users.add(new SignUpCredentials("amderr", "102030","amila@gmail.com", "Amila", "Hadziomerovic", "061 123 456", "Female"));
    }

    public ArrayList<SignUpCredentials> GetUserCredentials(){
        return this.Users;
    }

    
}
