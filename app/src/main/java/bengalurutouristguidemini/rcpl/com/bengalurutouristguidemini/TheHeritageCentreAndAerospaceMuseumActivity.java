package bengalurutouristguidemini.rcpl.com.bengalurutouristguidemini;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TheHeritageCentreAndAerospaceMuseumActivity extends AppCompatActivity {
    Button button7,button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_heritage_centre_and_aerospace_museum);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/HAL_Aerospace_Museum"));
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:12.9553 77.6836"));
                startActivity(intent1);
            }
        });
    }
}
