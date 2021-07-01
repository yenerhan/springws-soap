package com.yener.springwssaopv2.soap;

import com.yener.springwssaopv2.dto.KisiSorgulaRequest;
import com.yener.springwssaopv2.dto.KisiSorgulaResponse;
import com.yener.springwssaopv2.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestServiceImpl implements TestService {

    @Autowired
    private KisiService kisiService;

    @Override
    public KisiSorgulaResponse getKisiV1(KisiSorgulaRequest kisiSorgulaRequest) {
        return kisiService.getKisiV1(kisiSorgulaRequest);
    }

    @Override
    public KisiSorgulaResponse getKisiV2(KisiSorgulaRequest kisiSorgulaRequest) {
        return kisiService.getKisiV2(kisiSorgulaRequest);
    }

}
