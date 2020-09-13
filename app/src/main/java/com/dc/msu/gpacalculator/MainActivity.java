package com.dc.msu.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText score1 ;
    private EditText score2 ;
    private EditText score3 ;
    private EditText score4 ;
    private EditText score5 ;
    private TextView tvAppNotfnMsg;
    private Button btnCompute;
    View screenView;
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         score1  = (EditText)findViewById(R.id.txtSub1);
       // score1.setFilters(new InputFilter[]{ new InputFilterMinMax("1", "100")});
         score2  = (EditText)findViewById(R.id.txtSub2);
       // score2.setFilters(new InputFilter[]{ new InputFilterMinMax("1", "100")});
         score3  = (EditText)findViewById(R.id.txtSub3);
       // score3.setFilters(new InputFilter[]{ new InputFilterMinMax("1", "100")});
         score4  = (EditText)findViewById(R.id.txtSub4);
      //  score4.setFilters(new InputFilter[]{ new InputFilterMinMax("1", "100")});
         score5  = (EditText)findViewById(R.id.txtSub5);
      //  score5.setFilters(new InputFilter[]{ new InputFilterMinMax("1", "100")});

        tvAppNotfnMsg = (TextView)findViewById(R.id.tvAppNotfn);


        btnCompute = (Button)findViewById(R.id.btnCompute);
        screenView = this.getWindow().getDecorView();


        score1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(btnCompute.getText().toString().equalsIgnoreCase(getString(R.string.app_btn_Clear_label)))
                {
                    btnCompute.setText(R.string.app_btn_Compute_label);
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable != null )
                {
                    if(editable.toString().length() > 0)
                    {
                        if(Integer.parseInt(editable.toString()) > 100)
                        {
                            Toast.makeText(getApplicationContext(),editable.toString()+" - "+getString(R.string.app_err_range_above100_msg),Toast.LENGTH_SHORT).show();
                            return;
                        }
                        if(Integer.parseInt(editable.toString()) == 0 )
                        {
                            Toast.makeText(getApplicationContext(),getString(R.string.app_err_range_zero_msg),Toast.LENGTH_SHORT).show();
                            return;
                        }
                    }
                }

            }
        });
        score2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(btnCompute.getText().toString().equalsIgnoreCase(getString(R.string.app_btn_Clear_label)))
                {
                    btnCompute.setText(R.string.app_btn_Compute_label);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable != null )
                {
                    if(editable.toString().length() > 0)
                    {
                        if(Integer.parseInt(editable.toString()) > 100)
                        {
                            Toast.makeText(getApplicationContext(),editable.toString()+" - "+getString(R.string.app_err_range_above100_msg),Toast.LENGTH_SHORT).show();
                            return;
                        }
                        if(Integer.parseInt(editable.toString()) == 0 )
                        {
                            Toast.makeText(getApplicationContext(),getString(R.string.app_err_range_zero_msg),Toast.LENGTH_SHORT).show();
                            return;
                        }
                    }
                }

            }
        });
        score3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(btnCompute.getText().toString().equalsIgnoreCase(getString(R.string.app_btn_Clear_label)))
                {
                    btnCompute.setText(R.string.app_btn_Compute_label);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable != null )
                {
                    if(editable.toString().length() > 0)
                    {
                        if(Integer.parseInt(editable.toString()) > 100)
                        {
                            Toast.makeText(getApplicationContext(),editable.toString()+" - "+getString(R.string.app_err_range_above100_msg),Toast.LENGTH_SHORT).show();
                            return;
                        }
                        if(Integer.parseInt(editable.toString()) == 0 )
                        {
                            Toast.makeText(getApplicationContext(),getString(R.string.app_err_range_zero_msg),Toast.LENGTH_SHORT).show();
                            return;
                        }
                    }
                }
            }
        });
        score4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(btnCompute.getText().toString().equalsIgnoreCase(getString(R.string.app_btn_Clear_label)))
                {
                    btnCompute.setText(R.string.app_btn_Compute_label);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable != null )
                {
                    if(editable.toString().length() > 0)
                    {
                        if(Integer.parseInt(editable.toString()) > 100)
                        {
                            Toast.makeText(getApplicationContext(),editable.toString()+" - "+getString(R.string.app_err_range_above100_msg),Toast.LENGTH_SHORT).show();
                            return;
                        }
                        if(Integer.parseInt(editable.toString()) == 0 )
                        {
                            Toast.makeText(getApplicationContext(),getString(R.string.app_err_range_zero_msg),Toast.LENGTH_SHORT).show();
                            return;
                        }
                    }
                }
            }
        });
        score5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(btnCompute.getText().toString().equalsIgnoreCase(getString(R.string.app_btn_Clear_label)))
                {
                    btnCompute.setText(R.string.app_btn_Compute_label);
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable != null )
                {
                    if(editable.toString().length() > 0)
                    {
                        if(Integer.parseInt(editable.toString()) > 100)
                        {
                            Toast.makeText(getApplicationContext(),editable.toString()+" - "+getString(R.string.app_err_range_above100_msg),Toast.LENGTH_SHORT).show();
                            return;
                        }
                        if(Integer.parseInt(editable.toString()) == 0 )
                        {
                            Toast.makeText(getApplicationContext(),getString(R.string.app_err_range_zero_msg),Toast.LENGTH_SHORT).show();
                            return;
                        }
                    }
                }
            }
        });
    }

    public void computeGPA(View view) {
        /*
        Initialize / assign the edittxt values to variables

         */
         score1  = (EditText)findViewById(R.id.txtSub1);
         score2  = (EditText)findViewById(R.id.txtSub2);
         score3  = (EditText)findViewById(R.id.txtSub3);
         score4  = (EditText)findViewById(R.id.txtSub4);
         score5  = (EditText)findViewById(R.id.txtSub5);
        btnCompute = (Button)findViewById(R.id.btnCompute);


        if((score1.getText()== null || score1.getText().toString() == null || score1.getText().toString().matches("")) || (score2.getText()== null || score2.getText().toString() == null || score2.getText().toString().matches("") ) ||(score3.getText()== null || score3.getText().toString() == null || score3.getText().toString().matches(""))||(score4.getText()== null || score4.getText().toString() == null || score4.getText().toString().matches(""))||(score5.getText()== null || score5.getText().toString() == null || score5.getText().toString().matches("")))
        {
            Toast.makeText(getApplicationContext(),getString(R.string.app_err_blank_msg),Toast.LENGTH_SHORT).show();
            return;
        }else if ((Integer.parseInt(score1.getText().toString()) == 0) || (Integer.parseInt(score2.getText().toString())== 0) || (Integer.parseInt(score3.getText().toString())==0) || (Integer.parseInt(score4.getText().toString())==0)||(Integer.parseInt(score5.getText().toString())==0)   )
        {
            Toast.makeText(getApplicationContext(),getString(R.string.app_err_range_zero_msg),Toast.LENGTH_SHORT).show();

        }
        else if ((Integer.parseInt(score1.getText().toString())> 100) || (Integer.parseInt(score2.getText().toString())> 100) || (Integer.parseInt(score3.getText().toString())> 100) || (Integer.parseInt(score4.getText().toString())> 100)||(Integer.parseInt(score5.getText().toString())> 100)   )
        {
            Toast.makeText(getApplicationContext(),getString(R.string.app_err_range_above100_msg),Toast.LENGTH_SHORT).show();

        }
        else
            {
                Log.i(TAG,"btn Value"+btnCompute.getText().toString());
                if(btnCompute.getText().toString().equalsIgnoreCase(getString(R.string.app_btn_Clear_label)))
                {
                    btnCompute.setText(R.string.app_btn_Clear_label);
                    tvAppNotfnMsg.setText(getString(R.string.app_Welcome_msg));
                    screenView.setBackgroundResource(R.color.WHITE);
                    //score1.getText().clear();
                    //score2.setText("");
                    //score3.getText().clear();
                    //score4.getText().clear();
                    //score5.getText().clear();

                }
        if(btnCompute.getText().toString().equalsIgnoreCase(getString(R.string.app_btn_Compute_label)))
        {
            btnCompute.setText(R.string.app_btn_Clear_label);
            int totalGPAScore =Integer.parseInt(score1.getText().toString())+Integer.parseInt(score2.getText().toString())+Integer.parseInt(score3.getText().toString())+Integer.parseInt(score4.getText().toString())+Integer.parseInt(score5.getText().toString());
            int avgGPA = Math.round(totalGPAScore / 5);
            tvAppNotfnMsg.setText(getString(R.string.app_GPA_score_msg)+avgGPA);
            Toast.makeText(getApplicationContext(),getString(R.string.app_GPA_score_msg)+avgGPA,Toast.LENGTH_SHORT).show();

            //String RED_COLOR = "#f44336";
            //String YELLOW_COLOR = "#fff176";
            //String GREEN_COLOR = "#8bc34a";
            if(avgGPA > 80)
            {
                screenView.setBackgroundResource(R.color.GREEN);
            }else if ((avgGPA < 80  &&  avgGPA >60))
            {
                screenView.setBackgroundResource(R.color.YELLOW);
            }else {
                screenView.setBackgroundResource(R.color.RED);
            }
        }
        }







    }
}