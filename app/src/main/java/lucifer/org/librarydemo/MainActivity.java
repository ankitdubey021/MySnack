package lucifer.org.librarydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import lucifer.org.snackbartest.Icon;
import lucifer.org.snackbartest.MySnack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new MySnack.SnackBuilder(this)
                .setText("Are you sure?")
                .setTextColor("#ffffff") //optional
                .setTextSize(15)
                .setBgColor("#2196F3")
                .setActionBtnColor("#f44336")
                .setIcon(Icon.WARNING)
                //or  .setIcon(R.drawable.ic_info_black_24dp)
                .setDurationInSeconds(10)
                .setActionListener("Ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"done",Toast.LENGTH_LONG).show();
                    }
                })
                .build();


    }


}
