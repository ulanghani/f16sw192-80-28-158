package com.example.sakhicomputer.mrnetwork.Zong;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.sakhicomputer.mrnetwork.Adapters.Adapter_u;
import com.example.sakhicomputer.mrnetwork.BeanClasses.Bean_ufone;
import com.example.sakhicomputer.mrnetwork.MyDatabase;
import com.example.sakhicomputer.mrnetwork.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Tab1_zong.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Tab1_zong#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tab1_zong extends Fragment {


    ViewGroup viewGroup;
    ListView listt;
    public static ArrayList<Bean_ufone> arrayList = new ArrayList<>();
    public MyDatabase mydatabase2;
    public Adapter_u adapterU;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Tab1_zong() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tab1_zong.
     */
    // TODO: Rename and change types and number of parameters
    public static Tab1_zong newInstance(String param1, String param2) {
        Tab1_zong fragment = new Tab1_zong();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_tab1_zong, container, false);

        viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_tab1_zong, container, false);
        mydatabase2 = new MyDatabase(this.getActivity());


        listt = (ListView) viewGroup.findViewById(R.id.listt);
        System.out.println("---ufone fff = "+mydatabase2.getallZong_sms());

//        ArrayAdapter adapter = new ArrayAdapter(this.getActivity(),R.layout.support_simple_spinner_dropdown_item,
//                mydatabase2.getallRecordsStudent());

        adapterU = new Adapter_u(this.getActivity(), mydatabase2.getallZong_sms());

        listt.setAdapter(adapterU);
        adapterU.notifyDataSetChanged();

        return viewGroup;


    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
