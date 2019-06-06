package Quotes;

import com.sun.tools.corba.se.idl.InvalidArgument;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class AltSolutionTest {
    String path = "src/main/resources/recentquotes.json";
    @Test
    public void testAltSol_testObjCount(){
        AltSolution o = new AltSolution(path);
        int output = 138;
        assertEquals(o.getSize(),output);
    }
    @Test
    public void testAltSol_firstJsonObject_tags(){
        AltSolution o = new AltSolution(path);
        String output = "[\"attributed-no-source\"]";
        assertEquals(o.getValue("tags",0),output);
    }
    @Test
    public void testAltSol_secondLastJsonObject_tags(){
        AltSolution o = new AltSolution(path);
        String output = "[]";
        assertEquals(o.getValue("tags",136),output);
    }
    @Test
    public void testAltSol_thirdJsonObject_tags(){
        AltSolution o = new AltSolution(path);
        String output = "[\"march\",\"summer\",\"sun\",\"wind\",\"winter\"]";
        assertEquals(o.getValue("tags",2),output);
    }
    @Test
    public void testAltSol_seventhJsonObject_author(){
        AltSolution o = new AltSolution(path);
        String output = "\"Erik Pevernagie\"";
        assertEquals(o.getValue("author",7),output);
    }
    @Test
    public void testAltSol_tenthJsonObject_likes(){
        AltSolution o = new AltSolution(path);
        String output = "\"0 likes\"";
        assertEquals(o.getValue("likes",10),output);
    }
    @Test
    public void testAltSol_eleventhJsonObject_text(){
        AltSolution o = new AltSolution(path);
        String output = "\"Man is the only creature that consumes without producing\"";
        assertNotEquals(o.getValue("text",11),output);
    }
    @Test
            (expected = InvalidParameterException.class)
    public void testAltSol_invalidParam(){
        AltSolution o = new AltSolution(path);

        o.getValue("textss",11);
    }
}