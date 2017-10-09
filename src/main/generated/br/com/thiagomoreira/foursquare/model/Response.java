
package br.com.thiagomoreira.foursquare.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Response implements Serializable
{

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("response")
    @Expose
    private Object response;
    private final static long serialVersionUID = -2245667599278742948L;

    /**
     * 
     * @return
     *     The meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The meta
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * 
     * @return
     *     The response
     */
    public Object getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The response
     */
    public void setResponse(Object response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(meta).append(response).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Response) == false) {
            return false;
        }
        Response rhs = ((Response) other);
        return new EqualsBuilder().append(meta, rhs.meta).append(response, rhs.response).isEquals();
    }

}
