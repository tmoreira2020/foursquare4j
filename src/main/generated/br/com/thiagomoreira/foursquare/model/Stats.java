
package br.com.thiagomoreira.foursquare.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Stats implements Serializable
{

    @SerializedName("checkinsCount")
    @Expose
    private int checkinsCount;
    @SerializedName("tipCount")
    @Expose
    private int tipCount;
    @SerializedName("usersCount")
    @Expose
    private int usersCount;
    @SerializedName("visitsCount")
    @Expose
    private int visitsCount;
    private final static long serialVersionUID = -7400775055236697970L;

    /**
     * 
     * @return
     *     The checkinsCount
     */
    public int getCheckinsCount() {
        return checkinsCount;
    }

    /**
     * 
     * @param checkinsCount
     *     The checkinsCount
     */
    public void setCheckinsCount(int checkinsCount) {
        this.checkinsCount = checkinsCount;
    }

    /**
     * 
     * @return
     *     The tipCount
     */
    public int getTipCount() {
        return tipCount;
    }

    /**
     * 
     * @param tipCount
     *     The tipCount
     */
    public void setTipCount(int tipCount) {
        this.tipCount = tipCount;
    }

    /**
     * 
     * @return
     *     The usersCount
     */
    public int getUsersCount() {
        return usersCount;
    }

    /**
     * 
     * @param usersCount
     *     The usersCount
     */
    public void setUsersCount(int usersCount) {
        this.usersCount = usersCount;
    }

    /**
     * 
     * @return
     *     The visitsCount
     */
    public int getVisitsCount() {
        return visitsCount;
    }

    /**
     * 
     * @param visitsCount
     *     The visitsCount
     */
    public void setVisitsCount(int visitsCount) {
        this.visitsCount = visitsCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(checkinsCount).append(tipCount).append(usersCount).append(visitsCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stats) == false) {
            return false;
        }
        Stats rhs = ((Stats) other);
        return new EqualsBuilder().append(checkinsCount, rhs.checkinsCount).append(tipCount, rhs.tipCount).append(usersCount, rhs.usersCount).append(visitsCount, rhs.visitsCount).isEquals();
    }

}
