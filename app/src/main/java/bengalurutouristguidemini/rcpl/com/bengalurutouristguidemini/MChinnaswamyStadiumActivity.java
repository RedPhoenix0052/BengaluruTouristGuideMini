package bengalurutouristguidemini.rcpl.com.bengalurutouristguidemini;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MChinnaswamyStadiumActivity extends AppCompatActivity {
    Button button5,button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mchinnaswamy_stadium);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/M._Chinnaswamy_Stadium"));
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:12.9788 77.5996"));
                startActivity(intent1);
            }
        });
    }
}
