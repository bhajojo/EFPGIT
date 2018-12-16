
package ApiTestsTestNG;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InvoicesResponses {

    @SerializedName("InvoiceList")
    @Expose
    private List<InvoiceListResponse> invoiceList = null;

    public List<InvoiceListResponse> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<InvoiceListResponse> invoiceList) {
        this.invoiceList = invoiceList;
    }

}
