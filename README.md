FileHandler Project - Documentation

Welcome to FileHandler! This project provides a simple and efficient way to manage file operations in Java.

Overview

FileHandler is designed to help developers easily read from and write to files with proper resource management and error handling. It simplifies working with files by providing high-level methods while maintaining full control over file permissions and operations.

Features

Write text content to a file safely.

Read content from a file with proper resource management.

Built-in checks for file accessibility.

Exception handling for IO operations.

Easy integration into any Java project.

Getting Started

Prerequisites

Java Development Kit (JDK) 7 or higher

IDE or text editor of your choice (e.g., IntelliJ IDEA, Eclipse)

Usage

Writing to a File

File file = new File("path/to/your/file.txt");
FileHandler.writeFile("Hello, FileHandler!", file);

Reading from a File

File file = new File("path/to/your/file.txt");
String content = FileHandler.readFile(file);
System.out.println(content);

Method Descriptions

writeFile(String fileContent, File filePath)

Writes the given text content to the specified file.

Checks if the file is writable before attempting to write.

readFile(File filePath)

Reads and returns the content of the specified file as a String.

Ensures proper closing of resources.

Error Handling

All IO operations are wrapped with exception handling to ensure that any IOExceptions are caught and escalated as RuntimeExceptions, making it easier to manage errors at a higher level in the application.

Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

License

This project is open-source and available under the MIT License.
