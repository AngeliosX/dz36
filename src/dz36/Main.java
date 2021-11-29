package dz36;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        Path filePath = Paths.get("file.txt");
        try {
            Files.write(filePath, "Привет nio".getBytes(UTF_8));
            byte[] bytes = Files.readAllBytes(filePath);
            System.out.println(new String(bytes, UTF_8));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
