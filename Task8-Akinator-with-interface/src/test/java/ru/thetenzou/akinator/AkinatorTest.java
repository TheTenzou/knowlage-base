package ru.thetenzou.akinator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.thethenzou.akinator.Akinator;
import ru.thethenzou.character.Character;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;

public class AkinatorTest {

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
                1,1,1,1,0);
        Optional<Character> result = akinator.guess(character);
        Assertions.assertTrue(result.isEmpty());
    }
}
