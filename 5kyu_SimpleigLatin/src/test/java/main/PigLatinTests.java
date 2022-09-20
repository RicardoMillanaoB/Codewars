package main;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PigLatinTests {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }

    @Test
    public void test2(){
        assertEquals("?? olaHay !",PigLatin.pigIt("?? Hola !"));
    }
}