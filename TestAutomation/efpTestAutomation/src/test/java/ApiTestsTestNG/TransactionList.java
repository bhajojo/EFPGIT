
package ApiTestsTestNG;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TransactionList {

    @SerializedName("transactionList")
    @Expose
    private List<TransactionList_> transactionList = null;
    @SerializedName("extras")
    @Expose
    private Object extras;
    @SerializedName("validationError")
    @Expose
    private Object validationError;

    public List<TransactionList_> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<TransactionList_> transactionList) {
        this.transactionList = transactionList;
    }

    public Object getExtras() {
        return extras;
    }

    public void setExtras(Object extras) {
        this.extras = extras;
    }

    public Object getValidationError() {
        return validationError;
    }

    public void setValidationError(Object validationError) {
        this.validationError = validationError;
    }

}
