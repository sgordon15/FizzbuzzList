package com.example.FizzbuzzList.Service;

import com.example.FizzbuzzList.Model.FizzbuzzResponse;
import com.example.FizzbuzzList.Model.NumberList;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class NumberListService {




    private RestTemplate restTemplate = new RestTemplate();


    public String  insertNumberList(Integer userInput)
    {
      //  HttpEntity<NumberList> httpEntity = new HttpEntity<>(userInput);
        String fizzbuzzResponse;

        try {
            fizzbuzzResponse = restTemplate.exchange("http://localhost:8080/api/v1/divisor/Enter/" + userInput,
                    HttpMethod.GET, null, String.class).getBody();
            return fizzbuzzResponse;
        } catch (RestClientException e) {
            System.out.println(e.getMessage());
            return e.getMessage() ;
        }
    }
}
