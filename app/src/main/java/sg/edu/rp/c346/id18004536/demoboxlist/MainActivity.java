package sg.edu.rp.c346.id18004536.demoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<Box> alboxes;
    sg.edu.rp.c346.id18004536.democustomcontactlist.CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBox = findViewById(R.id.listViewbox);
        alboxes = new ArrayList<>();
        Box item1 = new Box('B');
        Box item2 = new Box('O');
        Box item3 = new Box('r');
        alboxes.add(item1);
        alboxes.add(item2);
        alboxes.add(item3);

        customAdapter = new sg.edu.rp.c346.id18004536.democustomcontactlist.CustomAdapter(this,R.layout.row, alboxes);
        lvBox.setAdapter(customAdapter);
    }
}
