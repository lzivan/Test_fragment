package com.lzivan.test_fragment;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


public class BlankFragment2 extends Fragment {

//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public BlankFragment2() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment BlankFragment2.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static BlankFragment2 newInstance(String param1, String param2) {
//        BlankFragment2 fragment = new BlankFragment2();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_blank2, container, false);
//    }
    View view;
    private String arry[] = { "Cow", "Rooster", "Dog", "Pig", "Cat", "Horse"};
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment_blank2,container,false);
//        Button send = view.findViewById(R.id.button);
//        send.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText editText = view.findViewById(R.id.editdata);
//                Bundle result = new Bundle();
//                result.putString("df1",editText.getText().toString());
//                getParentFragmentManager().setFragmentResult("dataFrom1",result);
//                editText.setText("");
//            }
//        });
        final MediaPlayer cow = MediaPlayer.create(getActivity(), R.raw.cow);
        final MediaPlayer rooster = MediaPlayer.create(getActivity(), R.raw.rooster);
        final MediaPlayer dog = MediaPlayer.create(getActivity(), R.raw.dog);
        final MediaPlayer pig = MediaPlayer.create(getActivity(), R.raw.pig);
        final MediaPlayer cat = MediaPlayer.create(getActivity(), R.raw.cat);
        final MediaPlayer horse = MediaPlayer.create(getActivity(), R.raw.horse);
        ListView lv = (ListView)view.findViewById(R.id.ListView);
        ArrayAdapter<String> array = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1);
        for (String str : arry)
            array.add(str);
        lv.setAdapter(array);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l) {
                Toast.makeText(getActivity(), ""+(adapterView.getAdapter().getItem(i)),Toast.LENGTH_SHORT).show();
                Bundle result = new Bundle();
                result.putString("df1",String.valueOf(adapterView.getAdapter().getItem(i)));
                getParentFragmentManager().setFragmentResult("dataFrom1",result);
                if (String.valueOf(adapterView.getAdapter().getItem(i)).equals("Cow")){
                    cow.start();
//                    rooster.stop();
//                    dog.stop();
//                    cat.stop();
//                    horse.stop();
//                    pig.stop();
                }
                if (String.valueOf(adapterView.getAdapter().getItem(i)).equals("Rooster")){
                    rooster.start();
//                    cow.stop();
//                    dog.stop();
//                    cat.stop();
//                    horse.stop();
//                    pig.stop();
                }
                if (String.valueOf(adapterView.getAdapter().getItem(i)).equals("Dog")){
                    dog.start();
//                    rooster.stop();
//                    cow.stop();
//                    cat.stop();
//                    horse.stop();
//                    pig.stop();
                }
                if (String.valueOf(adapterView.getAdapter().getItem(i)).equals("Pig")){
                    pig.start();
//                    rooster.stop();
//                    dog.stop();
//                    cat.stop();
//                    horse.stop();
//                    cow.stop();
                }
                if (String.valueOf(adapterView.getAdapter().getItem(i)).equals("Cat")){
                    cat.start();
//                    rooster.stop();
//                    dog.stop();
//                    cow.stop();
//                    horse.stop();
//                    pig.stop();
                }
                if (String.valueOf(adapterView.getAdapter().getItem(i)).equals("Horse")){
                    horse.start();
//                    rooster.stop();
//                    dog.stop();
//                    cat.stop();
//                    cow.stop();
//                    pig.stop();

                }

            }
        });
        return view;
    }


}