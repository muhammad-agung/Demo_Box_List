package sg.edu.rp.c346.id18004536.democustomcontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import sg.edu.rp.c346.id18004536.demoboxlist.Box;
import sg.edu.rp.c346.id18004536.demoboxlist.R;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Box> boxList;

    public CustomAdapter(Context context, int resource, ArrayList<Box> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object\\//layout inflater shows XML file
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        ImageView ivBoxColor = rowView.findViewById(R.id.imageViewBoxColor);

        // Obtain the Android Version information based on the position
        Box boxes = boxList.get(position);

        // Set values to the TextView to display the corresponding information
        if(boxes.getBoxColor() == 'B'|| boxes.getBoxColor() == 'b'){
            ivBoxColor.setImageResource(R.drawable.blue_box);
        }
        else if(boxes.getBoxColor() == 'R'|| boxes.getBoxColor() == 'r'){
            ivBoxColor.setImageResource(R.drawable.brown_box);
        }
        else if(boxes.getBoxColor() == 'O'|| boxes.getBoxColor() == 'o'){
            ivBoxColor.setImageResource(R.drawable.orange_box);
        }



        return rowView;
    }
}
