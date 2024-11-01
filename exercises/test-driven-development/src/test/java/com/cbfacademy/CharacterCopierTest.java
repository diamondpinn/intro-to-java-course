package com.cbfacademy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterCopierTest {

    private StringWriter destination; // This will be our spy
    private Reader source; // We will create a manual test double for this

    @BeforeEach
    void setUp() {
        destination = new StringWriter();
    }

    @Test
    void testCopyStopsAtNewline() throws IOException {
        // Test input simulating a source that returns characters until a newline
        String input = "Hello, World!\nThis should not be copied.";
        source = new TestReader(input); // Use our manual test double

        CharacterCopier copier = new CharacterCopier(source, destination);
        copier.copy();

        assertEquals("Hello, World!", destination.toString()); // Verify copied content
    }

    // Manual test double for Reader
    private static class TestReader extends Reader {
        private final String input;
        private int index = 0;

        public TestReader(String input) {
            this.input = input;
        }

        @Override
        public int read(char[] cbuf, int off, int len) throws IOException {
            if (index >= input.length()) {
                return -1; // End of input
            }
            int count = 0;
            while (index < input.length() && count < len) {
                cbuf[off + count] = input.charAt(index++);
                count++;
            }
            return count; // Number of characters read
        }

        @Override
        public void close() throws IOException {
            // No action needed for this simple implementation
        }
    }
}
