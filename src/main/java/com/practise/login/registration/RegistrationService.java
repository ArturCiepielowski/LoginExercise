package com.practise.login.registration;

import com.practise.login.appuser.AppUser;
import com.practise.login.appuser.AppUserRole;
import com.practise.login.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    private final EmailValidator emailValidator;
    public String register(RegistrationRequest request) {

       boolean isValidEmail= emailValidator.test(request.getEmail());

       if (!isValidEmail){
           throw new IllegalStateException("email not valid");
       }
        return appUserService.signUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                        )
        );
    }
}
