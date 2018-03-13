package com.example.android.miwok;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;

public class Books extends AppCompatActivity {

    long queueid;
    TextView bookTech;
    TextView bookPrapos;
    DownloadManager dm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        getSupportActionBar().hide();

        BroadcastReceiver receiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if(DownloadManager.ACTION_DOWNLOAD_COMPLETE.equals(action))
            {

                DownloadManager.Query req_query = new DownloadManager.Query();
                req_query.setFilterById(queueid);

                Cursor c = dm.query(req_query);

                if(c.moveToFirst())
                {
                    int columnIndex = c.getColumnIndex(DownloadManager.COLUMN_STATUS);

                    if(DownloadManager.STATUS_SUCCESSFUL == c.getInt(columnIndex))
                    {
                        Toast.makeText(Books.this,"Download Successful",Toast.LENGTH_LONG).show();                    }
                }
            }
            }
        };

        registerReceiver(receiver, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));
    }

    public  void Download_Click(View v){
        dm = (DownloadManager)getSystemService(DOWNLOAD_SERVICE);
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse("http://www.goyalpublisher.com/downloads/Tech%20French%20teacher%20book.pdf"));

         queueid = dm.enqueue(request);
    }

}
