package testfragment.dk.com.fragmenttest;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by carol on 2017-08-17.
 */

public class MyFragment extends Fragment {
    private String content;
    public MyFragment(){

    }
    public static MyFragment newInstance(String content){
        MyFragment frag = new MyFragment();
        Bundle args = new Bundle();
        args.putString("content",content);
        frag.setArguments(args);
        frag.content = content;
        return frag;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_content,container,false);
        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
        txt_content.setText(content);
        return view;
    }
}
