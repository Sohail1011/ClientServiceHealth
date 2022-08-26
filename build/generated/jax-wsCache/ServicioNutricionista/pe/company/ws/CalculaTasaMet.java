
package pe.company.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para calculaTasaMet complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="calculaTasaMet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estatura" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="edad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculaTasaMet", propOrder = {
    "genero",
    "estatura",
    "peso",
    "edad"
})
public class CalculaTasaMet {

    protected String genero;
    protected double estatura;
    protected double peso;
    protected int edad;

    /**
     * Obtiene el valor de la propiedad genero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define el valor de la propiedad genero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Obtiene el valor de la propiedad estatura.
     * 
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * Define el valor de la propiedad estatura.
     * 
     */
    public void setEstatura(double value) {
        this.estatura = value;
    }

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     */
    public void setPeso(double value) {
        this.peso = value;
    }

    /**
     * Obtiene el valor de la propiedad edad.
     * 
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Define el valor de la propiedad edad.
     * 
     */
    public void setEdad(int value) {
        this.edad = value;
    }

}
