//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.04.01 a las 05:15:02 PM CST 
//


package org.example.cine;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.cine package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.cine
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeliculaResponse }
     * 
     */
    public PeliculaResponse createPeliculaResponse() {
        return new PeliculaResponse();
    }

    /**
     * Create an instance of {@link ReservacionRequest }
     * 
     */
    public ReservacionRequest createReservacionRequest() {
        return new ReservacionRequest();
    }

    /**
     * Create an instance of {@link PeliculaRequest }
     * 
     */
    public PeliculaRequest createPeliculaRequest() {
        return new PeliculaRequest();
    }

    /**
     * Create an instance of {@link ReservacionResponse }
     * 
     */
    public ReservacionResponse createReservacionResponse() {
        return new ReservacionResponse();
    }

}
