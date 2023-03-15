package com.perf2k2.rsaxml2pem;

import junit.framework.TestCase;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainTest extends TestCase {

    public void testMain() throws Exception {
        byte[] encoded = Files.readAllBytes(Paths.get("src/test/data/private.pem").toAbsolutePath());
        String pemKey = new String(encoded, StandardCharsets.US_ASCII);
        Result result = Main.convert(Paths.get("src/test/data/private.xml").toAbsolutePath().toString());

        assertEquals(pemKey, result.getContent());

        encoded = Files.readAllBytes(Paths.get("src/test/data/public.pem").toAbsolutePath());
        pemKey = new String(encoded, StandardCharsets.US_ASCII);
        result = Main.convert(Paths.get("src/test/data/public.xml").toAbsolutePath().toString());

        assertEquals(pemKey, result.getContent());
    }
}
