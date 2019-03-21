package com.ashwinmulky.spring.security.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class SecurityResource {

    @GetMapping("/")
    public ResponseEntity<?> getBasePath() {
       return new ResponseEntity<>("base path !!", HttpStatus.OK);
    }

    @GetMapping("/first")
    public ResponseEntity<?> getFirstPath() {
        return new ResponseEntity<>("first path !!", HttpStatus.OK);
    }

    @GetMapping("/second")
    public ResponseEntity<?> getSecondPath() {
        return new ResponseEntity<>("second path !!", HttpStatus.OK);
    }

    @GetMapping("/third")
    public ResponseEntity<?> getThirdPath() {
        return new ResponseEntity<>("third path !!", HttpStatus.OK);
    }
}
