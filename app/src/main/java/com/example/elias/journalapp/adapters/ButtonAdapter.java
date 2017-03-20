package com.example.elias.journalapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.example.elias.journalapp.R;
import com.example.elias.journalapp.views.PostButton;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Elias on 20/03/2017.
 */

public class ButtonAdapter extends BaseAdapter {
    ArrayList<PostButton> buttons;
    LayoutInflater layoutInflater;
    Context ctx;
    public ButtonAdapter(Context ctx, ArrayList<PostButton> buttons) {
        this.buttons = buttons;
        this.ctx = ctx;
        layoutInflater = LayoutInflater.from(this.ctx);
    }
    @Override
    public int getCount() {
        return buttons.size();
    }

    @Override
    public Object getItem(int position) {
        return buttons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        return null;
    }
}
