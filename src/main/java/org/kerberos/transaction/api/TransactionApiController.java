package org.kerberos.transaction.api;

import org.kerberos.transaction.data.Transaction;
import org.kerberos.transaction.helper.MapperDTO;
import org.kerberos.transaction.model.TransactionDTO;
import org.kerberos.transaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class TransactionApiController implements TransactionApi {

    private final NativeWebRequest request;

    private final TransactionService service;

    private final MapperDTO mapper;

    @Autowired
    public TransactionApiController(NativeWebRequest request, TransactionService transactionService, MapperDTO mapperDTO) {
        this.request = request;
        this.service = transactionService;
        this.mapper = mapperDTO;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<TransactionDTO>> accountNumberTransactionsGet(String accountNumber) {
        List<Transaction> transactions = service.getTransactions(accountNumber);
        List<TransactionDTO> result = transactions.stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
