package com.loftschool.fomin.moneyloft;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class AddItemActivity extends AppCompatActivity {

    private EditText titleEdit;
    private EditText priceEdit;
    private Button addButton;

    private String title;
    private String price;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        titleEdit = findViewById(R.id.title_editText);
        priceEdit = findViewById(R.id.price_editText);
        addButton = findViewById(R.id.add_button);

        titleEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                title = s.toString();
                changeButtonTextColor();
            }
        });
        priceEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                price = s.toString();
                changeButtonTextColor();
            }
        });
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(Activity.RESULT_OK, new Intent().putExtra("name", title).putExtra("price", price));
                finish();
            }
        });
    }

    @SuppressLint("ResourceType")
    private void changeButtonTextColor() {


            if (!TextUtils.isEmpty(title) && !TextUtils.isEmpty(price)) {
                addButton.setTextColor(ContextCompat.getColor(this, R.color.add_button_text_color));
            }
            else {
                addButton.setTextColor(ContextCompat.getColor(this, R.color.add_button_color_inactive));
            }
    }
}


