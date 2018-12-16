
package ApiTests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InvoicesRequest {

    @SerializedName("id")
    @Expose
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
