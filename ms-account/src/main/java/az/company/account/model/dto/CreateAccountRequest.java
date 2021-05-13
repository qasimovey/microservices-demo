package az.company.account.model.dto;

import az.company.account.model.AccountType;
import lombok.Data;

/**
 * @Author QasimovEY on 13.05.21
 */
@Data
public class CreateAccountRequest {
    private Integer customerId;
    private AccountType accountType;
    private String branchCode;
    private String currency;
}
