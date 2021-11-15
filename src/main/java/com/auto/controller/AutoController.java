package com.auto.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class AutoController {
    @GetMapping(value = "/hi/{name}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String dummyAPI(@PathVariable(name = "name") String userName) {
        return "Hi.. " + userName + "!.. Welcome to the automobile application";
    }

    @GetMapping(value = "/{num}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String checkAPI(@PathVariable(name = "num") int number) {
        return IntStream.rangeClosed(0, number).mapToObj(a -> String.valueOf(a)).collect(Collectors.toList()).toString();
    }


}
