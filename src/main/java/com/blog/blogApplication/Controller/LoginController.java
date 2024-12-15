package com.blog.blogApplication.Controller;

import com.blog.blogApplication.JwtFiles.BlogUserDetailService;

import com.blog.blogApplication.JwtFiles.JwtService;
import com.blog.blogApplication.Records.LoginForm;
import com.blog.blogApplication.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = {"http://localhost:5173", "https://blog-sooty-theta-55.vercel.app/"})
@RestController
public class LoginController {
    @Autowired
    private MailController mailService;
    @Autowired
    private UsersRepository repo;
    @Autowired
    private JwtService jwtService;

    @Autowired
    private BlogUserDetailService blogUserDetailService;

    @PostMapping("/login")
    public ResponseEntity<?> userLogin(@RequestBody LoginForm loginForm) {
        return mailService.userLogin(loginForm);
    }


    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/send-otp")
    public ResponseEntity<?> sendOtp(@RequestParam String email) {
        return mailService.tokenValidationAndOtp(email);
    }
}
