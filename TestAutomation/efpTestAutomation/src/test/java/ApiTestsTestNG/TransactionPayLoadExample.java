
package ApiTestsTestNG;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TransactionPayLoadExample {

    @SerializedName("callContext")
    @Expose
    private TransactionPayLoad callContext;
    @SerializedName("accountNumber")
    @Expose
    private String accountNumber;
    @SerializedName("cardNumber")
    @Expose
    private String cardNumber;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("isShort")
    @Expose
    private Object isShort;
    @SerializedName("userId")
    @Expose
    private String userId;

    public TransactionPayLoad getCallContext() {
        return callContext;
    }

    public void setCallContext(TransactionPayLoad callContext) {
        this.callContext = callContext;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Object getIsShort() {
        return isShort;
    }

    public void setIsShort(Object isShort) {
        this.isShort = isShort;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
