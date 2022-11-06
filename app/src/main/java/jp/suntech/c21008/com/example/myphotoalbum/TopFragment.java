package jp.suntech.c21008.com.example.myphotoalbum;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class TopFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_top, container,
                false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.mainImageView);
        imageView.setImageResource(R.drawable.usual_water);

        return rootView;
    }
}