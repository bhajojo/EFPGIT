
package ApiTests;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("messageDescription")
    @Expose
    private Object messageDescription;
    @SerializedName("message")
    @Expose
    private Object message;
    @SerializedName("cardsList")
    @Expose
    private List<CardsList> cardsList = null;

    public Object getMessageDescription() {
        return messageDescription;
    }

    public void setMessageDescription(Object messageDescription) {
        this.messageDescription = messageDescription;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public List<CardsList> getCardsList() {
        return cardsList;
    }

    public void setCardsList(List<CardsList> cardsList) {
        this.cardsList = cardsList;
    }

}
