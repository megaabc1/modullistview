package com.example.presiden;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] presiden = {"Soekarno","Soeharto","Bacharrudin Jusuf Habibie","Abdurrahman Wahid","Megawati Soekarnoputri","Susilo Bambang Yudhoyono","Joko Widodo"};
    int[] gbr = {R.drawable.soekarno,R.drawable.soeharto,R.drawable.habibie,R.drawable.gusdur,R.drawable.megawati,R.drawable.sby,R.drawable.jokowi};
    String[] desc = {
            "Ini adalah deskripsi presiden pertama Indonesia yaitu Ir. Soekarno. Deskripsi ini dibuat panjang agar mengisi beberapa baris dalam program",
            "Ini adalah deskripsi presiden kedua Indonesia yaitu Soeharto. Deskripsi ini dibuat panjang agar mengisi beberapa baris dalam program",
            "Ini adalah deskripsi presiden ketiga Indonesia yaitu BJ. Habibie. Deskripsi ini dibuat panjang agar mengisi beberapa baris dalam program",
            "Ini adalah deskripsi presiden keempat Indonesia yaitu Abdurrahman Wahid. Deskripsi ini dibuat panjang agar mengisi beberapa baris dalam program",
            "Ini adalah deskripsi presiden kelima Indonesia yaitu Megawati. Deskripsi ini dibuat panjang agar mengisi beberapa baris dalam program",
            "Ini adalah deskripsi presiden keenam Indonesia yaitu Susilo Bambang Yudhoyono. Deskripsi ini dibuat panjang agar mengisi beberapa baris dalam program",
            "Ini adalah deskripsi presiden pertama Indonesia yaitu Joko Widodo. Deskripsi ini dibuat panjang agar mengisi beberapa baris dalam program"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), ListdataActivity.class);
                intent.putExtra("name", presiden[i]);
                intent.putExtra("image", gbr[i]);
                intent.putExtra("desc", desc[i]);
                startActivity(intent);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return gbr.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }
            @Override
            public View getView ( int i, View view, ViewGroup viewGroup){
                View view1 = getLayoutInflater().inflate(R.layout.row_data, null);
                //getting view in row_data
                TextView name = view1.findViewById(R.id.judul);
                ImageView image = view1.findViewById(R.id.images);
                name.setText(presiden[i]);
                image.setImageResource(gbr[i]);
                return view1;

        }
    }
}