package id.co.kredibel.pickersample;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import io.kredibel.picker.Picker;
import io.kredibel.picker.PickerListener;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    Picker picker = new Picker(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgResult = findViewById(R.id.imgResult);
        findViewById(R.id.btnCamera).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picker.pickCamera((uri, file, bitmap) -> {
                    //do something;
                });
            }
        });

        findViewById(R.id.btnGalery).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picker.pickGallery(new PickerListener() {
                    @Override
                    public void onPicked(Uri uri, File file, Bitmap bitmap) {
                        imgResult.setImageURI(uri);
                    }
                });
            }
        });
    }
}