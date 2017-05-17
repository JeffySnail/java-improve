package com.viashare;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;

/**
 * Created by Jeffy on 17/5/12.
 */
public class DurationMain {

    public static void main(String[] args) throws InterruptedException {

        System.err.println("f'");
        Instant first = Instant.now();
//        Thread.sleep(3000);
        Instant second = Instant.now();

        Duration duration = Duration.between(first, second);
        System.err.println(duration.getSeconds());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.err.println(dateTimeFormatter.format(LocalDateTime.now()));


    }
}
