
package ApiTestsTestNG;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InvoicesExample {

    @SerializedName("callContext")
    @Expose
    private InvoicesRequest callContext;
    @SerializedName("accountNumber")
    @Expose
    private String accountNumber;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("cardNumber")
    @Expose
    private String cardNumber;
    @SerializedName("brand")
    @Expose
    private String brand;

    public InvoicesRequest getCallContext() {
        return callContext;
    }

    public void setCallContext(InvoicesRequest callContext) {
        this.callContext = callContext;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
