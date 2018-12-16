package xyz.elfanrodhian.movieand.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by elfar on 15/12/18.
 */

public class Video {

    public static final String JKEY_VIDEO_LIST = "results";

    @SerializedName("id")
    private String mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("site")
    private String mSite;
    @SerializedName("key")
    private String mKey;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getSite() {
        return mSite;
    }

    public void setSite(String site) {
        mSite = site;
    }

    public String getKey() {
        return mKey;
    }

    public void setKey(String key) {
        mKey = key;
    }
}
