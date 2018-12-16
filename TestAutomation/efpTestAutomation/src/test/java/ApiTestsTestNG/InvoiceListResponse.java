
package ApiTestsTestNG;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InvoiceListResponse {

    @SerializedName("referenceRate")
    @Expose
    private String referenceRate;
    @SerializedName("nordeaFinanceBankAccountInformation")
    @Expose
    private String nordeaFinanceBankAccountInformation;
    @SerializedName("installmentsFreeMonths")
    @Expose
    private String installmentsFreeMonths;
    @SerializedName("interestPercentage")
    @Expose
    private String interestPercentage;
    @SerializedName("pastDueLoanInvoice")
    @Expose
    private String pastDueLoanInvoice;
    @SerializedName("installmentAmount")
    @Expose
    private String installmentAmount;
    @SerializedName("cardHolderName")
    @Expose
    private String cardHolderName;
    @SerializedName("purchasesForThePeriod")
    @Expose
    private String purchasesForThePeriod;
    @SerializedName("uninvoicedPurchasesAmount")
    @Expose
    private String uninvoicedPurchasesAmount;
    @SerializedName("dueDate")
    @Expose
    private String dueDate;
    @SerializedName("paymentsForThePeriod")
    @Expose
    private String paymentsForThePeriod;
    @SerializedName("accountNumber")
    @Expose
    private String accountNumber;
    @SerializedName("referenceRateName")
    @Expose
    private String referenceRateName;
    @SerializedName("cardParticipantsDetails")
    @Expose
    private String cardParticipantsDetails;
    @SerializedName("productName")
    @Expose
    private String productName;
    @SerializedName("minimumInstalmentAmount")
    @Expose
    private String minimumInstalmentAmount;
    @SerializedName("paymentReferenceNumber")
    @Expose
    private String paymentReferenceNumber;
    @SerializedName("APJTransactions")
    @Expose
    private String aPJTransactions;
    @SerializedName("totalDebit")
    @Expose
    private String totalDebit;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("coverReservationsAmount")
    @Expose
    private String coverReservationsAmount;
    @SerializedName("cardNumber")
    @Expose
    private String cardNumber;
    @SerializedName("paymentRecipientInformation")
    @Expose
    private String paymentRecipientInformation;

    public String getReferenceRate() {
        return referenceRate;
    }

    public void setReferenceRate(String referenceRate) {
        this.referenceRate = referenceRate;
    }

    public String getNordeaFinanceBankAccountInformation() {
        return nordeaFinanceBankAccountInformation;
    }

    public void setNordeaFinanceBankAccountInformation(String nordeaFinanceBankAccountInformation) {
        this.nordeaFinanceBankAccountInformation = nordeaFinanceBankAccountInformation;
    }

    public String getInstallmentsFreeMonths() {
        return installmentsFreeMonths;
    }

    public void setInstallmentsFreeMonths(String installmentsFreeMonths) {
        this.installmentsFreeMonths = installmentsFreeMonths;
    }

    public String getInterestPercentage() {
        return interestPercentage;
    }

    public void setInterestPercentage(String interestPercentage) {
        this.interestPercentage = interestPercentage;
    }

    public String getPastDueLoanInvoice() {
        return pastDueLoanInvoice;
    }

    public void setPastDueLoanInvoice(String pastDueLoanInvoice) {
        this.pastDueLoanInvoice = pastDueLoanInvoice;
    }

    public String getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(String installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getPurchasesForThePeriod() {
        return purchasesForThePeriod;
    }

    public void setPurchasesForThePeriod(String purchasesForThePeriod) {
        this.purchasesForThePeriod = purchasesForThePeriod;
    }

    public String getUninvoicedPurchasesAmount() {
        return uninvoicedPurchasesAmount;
    }

    public void setUninvoicedPurchasesAmount(String uninvoicedPurchasesAmount) {
        this.uninvoicedPurchasesAmount = uninvoicedPurchasesAmount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getPaymentsForThePeriod() {
        return paymentsForThePeriod;
    }

    public void setPaymentsForThePeriod(String paymentsForThePeriod) {
        this.paymentsForThePeriod = paymentsForThePeriod;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getReferenceRateName() {
        return referenceRateName;
    }

    public void setReferenceRateName(String referenceRateName) {
        this.referenceRateName = referenceRateName;
    }

    public String getCardParticipantsDetails() {
        return cardParticipantsDetails;
    }

    public void setCardParticipantsDetails(String cardParticipantsDetails) {
        this.cardParticipantsDetails = cardParticipantsDetails;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMinimumInstalmentAmount() {
        return minimumInstalmentAmount;
    }

    public void setMinimumInstalmentAmount(String minimumInstalmentAmount) {
        this.minimumInstalmentAmount = minimumInstalmentAmount;
    }

    public String getPaymentReferenceNumber() {
        return paymentReferenceNumber;
    }

    public void setPaymentReferenceNumber(String paymentReferenceNumber) {
        this.paymentReferenceNumber = paymentReferenceNumber;
    }

    public String getAPJTransactions() {
        return aPJTransactions;
    }

    public void setAPJTransactions(String aPJTransactions) {
        this.aPJTransactions = aPJTransactions;
    }

    public String getTotalDebit() {
        return totalDebit;
    }

    public void setTotalDebit(String totalDebit) {
        this.totalDebit = totalDebit;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCoverReservationsAmount() {
        return coverReservationsAmount;
    }

    public void setCoverReservationsAmount(String coverReservationsAmount) {
        this.coverReservationsAmount = coverReservationsAmount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPaymentRecipientInformation() {
        return paymentRecipientInformation;
    }

    public void setPaymentRecipientInformation(String paymentRecipientInformation) {
        this.paymentRecipientInformation = paymentRecipientInformation;
    }

}
