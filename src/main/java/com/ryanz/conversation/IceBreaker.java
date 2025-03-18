package com.ryanz.conversation;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import java.io.IOException;
import org.apache.http.HttpException;
import java.util.Scanner;

public class IceBreaker {
    public static void main(String[] args) {
        try {
            Client client = GeminiClient.getClient();
            Scanner scan = new Scanner(System.in);

            String model = "gemini-2.0-flash-001";
            System.out.println("Enter a prompt:");
            String prompt = scan.nextLine();

            GenerateContentResponse response = client.models.generateContent(model, prompt, null);
            System.out.println(response.text());
            scan.close();
        } catch (IOException | HttpException e) {
            e.printStackTrace();
        }
    }
}