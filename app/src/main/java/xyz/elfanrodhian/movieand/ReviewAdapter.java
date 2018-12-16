package xyz.elfanrodhian.movieand;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

import java.util.ArrayList;
import java.util.List;

import xyz.elfanrodhian.movieand.model.Review;

/**
 * Created by elfar on 15/12/18.
 */

class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolder> {

    private Parser mParser = Parser.builder().build();
    private HtmlRenderer mRenderer = HtmlRenderer.builder().build();

    void setReviews(List<Review> reviews) {
        if (reviews == null) {
            reviews = new ArrayList<>();
        }
        mReviews = reviews;
    }

    private List<Review> mReviews;
    private Context context;

    ReviewAdapter(Context context1, List<Review> reviews) {
        mReviews = reviews;
        context = context1;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView authorView;
        TextView contentView;

        ViewHolder(View v) {
            super(v);
            authorView = (TextView) v.findViewById(R.id.review_author);
            contentView = (TextView) v.findViewById(R.id.review_content);
        }
    }

    @Override
    public ReviewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.review_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ReviewAdapter.ViewHolder holder, int position) {
        holder.authorView.setText(mReviews.get(position).getAuthor());
        holder.contentView.setText(Html.fromHtml(mRenderer.render(mParser.parse(mReviews.get(position).getContent()))));
    }

    @Override
    public int getItemCount() {
        return mReviews.size();
    }
}
