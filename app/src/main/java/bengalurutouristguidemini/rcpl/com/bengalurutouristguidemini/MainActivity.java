package bengalurutouristguidemini.rcpl.com.bengalurutouristguidemini;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    String[] places;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        places = new String[]{getString(R.string.place1),getString(R.string.place2),getString(R.string.place3),getString(R.string.place4),getString(R.string.place5)};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.text_style,R.id.textView,places);
        setListAdapter(arrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        switch (position) {
            case 0:
                Intent intent = new Intent(MainActivity.this,ArtofLivingInternationalCenterActivity.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(MainActivity.this,WonderlaAmusementParkActivity.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(MainActivity.this,MChinnaswamyStadiumActivity.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(MainActivity.this,TheHeritageCentreAndAerospaceMuseumActivity.class);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(MainActivity.this,CubbonParkActivity.class);
                startActivity(intent4);
                break;
        }
    }
}
