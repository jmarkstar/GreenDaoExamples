package com.jmarkstar.greendaocrud.util;

import android.content.Context;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.TextView;

import com.jmarkstar.greendaocrud.R;

/**
 * Created by jmarkstar on 19/5/17.
 */
public class SnackBarHelper {

    public static void showWarningMessage(View view, Context context, int id){
        Snackbar snackbar = Snackbar.make(view, context.getText(id), Snackbar.LENGTH_LONG);
        View snackBarView = snackbar.getView();
        snackBarView.setBackgroundColor(ContextCompat.getColor(context, R.color.color_msj_warning));
        TextView textView = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setBackgroundColor(ContextCompat.getColor(context, R.color.color_msj_warning));
        snackbar.show();
    }

    public static void showWarningMessage(View view, Context context, String message){
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG);
        View snackBarView = snackbar.getView();
        snackBarView.setBackgroundColor(ContextCompat.getColor(context, R.color.color_msj_warning));
        TextView textView = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setBackgroundColor(ContextCompat.getColor(context, R.color.color_msj_warning));
        snackbar.show();
    }

    public static void showErrorMessage(View view, Context context, int id){
        Snackbar snackbar = Snackbar.make(view, context.getText(id), Snackbar.LENGTH_LONG);
        View snackBarView = snackbar.getView();
        snackBarView.setBackgroundColor(ContextCompat.getColor(context, R.color.color_msj_error));
        TextView textView = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setBackgroundColor(ContextCompat.getColor(context, R.color.color_msj_error));
        snackbar.show();
    }

    public static void showErrorMessage(View view, Context context, String message){
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG);
        View snackBarView = snackbar.getView();
        snackBarView.setBackgroundColor(ContextCompat.getColor(context, R.color.color_msj_error));
        TextView textView = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setBackgroundColor(ContextCompat.getColor(context, R.color.color_msj_error));
        snackbar.show();
    }

    public static void showSuccessMessage(View view, Context context, int id){
        Snackbar snackbar = Snackbar.make(view, context.getText(id), Snackbar.LENGTH_LONG);
        View snackBarView = snackbar.getView();
        snackBarView.setBackgroundColor(ContextCompat.getColor(context, R.color.color_msj_success));
        TextView textView = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setBackgroundColor(ContextCompat.getColor(context, R.color.color_msj_success));
        snackbar.show();
    }

    public static void showSuccessMessage(View view, Context context, int id, BaseTransientBottomBar.BaseCallback<Snackbar> callback){
        Snackbar snackbar = Snackbar.make(view, context.getText(id), Snackbar.LENGTH_LONG);
        View snackBarView = snackbar.getView();
        snackBarView.setBackgroundColor(ContextCompat.getColor(context, R.color.color_msj_success));
        TextView textView = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setBackgroundColor(ContextCompat.getColor(context, R.color.color_msj_success));
        snackbar.addCallback(callback);
        snackbar.show();
    }

    public static void showSuccessMessage(View view, Context context, String msj){
        Snackbar snackbar = Snackbar.make(view, msj, Snackbar.LENGTH_LONG);
        View snackBarView = snackbar.getView();
        snackBarView.setBackgroundColor(ContextCompat.getColor(context, R.color.color_msj_success));
        TextView textView = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setBackgroundColor(ContextCompat.getColor(context, R.color.color_msj_success));
        snackbar.show();
    }

    public static void showSuccessMessage(View view, Context context, String msj, BaseTransientBottomBar.BaseCallback<Snackbar> callback){
        Snackbar snackbar = Snackbar.make(view, msj, Snackbar.LENGTH_LONG);
        View snackBarView = snackbar.getView();
        snackBarView.setBackgroundColor(ContextCompat.getColor(context, R.color.color_msj_success));
        TextView textView = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setBackgroundColor(ContextCompat.getColor(context, R.color.color_msj_success));
        snackbar.addCallback(callback);
        snackbar.show();
    }
}
