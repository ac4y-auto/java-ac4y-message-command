package ac4y.command.message.domain;

import ac4y.command.message.algebra.Ac4yCMDMessageAlgebra;
import ac4y.service.domain.Ac4yServiceRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Domain class representing a Message Command in the Ac4y framework.
 * <p>
 * This command type is used for sending messages between systems or components.
 * It automatically initializes with a MESSAGE command name and creates a message
 * request if one doesn't exist.
 * </p>
 * <p>
 * The message request contains fields for sender, addressee, subject, and body,
 * making it suitable for email-like message operations.
 * </p>
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 * @since 1.0
 * @see Ac4yCMDMessageAlgebra
 * @see Ac4yCMDMessageRequest
 */
@XmlRootElement
public class Ac4yCMDMessage extends Ac4yCMDMessageAlgebra {

    /**
     * Constructs a new Ac4yCMDMessage.
     * <p>
     * Automatically initializes the message request if it doesn't exist,
     * and sets the command name to "MESSAGE".
     * </p>
     */
    public Ac4yCMDMessage() {
        if (getRequest()==null)
            createRequest();
        setCommandName("MESSAGE");
    }

}
