package binarne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZRTest {
    @Test
    void najdłuższePołączenie() {
        String[] words = {
                "abc", "abuzs", "qwrty", "qwrtyu", "zupk", "defgh", "defghj", "loi"};

        int i = new ZR().najdłuższePołączenie(words);

        Assertions.assertEquals(21, i);
    }

}