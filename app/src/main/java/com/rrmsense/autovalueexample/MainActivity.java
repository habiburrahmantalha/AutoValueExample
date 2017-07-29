package com.rrmsense.autovalueexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Person person = Person.builder().email("email1").name("Name1").password("p").build();

        tv.setText(person.email()+""+person.password());

        Person person1 = person.withEmail("3");
        tv.setText(person1.email()+""+person1.password()+""+person1.toString());



    }
}
