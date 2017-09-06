package com.example.junhee.imagebuttonex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnBlue, btnPink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* 1. test용 이미지 버튼 연결 */
        // 1.1. nine-patch 비교를 위해 btnBlue에만 nine-patch 적용
        btnBlue = (ImageButton) findViewById(R.id.btnBlue);

        // 1.2. btnPink에는 일반 이미지 적용 (nine-patch x)
        btnPink = (ImageButton) findViewById(R.id.btnPink);
    }
}
