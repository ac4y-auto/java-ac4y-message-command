package ac4y.command.message.algebra;

import ac4y.service.domain.Ac4yServiceRequest;

/**
 * Algebra class for message request operations.
 * <p>
 * This class extends {@link Ac4yServiceRequest} and provides the structure
 * for message-based requests. It contains all necessary fields for a message:
 * sender, addressee, subject, and body.
 * </p>
 * <p>
 * This follows an email-like message pattern suitable for inter-system
 * or inter-component communication.
 * </p>
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 * @since 1.0
 */
public class Ac4yCMDMessageRequestAlgebra extends Ac4yServiceRequest {

    /**
     * The sender identifier of the message.
     */
    private String sender;

    /**
     * The addressee/recipient identifier of the message.
     */
    private String addressee;

    /**
     * The subject line of the message.
     */
    private String subject;

    /**
     * The body/content of the message.
     */
    private String body;

    /**
     * Gets the sender of this message.
     *
     * @return the sender identifier
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the sender of this message.
     *
     * @param sender the sender identifier to set
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * Gets the addressee/recipient of this message.
     *
     * @return the addressee identifier
     */
    public String getAddressee() {
        return addressee;
    }

    /**
     * Sets the addressee/recipient of this message.
     *
     * @param addressee the addressee identifier to set
     */
    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    /**
     * Gets the subject line of this message.
     *
     * @return the message subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the subject line of this message.
     *
     * @param subject the message subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Gets the body/content of this message.
     *
     * @return the message body
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the body/content of this message.
     *
     * @param body the message body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

}
