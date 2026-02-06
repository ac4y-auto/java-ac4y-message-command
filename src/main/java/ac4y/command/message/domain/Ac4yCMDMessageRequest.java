package ac4y.command.message.domain;

import ac4y.command.message.algebra.Ac4yCMDMessageRequestAlgebra;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Domain class representing a message request.
 * <p>
 * This class extends {@link Ac4yCMDMessageRequestAlgebra} and is annotated
 * for XML/JSON serialization. It represents a complete message request with
 * sender, addressee, subject, and body fields.
 * </p>
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 * @since 1.0
 * @see Ac4yCMDMessageRequestAlgebra
 */
@XmlRootElement
public class Ac4yCMDMessageRequest extends Ac4yCMDMessageRequestAlgebra {
}
