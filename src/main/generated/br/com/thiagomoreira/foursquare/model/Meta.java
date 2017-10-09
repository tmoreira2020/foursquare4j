
package br.com.thiagomoreira.foursquare.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Meta implements Serializable
{

    @SerializedName("code")
    @Expose
    private int code;
    @SerializedName("requestId")
    @Expose
    private String requestId;
    @SerializedName("error_detail")
    @Expose
    private String errorDetail;
    @SerializedName("error_type")
    @Expose
    private String errorType;
    private final static long serialVersionUID = -5860265920538737027L;

    /**
     * 
     * @return
     *     The code
     */
    public int getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * 
     * @param requestId
     *     The requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * 
     * @return
     *     The errorDetail
     */
    public String getErrorDetail() {
        return errorDetail;
    }

    /**
     * 
     * @param errorDetail
     *     The error_detail
     */
    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    /**
     * 
     * @return
     *     The errorType
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * 
     * @param errorType
     *     The error_type
     */
    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(requestId).append(errorDetail).append(errorType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Meta) == false) {
            return false;
        }
        Meta rhs = ((Meta) other);
        return new EqualsBuilder().append(code, rhs.code).append(requestId, rhs.requestId).append(errorDetail, rhs.errorDetail).append(errorType, rhs.errorType).isEquals();
    }

}
