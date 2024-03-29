package org.bdcc.bankaccountservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bdcc.bankaccountservice.enums.AccountType;
import org.bdcc.bankaccountservice.entities.Customer;

import java.util.Date;
@Data @NoArgsConstructor @AllArgsConstructor @Builder

public class BankAccountResponseDTO {

    private String Id;
    private Date createdAt;
    private Double balance;
    private String currency;
    private AccountType type;
    private Customer customer;
}
