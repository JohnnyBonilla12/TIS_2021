//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.05.26 a las 10:00:05 AM CDT 
//


package cafeteria.pedidos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="pedido" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="id_carrito" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="costo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "pedido"
})
@XmlRootElement(name = "ReadAllResponse")
public class ReadAllResponse {

    @XmlElement(required = true)
    protected List<ReadAllResponse.Pedido> pedido;

    /**
     * Gets the value of the pedido property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pedido property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedido().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadAllResponse.Pedido }
     * 
     * 
     */
    public List<ReadAllResponse.Pedido> getPedido() {
        if (pedido == null) {
            pedido = new ArrayList<ReadAllResponse.Pedido>();
        }
        return this.pedido;
    }


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
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="id_carrito" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="costo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "id",
        "idCarrito",
        "fecha",
        "costo",
        "status",
        "direccion"
    })
    public static class Pedido {

        protected int id;
        @XmlElement(name = "id_carrito")
        protected int idCarrito;
        @XmlElement(required = true)
        protected String fecha;
        @XmlElement(required = true)
        protected BigDecimal costo;
        @XmlElement(required = true)
        protected String status;
        @XmlElement(required = true)
        protected String direccion;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad idCarrito.
         * 
         */
        public int getIdCarrito() {
            return idCarrito;
        }

        /**
         * Define el valor de la propiedad idCarrito.
         * 
         */
        public void setIdCarrito(int value) {
            this.idCarrito = value;
        }

        /**
         * Obtiene el valor de la propiedad fecha.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFecha() {
            return fecha;
        }

        /**
         * Define el valor de la propiedad fecha.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFecha(String value) {
            this.fecha = value;
        }

        /**
         * Obtiene el valor de la propiedad costo.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCosto() {
            return costo;
        }

        /**
         * Define el valor de la propiedad costo.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCosto(BigDecimal value) {
            this.costo = value;
        }

        /**
         * Obtiene el valor de la propiedad status.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Define el valor de la propiedad status.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Obtiene el valor de la propiedad direccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * Define el valor de la propiedad direccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccion(String value) {
            this.direccion = value;
        }

    }

}
