package sg.edu.np.s10207318;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.content.DialogInterface;
import android.content.Intent;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView Imagebtn = findViewById(R.id.imagebtn);

        AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);

        Imagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setTitle("Profile");
                builder.setMessage("MADness");
                builder.setCancelable(true);
                builder.setPositiveButton("View", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        Intent intent = new Intent(ListActivity.this, MainActivity.class);
                        intent.putExtra("RandomID", new Random().nextInt() & Integer.MAX_VALUE);
                        startActivity(intent);
                    }
                });
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        finish();
                    }

                });
                builder.show();
            }
        });

    }
}