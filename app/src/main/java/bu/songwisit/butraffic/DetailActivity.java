package bu.songwisit.butraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detailTextView;
    private ImageView detailImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        bindWidget();

        //Receive Value from Intent
        receiveFromIntent();
    } // Main Method

    private void receiveFromIntent() {

        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        detailImageView.setImageResource(intImage);

        String[] strDetail = getResources().getStringArray(R.array.detail);
        int intIndex  = getIntent().getIntExtra("Index",0);
        detailTextView.setText(strDetail[intIndex]);

    }


    private void bindWidget() {

        titleTextView = (TextView) findViewById(R.id.textView3);
        detailTextView = (TextView) findViewById(R.id.textView4);
        detailImageView = (ImageView) findViewById(R.id.imageView2);

    }
} // Main Class
