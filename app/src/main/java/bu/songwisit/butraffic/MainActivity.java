package bu.songwisit.butraffic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView trafficListView;
    private Button aboutMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();

    } // Main Method

    private void buttonController() {
       aboutMeButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               //Sound Effect
               MediaPlayer buttonPlayer = MediaPlayer.create(getBaseContext(), R.raw.cow);
               buttonPlayer.start();

               //Intent to WebView
           }
       });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }

}   // Main Class
