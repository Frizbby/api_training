package fr.esiea.ex4A;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TitiIT {

    private final Titi titi;

    TitiIT() {
        this.titi = new Titi("test", "test");
    }
    @Test
    void getName() {
        Assertions.assertEquals("test", this.titi.getName());
    }

    @Test
    void getTwitter() {
        Assertions.assertEquals("test", this.titi.getTwitter());
    }
}
