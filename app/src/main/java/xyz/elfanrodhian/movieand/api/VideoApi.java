package xyz.elfanrodhian.movieand.api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import xyz.elfanrodhian.movieand.model.Video;

/**
 * Created by elfar on 15/12/18.
 */

public interface VideoApi {

    @GET("movie/{id}/videos")
    Call<VideoResult> loadVideos(@Path("id") long id);

    class VideoResult {
        @SerializedName("results")
        private List<Video> mVideos;

        public List<Video> getVideos() {
            return mVideos;
        }
    }

}