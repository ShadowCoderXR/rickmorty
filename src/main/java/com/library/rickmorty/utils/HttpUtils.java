package com.library.rickmorty.utils;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HttpUtils {
    private static final String BASE_URL = "https://rickandmortyapi.com/api/";
    private static final RestTemplate restTemplate = new RestTemplate();

    public static <T> T get(String url, Class<T> responseType) {
        ResponseEntity<T> response = restTemplate.getForEntity(BASE_URL + url, responseType);
        return response.getBody();
    }
}
