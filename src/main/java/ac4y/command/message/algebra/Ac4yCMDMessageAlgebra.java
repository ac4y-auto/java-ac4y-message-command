package ac4y.command.message.algebra;

import ac4y.command.domain.Ac4yCommand;
import ac4y.command.message.domain.Ac4yCMDMessageRequest;
import ac4y.service.domain.Ac4yServiceRequest;
import ac4y.service.domain.Ac4yServiceResponse;

import javax.xml.bind.JAXBException;

/**
 * Algebra class for message command operations.
 * <p>
 * This class extends {@link Ac4yCommand} and provides the algebraic structure
 * for message-based commands. It manages a request-response pattern for
 * message transmission operations.
 * </p>
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 * @since 1.0
 */
public class Ac4yCMDMessageAlgebra extends Ac4yCommand {

    /**
     * The message request containing sender, addressee, subject and body.
     */
    protected Ac4yCMDMessageRequest request;

    /**
     * The service response after processing the message command.
     */
    protected Ac4yServiceResponse response;

    /**
     * Gets the service response for this message command.
     *
     * @return the service response, or null if not set
     */
    public Ac4yServiceResponse getResponse() {
        return response;
    }

    /**
     * Sets the service response for this message command.
     *
     * @param response the service response to set
     */
    public void setResponse(Ac4yServiceResponse response) {
        this.response = response;
    }

    /**
     * Gets the message request for this command.
     *
     * @return the message request, or null if not created
     */
    public Ac4yCMDMessageRequest getRequest() {
        return request;
    }

    /**
     * Sets the message request for this command.
     *
     * @param request the message request to set
     */
    public void setRequest(Ac4yCMDMessageRequest request) {
        this.request = request;
    }

    /**
     * Creates and initializes a new message request.
     * <p>
     * This method instantiates a new {@link Ac4yCMDMessageRequest} and
     * assigns it to this command.
     * </p>
     */
    public void createRequest(){
        setRequest(new Ac4yCMDMessageRequest());
    }

}
