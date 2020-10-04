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
        View aItemView = aInflater.inflate(R.layout.items_layout, parent, false);
        return new ArtistViewHolder(aItemView, this);    }

    @Override
    public void onBindViewHolder(@NonNull ArtistListAdapter.ArtistViewHolder holder, int position) {
        holder.titleView.setText(artists.get(position).getName());
        holder.descView.setText(artists.get(position).getDescription());
    }

    @Override
    public int getItemCount() { return artists.size(); }

    class ArtistViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView titleView, descView;
        ArtistListAdapter aAdapter;

        public ArtistViewHolder(@NonNull View itemView, ArtistListAdapter adapter) {
            super(itemView);
            titleView = itemView.findViewById(R.id.txtTitle);
            descView = itemView.findViewById(R.id.txtDesc);
            this.aAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getLayoutPosition();

            Intent intent = new Intent(v.getContext(), MainActivity2.class);
            intent.putExtra("song", artists.get(position).getSong());
            intent.putExtra("img", artists.get(position).getImg());
            v.getContext().startActivity(intent);

            aAdapter.notifyDataSetChanged();
        }
    }
}
