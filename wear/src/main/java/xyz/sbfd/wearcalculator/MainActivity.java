package xyz.sbfd.wearcalculator;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    String content1 = "";
    Double num1;
    boolean contains = true;
    Boolean Plu = false;
    Boolean Sub = false;
    Boolean Mul = false;
    Boolean Div = false;
    Boolean decimalPoint = false;
    Boolean decimalPoint2 = false;
    Boolean advanced = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.round_activity_wear);
        final TextView tv = findViewById(R.id.textView);
        final Button btn_1 = findViewById(R.id.n1);
        final Button btn_2 = findViewById(R.id.n2);
        final Button btn_3 = findViewById(R.id.n3);
        final Button btn_4 = findViewById(R.id.n4);
        final Button btn_5 = findViewById(R.id.n5);
        final Button btn_6 = findViewById(R.id.n6);
        final Button btn_7 = findViewById(R.id.n7);
        final Button btn_8 = findViewById(R.id.n8);
        final Button btn_9 = findViewById(R.id.n9);
        final Button btn_0 = findViewById(R.id.n0);

        final Button btn_plu = findViewById(R.id.plu);
        final Button btn_sub = findViewById(R.id.sub);
        final Button btn_mul = findViewById(R.id.mul);
        final Button btn_div = findViewById(R.id.div);
        final Button btn_ans = findViewById(R.id.ans);
        final Button btn_rm = findViewById(R.id.remain);

        if (!getSharedPreferences("TEST",MODE_PRIVATE).getBoolean("first",false)) {
            SharedPreferences sharedPreferences = getSharedPreferences("TEST", MODE_PRIVATE);
            sharedPreferences.edit().putBoolean("first", true).apply();
            Toast.makeText(this," 长按 . 来清空输入框 长按 = 来激活符号页面",Toast.LENGTH_LONG).show();
        }

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content1.length()<15) {
                    if(advanced){
                        if(content1.equals("")||content1.equals(".")){
                            Toast.makeText(MainActivity.this,"输入内容为空",Toast.LENGTH_LONG).show();
                        } else {
                            num1 = Double.parseDouble(content1);
                            num1 = Math.pow(num1, 2.0);
                            content1 = String.valueOf(num1);
                            tv.setText(content1);
                            num1 = 0.0;
                        }
                    }else{
                        if (Plu || Sub || Mul || Div) {
                            content1 = content1 + "1";
                            tv.setText((tv.getText() + "1"));
                        } else {
                            content1 = content1 + "1";
                            tv.setText(content1);
                        }
                    }
                }else{Toast.makeText(MainActivity.this,"数字太多",Toast.LENGTH_SHORT).show();}
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content1.length()<15) {
                    if(advanced) {
                        if (content1.equals("") || content1.equals(".")) {
                            Toast.makeText(MainActivity.this, "输入内容为空", Toast.LENGTH_LONG).show();
                        } else {
                            num1 = Double.parseDouble(content1);
                            num1 = Math.pow(num1, 3.0);
                            content1 = String.valueOf(num1);
                            tv.setText(content1);
                            num1 = 0.0;
                        }
                    }else{
                        if (Plu || Sub || Mul || Div) {
                            content1 = content1 + "2";
                            tv.setText((tv.getText() + "2"));
                        } else {
                            content1 = content1 + "2";
                            tv.setText(content1);
                        }
                    }
                }else{Toast.makeText(MainActivity.this,"数字太多",Toast.LENGTH_SHORT).show();}
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content1.length()<15) {
                    if (advanced) {
                        if (content1.equals("") || content1.equals(".")) {
                            Toast.makeText(MainActivity.this, "输入内容为空", Toast.LENGTH_LONG).show();
                        } else {
                            num1 = Double.parseDouble(content1);
                            num1 = Math.random();
                            content1 = String.valueOf(num1);
                            tv.setText(content1);
                            num1 = 0.0;
                        }
                    } else {
                        if (Plu || Sub || Mul || Div) {
                            content1 = content1 + "3";
                            tv.setText((tv.getText() + "3"));
                        } else {
                            content1 = content1 + "3";
                            tv.setText(content1);
                        }
                    }
                }else{Toast.makeText(MainActivity.this,"数字太多",Toast.LENGTH_SHORT).show();}
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content1.length()<15) {
                    if(advanced) {
                        if (content1.equals("") || content1.equals(".")) {
                            Toast.makeText(MainActivity.this, "输入内容为空", Toast.LENGTH_LONG).show();
                        } else {
                            num1 = Double.parseDouble(content1);
                            num1 = Math.sin(num1);
                            content1 = String.valueOf(num1);
                            tv.setText(content1);
                            num1 = 0.0;
                        }
                    }else{

                        if (Plu || Sub || Mul || Div) {
                            content1 = content1 + "4";
                            tv.setText((tv.getText() + "4"));
                        } else {
                            content1 = content1 + "4";
                            tv.setText(content1);
                        }
                    }
                }else{Toast.makeText(MainActivity.this,"数字太多",Toast.LENGTH_SHORT).show();}
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content1.length()<15) {
                    if(advanced) {
                        if (content1.equals("") || content1.equals(".")) {
                            Toast.makeText(MainActivity.this, "输入内容为空", Toast.LENGTH_LONG).show();
                        } else {
                            num1 = Double.parseDouble(content1);
                            num1 = Math.cos(num1);
                            content1 = String.valueOf(num1);
                            tv.setText(content1);
                            num1 = 0.0;
                        }
                    }else{
                        if (Plu || Sub || Mul || Div) {
                            content1 = content1 + "5";
                            tv.setText((tv.getText() + "5"));
                        } else {
                            content1 = content1 + "5";
                            tv.setText(content1);
                        }
                    }
                }else{Toast.makeText(MainActivity.this,"数字太多",Toast.LENGTH_SHORT).show();}
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content1.length()<15) {
                    if(advanced) {
                        if (content1.equals("") || content1.equals(".")) {
                            Toast.makeText(MainActivity.this, "输入内容为空", Toast.LENGTH_LONG).show();
                        } else {
                            num1 = Double.parseDouble(content1);
                            num1 = Math.tan(num1);
                            content1 = String.valueOf(num1);
                            tv.setText(content1);
                            num1 = 0.0;
                        }
                    }else{
                        if (Plu || Sub || Mul || Div) {
                            content1 = content1 + "6";
                            tv.setText((tv.getText() + "6"));
                        } else {
                            content1 = content1 + "6";
                            tv.setText(content1);
                        }
                    }
                }else{Toast.makeText(MainActivity.this,"数字太多",Toast.LENGTH_SHORT).show();}
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content1.length()<15) {
                    if(advanced) {
                        if (content1.equals("") || content1.equals(".")) {
                            Toast.makeText(MainActivity.this, "输入内容为空", Toast.LENGTH_LONG).show();
                        } else {
                            num1 = Double.parseDouble(content1);
                            num1 = Math.abs(num1);
                            content1 = String.valueOf(num1);
                            tv.setText(content1);
                            num1 = 0.0;
                        }
                    }else{
                        if (Plu || Sub || Mul || Div) {
                            content1 = content1 + "7";
                            tv.setText((tv.getText() + "7"));
                        } else {
                            content1 = content1 + "7";
                            tv.setText(content1);
                        }
                    }
                }else{Toast.makeText(MainActivity.this,"数字太多",Toast.LENGTH_SHORT).show();}
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content1.length()<15) {
                    if(advanced) {
                        if (content1.equals("") || content1.equals(".")) {
                            Toast.makeText(MainActivity.this, "输入内容为空", Toast.LENGTH_LONG).show();
                        } else {
                            num1 = Double.parseDouble(content1);
                            num1 = Math.sqrt(num1);
                            content1 = String.valueOf(num1);
                            tv.setText(content1);
                            num1 = 0.0;
                        }
                    }else{
                        if (Plu || Sub || Mul || Div) {
                            content1 = content1 + "8";
                            tv.setText((tv.getText() + "8"));
                        } else {
                            content1 = content1 + "8";
                            tv.setText(content1);
                        }
                    }
                }else{Toast.makeText(MainActivity.this,"数字太多",Toast.LENGTH_SHORT).show();}
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content1.length()<15) {
                    if(advanced) {
                        if (content1.equals("") || content1.equals(".")) {
                            Toast.makeText(MainActivity.this, "输入内容为空", Toast.LENGTH_LONG).show();
                        } else {
                            num1 = Double.parseDouble(content1);
                            num1 = Math.pow(num1, 1.0/3);
                            content1 = String.valueOf(num1);
                            tv.setText(content1);
                            num1 = 0.0;
                        }
                    }else{
                        if (Plu || Sub || Mul || Div) {
                            content1 = content1 + "9";
                            tv.setText((tv.getText() + "9"));
                        } else {
                            content1 = content1 + "9";
                            tv.setText(content1);
                        }
                    }
                }else{Toast.makeText(MainActivity.this,"数字太多",Toast.LENGTH_SHORT).show();}
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content1.length()<15) {
                    if (Plu || Sub || Mul || Div) {
                        content1 = content1 + "0";
                        tv.setText((tv.getText() + "0"));
                    } else {
                        content1 = content1 + "0";
                        tv.setText(content1);
                    }
                }else{Toast.makeText(MainActivity.this,"数字太多",Toast.LENGTH_SHORT).show();}
            }
        });
        btn_0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this,"Spotted!",Toast.LENGTH_LONG).show();
                return true;
            }
        });

        btn_plu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!content1.equals("") && !content1.equals(".")) {
                    if (!Plu) {
                        decimalPoint = true;
                        num1 = Double.parseDouble(content1);
                        content1 = content1 + "+";
                        tv.setText(content1);
                        content1 = "";
                        Plu = true;
                        Sub = Mul = Div = false;
                    }
                }
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!content1.equals("") && !content1.equals(".") && !content1.equals("-")) {
                    if (!Sub) {
                        decimalPoint = true;
                        num1 = Double.parseDouble(content1);
                        content1 = content1 + "-";
                        tv.setText(content1);
                        content1 = "";
                        Sub = true;
                        Plu = Mul = Div = false;
                    }
                }else if(content1.equals("") && !tv.getText().toString().contains("-")) {
                    content1 = content1 + "-";
                    tv.setText(content1);
                }else if(content1.contains("-") || tv.getText().toString().contains("-") && (Plu || Sub || Div || Mul)){
                    content1 = content1 + "-";
                    tv.setText(String.format("%s-", tv.getText()));
                }else if(content1.contains("-") || tv.getText().toString().contains("-")){
                    Toast.makeText(MainActivity.this,"负号太多",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!content1.equals("") && !content1.equals(".")) {
                    if (!Mul) {
                        decimalPoint = true;
                        num1 = Double.parseDouble(content1);
                        content1 = content1 + "×";
                        tv.setText(content1);
                        content1 = "";
                        Mul = true;
                        Plu = Sub = Div = false;
                    }
                }
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!content1.equals("") && !content1.equals(".")) {
                    if (!Div) {
                        decimalPoint = true;
                        num1 = Double.parseDouble(content1);
                        content1 = content1 + "÷";
                        tv.setText(content1);
                        content1 = "";
                        Div = true;
                        Plu = Sub = Mul = false;
                    }
                }
            }
        });
        btn_rm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Spec. condition
                if(!decimalPoint && !decimalPoint2 && !(Plu || Sub || Div || Mul) && advanced){
                    if(tv.getText().toString().contains(".")){
                        Toast.makeText(MainActivity.this,"小数点过多",Toast.LENGTH_SHORT).show();
                    }else{
                        decimalPoint =true;
                        content1 = content1+".";
                        tv.setText(content1);
                    }
                }

                if(!decimalPoint && !decimalPoint2 && !(Plu || Sub || Div || Mul) && !advanced){
                    //state-1 no any dec. and no operator
                    Log.i("MainActivity", "onClick: 1");
                    decimalPoint =true;
                    content1 = content1+".";
                    tv.setText(content1);
                }else if(decimalPoint && !decimalPoint2 && !(Plu || Sub || Div || Mul) && !advanced){
                    //state-2 one dec. before operator
                    Log.i("MainActivity", "onClick: 2");
                    Toast.makeText(MainActivity.this,"小数点过多",Toast.LENGTH_SHORT).show();
                }else if(decimalPoint && !decimalPoint2 && !advanced){
                    //state-3 one dec. after operator now
                    //there's no real contents
                    Log.i("MainActivity", "onClick: 3");
                    decimalPoint2 = true;
                    content1 = content1 + ".";
                    tv.setText((tv.getText() + "."));
                }else if(decimalPoint && (Plu || Sub || Div || Mul) && !advanced){
                    //state-4 two decs. after operator now
                    Log.i("MainActivity", "onClick: 4");
                    Toast.makeText(MainActivity.this,"小数点过多",Toast.LENGTH_SHORT).show();
                }else if(!decimalPoint && !decimalPoint2 && !advanced){
                    Toast.makeText(MainActivity.this,"2",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_rm.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                content1 = "";
                num1 = 0.0;
                Plu = Sub = Mul = Div = decimalPoint = decimalPoint2 = false;
                tv.setText(content1);
                return true;
            }
        });
        btn_ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!content1.equals("") && !content1.equals(".")) {
                    if (Plu) {
                        tv.setText(String.format("%s=%s", tv.getText(), String.valueOf(num1 + Double.parseDouble(content1))));
                    } else if (Sub) {
                        tv.setText(String.format("%s=%s", tv.getText(), String.valueOf(num1 - Double.parseDouble(content1))));
                    } else if (Mul) {
                        tv.setText(String.format("%s=%s", tv.getText(), String.valueOf(num1 * Double.parseDouble(content1))));
                    } else if (Div) {
                        if (Double.parseDouble(content1) == 0) {
                            Toast.makeText(MainActivity.this, "不存在", Toast.LENGTH_SHORT).show();
                            tv.setText("");
                        } else {
                            tv.setText(String.format("%s=%s", tv.getText(), String.valueOf((num1 / Double.parseDouble(content1)))));
                        }
                    }
                    Plu = Sub = Mul = Div = decimalPoint = decimalPoint2 = false;
                    content1 = "";
                    num1 = 0.0;
                }
            }
        });
        btn_ans.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(advanced){
                    advanced = false;
                    btn_0.setText("0");
                    btn_1.setText("1");
                    btn_2.setText("2");
                    btn_3.setText("3");
                    btn_4.setText("4");
                    btn_5.setText("5");
                    btn_6.setText("6");
                    btn_7.setText("7");
                    btn_8.setText("8");
                    btn_9.setText("9");
                }else{
                    advanced = true;
                    btn_0.setText("");
                    btn_1.setText("x²");
                    btn_2.setText("x³");
                    btn_3.setText("R");
                    btn_4.setText(R.string.sin);
                    btn_5.setText(R.string.cos);
                    btn_6.setText(R.string.tan);
                    btn_7.setText("| |");
                    btn_8.setText("²√");
                    btn_9.setText("³√");
                }
                return true;
            }
        });
    }
}
