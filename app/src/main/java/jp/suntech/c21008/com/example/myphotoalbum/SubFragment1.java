package jp.suntech.c21008.com.example.myphotoalbum;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SubFragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sub, container,
                false);

        TextView textView = (TextView) rootView.findViewById(R.id.titleSub);
        textView.setText(R.string.cold_title);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.subImageView);
        imageView.setImageResource(R.drawable.iceing_water);

        return rootView;
    }
}