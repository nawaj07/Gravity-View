package nawaj.dev.gravityview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import co.gofynd.gravityview.GravityView;

public class MainActivity extends AppCompatActivity {

    GravityView gravityView;
    ImageView image_background;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image_background=(ImageView)findViewById(R.id.image_background);
        gravityView = GravityView.getInstance(this);

        if(!gravityView.deviceSupported()) {
            Toast.makeText(this, "Device unsupported",Toast.LENGTH_SHORT).show();
            return;
        }
        else {
            gravityView.setImage(image_background,R.drawable.dd)
                    .center();


        }   }

    }

