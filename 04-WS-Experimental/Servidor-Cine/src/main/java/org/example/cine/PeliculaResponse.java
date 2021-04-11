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
 *         &lt;element name="idPelicula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lugaresD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lugaresO" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idPelicula",
    "nombreP",
    "lugaresD",
    "lugaresO"
})
@XmlRootElement(name = "PeliculaResponse")
public class PeliculaResponse {

    @XmlElement(required = true)
    protected String idPelicula;
    @XmlElement(required = true)
    protected String nombreP;
    @XmlElement(required = true)
    protected String lugaresD;
    @XmlElement(required = true)
    protected String lugaresO;

    /**
     * Obtiene el valor de la propiedad idPelicula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPelicula() {
        return idPelicula;
    }

    /**
     * Define el valor de la propiedad idPelicula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPelicula(String value) {
        this.idPelicula = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreP() {
        return nombreP;
    }

    /**
     * Define el valor de la propiedad nombreP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreP(String value) {
        this.nombreP = value;
    }

    /**
     * Obtiene el valor de la propiedad lugaresD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugaresD() {
        return lugaresD;
    }

    /**
     * Define el valor de la propiedad lugaresD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugaresD(String value) {
        this.lugaresD = value;
    }

    /**
     * Obtiene el valor de la propiedad lugaresO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugaresO() {
        return lugaresO;
    }

    /**
     * Define el valor de la propiedad lugaresO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugaresO(String value) {
        this.lugaresO = value;
    }

}
