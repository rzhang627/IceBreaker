# IceBreaker

IceBreaker is a Java-based project that generates new conversation topics using Google's Gemini 2.0 Flash API. In particular, Maven is used for dependency management and execution.

## Features
- Queries Google's Gemini API to generate conversation topics
- Java backend with a structured client-server approach
- Maven-based build and dependency management

## Prerequisites
Before running this project, ensure you have:
- **Java 17+** installed (`java -version` to check)
- **Maven 3.6+** installed (`mvn -v` to check)
- A **Google Gemini API key** (stored securely in environment variables)
    - Generate an API key here: `https://aistudio.google.com/apikey`

## Installation & Setup
### 1. Clone the Repository
```sh
git clone --recusrive https://github.com/rzhang627/IceBreaker.git
cd IceBreaker
```

### 2. Set Up Your Google API Key
Ensure your API key is stored securely:
#### **Option 1: Set Environment Variable (Recommended)**
```sh
export GOOGLE_API_KEY="your-api-key"
```
For Windows (PowerShell):
```powershell
$env:GOOGLE_API_KEY="your-api-key"
```

#### **Option 2: Use a `.env` File**
Create a `.env` file and add:
```
GOOGLE_API_KEY=your-api-key
```

### 3. Build the Project
```sh
mvn clean compile
```

### 4. Run the Application
On Windows:
```sh
mvn exec:java -D"exec.mainClass"="com.ryanz.conversation.IceBreaker"
```
For other platforms:
```sh
mvn exec:java -Dexec.mainClass="com.ryanz.conversation.IceBreaker"
```

## Project Structure
```
IceBreaker/
│── src/
│   ├── main/
│   │   ├── java/com/ryanz/conversation/
│   │   │   ├── IceBreaker.java
│   │   │   ├── GeminiClient.java
│── libs/
│   ├── java-genai/ (Google's Java SDK for Gemini, added as a Git submodule)
│── pom.xml
│── .gitignore
│── README.md
```

## Dependencies (Managed via Maven)
- `com.google.genai:genai-sdk` (Google Gemini API SDK)
- `org.apache.maven.plugins:maven-compiler-plugin`
- `org.codehaus.mojo:exec-maven-plugin` (for running the app via Maven)

## Troubleshooting
### "`mvn` is not recognized"
Ensure Maven is installed and added to the system `PATH`. Restart your terminal after installation.

### "Unknown lifecycle phase '.mainClass'"
Use the correct execution command:
```sh
mvn exec:java -Dexec.mainClass="com.ryanz.conversation.IceBreaker"
```

### "Invalid target release: 17"
Ensure Java 17 is set as the default:
```sh
java -version
```
If Java 11 appears, update `JAVA_HOME` to point to Java 17.

### For other issues, reference the relevant documentation as necessary.