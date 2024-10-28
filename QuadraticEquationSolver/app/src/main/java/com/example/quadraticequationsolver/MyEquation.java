package com.example.quadraticequationsolver;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;

import com.example.quadraticequationsolver.databinding.ActivityMainBinding;

public class MyEquation extends BaseObservable {
    String a;
    String b;
    String c;
    ActivityMainBinding binding;

    public MyEquation(ActivityMainBinding binding) {
        this.binding = binding;
    }

    public MyEquation() {
    }

    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void SolveEquation(View view){
        int a= Integer.parseInt(getA());
        int b=Integer.parseInt(getB());
        int c=Integer.parseInt(getC());

        //Calculating discriminant
        double d=b*b-4*a*c;

        //Calculating roots
        double x1,x2;

        if(d>0){
            //two real roots
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);

            //printing values
            binding.textView.setText("x1="+x1+"  x2="+x2);
        }else if(d<0){
            //no real roots
            binding.textView.setText("No real roots(complex root)");
        }
        else{
            //two repeated roots
            x1=-b/(2*a);
            binding.textView.setText("x="+x1);
        }
    }
}
