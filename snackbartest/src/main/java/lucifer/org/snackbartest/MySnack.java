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
    private int icon;






    private MySnack(SnackBuilder builder) {

        this.view=builder.view;
        this.text=builder.text;
        this.bgColor=builder.bgColor;
        this.textColor=builder.textColor;
        this.textSize=builder.textSize;
        this.actionBtnColor=builder.actionBtnColor;
        this.listener=builder.listener;
        this.time=builder.time;
        this.icon=builder.icon;


    }



    //static inner class

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
        private int icon;

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

        //set listener
        public SnackBuilder setActionListener(String text, View.OnClickListener listener){
            this.listener=listener;
            this.actionBtnText=text;
            return this;
        }


        //set time
        public SnackBuilder setDurationInSeconds(int time){
            this.time=time;
            return this;
        }

        //set icon
        public SnackBuilder setIcon(int icon){
            this.icon=icon;
            return this;
        }


        //SET ICON BY ENUM
        public SnackBuilder setIcon(Icon i){
            switch(i){
                case ERROR:
                    this.icon=R.drawable.ic_highlight_off_black_24dp;
                    break;
                case SUCCESS:
                    this.icon=R.drawable.success;
                    break;
                case WARNING:
                    this.icon=R.drawable.ic_info_black_24dp;
            }
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

            //setting size
            if(textSize!=0.0f){
                tv.setTextSize(textSize);
                tv2.setTextSize(textSize);
            }

            if(icon!=0) {
                try {
                    tv.setCompoundDrawablesWithIntrinsicBounds(icon, 0, 0, 0);
                    tv.setCompoundDrawablePadding(15);
                    tv.setTextSize(18);
                    tv2.setTextSize(18);
                }catch(Exception e){
                    tv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info_black_24dp, 0, 0, 0);
                    tv.setCompoundDrawablePadding(15);
                    tv.setTextSize(18);
                    tv2.setTextSize(18);
                }

            }


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
