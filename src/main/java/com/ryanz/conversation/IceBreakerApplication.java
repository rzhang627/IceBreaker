package com.ryanz.conversation;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.http.HttpException;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class IceBreakerApplication {
    public static void main(String[] args) {
        SpringApplication.run(IceBreakerApplication.class, args);
    }
}