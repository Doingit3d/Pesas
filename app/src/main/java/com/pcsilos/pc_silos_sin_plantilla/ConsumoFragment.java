package com.pcsilos.pc_silos_sin_plantilla;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;

import java.util.ArrayList;

import static com.pcsilos.pc_silos_sin_plantilla.UtilityGraph.LineGraphAnual;


public class ConsumoFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ConsumoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ConsumoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ConsumoFragment newInstance(String param1, String param2) {
        ConsumoFragment fragment = new ConsumoFragment();
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

        View v =  inflater.inflate(R.layout.fragment_consumo, container, false);
        if(v != null){
            LineChart chart = (LineChart) v.findViewById(R.id.chart);

            ArrayList<Float> dataSilo1 = new ArrayList<>();
            dataSilo1.add(2f);
            dataSilo1.add(22f);
            dataSilo1.add(26f);
            dataSilo1.add(72f);
            dataSilo1.add(62f);
            dataSilo1.add(67f);
            dataSilo1.add(48f);
            dataSilo1.add(2f);
            dataSilo1.add(22f);
            dataSilo1.add(26f);
            dataSilo1.add(72f);
            dataSilo1.add(62f);

            ArrayList<Float> dataSilo2 = new ArrayList<>();
            dataSilo2.add(48f);
            dataSilo2.add(2f);
            dataSilo2.add(62f);
            dataSilo2.add(26f);
            dataSilo2.add(72f);
            dataSilo2.add(62f);
            dataSilo2.add(2f);
            dataSilo2.add(22f);
            dataSilo2.add(56f);
            dataSilo2.add(22f);
            dataSilo2.add(82f);
            dataSilo2.add(67f);

            String[] meses = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sept", "Oct", "Nov", "Dic"};

            ArrayList<Silo> silos = new ArrayList<>();
            Silo silo0 = new Silo(1, "Preuba", dataSilo1 , 12, 2, 123);
            Silo silo1 = new Silo(1, "Otro silo", dataSilo2, 12, 2, 123);

            silos.add(silo0);
            silos.add(silo1);


            LineGraphAnual(chart, silos);



        }

        return v;
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
