package com.tribal.creditline.service;

import com.tribal.creditline.model.CreditLineRequest;
import com.tribal.creditline.model.CreditLineResponse;
import org.springframework.stereotype.Service;

@Service
public class CreditLineService {

    public CreditLineResponse calculate(CreditLineRequest request) {

        Double creditLine = calculateCreditLine(request);

        boolean applicationAccepted = acceptApplication(request, creditLine);

        CreditLineResponse creditLineResponse = new CreditLineResponse();
        creditLineResponse.setCreditLine(creditLine.toString());
        creditLineResponse.setCode(applicationAccepted ? "CL-000":"CL-100");
        creditLineResponse.setMessage(applicationAccepted ? "Approved":"Rejected");

        return creditLineResponse;
    }

    private boolean acceptApplication(CreditLineRequest request, Double creditLine) {
        return creditLine > request.getRequestedCreditLine();
    }

    private Double calculateCreditLine(CreditLineRequest request) {

        Double cashBalanceRatio = request.getCashBalance()/3;
        Double monthlyRevenueRatio = request.getMonthlyRevenue()/5;

        switch (request.getFoundingType()){
            case SME:
                return monthlyRevenueRatio;
            case STARTUP:
                return Math.max(cashBalanceRatio, monthlyRevenueRatio);
            default:
                return 0.0;
        }
    }
}
