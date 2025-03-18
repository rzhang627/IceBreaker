package com.ryanz.conversation;

import com.google.genai.Client;

public class GeminiClient {
    // Implement Singleton Design Pattern to ensure only one Client exists
    private static Client client;

    private GeminiClient() {}

    public static Client getClient() {
        if (client == null) {
            // Fetch API key from environment variables
            String apiKey = System.getenv("GOOGLE_API_KEY");
            if (apiKey == null || apiKey.isEmpty()) {
                throw new IllegalStateException("GOOGLE_API_KEY environment variable is not set.");
            }
            client = Client.builder().apiKey(apiKey).build();
        }
        return client;
    }
}