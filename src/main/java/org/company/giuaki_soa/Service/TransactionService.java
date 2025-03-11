package org.company.giuaki_soa.Service;

import org.company.giuaki_soa.Model.Account;
import org.company.giuaki_soa.Model.Transaction;
import org.company.giuaki_soa.Reponsitory.AccountRepository;
import org.company.giuaki_soa.Reponsitory.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    public String performTransaction(String username, String password, double amount) {
        Optional<Account> accountOpt = accountRepository.findByUsername(username);
        if (accountOpt.isPresent()) {
            Account account = accountOpt.get();
            if (account.getPassword().equals(password)) {
                if (account.getBalance() >= amount) {
                    account.setBalance(account.getBalance() - amount);
                    accountRepository.save(account);

                    Transaction transaction = new Transaction();
                    transaction.setAccountId(account.getId());
                    transaction.setAmount(amount);
                    transaction.setTimestamp(LocalDateTime.now());
                    transaction.setSuccess(true);
                    transactionRepository.save(transaction);

                    return "Transaction successful!";
                } else {
                    return "Insufficient balance!";
                }
            } else {
                return "Invalid password!";
            }
        } else {
            return "Account not found!";
        }
    }
}