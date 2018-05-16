package com.example.android.miwok;

import android.app.Activity;

import android.content.Context;

import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.ImageView;

import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.zip.Inflater;

public class RecyclerAdapterGermanBooks extends RecyclerView.Adapter<RecyclerAdapterGermanBooks.MyViewHolder> {

    int[] bookImagesGerman;

    String [] booksText;

    RecyclerAdapterGermanBooks.ListItemClickListener listItemClickListener;

    Context context;

    public interface ListItemClickListener

    {

        void onListItemClick(View view, int position);

    }
    public RecyclerAdapterGermanBooks(int[] booksImages, String[] booksText, RecyclerAdapterGermanBooks.ListItemClickListener listItemClickListener, Context mContext) {

        this.bookImagesGerman = booksImages;

        this.booksText = booksText;

        this.listItemClickListener = (RecyclerAdapterGermanBooks.ListItemClickListener) listItemClickListener;

        this.context = mContext;
    }
    @Override

    public RecyclerAdapterGermanBooks.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_german_books,parent,false);

        RecyclerAdapterGermanBooks.MyViewHolder viewHolder = new RecyclerAdapterGermanBooks.MyViewHolder(inflate);

        return viewHolder;

    }



    @Override

    public void onBindViewHolder(RecyclerAdapterGermanBooks.MyViewHolder holder, int position) {



        Glide.with(context)

                .load(bookImagesGerman[position])

                .centerCrop()

                .into(holder.booksImage);

        holder.booksText.setText(booksText[position]);

    }



    @Override

    public int getItemCount()

    {

        return bookImagesGerman.length;

    }



    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener

    {



        ImageView booksImage;

        TextView booksText;



        public MyViewHolder(View itemView) {

            super(itemView);

            booksImage = itemView.findViewById(R.id.frenchBooksImage);

            booksText = itemView.findViewById(R.id.frenchBooksText);

            booksImage.setOnClickListener(this);

        }



        @Override

        public void onClick(View view) {

            listItemClickListener.onListItemClick(view,getAdapterPosition());

        }

    }
}
