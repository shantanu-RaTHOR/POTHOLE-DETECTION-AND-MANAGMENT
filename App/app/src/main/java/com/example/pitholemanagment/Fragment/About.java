package com.example.pitholemanagment.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.pitholemanagment.R;

public class About extends Fragment
{
    public About() {
    }
    CardView cardView1,cardView2,cardView3;
    TextView about;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View v=inflater.inflate(R.layout.fragment_about, container, false);
        cardView1=(CardView) v.findViewById(R.id.card1);
        cardView2=(CardView) v.findViewById(R.id.card2);
        cardView3=(CardView) v.findViewById(R.id.card3);
        about=(TextView) v.findViewById(R.id.about_text);
        about.setText("This project is built for smart managment of potholes."+"\n"+
                "User can report potholes by clicking picture of it"+"\n"+"If pothole is detected by ML model used in app, pothole is registered with its exact location."+"\n"+"Concered official can see all reports of potholes with necessary information."+""+
                "Official can resolve requests."+"\n"+"Users can see their solved and pending requests in app dashboard.User are notified by email for every progress in their reports.");
        cardView1.setOnLongClickListener(new View.OnLongClickListener()
        {
            @Override
            public boolean onLongClick(View view)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/shantanu-rathore/"));
                startActivity(browserIntent);
                return  true;
            }
        });
        cardView2.setOnLongClickListener(new View.OnLongClickListener()
        {
            @Override
            public boolean onLongClick(View view)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/utkarshkrsingh2091/"));
                startActivity(browserIntent);
                return  true;
            }
        });
        cardView3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/ayushtiwari57"));
                startActivity(browserIntent);
                return  true;
            }
        });
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getContext(),"PRESS LONG TO CONNECT WITH ME",Toast.LENGTH_LONG).show();
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getContext(),"PRESS LONG TO CONNECT WITH ME",Toast.LENGTH_LONG).show();
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getContext(),"PRESS LONG TO CONNECT WITH ME",Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }
}