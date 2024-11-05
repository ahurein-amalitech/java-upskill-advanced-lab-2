package org.example.ex_1_secure_with_oauth2;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("public")
    public String anonymousHello(){
        return "Anonymous Hello";
    }

    @GetMapping("private")
    public String privateHello(@AuthenticationPrincipal OAuth2User principal){
        return principal.getAttribute("name");
    }
}
