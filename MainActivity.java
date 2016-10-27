package makeabilitylab.umiacs.umd.edu.cmsc434helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonGoodMorning = (Button) findViewById(R.id.goodnightToggle);
        buttonGoodMorning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // most event planning is this way
               TextView textViewGoodMorning = (TextView) findViewById(R.id.goodnightText);
                if (textViewGoodMorning.getText().toString().startsWith("Good Night")) {
                    textViewGoodMorning.setText("Good Morning World!");
                } else textViewGoodMorning.setText("Good Night World!"); // this worked but the first one didn't...
            }
        });
    }

    protected void onClickToggleHelloWorldButton(View view) {
        // this is something you'd google if you don't know
        TextView textViewHelloWorld = (TextView) view.findViewById(R.id.helloText); // you'll do this a lot
        if (textViewHelloWorld.getText().toString().startsWith("Hello")) {
            textViewHelloWorld.setText("Goodbye World!");
        } else textViewHelloWorld.setText("Hello World!");
    }
}
