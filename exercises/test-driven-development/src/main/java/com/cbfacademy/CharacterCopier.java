package com.cbfacademy;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharacterCopier {

    private final Reader source;
    private final Writer destination;

    public CharacterCopier(Reader source, Writer destination) {
        this.source = source;
        this.destination = destination;
    }

    public void copy() throws IOException {
        int character;
        while ((character = source.read()) != -1) {
            if (character == '\n') {
                break; // Stop copying on newline
            }
            destination.write(character); // Write the character to the destination
        }
        destination.flush(); // Ensure all data is written out
    }
}
