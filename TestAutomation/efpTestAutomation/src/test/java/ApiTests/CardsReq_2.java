
package ApiTests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CardsReq_2 {

    @SerializedName("callContext")
    @Expose
    private CardsReq_1 callContext;
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

    public CardsReq_1 getCallContext() {
        return callContext;
    }

    public void setCallContext(CardsReq_1 callContext) {
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
