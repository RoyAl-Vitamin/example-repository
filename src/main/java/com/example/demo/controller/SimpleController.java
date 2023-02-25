package com.example.demo.controller;

import com.example.demo.dto.SimpleDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SimpleController {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SimpleDto> getFood(@RequestParam("name") String name) {
        log.info("GET: /hello?name=" + name);

        return ResponseEntity.ok(new SimpleDto(String.format("Hello %s!", name)));
    }
}
