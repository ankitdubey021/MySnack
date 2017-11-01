package lucifer.org.librarydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import lucifer.org.snackbartest.MySnack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MySnack.display(findViewById(R.id.activity_main),"Welcome to First Android library!");
    }
}
