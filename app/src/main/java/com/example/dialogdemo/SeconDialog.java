package com.example.dialogdemo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

 public class SeconDialog extends DialogFragment {

     private String diaBtnPositive = "";
     private String diaBtnNegative = "";
     private String diaTitle = "";
     private String diaMessage = "";


     @NonNull
     @Override
     public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

         AlertDialog.Builder myBuilder = new AlertDialog.Builder(getActivity());

         myBuilder.setMessage(diaMessage)
                 .setPositiveButton(diaBtnPositive, new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                     }
                 })
                 .setNegativeButton(diaBtnNegative, new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                     }
                 })
                 .setIcon(R.drawable.ic_launcher_foreground)
                 .setTitle(diaTitle)
                 .setCancelable(false);

         return myBuilder.create();
     }

     public SeconDialog(String diaTitle, String diaMessage, String diaBtnPositive, String diaBtnNegative) {
         this.diaTitle = diaTitle;
         this.diaMessage = diaMessage;
         this.diaBtnPositive = diaBtnPositive;
         this.diaBtnNegative = diaBtnNegative;
     }



 }
