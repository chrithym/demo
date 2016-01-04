//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.01.04 um 02:44:22 AM CET 
//


package de.casedevelop.io.xml.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unusedBegin">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="solution">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="areas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="area" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="table" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tableId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                       &lt;element name="seats" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                       &lt;element name="position">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                                 &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                                 &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                                 &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "version",
    "unusedBegin",
    "solution",
    "areas"
})
@XmlRootElement(name = "location_configuration")
public class LocationConfiguration {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected LocationConfiguration.UnusedBegin unusedBegin;
    @XmlElement(required = true)
    protected LocationConfiguration.Solution solution;
    @XmlElement(required = true)
    protected LocationConfiguration.Areas areas;

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der unusedBegin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocationConfiguration.UnusedBegin }
     *     
     */
    public LocationConfiguration.UnusedBegin getUnusedBegin() {
        return unusedBegin;
    }

    /**
     * Legt den Wert der unusedBegin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationConfiguration.UnusedBegin }
     *     
     */
    public void setUnusedBegin(LocationConfiguration.UnusedBegin value) {
        this.unusedBegin = value;
    }

    /**
     * Ruft den Wert der solution-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocationConfiguration.Solution }
     *     
     */
    public LocationConfiguration.Solution getSolution() {
        return solution;
    }

    /**
     * Legt den Wert der solution-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationConfiguration.Solution }
     *     
     */
    public void setSolution(LocationConfiguration.Solution value) {
        this.solution = value;
    }

    /**
     * Ruft den Wert der areas-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocationConfiguration.Areas }
     *     
     */
    public LocationConfiguration.Areas getAreas() {
        return areas;
    }

    /**
     * Legt den Wert der areas-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationConfiguration.Areas }
     *     
     */
    public void setAreas(LocationConfiguration.Areas value) {
        this.areas = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="area" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="table" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tableId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                             &lt;element name="seats" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                             &lt;element name="position">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                                       &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                                       &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                                       &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "area"
    })
    public static class Areas {

        protected List<LocationConfiguration.Areas.Area> area;

        /**
         * Gets the value of the area property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the area property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArea().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LocationConfiguration.Areas.Area }
         * 
         * 
         */
        public List<LocationConfiguration.Areas.Area> getArea() {
            if (area == null) {
                area = new ArrayList<LocationConfiguration.Areas.Area>();
            }
            return this.area;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="table" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tableId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                   &lt;element name="seats" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                   &lt;element name="position">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                             &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                             &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                             &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
            "name",
            "table"
        })
        public static class Area {

            @XmlElement(required = true)
            protected String name;
            protected List<LocationConfiguration.Areas.Area.Table> table;

            /**
             * Ruft den Wert der name-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Legt den Wert der name-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the table property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the table property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTable().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LocationConfiguration.Areas.Area.Table }
             * 
             * 
             */
            public List<LocationConfiguration.Areas.Area.Table> getTable() {
                if (table == null) {
                    table = new ArrayList<LocationConfiguration.Areas.Area.Table>();
                }
                return this.table;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="tableId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *         &lt;element name="seats" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *         &lt;element name="position">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *                   &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *                   &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *                   &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
                "tableId",
                "seats",
                "position"
            })
            public static class Table {

                @XmlElement(required = true)
                protected BigInteger tableId;
                @XmlElement(required = true)
                protected BigInteger seats;
                @XmlElement(required = true)
                protected LocationConfiguration.Areas.Area.Table.Position position;

                /**
                 * Ruft den Wert der tableId-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTableId() {
                    return tableId;
                }

                /**
                 * Legt den Wert der tableId-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTableId(BigInteger value) {
                    this.tableId = value;
                }

                /**
                 * Ruft den Wert der seats-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSeats() {
                    return seats;
                }

                /**
                 * Legt den Wert der seats-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSeats(BigInteger value) {
                    this.seats = value;
                }

                /**
                 * Ruft den Wert der position-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LocationConfiguration.Areas.Area.Table.Position }
                 *     
                 */
                public LocationConfiguration.Areas.Area.Table.Position getPosition() {
                    return position;
                }

                /**
                 * Legt den Wert der position-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LocationConfiguration.Areas.Area.Table.Position }
                 *     
                 */
                public void setPosition(LocationConfiguration.Areas.Area.Table.Position value) {
                    this.position = value;
                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}integer"/>
                 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}integer"/>
                 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}integer"/>
                 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
                    "x",
                    "y",
                    "width",
                    "height"
                })
                public static class Position {

                    @XmlElement(required = true)
                    protected BigInteger x;
                    @XmlElement(required = true)
                    protected BigInteger y;
                    @XmlElement(required = true)
                    protected BigInteger width;
                    @XmlElement(required = true)
                    protected BigInteger height;

                    /**
                     * Ruft den Wert der x-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getX() {
                        return x;
                    }

                    /**
                     * Legt den Wert der x-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setX(BigInteger value) {
                        this.x = value;
                    }

                    /**
                     * Ruft den Wert der y-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getY() {
                        return y;
                    }

                    /**
                     * Legt den Wert der y-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setY(BigInteger value) {
                        this.y = value;
                    }

                    /**
                     * Ruft den Wert der width-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getWidth() {
                        return width;
                    }

                    /**
                     * Legt den Wert der width-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setWidth(BigInteger value) {
                        this.width = value;
                    }

                    /**
                     * Ruft den Wert der height-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getHeight() {
                        return height;
                    }

                    /**
                     * Legt den Wert der height-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setHeight(BigInteger value) {
                        this.height = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "x",
        "y"
    })
    public static class Solution {

        @XmlElement(required = true)
        protected BigInteger x;
        @XmlElement(required = true)
        protected BigInteger y;

        /**
         * Ruft den Wert der x-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getX() {
            return x;
        }

        /**
         * Legt den Wert der x-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setX(BigInteger value) {
            this.x = value;
        }

        /**
         * Ruft den Wert der y-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getY() {
            return y;
        }

        /**
         * Legt den Wert der y-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setY(BigInteger value) {
            this.y = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "value"
    })
    public static class UnusedBegin {

        @XmlElement(required = true)
        protected BigInteger value;

        /**
         * Ruft den Wert der value-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

    }

}
