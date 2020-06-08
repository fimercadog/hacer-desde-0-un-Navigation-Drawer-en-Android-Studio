package net.mercado.fidel.hacer_desde_0_un_navigation_drawer_en_androidstudio.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import net.mercado.fidel.hacer_desde_0_un_navigation_drawer_en_androidstudio.R;

public class FragmentPersonas extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.personas_fragment,container, false);
        return view;
    }
}
