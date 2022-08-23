package com.EMANDI.shopping;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
    ImageView backicon;
    private Button  CheckOrdersBtn,expandBtn1,expandBtn2,expandBtn3,expandBtn4,expandBtn5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);
        backicon=findViewById(R.id.back_pressed);
        backicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();

            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });
        expandBtn1=(Button) findViewById(R.id.expandAll1);

        expandBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.EMANDI.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "expandBtn1");
                startActivity(intent);
            }
        });
        expandBtn2=(Button) findViewById(R.id.expandAll2);

        expandBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.EMANDI.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "expandBtn2");
                startActivity(intent);
            }
        });
        expandBtn3=(Button) findViewById(R.id.expandAll3);

        expandBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.EMANDI.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "expandBtn3");
                startActivity(intent);
            }
        });
        expandBtn4=(Button) findViewById(R.id.expandAll4);

        expandBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.EMANDI.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "expandBtn4");
                startActivity(intent);
            }
        });
        expandBtn5=(Button) findViewById(R.id.expandAll5);

        expandBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.EMANDI.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "expandBtn5");
                startActivity(intent);
            }
        });
    }
}
