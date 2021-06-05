package br.com.cardoso;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ReadMessages {

    public List<String> readContentFromFile() throws URISyntaxException, IOException {
        URL resource = ReadMessages.class.getClassLoader().getResource("messages.txt");
        if (resource != null) {

            File file = new File(resource.toURI());
            return Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        }
        return new ArrayList<>();
    }
}
