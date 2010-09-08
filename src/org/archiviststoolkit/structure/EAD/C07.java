//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.11 at 01:13:59 PM EDT 
//


package org.archiviststoolkit.structure.EAD;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for c07 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="c07">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="head" type="{urn:isbn:1-931666-22-9}head" minOccurs="0"/>
 *         &lt;element name="did" type="{urn:isbn:1-931666-22-9}did"/>
 *         &lt;group ref="{urn:isbn:1-931666-22-9}m.desc.full" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="thead" type="{urn:isbn:1-931666-22-9}thead" minOccurs="0"/>
 *           &lt;element name="c08" type="{urn:isbn:1-931666-22-9}c08" maxOccurs="unbounded"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:isbn:1-931666-22-9}a.desc.c"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c07", namespace = "urn:isbn:1-931666-22-9", propOrder = {
    "head",
    "did",
    "mDescFull",
    "theadAndC08"
})
public class C07 {

    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected Head head;
    @XmlElement(namespace = "urn:isbn:1-931666-22-9", required = true)
    protected Did did;
    @XmlElements({
        @XmlElement(name = "daogrp", namespace = "urn:isbn:1-931666-22-9", type = Daogrp.class),
        @XmlElement(name = "userestrict", namespace = "urn:isbn:1-931666-22-9", type = Userestrict.class),
        @XmlElement(name = "acqinfo", namespace = "urn:isbn:1-931666-22-9", type = Acqinfo.class),
        @XmlElement(name = "dsc", namespace = "urn:isbn:1-931666-22-9", type = Dsc.class),
        @XmlElement(name = "accessrestrict", namespace = "urn:isbn:1-931666-22-9", type = Accessrestrict.class),
        @XmlElement(name = "odd", namespace = "urn:isbn:1-931666-22-9", type = Odd.class),
        @XmlElement(name = "appraisal", namespace = "urn:isbn:1-931666-22-9", type = Appraisal.class),
        @XmlElement(name = "originalsloc", namespace = "urn:isbn:1-931666-22-9", type = Originalsloc.class),
        @XmlElement(name = "note", namespace = "urn:isbn:1-931666-22-9", type = Note.class),
        @XmlElement(name = "bibliography", namespace = "urn:isbn:1-931666-22-9", type = Bibliography.class),
        @XmlElement(name = "phystech", namespace = "urn:isbn:1-931666-22-9", type = Phystech.class),
        @XmlElement(name = "prefercite", namespace = "urn:isbn:1-931666-22-9", type = Prefercite.class),
        @XmlElement(name = "controlaccess", namespace = "urn:isbn:1-931666-22-9", type = Controlaccess.class),
        @XmlElement(name = "dao", namespace = "urn:isbn:1-931666-22-9", type = Dao.class),
        @XmlElement(name = "otherfindaid", namespace = "urn:isbn:1-931666-22-9", type = Otherfindaid.class),
        @XmlElement(name = "processinfo", namespace = "urn:isbn:1-931666-22-9", type = Processinfo.class),
        @XmlElement(name = "fileplan", namespace = "urn:isbn:1-931666-22-9", type = Fileplan.class),
        @XmlElement(name = "relatedmaterial", namespace = "urn:isbn:1-931666-22-9", type = Relatedmaterial.class),
        @XmlElement(name = "scopecontent", namespace = "urn:isbn:1-931666-22-9", type = Scopecontent.class),
        @XmlElement(name = "separatedmaterial", namespace = "urn:isbn:1-931666-22-9", type = Separatedmaterial.class),
        @XmlElement(name = "descgrp", namespace = "urn:isbn:1-931666-22-9", type = Descgrp.class),
        @XmlElement(name = "accruals", namespace = "urn:isbn:1-931666-22-9", type = Accruals.class),
        @XmlElement(name = "custodhist", namespace = "urn:isbn:1-931666-22-9", type = Custodhist.class),
        @XmlElement(name = "altformavail", namespace = "urn:isbn:1-931666-22-9", type = Altformavail.class),
        @XmlElement(name = "index", namespace = "urn:isbn:1-931666-22-9", type = Index.class),
        @XmlElement(name = "arrangement", namespace = "urn:isbn:1-931666-22-9", type = Arrangement.class),
        @XmlElement(name = "bioghist", namespace = "urn:isbn:1-931666-22-9", type = Bioghist.class)
    })
    protected List<Object> mDescFull;
    @XmlElements({
        @XmlElement(name = "thead", namespace = "urn:isbn:1-931666-22-9", type = Thead.class),
        @XmlElement(name = "c08", namespace = "urn:isbn:1-931666-22-9", type = C08 .class)
    })
    protected List<Object> theadAndC08;
    @XmlAttribute
    protected AvLevel level;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String tpattern;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String altrender;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String audience;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String otherlevel;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String encodinganalog;

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link Head }
     *     
     */
    public Head getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link Head }
     *     
     */
    public void setHead(Head value) {
        this.head = value;
    }

    /**
     * Gets the value of the did property.
     * 
     * @return
     *     possible object is
     *     {@link Did }
     *     
     */
    public Did getDid() {
        return did;
    }

    /**
     * Sets the value of the did property.
     * 
     * @param value
     *     allowed object is
     *     {@link Did }
     *     
     */
    public void setDid(Did value) {
        this.did = value;
    }

    /**
     * Gets the value of the mDescFull property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mDescFull property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMDescFull().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Daogrp }
     * {@link Userestrict }
     * {@link Acqinfo }
     * {@link Dsc }
     * {@link Accessrestrict }
     * {@link Odd }
     * {@link Appraisal }
     * {@link Originalsloc }
     * {@link Note }
     * {@link Bibliography }
     * {@link Phystech }
     * {@link Prefercite }
     * {@link Controlaccess }
     * {@link Dao }
     * {@link Otherfindaid }
     * {@link Processinfo }
     * {@link Fileplan }
     * {@link Relatedmaterial }
     * {@link Scopecontent }
     * {@link Separatedmaterial }
     * {@link Descgrp }
     * {@link Accruals }
     * {@link Custodhist }
     * {@link Altformavail }
     * {@link Index }
     * {@link Arrangement }
     * {@link Bioghist }
     * 
     * 
     */
    public List<Object> getMDescFull() {
        if (mDescFull == null) {
            mDescFull = new ArrayList<Object>();
        }
        return this.mDescFull;
    }

    /**
     * Gets the value of the theadAndC08 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theadAndC08 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheadAndC08().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Thead }
     * {@link C08 }
     * 
     * 
     */
    public List<Object> getTheadAndC08() {
        if (theadAndC08 == null) {
            theadAndC08 = new ArrayList<Object>();
        }
        return this.theadAndC08;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link AvLevel }
     *     
     */
    public AvLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvLevel }
     *     
     */
    public void setLevel(AvLevel value) {
        this.level = value;
    }

    /**
     * Gets the value of the tpattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpattern() {
        return tpattern;
    }

    /**
     * Sets the value of the tpattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpattern(String value) {
        this.tpattern = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the altrender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltrender() {
        return altrender;
    }

    /**
     * Sets the value of the altrender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltrender(String value) {
        this.altrender = value;
    }

    /**
     * Gets the value of the audience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudience() {
        return audience;
    }

    /**
     * Sets the value of the audience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudience(String value) {
        this.audience = value;
    }

    /**
     * Gets the value of the otherlevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherlevel() {
        return otherlevel;
    }

    /**
     * Sets the value of the otherlevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherlevel(String value) {
        this.otherlevel = value;
    }

    /**
     * Gets the value of the encodinganalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodinganalog() {
        return encodinganalog;
    }

    /**
     * Sets the value of the encodinganalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodinganalog(String value) {
        this.encodinganalog = value;
    }

}
