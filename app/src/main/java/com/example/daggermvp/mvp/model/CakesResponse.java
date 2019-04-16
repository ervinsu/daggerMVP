
package com.example.daggermvp.mvp.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class CakesResponse {

    @SerializedName("cakes")
    private List<Cake> mCakes;
    @SerializedName("product")
    private String mProduct;
    @SerializedName("releaseDate")
    private String mReleaseDate;
    @SerializedName("staffContacts")
    private List<StaffContact> mStaffContacts;
    @SerializedName("version")
    private Long mVersion;

    public List<Cake> getCakes() {
        return mCakes;
    }

    public void setCakes(List<Cake> cakes) {
        mCakes = cakes;
    }

    public String getProduct() {
        return mProduct;
    }

    public void setProduct(String product) {
        mProduct = product;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        mReleaseDate = releaseDate;
    }

    public List<StaffContact> getStaffContacts() {
        return mStaffContacts;
    }

    public void setStaffContacts(List<StaffContact> staffContacts) {
        mStaffContacts = staffContacts;
    }

    public Long getVersion() {
        return mVersion;
    }

    public void setVersion(Long version) {
        mVersion = version;
    }

}
