package com.kelvin.json;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by kelvin on 17/8/7.
 */
public class ParaUtil {
    private static RestTemplate getRestTemplate(int connectTimeout, int readTimeout) {
        RestTemplate restTemplate = new RestTemplateBuilder().setConnectTimeout(connectTimeout).setReadTimeout(readTimeout).build();
        for (HttpMessageConverter<?> hmc : restTemplate.getMessageConverters()) {
            if (hmc instanceof StringHttpMessageConverter) {
                StringHttpMessageConverter mc = (StringHttpMessageConverter) hmc;
                mc.setWriteAcceptCharset(false);
                mc.setDefaultCharset(Charset.forName("UTF-8"));
            }
        }
        restTemplate.setErrorHandler(new ResponseErrorHandler() {
            @Override
            public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
                return false;
            }

            @Override
            public void handleError(ClientHttpResponse clientHttpResponse) throws IOException {
            }
        });
        return restTemplate;
    }

    public static void main(String[] args) {
        String jwtToken = getJwtToken();
        System.out.println(getNewID(jwtToken));
        System.out.println( java.util.UUID.randomUUID());

    }
    public static String getNewID(String token){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", token);
        RestTemplate restTemplate = getRestTemplate(5000, 5000);
        HttpEntity<String> requestEntity = new HttpEntity<>(headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange("http://47.93.245.109:8100/v1/utils/newid",
                HttpMethod.GET,
                requestEntity,
                String.class);
        if (!responseEntity.getStatusCode().is2xxSuccessful()) {
            return "";
        }
        return responseEntity.getBody().toString();
    }
    public static String getJwtToken() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        LinkedHashMap<String, String> body = new LinkedHashMap<>();
        body.put("appid", "app:mybaas");
        body.put("provider", "password");
        body.put("token", "me@email.com::pass1234");
        RestTemplate restTemplate = getRestTemplate(5000, 5000);
        HttpEntity<LinkedHashMap> requestEntity = new HttpEntity<>(body, headers);
        ResponseEntity<LinkedHashMap> responseEntity = restTemplate.exchange("http://47.93.245.109:8100/jwt_auth",
                HttpMethod.POST,
                requestEntity,
                LinkedHashMap.class);
        if (!responseEntity.getStatusCode().is2xxSuccessful()) {
            return "";
        }
        @SuppressWarnings("unchecked")
        Map<String, Object> jwtMap = (Map<String, Object>) responseEntity.getBody().get("jwt");
        if (jwtMap == null) {
            return "";
        }
        String accessToken = (String) jwtMap.get("access_token");;
        return "Bearer" + accessToken;
    }
}
