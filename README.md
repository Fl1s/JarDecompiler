# JarExtractor

JarExtractor is a console utility written in Java designed to extract the contents of JAR files to a specified directory. The program prompts the user for the paths to the JAR file and the extraction directory, creates the directory if it does not exist, extracts the files, and lists all extracted files.

## Features

- Extraction of JAR file contents.
- Automatic creation of the extraction directory.
- Recursive listing of all extracted files.

## Installation and Usage

### Requirements

- Java Development Kit (JDK) version 8 or higher
- Java compiler (`javac`)

### Building the Project

1. Clone the repository or download the source code.

    ```sh
    git clone https://github.com/your-repo/JarExtractor.git
    cd JarExtractor
    ```

2. Compile the project using the command line.

    ```sh
    javac JarExtractor.java
    ```

### Running the Program

1. Run the program.

    ```sh
    java JarExtractor
    ```

2. Enter the path to the JAR file you want to extract and press Enter.

3. Enter the path to the directory for extracting the files and press Enter.

4. The program will perform the extraction and list all extracted files.

## Usage Example

```
Enter the path to the JAR file:
C:/path/to/your/file.jar
Enter the path to the extraction directory:
C:/path/to/extract/directory
Extracted files:
file1.txt
folder/file2.txt
...
```

## Project Structure

- **JarExtractor.java**: The main class that ties together all components of the program.
- **ConsoleInterface.java**: The class for interacting with the user through the console.
- **FileManager.java**: The class for managing files and directories.
- **Extractor.java**: The class for extracting the contents of JAR files.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
