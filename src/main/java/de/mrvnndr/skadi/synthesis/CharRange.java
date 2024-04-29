package de.mrvnndr.skadi.synthesis;

import java.util.Iterator;
import java.util.SortedSet;

public record CharRange(Character low, Character high) {

    public static Iterator<CharRange> iterator(SortedSet<Character> chars) {
        return new Iter(chars);
    }

    private static class Iter implements Iterator<CharRange> {
        private final Iterator<Character> charIterator;
        private Character lookahead;
        private boolean charRemaining;

        public Iter(SortedSet<Character> chars) {
            this.charIterator = chars.iterator();
        }

        @Override
        public boolean hasNext() {
            return this.charIterator.hasNext();
        }

        @Override
        public CharRange next() {
            var lowerChar = getNextCharacter();
            if (!this.charIterator.hasNext()) {
                return new CharRange(lowerChar, lowerChar);
            }

            var upperChar = getNextCharacter();

            if (upperChar - lowerChar > 1) {
                charRemaining = true;
                return new CharRange(lowerChar, lowerChar);
            }

            do {
                var next = getNextCharacter();
                if (next - upperChar > 1) {
                    charRemaining = true;
                    return new CharRange(lowerChar, upperChar);
                }
                upperChar = next;
            } while (this.charIterator.hasNext());

            return new CharRange(lowerChar, upperChar);
        }

        private Character getNextCharacter() {
            if (charRemaining) {
                this.charRemaining = false;
                return this.lookahead;
            }
            this.lookahead = this.charIterator.next();
            return this.lookahead;
        }
    }
}
