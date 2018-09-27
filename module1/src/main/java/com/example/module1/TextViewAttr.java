package com.example.module1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class TextViewAttr extends AppCompatActivity {

    EditText edit;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_attr);

        //XML 파일에 만든 뷰를 가져오기
        TextView tv = (TextView)findViewById(R.id.friend);
        //text 속성을 설정할 때는 String을 대입 가능
        tv.setText("박태호");
        //가져올 때는 toString()을 이용해서 String으로 변환해서 가져와야
        //합니다.
        String msg = tv.getText().toString();

        edit = (EditText)findViewById(R.id.edit);
        text = (TextView)findViewById(R.id.text);

        edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                text.setText(edit.getText());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
