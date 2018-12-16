package xyz.elfanrodhian.movieand.api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import xyz.elfanrodhian.movieand.model.Review;

/**
 * Created by elfar on 15/12/18.
 */

public interface ReviewApi {

    @GET("movie/{id}/reviews")
    Call<ReviewResult> loadReviews(@Path("id") long id);

    class ReviewResult {
        @SerializedName("results")
        private List<Review> mReviews;

        public List<Review> getReviews() {
            return mReviews;
        }
    }

}