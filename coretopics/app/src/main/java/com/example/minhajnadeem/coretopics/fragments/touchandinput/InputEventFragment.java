package com.example.minhajnadeem.coretopics.fragments.touchandinput;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.minhajnadeem.coretopics.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InputEventFragment extends Fragment implements View.OnClickListener
        , View.OnLongClickListener
        , View.OnFocusChangeListener
        , View.OnKeyListener
        , View.OnTouchListener {


    public InputEventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_input_event, container, false);

        Button btn = view.findViewById(R.id.btn);
        btn.setOnClickListener(this);
        btn.setOnLongClickListener(this);

        EditText editText1 = view.findViewById(R.id.editText1);
        editText1.setOnFocusChangeListener(this);

        EditText editText2 = view.findViewById(R.id.editText2);
        editText2.setOnFocusChangeListener(this);

        EditText editText3 = view.findViewById(R.id.editText3);
        editText3.setOnKeyListener(this);

        Button btn2 = view.findViewById(R.id.btn2);
        btn2.setOnTouchListener(this);

        Button btn3 = view.findViewById(R.id.btn3);
        registerForContextMenu(btn3);

        Button btn4 = view.findViewById(R.id.btn4);
        registerForContextMenu(btn4);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn) {
            Toast.makeText(getActivity(), "on click", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if (v.getId() == R.id.btn) {
            Toast.makeText(getActivity(), "on long click", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {

        if (v.getId() == R.id.editText1) {
            if (hasFocus) {
                Toast.makeText(getActivity(), "has focus : et1", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getActivity(), "has not focus: et1" , Toast.LENGTH_SHORT).show();
            }
        } else if (v.getId() == R.id.editText2) {
            if (hasFocus) {
                Toast.makeText(getActivity(), "has focus : et2", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getActivity(), "has not focus : et2" , Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (v.getId() == R.id.editText3) {
            Toast.makeText(getActivity(), "key code " + keyCode, Toast.LENGTH_SHORT).show();
            return true;
        }
        return true;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (v.getId() == R.id.btn2) {
            Toast.makeText(getActivity(), "on touch", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        if (v.getId() == R.id.btn3) {
            menu.setHeaderTitle("context menu header");
            menu.add(0,1,1,"menu item 1");
            menu.add(0,2,2,"menu item 2");
            menu.add(0,3,3,"menu item 3");
            menu.add(0,4,4,"menu item 4");
        }else if (v.getId() == R.id.btn4){
            menu.setHeaderTitle("another context menu header");
            menu.add(0,1,1,"menu item 1");
            menu.add(0,2,2,"menu item 2");
        }else {
            super.onCreateContextMenu(menu, v, menuInfo);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        Toast.makeText(getActivity(), "on click menu "+item.getItemId(), Toast.LENGTH_SHORT).show();
        return true;
    }
}
