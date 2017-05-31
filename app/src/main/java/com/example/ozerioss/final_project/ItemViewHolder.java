package com.example.ozerioss.final_project;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Ozerioss on 27/03/2017.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder{
    private TextView title;
    private TextView description;
    private TextView publishedAt;
    private TextView channelTitle;
    private TextView thumbnails;
    private OnVideoSelectedListener onVideoSelectedListener;
    ImageView imageView;

    public ItemViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.titleTextView);
        description = (TextView) itemView.findViewById(R.id.descriptionTextView);
        publishedAt = (TextView) itemView.findViewById(R.id.publishedAtTextView);
        channelTitle = (TextView) itemView.findViewById(R.id.channelTitleTextView);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
    }

    public void bind(final QueryItem.ItemsBean itemsBeen) {
        title.setText(itemsBeen.getSnippet().getTitle());
        description.setText(itemsBeen.getSnippet().getDescription());
        publishedAt.setText(itemsBeen.getSnippet().getPublishedAt());
        channelTitle.setText(itemsBeen.getSnippet().getChannelTitle());
        Picasso.with(itemView.getContext()).load(itemsBeen.getSnippet().getThumbnails().getMedium().getUrl().toString()).into(imageView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onVideoSelectedListener == null) {
                    return;
                }
                //onVideoSelectedListener.onVideoSelected(video);
            }
        });
    }

    public void setOnVideoSelectedListener(OnVideoSelectedListener onVideoSelectedListener) {
        this.onVideoSelectedListener = onVideoSelectedListener;
    }
}
