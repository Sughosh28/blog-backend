package com.blog.blogApplication.Service;

import com.blog.blogApplication.Controller.MailController;
import com.blog.blogApplication.DTO.AuthResponse;
import com.blog.blogApplication.JwtFiles.BlogUserDetailService;
import com.blog.blogApplication.JwtFiles.JwtService;
import com.blog.blogApplication.Model.Users;
import com.blog.blogApplication.Records.LoginForm;
import com.blog.blogApplication.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Optional;

@Service
public class LoginService {


    @Autowired
    private MailController mailService;
    @Autowired
    private UsersRepository repo;
    @Autowired
    private JwtService jwtService;


    }
