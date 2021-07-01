package com.yener.springwssaopv2.service;

import com.yener.springwssaopv2.dto.KisiSorgulaRequest;
import com.yener.springwssaopv2.dto.KisiSorgulaResponse;
import org.springframework.stereotype.Service;

@Service
public class KisiService {


    public KisiSorgulaResponse getKisiV1(KisiSorgulaRequest kisiSorgulaRequest) {
        KisiSorgulaResponse kisiSorgulaResponse = new KisiSorgulaResponse();
        kisiSorgulaResponse.setAd("erhan");
        kisiSorgulaResponse.setSoyad("yener");
        return kisiSorgulaResponse;
    }

    public KisiSorgulaResponse getKisiV2(KisiSorgulaRequest kisiSorgulaRequest) {
        KisiSorgulaResponse kisiSorgulaResponse = new KisiSorgulaResponse();
        kisiSorgulaResponse.setAd("erhan");
        kisiSorgulaResponse.setSoyad("yener");
        return kisiSorgulaResponse;
    }
}
