package com.adflix.infrastructure;

import org.junit.jupiter.api.Assertions;

public class MainTest {

    public void testMain() {
        Assertions.assertNotNull(new Main());
        Main.main(new String[]{});
    }
}
