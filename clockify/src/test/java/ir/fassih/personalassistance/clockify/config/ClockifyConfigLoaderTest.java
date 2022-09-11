package ir.fassih.personalassistance.clockify.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockifyConfigLoaderTest {



    @Test
    void test_loadFile() {
        var stream = ClockifyConfigLoaderTest.class.getClassLoader()
                .getResourceAsStream("test-loader.properties");
        var loaded = ClockifyConfigLoader.load(stream);

        Assertions.assertEquals("some-token", loaded.getToken());
    }
}