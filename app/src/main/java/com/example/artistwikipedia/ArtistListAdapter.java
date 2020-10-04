package com.example.artistwikipedia;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ArtistListAdapter extends RecyclerView.Adapter<ArtistListAdapter.ArtistViewHolder>{
    private final ArrayList<Artist> artists;
    private LayoutInflater aInflater;

    public ArtistListAdapter(Context context, ArrayList<Artist> artists)
    {
        aInflater = LayoutInflater.from(context);
        this.artists = artists;
    }

    @NonNull
    @Override
    public ArtistListAdapter.ArtistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ArtistListAdapter.ArtistViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ArtistViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView titleView, descView;
        ArtistListAdapter aAdapter;

        public ArtistViewHolder(@NonNull View itemView, ArtistListAdapter adapter) {
            super(itemView);

        }

        @Override
        public void onClick(View v) {

        }
    }
}
