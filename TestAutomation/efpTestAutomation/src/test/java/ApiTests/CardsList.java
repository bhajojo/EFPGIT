
package ApiTests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CardsList {

    @SerializedName("paymentsRemaining")
    @Expose
    private Integer paymentsRemaining;
    @SerializedName("cardHolderName")
    @Expose
    private String cardHolderName;
    @SerializedName("cardLevel")
    @Expose
    private String cardLevel;
    @SerializedName("nickName")
    @Expose
    private String nickName;
    @SerializedName("usedCredit")
    @Expose
    private Double usedCredit;
    @SerializedName("yearOfSaving")
    @Expose
    private Integer yearOfSaving;
    @SerializedName("actualBonus")
    @Expose
    private Object actualBonus;
    @SerializedName("creditAvailable")
    @Expose
    private Double creditAvailable;
    @SerializedName("accountNumber")
    @Expose
    private String accountNumber;
    @SerializedName("paymentsEndDate")
    @Expose
    private String paymentsEndDate;
    @SerializedName("maskedCardNumber")
    @Expose
    private String maskedCardNumber;
    @SerializedName("purchasesLeftForBonus")
    @Expose
    private Integer purchasesLeftForBonus;
    @SerializedName("ssn")
    @Expose
    private String ssn;
    @SerializedName("cardCurrency")
    @Expose
    private String cardCurrency;
    @SerializedName("remainingOnOnePercent")
    @Expose
    private Object remainingOnOnePercent;
    @SerializedName("creditLimit")
    @Expose
    private Integer creditLimit;
    @SerializedName("instalmentFreeMonths")
    @Expose
    private Integer instalmentFreeMonths;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("matrixRange")
    @Expose
    private String matrixRange;
    @SerializedName("fuelDiscount")
    @Expose
    private String fuelDiscount;

    public Integer getPaymentsRemaining() {
        return paymentsRemaining;
    }

    public void setPaymentsRemaining(Integer paymentsRemaining) {
        this.paymentsRemaining = paymentsRemaining;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardLevel() {
        return cardLevel;
    }

    public void setCardLevel(String cardLevel) {
        this.cardLevel = cardLevel;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Double getUsedCredit() {
        return usedCredit;
    }

    public void setUsedCredit(Double usedCredit) {
        this.usedCredit = usedCredit;
    }

    public Integer getYearOfSaving() {
        return yearOfSaving;
    }

    public void setYearOfSaving(Integer yearOfSaving) {
        this.yearOfSaving = yearOfSaving;
    }

    public Object getActualBonus() {
        return actualBonus;
    }

    public void setActualBonus(Object actualBonus) {
        this.actualBonus = actualBonus;
    }

    public Double getCreditAvailable() {
        return creditAvailable;
    }

    public void setCreditAvailable(Double creditAvailable) {
        this.creditAvailable = creditAvailable;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPaymentsEndDate() {
        return paymentsEndDate;
    }

    public void setPaymentsEndDate(String paymentsEndDate) {
        this.paymentsEndDate = paymentsEndDate;
    }

    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    public void setMaskedCardNumber(String maskedCardNumber) {
        this.maskedCardNumber = maskedCardNumber;
    }

    public Integer getPurchasesLeftForBonus() {
        return purchasesLeftForBonus;
    }

    public void setPurchasesLeftForBonus(Integer purchasesLeftForBonus) {
        this.purchasesLeftForBonus = purchasesLeftForBonus;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getCardCurrency() {
        return cardCurrency;
    }

    public void setCardCurrency(String cardCurrency) {
        this.cardCurrency = cardCurrency;
    }

    public Object getRemainingOnOnePercent() {
        return remainingOnOnePercent;
    }

    public void setRemainingOnOnePercent(Object remainingOnOnePercent) {
        this.remainingOnOnePercent = remainingOnOnePercent;
    }

    public Integer getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Integer getInstalmentFreeMonths() {
        return instalmentFreeMonths;
    }

    public void setInstalmentFreeMonths(Integer instalmentFreeMonths) {
        this.instalmentFreeMonths = instalmentFreeMonths;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMatrixRange() {
        return matrixRange;
    }

    public void setMatrixRange(String matrixRange) {
        this.matrixRange = matrixRange;
    }

    public String getFuelDiscount() {
        return fuelDiscount;
    }

    public void setFuelDiscount(String fuelDiscount) {
        this.fuelDiscount = fuelDiscount;
    }

}
