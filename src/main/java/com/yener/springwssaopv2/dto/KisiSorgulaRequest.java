package com.yener.springwssaopv2.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "KisiSorgulaRequest")
public class KisiSorgulaRequest {

    private Long kisiId;

    public KisiSorgulaRequest() {
    }

    public Long getKisiId() {
        return kisiId;
    }

    public void setKisiId(Long kisiId) {
        this.kisiId = kisiId;
    }
}
