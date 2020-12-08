package ru.thetenzou.akinator;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.thethenzou.akinator.Akinator;
import ru.thethenzou.models.Character;

import java.io.*;
import java.util.Arrays;
import java.util.Optional;
import java.util.Properties;

public class AkinatorTest {

    @AfterAll
    public static void cleanUp() throws IOException {
        File folder = new File("src/test/resources/answers");
        Arrays.stream(folder.listFiles()).filter(file -> file.getName().endsWith(".txt")).forEach(File::delete);

        File folderBackup = new File("src/test/resources/backups");
        FileUtils.copyDirectory(folderBackup, folder);
    }

    @Test
    public void questionTest() throws IOException {

        Properties properties = new Properties();
        try (InputStream inputStream = new FileInputStream("src/test/resources/application.properties")) {
            properties.load(inputStream);
        }
        Akinator akinator = new Akinator(properties);
        Character character = new Character(
                1,1,1,1,1,
                1,1,1,1,1);
        Optional<Character> result = akinator.guess(character);
        Assertions.assertTrue(result.isPresent());

        character.setName("test");

        Assertions.assertEquals(character, result.get());
    }

    @Test
    public void questionEmptyTest() throws IOException {

        Properties properties = new Properties();
        try (InputStream inputStream = new FileInputStream("src/test/resources/application.properties")) {
            properties.load(inputStream);
        }
        Akinator akinator = new Akinator(properties);
        Character character = new Character(
                1,1,1,1,1,
                1,1,1,0,0);
        Optional<Character> result = akinator.guess(character);
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    public void saveTest() throws IOException {

        Properties properties = new Properties();
        try (InputStream inputStream = new FileInputStream("src/test/resources/application.properties")) {
            properties.load(inputStream);
        }
        Akinator akinator = new Akinator(properties);
        Character expectedCharacter = new Character(
                "save",
                1,1,1,1,1,
                1,1,1,1,0);
        akinator.save(expectedCharacter);

        Character character = new Character(
                1,1,1,1,1,
                1,1,1,1,0);

        Optional<Character> result = akinator.guess(character);

        System.out.println(result.get().getName());

    }
}
