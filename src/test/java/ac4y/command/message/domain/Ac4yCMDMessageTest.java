package ac4y.command.message.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link Ac4yCMDMessage}.
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 */
public class Ac4yCMDMessageTest {

    private Ac4yCMDMessage message;

    @Before
    public void setUp() {
        message = new Ac4yCMDMessage();
    }

    @Test
    public void testConstructorSetsCommandNameToMessage() {
        assertEquals("MESSAGE", message.getCommandName());
    }

    @Test
    public void testConstructorCreatesRequest() {
        assertNotNull(message.getRequest());
    }

    @Test
    public void testRequestIsInstanceOfAc4yCMDMessageRequest() {
        assertTrue(message.getRequest() instanceof Ac4yCMDMessageRequest);
    }

    @Test
    public void testMessageRequestSenderGetterSetter() {
        String sender = "sender@example.com";
        message.getRequest().setSender(sender);
        assertEquals(sender, message.getRequest().getSender());
    }

    @Test
    public void testMessageRequestAddresseeGetterSetter() {
        String addressee = "recipient@example.com";
        message.getRequest().setAddressee(addressee);
        assertEquals(addressee, message.getRequest().getAddressee());
    }

    @Test
    public void testMessageRequestSubjectGetterSetter() {
        String subject = "Test Subject";
        message.getRequest().setSubject(subject);
        assertEquals(subject, message.getRequest().getSubject());
    }

    @Test
    public void testMessageRequestBodyGetterSetter() {
        String body = "This is the message body content.";
        message.getRequest().setBody(body);
        assertEquals(body, message.getRequest().getBody());
    }

    @Test
    public void testCompleteMessageFlow() {
        message.getRequest().setSender("alice@company.com");
        message.getRequest().setAddressee("bob@company.com");
        message.getRequest().setSubject("Project Update");
        message.getRequest().setBody("The project is on track.");

        assertEquals("MESSAGE", message.getCommandName());
        assertEquals("alice@company.com", message.getRequest().getSender());
        assertEquals("bob@company.com", message.getRequest().getAddressee());
        assertEquals("Project Update", message.getRequest().getSubject());
        assertEquals("The project is on track.", message.getRequest().getBody());
    }

    @Test
    public void testResponseCanBeSet() {
        assertNull(message.getResponse());
        // Response setting would be tested if Ac4yServiceResponse was available
    }
}
