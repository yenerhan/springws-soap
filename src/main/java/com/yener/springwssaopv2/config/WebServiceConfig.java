package com.yener.springwssaopv2.config;

import com.yener.springwssaopv2.soap.TestServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class WebServiceConfig {

    @Autowired
    private TestServiceImpl testServiceImpl;

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
        Endpoint endpoint = new EndpointImpl(bus, testServiceImpl);
        endpoint.publish("/TestService"); //İstediğin İsmi Verebilirsin wsdlin adını değiştirir.
        return endpoint;
    }

}
