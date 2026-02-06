package ac4y.command.message.algebra;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link Ac4yCMDMessageRequestAlgebra}.
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 */
public class Ac4yCMDMessageRequestAlgebraTest {

    private Ac4yCMDMessageRequestAlgebra algebra;

    @Before
    public void setUp() {
        algebra = new Ac4yCMDMessageRequestAlgebra();
    }

    @Test
    public void testSenderInitiallyNull() {
        assertNull(algebra.getSender());
    }

    @Test
    public void testAddresseeInitiallyNull() {
        assertNull(algebra.getAddressee());
    }

    @Test
    public void testSubjectInitiallyNull() {
        assertNull(algebra.getSubject());
    }

    @Test
    public void testBodyInitiallyNull() {
        assertNull(algebra.getBody());
    }

    @Test
    public void testSetAndGetSender() {
        String sender = "test@sender.com";
        algebra.setSender(sender);
        assertEquals(sender, algebra.getSender());
    }

    @Test
    public void testSetAndGetAddressee() {
        String addressee = "test@recipient.com";
        algebra.setAddressee(addressee);
        assertEquals(addressee, algebra.getAddressee());
    }

    @Test
    public void testSetAndGetSubject() {
        String subject = "Important Message";
        algebra.setSubject(subject);
        assertEquals(subject, algebra.getSubject());
    }

    @Test
    public void testSetAndGetBody() {
        String body = "This is a test message body with multiple lines.\nLine 2\nLine 3";
        algebra.setBody(body);
        assertEquals(body, algebra.getBody());
    }

    @Test
    public void testAllFieldsCanBeSetAndRetrieved() {
        algebra.setSender("sender@test.com");
        algebra.setAddressee("recipient@test.com");
        algebra.setSubject("Test Subject");
        algebra.setBody("Test Body");

        assertEquals("sender@test.com", algebra.getSender());
        assertEquals("recipient@test.com", algebra.getAddressee());
        assertEquals("Test Subject", algebra.getSubject());
        assertEquals("Test Body", algebra.getBody());
    }

    @Test
    public void testFieldsCanBeSetToNull() {
        algebra.setSender("sender");
        algebra.setAddressee("addressee");
        algebra.setSubject("subject");
        algebra.setBody("body");

        algebra.setSender(null);
        algebra.setAddressee(null);
        algebra.setSubject(null);
        algebra.setBody(null);

        assertNull(algebra.getSender());
        assertNull(algebra.getAddressee());
        assertNull(algebra.getSubject());
        assertNull(algebra.getBody());
    }

    @Test
    public void testEmptyStrings() {
        algebra.setSender("");
        algebra.setAddressee("");
        algebra.setSubject("");
        algebra.setBody("");

        assertEquals("", algebra.getSender());
        assertEquals("", algebra.getAddressee());
        assertEquals("", algebra.getSubject());
        assertEquals("", algebra.getBody());
    }
}
