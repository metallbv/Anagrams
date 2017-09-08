package task;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test(timeout = 1000)
    public void verifyAnagrams() throws DifferentLengthException {

        Anagram anagram = new Anagram();

        assertEquals("elvis & lives are anagrams", true, anagram.verifyAnagrams("elvis", "lives"));
        assertEquals("vector & gector aren't anagrams", false, anagram.verifyAnagrams("vector", "gector"));
        try {
            anagram.verifyAnagrams("junior", "trainee");
            Assert.fail("Strings have different length");
        }
        catch (DifferentLengthException e) {
            Assert.assertNotEquals("", e.getMessage());
        }


    }

}