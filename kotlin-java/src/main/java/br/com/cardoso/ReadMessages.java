package br.com.cardoso;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ReadMessages {

    public List<String> readContentFromFile() throws URISyntaxException, IOException {
        File file = new File(ReadMessages.class.getClassLoader().getResource("messages.txt").toURI());
        return Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
    }
}
