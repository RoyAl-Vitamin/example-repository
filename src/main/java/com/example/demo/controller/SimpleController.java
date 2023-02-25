package com.example.demo.controller;

import com.example.demo.dto.SimpleDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
@RestController
public class SimpleController {

    private final String HOST;

    public SimpleController() throws UnknownHostException {
        this.HOST = InetAddress.getLocalHost().getHostName();
    }

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SimpleDto> getHello(@RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            name = "undefined user";
        }
        log.info("GET: /hello?name=" + name);

        return ResponseEntity.ok(new SimpleDto(String.format("Hello %s!", name), HOST));
    }
}
