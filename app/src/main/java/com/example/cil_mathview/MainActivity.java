package com.example.cil_mathview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.noties.jlatexmath.JLatexMathDrawable;
import ru.noties.jlatexmath.JLatexMathView;

public class MainActivity extends AppCompatActivity {

    JLatexMathView latexMathView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        latexMathView=findViewById(R.id.j_latex_math_view);

         JLatexMathDrawable drawable = JLatexMathDrawable.builder("\\begin{array}{l}\na_{1} x+b_{1} y+c_{1}=0 \\\\\na_{2} x+b_{2} y+c_{2}=0 \\\\\na_{1}^{2}+b_{1}^{2} \\neq 0 \\& a_{2}^{2}+b_{2}^{2} \\neq 0 \\\\\nx=\\frac{-b \\pm \\sqrt{b^{2}+4 a c}}{2 a} \\\\\np^{m} \\times p^{n}=p^{m+n} \\\\\n\\left\\{p^{m}\\right\\} /\\left\\{p^{n}\\right\\}=p^{m-n} \\\\\np^{-m}=\\frac{1}{p^{m}} \\quad n^{\\text {th }} \\text { term }=a+(n-1) d \\\\\nS_{n}=\\frac{n}{2}[2 a+(n-1) d] \\\\\n\\sin \\theta=\\frac{\\text { Side opposite to angle } \\theta}{\\text { Hypotenuse }}=\\frac{P}{H} \\\\\n\\operatorname{cosec} \\theta=\\frac{1}{\\sin \\theta} \\quad \\sin \\left(90^{\\circ}-\\theta\\right)=\\cos \\theta \\\\\n\\sin { }^{2} \\theta+\\cos ^{2} \\theta=1 \\\\\n\\sec ^{2} \\theta=1+\\tan ^{2} \\theta \\text { for } 0^{\\circ} \\leqslant \\theta<90^{\\circ} \\\\\n\\operatorname{cosec}^{2} \\theta=1+\\cot ^{2} \\theta \\text { for } 0^{\\circ} \\leqslant 0<90^{\\circ}\n\\end{array}"

                        )
                .textSize(70)
                .padding(8)
                .background(0xFFffffff)
                .align(JLatexMathDrawable.ALIGN_RIGHT)
                .build();

         latexMathView.setLatexDrawable(drawable);
    }
}