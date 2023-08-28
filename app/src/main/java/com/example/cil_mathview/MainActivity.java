package com.example.cil_mathview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import ru.noties.jlatexmath.JLatexMathDrawable;
import ru.noties.jlatexmath.JLatexMathView;

public class MainActivity extends AppCompatActivity {

    JLatexMathView latexMathView;
  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        latexMathView=findViewById(R.id.j_latex_math_view);

                 JLatexMathDrawable drawable = JLatexMathDrawable.builder("\\text {  \\begin{array}{l}\n\\left(\\frac{a_{1}}{a_{2}}\\right),\\left(\\frac{b_{1}}{b_{2}}\\right),\\left(\\begin{array}{c}\nc_{1} \\\\\nc_{2}\n\\end{array}\\right) \\mid x=\\frac{D_{x}}{D}, y=\\frac{D_{y}}{D} \\\\\n2) \\frac{4}{x-y}+\\frac{1}{x+y}=3 ; \\frac{2}{x-y}-\\frac{3}{x+y}=5 \\\\\n\\rightarrow \\frac{4}{x-y}+\\frac{1}{x+y}=3 ; \\frac{2}{x-y}-\\frac{3}{x+y}=5 \\\\\n4\\left(\\frac{1}{x-y}\\right)+1\\left(\\frac{1}{x+y}\\right)=3 \\ldots \\ldots \\text { (I) } \\\\\n2\\left(\\frac{1}{x-y}\\right)-3\\left(\\frac{1}{x+y}\\right)=5 \\ldots \\text { (II) } \\\\\n4 a+b=3 \\ldots \\text { (III) }\n\\end{array}\\\\\n Ans Acid contains \\( (H+) \\) hydrogen ions and vased contains \\\\\n \\( (10 \\mathrm{H}) \\) hydroxide ions. Salt and water are furmed by\\\\\ncombination of acid and vase.\\\\\n\\[\\\\\n\\begin{array}{l}\\\\\n\\text { Acid + Base } \\rightarrow \\text { Salt + water } \\\\\n\\mathrm{HCl}+\\mathrm{NaOH} \\rightarrow \\mathrm{NaCl}+\\mathrm{H}_{2} \\mathrm{O} .\\\\\n\\end{array}\\\\\n\\]\\\\\nThis chemical reaction is neutrillization}"
                         )
                .textSize(70)
                .padding(8)
                .background(0xFFffffff)
                .align(JLatexMathDrawable.ALIGN_RIGHT)
                .build();

         latexMathView.setLatexDrawable(drawable);
    }
}