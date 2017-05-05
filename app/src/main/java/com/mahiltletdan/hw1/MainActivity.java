package com.mahiltletdan.hw1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //define MESSAGE_TO_PASS String
    public static String MESSAGE_TO_PASS = "package com.mahiltletdan.hw1;";

    EditText myEditText;
    Button mButton;

    /**
     * Called when the user taps the Send button
     */

      // Array of strings...
    String[] buttonsArray = {"TL", "TR", "BL", "BR" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.button);

        mButton.setOnClickListener(this);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ButtonAdapter(this));

    }


    @Override
    public void onClick(View v) {
        Button btn = (Button) v;



        Log.d("CLICK", "clicked button");
        if(btn.getId() == R.id.button){
            myEditText = (EditText) findViewById(R.id.message);
            String message = myEditText.getText().toString();
            Intent intent = new Intent(this, detailActivity.class);
            intent.putExtra(MESSAGE_TO_PASS, message);
            startActivity(intent);

        }else {
            makeToast(btn.getText().toString());
        }
    }

    private void makeToast(String text){
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, detailActivity.class);
        EditText editText = (EditText) findViewById(R.id.message);
        String message = editText.getText().toString();
        intent.putExtra(MESSAGE_TO_PASS, message);
        startActivity(intent);


    }

    public class ButtonAdapter extends BaseAdapter {
        private Context mContext;

        public ButtonAdapter(Context c) {
            mContext = c;
        }

        public int getCount() {
            return buttonsArray.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        // create a new ImageView for each item referenced by the Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            Button button;
            if (convertView == null) {
                // if it's not recycled, initialize some attributes
                button = new Button(mContext);
            } else {
                button = (Button) convertView;
            }

            button.setText(buttonsArray[position]);
            button.setId(position);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(v.getId() == 0){
                        Intent intent = new Intent(mContext, MyMoviesList.class);
                        mContext.startActivity(intent);
                    } else {
                        Toast.makeText(mContext, "" + v.getId(),
                                Toast.LENGTH_SHORT).show();
                    }
                }
            });
            return button;
        }

    }

}


