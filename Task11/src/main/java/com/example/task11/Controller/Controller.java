package com.example.task11.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class Controller {

    @GetMapping("/minsk")
    public String GetMoscowTime() {
        return ZonedDateTime.now(ZoneId.of("Europe/Moscow")).format(DateTimeFormatter.ofPattern("HH:mm:ss z"));
    }

    @GetMapping("/washington")
    public String GetWashingtonTime() {
        return ZonedDateTime.now(ZoneId.of("America/New_York")).format(DateTimeFormatter.ofPattern("HH:mm:ss z"));
    }

    @GetMapping("/beijing")
    public String GetBeijingTime() {
        return ZonedDateTime.now(ZoneId.of("Asia/Shanghai")).format(DateTimeFormatter.ofPattern("HH:mm:ss z"));
    }
}
