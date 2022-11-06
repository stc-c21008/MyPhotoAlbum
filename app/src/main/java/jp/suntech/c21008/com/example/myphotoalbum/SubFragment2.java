package jp.suntech.c21008.com.example.myphotoalbum;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class SubFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sub, container,
                false);

        TextView textView = (TextView) rootView.findViewById(R.id.titleSub);
        textView.setText(R.string.hot_title);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.subImageView);
        imageView.setImageResource(R.drawable.boiling_water);

        return rootView;
    }
}
