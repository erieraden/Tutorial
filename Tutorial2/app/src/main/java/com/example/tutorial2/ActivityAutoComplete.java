package com.example.tutorial2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.annotation.Nullable;

public class ActivityAutoComplete extends Activity {
    AutoCompleteTextView autocmplt;
    //PEMBUATAN ARRAY
    String[] arr = {"Adit", "Bams", "Kultum", "Bayam", "Edgar"
            , "Rere", "Lele", "Yeye", "Rey", "Mysterio"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Memanggil Layout
        setContentView(R.layout.control_autocomplete);
        //Objek AutoComplete
        autocmplt = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
    /* Membuat adapter yang berfungsi sebagai jembatan antara sebuah data set (dalam hal ini array) dengan view
    Adapter akan mengambil data dari data set lalu membuatkan view sesuai dengan data tersebut */
        ArrayAdapter<String>adapter = new ArrayAdapter<String>
                // Bagian ini mengatur view untuk
                // menampilkan data dari data set (array : arr)
                (this, android.R.layout.select_dialog_item, arr);
    /* Threshold merupakan fungsi untuk mengatur jumlah huruf yang harus diketikkan sebelum suggestion words untuk autocompleteditampilkan.
    Dalam kasus ini kita minta minimum 2 huruf */
        autocmplt.setThreshold(2);
        //Mengatur adapter yang digunakan
        autocmplt.setAdapter(adapter);
    }
}

