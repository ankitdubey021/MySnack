package lucifer.org.snackbartest;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by Administrator on 11/1/2017.
 */

public class MySnack {

    public static void display(View v,String msg){
        Snackbar.make(v,msg,Snackbar.LENGTH_LONG).show();
    }
}
