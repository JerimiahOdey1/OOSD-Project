package edu.oosd.restservices.RestApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> home() {

        Map<String, Object> response = new HashMap<>();
        response.put("message", "Welcome to the API");

        Map<String, String> links = new HashMap<>();
        links.put("users", "http://localhost:8080/users");
        links.put("products", "http://localhost:8080/products");

        response.put("links", links);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}