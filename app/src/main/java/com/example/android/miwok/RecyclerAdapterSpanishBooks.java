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
public class RecyclerAdapterSpanishBooks extends RecyclerView.Adapter<RecyclerAdapterSpanishBooks.MyViewHolder> {

    int[] bookImagesSpanish;

    String [] booksText;

    RecyclerAdapterSpanishBooks.ListItemClickListener listItemClickListener;

    Context context;

    public interface ListItemClickListener

    {

        void onListItemClick(View view, int position);

    }
    public RecyclerAdapterSpanishBooks(int[] booksImages, String[] booksText, RecyclerAdapterSpanishBooks.ListItemClickListener listItemClickListener, Context mContext) {

        this.bookImagesSpanish = booksImages;

        this.booksText = booksText;

        this.listItemClickListener = (RecyclerAdapterSpanishBooks.ListItemClickListener) listItemClickListener;

        this.context = mContext;
    }
    @Override

    public RecyclerAdapterSpanishBooks.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_spanish_books,parent,false);

        RecyclerAdapterSpanishBooks.MyViewHolder viewHolder = new RecyclerAdapterSpanishBooks.MyViewHolder(inflate);

        return viewHolder;

    }



    @Override

    public void onBindViewHolder(RecyclerAdapterSpanishBooks.MyViewHolder holder, int position) {



        Glide.with(context)

                .load(bookImagesSpanish[position])

                .centerCrop()

                .into(holder.booksImage);

        holder.booksText.setText(booksText[position]);

    }



    @Override

    public int getItemCount()

    {

        return bookImagesSpanish.length;

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
