//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.04.17 a las 09:58:07 PM CDT 
//


package cafeteria.pedidos;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cafeteria.pedidos package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cafeteria.pedidos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadAllResponse }
     * 
     */
    public ReadAllResponse createReadAllResponse() {
        return new ReadAllResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link ReadResponse }
     * 
     */
    public ReadResponse createReadResponse() {
        return new ReadResponse();
    }

    /**
     * Create an instance of {@link ReadAllRequest }
     * 
     */
    public ReadAllRequest createReadAllRequest() {
        return new ReadAllRequest();
    }

    /**
     * Create an instance of {@link CreatePedidoRequest }
     * 
     */
    public CreatePedidoRequest createCreatePedidoRequest() {
        return new CreatePedidoRequest();
    }

    /**
     * Create an instance of {@link ReadAllResponse.Pedido }
     * 
     */
    public ReadAllResponse.Pedido createReadAllResponsePedido() {
        return new ReadAllResponse.Pedido();
    }

    /**
     * Create an instance of {@link CreatePedidoResponse }
     * 
     */
    public CreatePedidoResponse createCreatePedidoResponse() {
        return new CreatePedidoResponse();
    }

    /**
     * Create an instance of {@link DeleteRequest }
     * 
     */
    public DeleteRequest createDeleteRequest() {
        return new DeleteRequest();
    }

    /**
     * Create an instance of {@link ReadRequest }
     * 
     */
    public ReadRequest createReadRequest() {
        return new ReadRequest();
    }

}
