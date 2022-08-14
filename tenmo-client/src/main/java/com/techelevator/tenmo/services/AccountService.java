package com.techelevator.tenmo.services;

import com.techelevator.tenmo.model.Account;
import com.techelevator.tenmo.model.AuthenticatedUser;
import com.techelevator.tenmo.model.User;
import com.techelevator.util.BasicLogger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

public class AccountService {
    private final RestTemplate restTemplate = new RestTemplate();
    private static final String API_BASE_URL = "http://localhost:8080/";
    private String authToken = null;
    private AuthenticatedUser currentUser;


    public BigDecimal currentBalance(int accountid) {
        Account account = null;
        BigDecimal balance = BigDecimal.valueOf((0));

        try {
            ResponseEntity<BigDecimal> response = restTemplate.exchange(API_BASE_URL + "accounts/balance/" + acctId, HttpMethod.GET, makeAuthEntity(), BigDecimal.class);
            balance = response.getBody();

        } catch (
                RestClientException e) {
            BasicLogger.log(e.getMessage());

        }
        return balance;

    }
    private HttpEntity<Void> makeAuthEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(authToken);
        return new HttpEntity<>(headers);
    }
}
