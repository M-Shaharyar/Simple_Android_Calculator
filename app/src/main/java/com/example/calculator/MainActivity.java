package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnSub,btnMul,btnDiv,btnDot,
            btnEqual,btnClear,btnMode,btnXSquare,btnXCube,btnXPowerY,btnUnderRoot,btnCubeRoot
            ,btnFactorial;
    EditText ed1;
    Float resut1,result2;
    boolean Add, Sub,Div,Mul,Mode,Square,Cube,xPowerY,underRoot;
    boolean istrue=false;

    void storePre()
    {
        resut1=Float.parseFloat(ed1.getText()+"");
    }
    void setFalse()
    {
        Add=Sub=Div=Mul=Mode=Square=Cube=xPowerY=underRoot=false;
    }
    void Clear()
    {
        resut1  =null;
        ed1.setText(null);
        setFalse();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.buttonOne);
        btn2=(Button)findViewById(R.id.buttonTwo);
        btn3=(Button)findViewById(R.id.buttonThree);
        btn4=(Button)findViewById(R.id.buttonFour);
        btn5=(Button)findViewById(R.id.buttonFive);
        btn6=(Button)findViewById(R.id.buttonSix);
        btn7=(Button)findViewById(R.id.buttonSeven);
        btn8=(Button)findViewById(R.id.buttonEight);
        btn9=(Button)findViewById(R.id.buttonNine);
        btn0=(Button)findViewById(R.id.buttonZero);
        btnAdd=(Button)findViewById(R.id.buttonAddition);
        btnSub=(Button)findViewById(R.id.buttonSubtraction);
        btnMul=(Button)findViewById(R.id.buttonMultiplication);
        btnDiv=(Button)findViewById(R.id.buttonDivision);
        btnDot=(Button)findViewById(R.id.buttonDot);
        btnMode=(Button)findViewById(R.id.buttonMode);

        btnXSquare=(Button)findViewById(R.id.buttonSquare);
        btnXCube=(Button)findViewById(R.id.buttonCube);
        btnXPowerY=(Button)findViewById(R.id.buttonXPowerY);
        btnUnderRoot=(Button)findViewById(R.id.buttonUnderRoot);
        btnCubeRoot=(Button)findViewById(R.id.buttonCubeRoot);
        btnFactorial=(Button)findViewById(R.id.buttonFactorial);

        btnEqual=(Button)findViewById(R.id.buttonEqual);
        btnClear=(Button)findViewById(R.id.buttonClear);
        ed1=(EditText) findViewById(R.id.ed1);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
                result2=1.0f;
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
                result2=2.0f;
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
                result2=3.0f;
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
                result2=4.0f;
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
                result2=5.0f;
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
                result2=6.0f;
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
                result2=7.0f;
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
                result2=8.0f;
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
                result2=9.0f;
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
                result2=0.0f;
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
                result2=.0f;
            }
        });

        //-------------------------------------------------

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1== null)
                {
                    ed1.setText("");
                }
                else{
                    setFalse();
                    ed1.setText(resut1+"+"+"");
                    Add=true;
                    //ed1.setText(null);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else{
                    storePre();

                    setFalse();
                    Sub=true;
                    ed1.setText(resut1+"-"+"");

                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else{
                    storePre();
                    setFalse();
                    Div=true;
                    ed1.setText(resut1+"/"+"");
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else{
                    storePre();
                    setFalse();
                    Mul=true;
                    ed1.setText(resut1+"*"+"");
                }
            }
        });
        btnMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else{
                    storePre();
                    setFalse();
                    Mode=true;
                    ed1.setText(resut1+"%"+"");
                }
            }
        });
        btnXSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else{
                    storePre();
                    setFalse();
                    Square=true;
                    ed1.setText(resut1*resut1+"");
                }
            }
        });
        btnXCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else{
                    storePre();
                    setFalse();
                    Cube=true;
                    ed1.setText(null);
                    ed1.setText(resut1*resut1*resut1+"");
                }
            }
        });
        btnXPowerY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else{
                    storePre();
                    setFalse();
                    xPowerY=true;
                    ed1.setText(resut1+"^"+"");

                }
            }
        });
        btnUnderRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else{
                    storePre();
                    setFalse();
                    underRoot=true;
                    ed1.setText(null);
                    ed1.setText(Math.sqrt(resut1)+"");
                }
            }
        });
        btnCubeRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else{
                    storePre();
                    setFalse();
                    ed1.setText(null);
                    ed1.setText(Math.cbrt(resut1)+"");
                }
            }
        });
        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else{
                    storePre();
                    setFalse();
                    ed1.setText(null);

                    Float number=resut1;
                    int num=1;
                    for(int i=1;i<=number;i++)
                    {
                        num=num*i;
                    }
                    ed1.setText(num+"   ");
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Add){
                    if(resut1==null)
                    {
                        ed1.setText(ed1.getText()+"Error");
                    }
                    else
                    {
                        ed1.setText(resut1+Float.parseFloat(result2+"")+"");
                        result2=Float.parseFloat(ed1.getText()+"");
                    }

                } else if(Sub){
                    ed1.setText(resut1-Float.parseFloat(result2+"")+"");
                    result2=Float.parseFloat(ed1.getText()+"");
                } else if(Mul){
                    ed1.setText(resut1*Float.parseFloat(result2+"")+"");
                    result2=Float.parseFloat(ed1.getText()+"");
                } else if(Div){
                    ed1.setText(resut1/Float.parseFloat(result2+"")+"");
                    result2=Float.parseFloat(ed1.getText()+"");
                } else if(Mode){
                    ed1.setText(resut1%Float.parseFloat(result2+"")+"");
                    result2=Float.parseFloat(ed1.getText()+"");
                }
                else if(xPowerY) {
                    Float num = Float.parseFloat(result2 + "");
                    Float firstNum = resut1;
                    int i = 0;
                    for (i = 1; i < num; i++) {
                        resut1 *= firstNum;
                    }
                    ed1.setText(resut1 + "");
                }
                else{
                    ed1.setText(ed1.getText()+"Error");
                }

            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clear();
            }
        });


    }
}