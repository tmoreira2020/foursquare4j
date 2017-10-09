
package br.com.thiagomoreira.foursquare.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Venue implements Serializable
{

    @SerializedName("allowMenuUrlEdit")
    @Expose
    private boolean allowMenuUrlEdit;
    @SerializedName("canonicalUrl")
    @Expose
    private String canonicalUrl;
    @SerializedName("createdAt")
    @Expose
    private int createdAt;
    @SerializedName("dislike")
    @Expose
    private boolean dislike;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("ok")
    @Expose
    private boolean ok;
    @SerializedName("rating")
    @Expose
    private double rating;
    @SerializedName("ratingSignals")
    @Expose
    private int ratingSignals;
    @SerializedName("shortUrl")
    @Expose
    private String shortUrl;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("verified")
    @Expose
    private boolean verified;
    private final static long serialVersionUID = 2068155436566267569L;

    /**
     * 
     * @return
     *     The allowMenuUrlEdit
     */
    public boolean isAllowMenuUrlEdit() {
        return allowMenuUrlEdit;
    }

    /**
     * 
     * @param allowMenuUrlEdit
     *     The allowMenuUrlEdit
     */
    public void setAllowMenuUrlEdit(boolean allowMenuUrlEdit) {
        this.allowMenuUrlEdit = allowMenuUrlEdit;
    }

    /**
     * 
     * @return
     *     The canonicalUrl
     */
    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    /**
     * 
     * @param canonicalUrl
     *     The canonicalUrl
     */
    public void setCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public int getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The createdAt
     */
    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The dislike
     */
    public boolean isDislike() {
        return dislike;
    }

    /**
     * 
     * @param dislike
     *     The dislike
     */
    public void setDislike(boolean dislike) {
        this.dislike = dislike;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The ok
     */
    public boolean isOk() {
        return ok;
    }

    /**
     * 
     * @param ok
     *     The ok
     */
    public void setOk(boolean ok) {
        this.ok = ok;
    }

    /**
     * 
     * @return
     *     The rating
     */
    public double getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    public void setRating(double rating) {
        this.rating = rating;
    }

    /**
     * 
     * @return
     *     The ratingSignals
     */
    public int getRatingSignals() {
        return ratingSignals;
    }

    /**
     * 
     * @param ratingSignals
     *     The ratingSignals
     */
    public void setRatingSignals(int ratingSignals) {
        this.ratingSignals = ratingSignals;
    }

    /**
     * 
     * @return
     *     The shortUrl
     */
    public String getShortUrl() {
        return shortUrl;
    }

    /**
     * 
     * @param shortUrl
     *     The shortUrl
     */
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    /**
     * 
     * @return
     *     The stats
     */
    public Stats getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The verified
     */
    public boolean isVerified() {
        return verified;
    }

    /**
     * 
     * @param verified
     *     The verified
     */
    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(allowMenuUrlEdit).append(canonicalUrl).append(createdAt).append(dislike).append(id).append(name).append(ok).append(rating).append(ratingSignals).append(shortUrl).append(stats).append(url).append(verified).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Venue) == false) {
            return false;
        }
        Venue rhs = ((Venue) other);
        return new EqualsBuilder().append(allowMenuUrlEdit, rhs.allowMenuUrlEdit).append(canonicalUrl, rhs.canonicalUrl).append(createdAt, rhs.createdAt).append(dislike, rhs.dislike).append(id, rhs.id).append(name, rhs.name).append(ok, rhs.ok).append(rating, rhs.rating).append(ratingSignals, rhs.ratingSignals).append(shortUrl, rhs.shortUrl).append(stats, rhs.stats).append(url, rhs.url).append(verified, rhs.verified).isEquals();
    }

}
