
package ApiTests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TransactionList_ {

    @SerializedName("transactionDefinition")
    @Expose
    private String transactionDefinition;
    @SerializedName("creditBankCharges")
    @Expose
    private String creditBankCharges;
    @SerializedName("amount")
    @Expose
    private String amount;
    @SerializedName("additionalInformationOnPurchase")
    @Expose
    private String additionalInformationOnPurchase;
    @SerializedName("beneficiaryText")
    @Expose
    private String beneficiaryText;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("accountNumber")
    @Expose
    private String accountNumber;
    @SerializedName("transactionDate")
    @Expose
    private String transactionDate;
    @SerializedName("cardNumber")
    @Expose
    private String cardNumber;

    public String getTransactionDefinition() {
        return transactionDefinition;
    }

    public void setTransactionDefinition(String transactionDefinition) {
        this.transactionDefinition = transactionDefinition;
    }

    public String getCreditBankCharges() {
        return creditBankCharges;
    }

    public void setCreditBankCharges(String creditBankCharges) {
        this.creditBankCharges = creditBankCharges;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAdditionalInformationOnPurchase() {
        return additionalInformationOnPurchase;
    }

    public void setAdditionalInformationOnPurchase(String additionalInformationOnPurchase) {
        this.additionalInformationOnPurchase = additionalInformationOnPurchase;
    }

    public String getBeneficiaryText() {
        return beneficiaryText;
    }

    public void setBeneficiaryText(String beneficiaryText) {
        this.beneficiaryText = beneficiaryText;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

}
