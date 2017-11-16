package lucifer.org.snackbartest;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Ankit Dubey on 11/1/2017.
 */

public class MySnack {

    private View view;

    private String text;
    private String bgColor;
    private String textColor;
    private String actionBtnColor;
    private float textSize;
    private String actionBtnText;
    private View.OnClickListener listener;
    private int time;





    private MySnack(SnackBuilder builder) {

        this.view=builder.view;
        this.text=builder.text;
        this.bgColor=builder.bgColor;
        this.textColor=builder.textColor;
        this.textSize=builder.textSize;
        this.actionBtnColor=builder.actionBtnColor;
        this.listener=builder.listener;
        this.time=builder.time;


    }

    public static class SnackBuilder {

        private View view;


        private String text;
        private String bgColor;
        private String textColor;
        private String actionBtnColor;
        private float textSize;
        private String actionBtnText;
        private View.OnClickListener listener;
        private int time;

        //constructor
        public SnackBuilder(View v){
            this.view=v;
        }

        public SnackBuilder setText(String text){
            this.text=text;
            return this;
        }
        public SnackBuilder setBgColor(String bgColor){
            this.bgColor=bgColor;
            return this;
        }

        public SnackBuilder setTextColor(String textColor){
            this.textColor=textColor;
            return this;
        }

        public SnackBuilder setActionBtnColor(String actionBtnColor){
            this.actionBtnColor=actionBtnColor;
            return this;
        }

        public SnackBuilder setTextSize(float textSize){
            this.textSize=textSize;
            return this;
        }

        public SnackBuilder setActionListener(String text, View.OnClickListener listener){
            this.listener=listener;
            this.actionBtnText=text;
            return this;
        }

        public SnackBuilder setDurationInSeconds(int time){
            this.time=time;
            return this;
        }

        public MySnack build(){
            Snackbar bar= Snackbar.make(view,text,Snackbar.LENGTH_LONG);

            //setting background color
            if(bgColor!=null){
                try {
                    bar.getView().setBackgroundColor(Color.parseColor(bgColor));
                }catch(Exception e){
                    bar.getView().setBackgroundColor(Color.parseColor("#808080"));
                }
            }
            TextView tv = (TextView) bar.getView().findViewById(android.support.design.R.id.snackbar_text);
            TextView tv2=(TextView) bar.getView().findViewById(android.support.design.R.id.snackbar_action);

            //setting text color
            if(textColor!=null){
                try {
                    tv.setTextColor(Color.parseColor(textColor));
                }catch(Exception e){
                    tv.setTextColor(Color.parseColor("#000000"));
                    }
            }


            //setting action button color
            if(actionBtnColor!=null){
                try {
                    tv2.setTextColor(Color.parseColor(actionBtnColor));

                }catch(Exception e){
                    tv2.setTextColor(Color.parseColor("#000000"));
                }
            }

            //setting size
            if(textSize!=0.0f){
                tv.setTextSize(textSize);
                tv2.setTextSize(textSize);
            }

            //adding listener
            if(listener!=null)
            bar.setAction(actionBtnText, listener);

            if(time!=0) {
                bar.setDuration(time*1000);
            }

            bar.show();
            return new MySnack(this);
        }
    }


}
