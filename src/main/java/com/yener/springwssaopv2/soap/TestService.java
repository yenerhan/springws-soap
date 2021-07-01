package com.yener.springwssaopv2.soap;

import com.yener.springwssaopv2.dto.KisiSorgulaRequest;
import com.yener.springwssaopv2.dto.KisiSorgulaResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName = "TestService")
public interface TestService {


    @WebMethod(action = "tns:KisiSorgulaRequest")
    @WebResult(name = "KisiSorgulaResponse")
    public KisiSorgulaResponse getKisiV1(@WebParam(name = "KisiSorgulaRequest") KisiSorgulaRequest kisiSorgulaRequest);

    @WebMethod(action = "tns:KisiSorgulaRequest")
    @WebResult(name = "KisiSorgulaResponse")
    public KisiSorgulaResponse getKisiV2(@WebParam(name = "KisiSorgulaRequest") KisiSorgulaRequest kisiSorgulaRequest);
}
