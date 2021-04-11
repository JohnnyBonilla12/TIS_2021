//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.04.01 a las 05:15:02 PM CST 
//


package org.example.cine;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservacionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reservacionID"
})
@XmlRootElement(name = "ReservacionResponse")
public class ReservacionResponse {

    @XmlElement(name = "ReservacionID", required = true)
    protected String reservacionID;

    /**
     * Obtiene el valor de la propiedad reservacionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservacionID() {
        return reservacionID;
    }

    /**
     * Define el valor de la propiedad reservacionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservacionID(String value) {
        this.reservacionID = value;
    }

}
