package ru.hiddenvinnyp.safefood.foodlist;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class DetailActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //final LinearLayout layout =(LinearLayout) findViewById(R.id.detail);

        setContentView(R.layout.activity_detail);
        Bundle b = getIntent().getExtras();
        String item = b.getString("item");
        ArrayList<String> values = food.getValue(item);
        setTitle(item);

        if (item.equals("Меню")){
            TextView breakfast = (TextView) findViewById(R.id.yes);
            TextView yes = (TextView) findViewById(R.id.yes_text);
            TextView breakfast2 = (TextView) findViewById(R.id.maybe);
            TextView maybe = (TextView) findViewById(R.id.maybe_text);
            TextView lunch = (TextView) findViewById(R.id.nope);
            TextView nope = (TextView) findViewById(R.id.nope_text);

            breakfast.setText("Завтрак");
            yes.setText(values.get(0));
            breakfast2.setText("Второй завтрак");
            maybe.setText(values.get(1));
            lunch.setText("Обед");
            nope.setText(values.get(2));


            View linearLayout =  findViewById(R.id.detail);
            TextView snack = new TextView(this);
            TextView snackText = new TextView(this);
            TextView dinner = new TextView(this);
            TextView dinnerText = new TextView(this);
            TextView night = new TextView(this);
            TextView nightText = new TextView(this);

            snack.setText("Полдник");
            snackText.setText(values.get(3));
            dinner.setText("Ужин");
            dinnerText.setText(values.get(4));
            night.setText("На ночь");
            nightText.setText(values.get(5));

            snack.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            snackText.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            dinner.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            dinnerText.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            night.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            nightText.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

            //snack.setTextAppearance(getApplicationContext(), android.R.attr.textAppearanceMedium);
            snack.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
            dinner.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
            night.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
            ((LinearLayout) linearLayout).addView(snack);
            ((LinearLayout) linearLayout).addView(snackText);
            ((LinearLayout) linearLayout).addView(dinner);
            ((LinearLayout) linearLayout).addView(dinnerText);
            ((LinearLayout) linearLayout).addView(night);
            ((LinearLayout) linearLayout).addView(nightText);

        } else {

            TextView yes = (TextView) findViewById(R.id.yes_text);
            TextView maybe = (TextView) findViewById(R.id.maybe_text);
            TextView nope = (TextView) findViewById(R.id.nope_text);
            TextView yesTitle = (TextView) findViewById(R.id.yes);
            TextView maybeTitle = (TextView) findViewById(R.id.maybe);
            TextView nopeTitle = (TextView) findViewById(R.id.nope);
            yesTitle.setBackgroundColor(Color.parseColor("#78B50B"));
            maybeTitle.setBackgroundColor(Color.parseColor("#EDD202"));
            nopeTitle.setBackgroundColor(Color.parseColor("#FF0000"));
            yes.setText(values.get(0));
            maybe.setText(values.get(1));
            nope.setText(values.get(2));
        }

    }


}
