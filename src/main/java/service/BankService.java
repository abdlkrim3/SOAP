package service;

import entity.Account;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class BankService {

    private Account account;
    private List<Account> accountList;
    @WebMethod
    public List<Account> getAccountsList() {
        return List.of(
                new Account(1, 42222.343),
                new Account(2, 56644.97),
                new Account(3, 123322.99)
        );
    }

    @WebMethod(operationName = "convert")
    public double convert(@WebParam(name="mt") double mt){
        return mt*10.87;
    }

    @WebMethod
    public Account getAccount(@WebParam(name="code") int code){
        return new Account(code, Math.random()*1000);
    }

}
