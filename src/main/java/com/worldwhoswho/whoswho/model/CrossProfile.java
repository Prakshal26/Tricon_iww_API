package com.worldwhoswho.whoswho.model;

import javax.persistence.*;

@Entity
@Table(name = "ww_crossrefentry")
public class CrossProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String xmlId;

    private String indexedName;
    private String nobility;
    private String titles;
    private String givenName;
    private String pseudonym;
    private String referredId;
    private String referredName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getXmlId() {
        return xmlId;
    }

    public void setXmlId(String xmlId) {
        this.xmlId = xmlId;
    }

    public String getIndexedName() {
        return indexedName;
    }

    public void setIndexedName(String indexedName) {
        this.indexedName = indexedName;
    }

    public String getNobility() {
        return nobility;
    }

    public void setNobility(String nobility) {
        this.nobility = nobility;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public String getReferredId() {
        return referredId;
    }

    public void setReferredId(String referredId) {
        this.referredId = referredId;
    }

    public String getReferredName() {
        return referredName;
    }

    public void setReferredName(String referredName) {
        this.referredName = referredName;
    }
}
