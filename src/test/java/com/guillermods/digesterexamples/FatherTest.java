package com.guillermods.digesterexamples;


        import org.apache.commons.digester.Digester;
        import org.apache.commons.digester.xmlrules.DigesterLoader;
        import org.junit.Assert;
        import org.junit.Test;
        import org.xml.sax.SAXException;

        import java.io.File;
        import java.io.IOException;
        import java.util.Iterator;

/**
 * Created by gdiazs on 06/09/2016.
 */
public class FatherTest {


    @Test
    public void setUp() throws IOException, SAXException {
        File file = new File(this.getClass().getClassLoader().getResource("example-digester-rules.xml").getPath());
        File fatherXMl = new File(this.getClass().getClassLoader().getResource("example.xml").getPath());
        Digester digester;
        digester = DigesterLoader.createDigester(file.toURL());
        Father myFather = (Father) digester.parse(fatherXMl);

        Iterator<Child> childs = myFather.getChilds().iterator();

        while (childs.hasNext()){
            System.out.println(childs.next());
        }


    }
}