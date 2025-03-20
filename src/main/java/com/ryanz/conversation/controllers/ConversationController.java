package com.ryanz.conversation.controllers;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.web.bind.annotation.*;
import org.apache.http.HttpException;
import java.io.IOException;
import java.util.Scanner;

@RestController
@RequestMapping("/api")
public class ConversationController {
    private final Client client = Client.builder().apiKey(System.getenv("GOOGLE_API_KEY")).build();

    @GetMapping("/generateTopic")
    public String generateTopic(@RequestParam(defaultValue = "Generate a new conversation topic") String prompt) throws IOException, HttpException {
        GenerateContentResponse response = client.models.generateContent("gemini-2.0-flash-001", prompt, null);
        return response.text();
    }
}