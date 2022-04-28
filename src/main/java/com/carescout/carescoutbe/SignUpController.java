package com.carescout.carescoutbe;

import LoginService.LoginService;
import Models.LoginCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/login")
public class SignUpController {
    private final SignUpService signUpService;

    @Autowired
    public SignUpController() {
        this.signUpService = new signUpService();
    }

    @GetMapping()
    public String LandingPage(){
        return "Welcome to the Carescout";
    }

    @GetMapping("/all-credentials")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<signUpService> GetCredentials(){
        return this.signUpService.GetUserCredentials();
    }

    @PostMapping()
    @CrossOrigin(origins = "http://localhost:4200")
    public boolean Login(@RequestBody signUpService signUpService){
        return this.signUpService.CheckCredentials(signUpService);
    }

}
