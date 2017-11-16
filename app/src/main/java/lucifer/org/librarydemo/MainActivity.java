package lucifer.org.librarydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import lucifer.org.snackbartest.MySnack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new MySnack.SnackBuilder(findViewById(R.id.activity_main))
                .setText("Are you sure?")
                .setTextColor("#ffffff") //optional
                .setTextSize(20)
                .setBgColor("#2196F3")
                .setActionBtnColor("#f44336")
                .setActionListener("Ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"done",Toast.LENGTH_LONG).show();
                    }
                })
                .build();


    }


}
