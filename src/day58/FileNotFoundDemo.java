package day58;
import java.io.IOException;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDemo {
    public static void main(String[] args) throws IOException {
        try {
        System.out.println("Trying to compile...");
            Files.readAllLines(Paths.get("Hello.java","Cybertek","file.txt", "more files"));
            System.out.println("before catch");
        } catch (IOException e) {
            System.out.println("e = " + e.toString());
        }
    }
}
